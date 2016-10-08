public class PageServiceImpl implements IPageService {
    /**
     *
     * @param id
     */
    @Override
    public void makePage(String id) throws IOException {

        FileOutputStream fos = new FileOutputStream(new File("D:\\project\\springboot\\src\\main\\resources\\public\\template\\n.html"));

        File file1 = new File("D:\\project\\springboot\\src\\main\\resources\\public\\template\\n1.html");

        FileInputStream fis1 = new FileInputStream(file1);

        File file2 = new File("D:\\project\\springboot\\src\\main\\resources\\public\\template\\n2.html");
        FileInputStream fis2 = new FileInputStream(file2);



        List<InputStream> list = new ArrayList<InputStream>();
        list.add(fis1);
        list.add(fis2);
       // String s="<div th:fragemnt=\"test\">";
        InputStream is = new MultiSequenceInputStream(list);
        //InputStream is = new SequenceInputStream(fis1, fis2);

        byte[] arr = new byte[1024 * 20];
        int len = 0;
        String s = "<!DOCTYPE html>\n" +
                "<html xmlns:th=\"http://www.thymeleaf.org\"\n" +
                "      xmlns:layout=\"http://www.ultraq.net.nz/web/thymeleaf/layout\"  layout:decorate=\"~{layout_test}\">";
        fos.write(s.getBytes());
        while ((len = is.read(arr)) != -1) {
            fos.write(arr, 0, len);
            fos.flush();

        }
        String send = "</html>";
        fos.write(send.getBytes());
        fos.flush();
        is.close();
        fos.close();

        fis1.close();
        fis2.close();

    }

    public static void main(String[] args) throws IOException {
        PageServiceImpl psi = new PageServiceImpl();
        psi.makePage("1");

    }
}
