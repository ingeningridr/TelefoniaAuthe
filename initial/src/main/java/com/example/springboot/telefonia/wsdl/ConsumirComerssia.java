package com.example.springboot.telefonia.wsdl;
/**
import com.example.springboot.telefonia.utils.Constantes;
import com.example.springboot.telefonia.wsdl.mapping.WmEnvioTransacciones;
import com.example.springboot.telefonia.wsdl.mapping.WmEnvioTransaccionesResponse;
import com.example.springboot.telefonia.wsdl.mapping.WmReporte;
import com.example.springboot.telefonia.wsdl.mapping.WmReporteResponse;
import com.example.springboot.telefonia.wsdl.requesreportes.DATOS;
import com.example.springboot.telefonia.wsdl.request.Transaction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.xml.XmlMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import static com.example.springboot.telefonia.service.CallsService.LoggerFactory;
import com.example.springboot.telefonia.wsdl.mapping.WmReporteResponse;

public class ConsumirComerssia extends WmReporteResponse {

  private static final Logger log = (Logger) LoggerFactory.getLogger(String.valueOf(ConsumirComerssia.class));

  private String callBack = "http://localhost:8080//servicioqueespererespuesta";

  private String callBackReportes = "http://localhost:8080//servicioqueespererespuesta";
    private Object WmEnvioTransaccionesResponse;

    public ConsumirComerssia() {
        super("");
    }


   *
   * @param pi_sIdemp
   * @param pi_sEnvio
   * @param wmEnvioTransaccionesResponse
     * @return

  public WmEnvioTransaccionesResponse envioTransacciones(String pi_sIdemp, Transaction pi_sEnvio, Object wmEnvioTransaccionesResponse) throws Exception
{
      XmlMapper xmlMapper = new XmlMapper();
      String xml = xmlMapper.writeValueAsString(pi_sEnvio);
      log.info("XML: "+ xml);
      WmEnvioTransacciones envioTransacciones = new WmEnvioTransacciones();
      envioTransacciones.setPiSIdemp(pi_sIdemp);
      envioTransacciones.setPiSEnvio(xml.getBytes());

      WmEnvioTransaccionesResponse response = (WmEnvioTransaccionesResponse) envioTransacciones
              .setPiSEnvio(Constantes.WSDL, envioTransacciones,
                      new SoapActionCallback(callBackReportes));

      return response;

  }


    /**
     *
     * @param datos
     * @return
     * @throws JsonProcessingException

  public WmReporteResponse reportes(DATOS datos) throws JsonProcessingException, IOException {
      XmlMapper xmlMapper = new XmlMapper();
      String xml = xmlMapper.writeValueAsString(datos);
      log.info("XML REPORTE: " + xml);
      WmReporte wmReporte = new WmReporte();
      wmReporte.setPiSEntrada(xml);

      ConsumirComerssia WmReporteResponse = null;
      WmReporteResponse response = (WmReporteResponse) WmReporteResponse
     .WmEnvioTransaccionesResponse(Constantes.WSDL, wmReporte,
      new SoapActionCallback(WmReporteResponse));


      return response;
  }}
  */
