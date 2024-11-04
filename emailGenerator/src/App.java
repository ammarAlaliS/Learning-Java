public class App {
    public static void main(String[] args) throws Exception {
        PersonalData personalData = new PersonalData(
                "Ubaldo López",
                "Inspiro",
                "com.ni"
                );
        personalData.emailGenerator();
    }
}

class PersonalData {
    String nombre;
    String empresa;
    String dominio;

    public PersonalData(String nombre, String empresa, String dominio) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.dominio = dominio;
    }

    void emailGenerator() {
        // El resultado final tiene que ser algo como "ubaldo.lopez@inspiro.com.ni"

        // Aquí reemplazamos los espacios por puntos.
        String contactName = nombre.replace(" ", ".");
        empresa = empresa.toLowerCase();

        // Concatenamos los strings con el signo de +
        String email = contactName + "@" + empresa + "." + dominio;
        System.out.println(email);

        // Segunda forma de concatenar
        String email2 = contactName.concat("@").concat(empresa).concat(".").concat(dominio);
        System.out.println(email2);

        // Tercera forma de concatenar en Java
        StringBuilder email3 = new StringBuilder().append(contactName).append("@").append(empresa).append(".").append(dominio);
        System.out.println(email3.toString());

        // Cuarta forma de concatenar en Java
        StringBuffer email4 = new StringBuffer().append(contactName).append("@").append(empresa).append(".").append(dominio);
        System.out.println(email4.toString());
    }
}
