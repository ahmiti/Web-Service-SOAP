package Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(name = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConvertEuroToDH")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt*11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code")long code) {
        return new Compte(code,Math.random()*8000,new Date());
    }
    @WebMethod
    public List<Compte> getComptes(){
        List<Compte> cptes=new ArrayList<>();
        cptes.add(new Compte(1,Math.random()*8000,new Date()));
        cptes.add(new Compte(2,Math.random()*8000,new Date()));
        cptes.add(new Compte(3,Math.random()*8000,new Date()));
        return cptes;
    }
}