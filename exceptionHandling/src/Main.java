public class Main {

    public static void main(String[] args) {
	// write your code here

        try{
            int[] sayilar= new int[] {1,2,3};
            System.out.println(sayilar[5]);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);

        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (Exception exception){
            System.out.println("LOGLANDI"+exception);
        }



        finally {
            {
                System.out.println("Ben her türlü çalışırım.");
            }
        }
    }
}
