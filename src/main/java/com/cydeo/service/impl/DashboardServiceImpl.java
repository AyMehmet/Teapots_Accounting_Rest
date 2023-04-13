package com.cydeo.service.impl;


import com.cydeo.service.DashboardService;
import com.cydeo.service.InvoiceProductService;
import com.cydeo.service.InvoiceService;
import org.springframework.stereotype.Service;

@Service
public class DashboardServiceImpl implements DashboardService {

    private final InvoiceService invoiceService;
    private final InvoiceProductService invoiceProductService;

    public DashboardServiceImpl(InvoiceService invoiceService, InvoiceProductService invoiceProductService) {
        this.invoiceService = invoiceService;
        this.invoiceProductService = invoiceProductService;

    }

//    @Override
//    public BigDecimal totalCostOfAllApprovedPurchaseInvoiceWithTax() {
//        return invoiceService.listPurchaseInvoices().
//                        stream().filter(p->p.getInvoiceStatus().getValue().equals("Approved"))
//                        .map(InvoiceDto::getTotal)
//                        .reduce(BigDecimal.ZERO,BigDecimal::add);
//    }
//
//    @Override
//    public BigDecimal totalSalesWithTax() {
//        return invoiceService.listSalesInvoices().
//                stream().filter(p->p.getInvoiceStatus().getValue().equals("Approved"))
//                .map(InvoiceDto::getTotal)
//                .reduce(BigDecimal.ZERO,BigDecimal::add);
//    }
//
//    @Override
//    public BigDecimal totalProfitLoss() {
//     return  invoiceProductService.findAllByCompany().
//             stream().map(invoiceProductDto -> invoiceProductDto.getProfitLoss())
//                .reduce(BigDecimal.ZERO, BigDecimal::add);
//       // securityService.getLoggedInUser().getCompany();
//
//
//    }
}