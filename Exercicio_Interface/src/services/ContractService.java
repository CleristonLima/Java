package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		
		// Adicionando manual para testar a logica
		/* contract.getInstallments().add(new Installment(LocalDate.of(2018, 7, 25), 206.04));
		contract.getInstallments().add(new Installment(LocalDate.of(2018, 8, 25), 208.08));*/
		
		double basicCota = contract.getTotalValue() / months;
		
		for (int i=1; i <= months; i++) {
			
			// Ira Adicionar o mes
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			// Calcula o juros de cada mes
			double interest = onlinePaymentService.interest(basicCota, i);
			
		    double fee = onlinePaymentService.paymentFee(basicCota + interest);
		    
		    double quota = basicCota + interest + fee;
		    
		    // Adicionando os dados como installments
		    
		    contract.getInstallments().add(new Installment(dueDate, quota));
		}
	}
}
