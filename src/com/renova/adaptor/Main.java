package com.renova.adaptor;

import java.util.Arrays;
import java.util.List;

// Adaptor desing pattern, iki uyumsuz interface in birbiri yerine kullanılmasını sağlar
// Bir adaptor yardımıyla bir nesne başka bir nesneye bağlanarak onun yerine kullanılması sağlanır.

/*
Bu örnekteki senaryoda sistemde oluşan hataların e-mail olarak gönderilmesi istenmiştir.
UIerror class ı diğer error classlarından farklı bir interface implement ettiği için uyumsuzluk olmaktadır.
bu sorun UıErrorAdaptor class ı oluşturularak çözülmüştür.
 */


public class Main {

    public static void main(String[] args) {
        DBerror dBerror = new DBerror(401, "Unauthorized request");
        ServiceError serviceError=new ServiceError(502 ,"Bad Gateway");
        UIerror uıError=new UIerror(202,"user error");

        UIerrorAdaptor _uıError=new UIerrorAdaptor(uıError);

        List<Error> errorList= Arrays.asList(dBerror,serviceError,_uıError);

        for (Error error: errorList){
            error.sendEmail();
        }

    }
}

