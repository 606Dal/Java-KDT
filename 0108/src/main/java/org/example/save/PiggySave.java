package org.example.save;

public class PiggySave {

    // 특별한 일이 없으면 private
    private int total;

    // 데이터에 접근하려고 해서 필요하면 메서드를 만듦.
    // 입금
    public void deposit(int amount){
        this.total += amount;
    }
    // 출금
    public int  withdraw(){

        int result = this.total;

        this.total = 0;

        return result;
    }

}
