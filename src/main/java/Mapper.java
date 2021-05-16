import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Mapper {

    private Connect connect;

    public Mapper(){
        connect = new Connect();
    }

    public List<InformationDTO> createDTO(){
        List<InformationDTO> listInfo = new ArrayList<>();
        String query = "select cliente_idt, first_name, last_name, event_name, num_boleta, tipo_pago, fecha_pago, precio_final \n" +
                        "from cliente inner join transaccion on cliente.cliente_id = transaccion.cliente_idt";

        try {
            Statement statement = connect.connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);


            while(resultSet.next()){
                InformationDTO informationDTO = new InformationDTO();
                informationDTO.setCliente_id(resultSet.getString("cliente_idt"));
                informationDTO.setCliente_name(resultSet.getString("first_name") +
                                            " " + resultSet.getString("last_name"));
                informationDTO.setEvent_name(resultSet.getString("event_name"));
                informationDTO.setNum_boleta(resultSet.getInt("num_boleta"));
                informationDTO.setTipo_pago(resultSet.getString("tipo_pago"));
                informationDTO.setFecha(resultSet.getString("fecha_pago"));
                informationDTO.setPrecio_final(resultSet.getFloat("precio_final"));
                listInfo.add(informationDTO);

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return listInfo;
    }

}
