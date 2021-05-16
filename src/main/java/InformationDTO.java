public class InformationDTO {
    
    private String cliente_id;
    private String cliente_name;
    private String event_name;
    private int num_boleta;
    private String tipo_pago;
    private String fecha;
    private float precio_final;

    public InformationDTO(){

    }

    public String getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(String cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public int getNum_boleta() {
        return num_boleta;
    }

    public void setNum_boleta(int num_boleta) {
        this.num_boleta = num_boleta;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(float precio_final) {
        this.precio_final = precio_final;
    }

    public String getCliente_name() {
        return cliente_name;
    }

    public void setCliente_name(String cliente_name) {
        this.cliente_name = cliente_name;
    }

    @Override
    public String toString() {
        return  " | DNI: " + cliente_id +
                " | Nombre: " + cliente_name +
                " | Evento: " + event_name +
                " | Boletas: " + num_boleta +
                " | Medio de pago: " + tipo_pago +
                " | Fecha de pago: " + fecha +
                " | Total: " + precio_final;
    }
}
