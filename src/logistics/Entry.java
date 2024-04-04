package logistics;

public class Entry {
private String title;
private String body;
private int date;
private int id;

        public Entry(String title, String body, int date, int id) {
            this.title = title;
            this.body = body;
            this.date = date;
            this.id = id;
        }

        public void diary() {

            System.out.println("Title: " + title);
            System.out.println("Body: " + body);
            System.out.println("Date: " + date);
            System.out.println("ID: " + id);
        }


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public int getDate() {
            return date;
        }

        public void setDate(int date){

        }


    }
