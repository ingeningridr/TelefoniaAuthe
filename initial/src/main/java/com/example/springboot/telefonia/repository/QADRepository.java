package com.example.springboot.telefonia.repository;

import com.example.springboot.telefonia.Ld_det;
import com.example.springboot.telefonia.dto.CustomResponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

import com.example.springboot.telefonia.*;

@Transactional
@Repository
public interface QADRepository extends CrudRepository<Ld_det, Long> {

        /**
         * Esto es el script
         */
        @Query("select new com.example.springboot.dto.CustomResponse (p.pt_domain, p.pt_part, p.pt_article,"+
                "    p.pt_desc1,"+
                "    p.pt_desc2,"+
                "    p.pt_status,"+
                "    e.ld_domain,"+
                "    e.ld_site,"+
                "    e.ld_loc,"+
                "    e.ld_qty_oh, SUM(e.ld_qty_oh) as cantidad, t.tr_site + '-' + t.tr_nbr as consecutivo) from Ld_det e, Pt_mstr p, Tr_hist t "+
                "    WHERE e.ld_domain = 'cerracol' AND"+
                "    e.ld_site        = 'alm_destino'  AND"+
                "    e.ld_loc         = 'TRA001' AND "+
                "    e.ld_qty_oh > 0 AND "+
                "    t.tr_domain   = 'cerracol' AND "   +
                "    t.tr_part         = e.ld_part AND"+
                "    t.tr_effdate   = CURRENT_TIMESTAMP AND"+
                "    t.tr_loc           = e.ld_loc AND"+
                "    t.tr_site          = e.ld_site AND "+
                "    AND p.pt_domain  = 'cerracol'  " +
                "    AND p.pt_part    = e.ld_part" +
                "    ORDER BY e.ld_qty_oh")
        List<CustomResponse> getInfoFromQAD();
}
