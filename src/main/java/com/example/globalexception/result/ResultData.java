package com.example.globalexception.result;

/**
 * ResultData:封装数据且以json格式返回
 *
 * @author zhangxiaoxiang
 * @date: 2019/06/25
 */
public class ResultData {


    /**
     * 成功返回
     *
     * @param msg
     * @return
     */
    public static ResultVO success(String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(200);
        resultVO.setMsg(msg);
        resultVO.setData(null);
        return resultVO;
    }

    public static ResultVO success(String msg, Object data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(200);
        resultVO.setMsg(msg);
        resultVO.setData(data);
        return resultVO;
    }

    /**
     * 失败返回
     *
     * @param msg
     * @return
     */
    public static ResultVO failure(String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(500);
        resultVO.setMsg(msg);
        resultVO.setData(null);
        return resultVO;
    }

    /**
     * 身份验证失败返回
     *
     * @param msg
     * @return
     */
    public static ResultVO noVerify(String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(401);
        resultVO.setMsg(msg);
        resultVO.setData(null);
        return resultVO;
    }
}
