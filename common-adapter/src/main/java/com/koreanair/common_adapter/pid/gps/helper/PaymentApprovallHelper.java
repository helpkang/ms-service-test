package com.koreanair.common_adapter.pid.gps.helper;

import com.koreanair.common_adapter.pid.gps.vo.PaymentApprovalInputVo;
import com.koreanair.common_adapter.pid.gps.vo.PaymentApprovalOutputVo;
import com.koreanair.common_external.pid.gps.approvalRequest.ApprovalRequestService;
import com.koreanair.common_external.pid.gps.approvalRequest.GeneralInfo2;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class PaymentApprovallHelper {

    public ApprovalRequestService makeApprovalRequestServiceInput(PaymentApprovalInputVo input) {
        ApprovalRequestService inputVo = new ApprovalRequestService();
        BeanUtils.copyProperties(inputVo, input);
        return inputVo;
    }

    public PaymentApprovalOutputVo makeApprovalRequestServiceOutput(GeneralInfo2 output) {
        PaymentApprovalOutputVo outputVo = new PaymentApprovalOutputVo();
        return outputVo;
    }
}
