package Team;

import java.util.Arrays;

public class BookRental {
    public static BookVO[] rentalHistory=new BookVO[5];//대여정보를 저장하는 배열 입니다.대여성공될떄마다 정보를 배열에 저장
    /*
    * 대여기능은 도서검색후 그 도서가 현재 도서 목록에 있고, 해당 도서가 대여중이지 않을떄 대여가 가능하게 하시면됩니다.
    * 즉 대여중인 도서는
    * */

    public BookRental() {

    }
    public BookVO[]  retalHistorySizeUp(){
        BookVO[] temp=new BookVO[10];
        System.arraycopy(temp,0,rentalHistory,0,temp.length-1);
        System.out.println(Arrays.toString(temp));
        rentalHistory=temp;
        return rentalHistory;

    }

    public void a() {
    }
}
