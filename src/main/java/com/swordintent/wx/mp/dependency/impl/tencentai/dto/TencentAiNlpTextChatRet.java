package com.swordintent.wx.mp.dependency.impl.tencentai.dto;

import com.swordintent.wx.mp.dependency.impl.tencentai.dto.BaseTencentAiRet;
import lombok.Data;

@Data
public class TencentAiNlpTextChatRet extends BaseTencentAiRet {

    private TencentAiNlpTextChatInner data;

    @Data
    public class TencentAiNlpTextChatInner {
        private String session;

        private String answer;
    }
}
