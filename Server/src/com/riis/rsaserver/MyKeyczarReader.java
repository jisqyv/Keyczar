package com.riis.rsaserver;

import org.keyczar.interfaces.KeyczarReader;

public class MyKeyczarReader implements KeyczarReader {

    public MyKeyczarReader() {
    }

    public String getKey() {
    	return "{\"publicKey\":{\"modulus\":\"AKEhukbbC7TgsR2kfwuYL7GX4o0wq-3q_hr0NxfJRZTBQd77qxEmVOrTj5TUlNu_FTBojjkeySV4PgGiF9bDqLjz1QvBXAcF17dhm8WQOqO2foe82o0NyGJySG8W5BgICrpz699_YZJm_m6k13f2MsKMyVLC_xuaa7awLrLAEJHVaRKqmZsSlM0nOx5Ds2GtcLopNdIZ_v56hg3GTSfJ972RC4oWanzxVxRBDh9xXIFJUKR67Xta-wOnFkQgk2qnc4MKYzjpj7iZotjzm-pTcElgYfEZzaMuyHbfru_5_ZBJIgokVw88YWjYLGQzNtfi8jTLtw8gVNoV1mwoWjMcaTUBOZMBIg_v6GGi7M44nQnYQKPjkk7zCBGD4ea6sQ0AfApy_-ziFFO-WiwWmcI9L8TzUUWK6byEuAXwPp9IE8XjLhykMxfxhbtCTmAMzF018D5XAueFHmpzrwg-ShzKL_7yx4hRpGUiYObC0MU1UxAec2i_qdMRSx83cMD5rro-d31pGmFpa7mOh2PyN_s_Xq2HnpAyM4l6KoRIJvr0XR2HIAThpsXhrtHcwPPvl4gQLtmDUWl169vt9p34kEPPOtizd4HpyDIx7vFEKEuTLkHdhESR19MU3aWTh76Dc3Ma46Tiq5KPLJ9hDQDFWIcVt0QW0fFRaoDII7_ajEv6dItj\",\"publicExponent\":\"AQAB\",\"size\":4096},\"privateExponent\":\"bMmPsXz8V1-IVSIVYGecc8O_AmJFAfmxG9OcSqPqJXehGIJDye1eUbkKbIpmAkLtdGRy-V-uoGyhOIsOm0I4bL67LRecIWWxca8l82ngHV396Xj4-Vi_3K-Z9d63mv36-E2Bh8DByI1e5KbIjsabGLziw8zBXgqRBKPIs4h25271ZNPnp0oRSr1c7Z75wk3OGPHv020XuwpP7Ybf2qhCais-ZjmiJb7vcs5FUbdApE0ydApGwgz4AkxR_ScdQFnT5DokKW2PSiv4RY-bycYRvoijN5ubObxBPfjhbEYVCtBFeiF04eV7QsUIm5H0SieALWMIsd67Sw6JWTaZR368DCd55sTyb4vxyKZR9dmcgk4P0N20orGqH_A9c0wRHu2FDydDpsm-XmiyUyQFE1GZIddoKVOZj2-AAwZTO2WXL0gsycyn1M2DZcjbUcu4p4PPKZOeczK9JPfHSpoCFr068iIFwbkxdSzNe5SNYGMCW1sZ8XaDSMHACfQsrw1uphVd3-p2nlAdS8-VSX_NdNWB_vi8UgElqXD5V8nhqOBp0Oj9igcYD9PotXA3rnKcVQRx-hBwOq6_VMa_ZhyDW2mgifCJvpO79gTatr0-A6RmK7j2-1A3t9gtO0tRxZP_RQWSc9-0EWM7tlI2iltLrDNRPEGdcZXP2K4D1IXLjgSTVGE\",\"primeP\":\"AOjZ-Jalixu8wRcRDZyDij4I09j1dtwAIRi_jFs6HNzEVExeghf4dgWJ_qpm2ogCce7RTc9aUnJUQF5rqTkB6fG_aQ2X6dpAQxARQ9NTEsLQur2rpyyxEe-t6TL8u9tTRmY8tfzvS2KHPBGLEMzKGPgzKQpkbc3bT48o6azrQcLAsNBMBzxwbsEAK1e3o6ZtMdS9IKGMplByrM3Y_-273CYUOypYWlNhRKIaHYhKBpbo8oz3UhiTjJdpkJPMaAgd7JQJ2sjb4eplDTZcpTT8wLf1XS3lzvrGM6wL6wMJjWvfrij9u2aIYEOFz-1JJwBZ32T55P0qpWzOdLHOuoTQh9E\",\"primeQ\":\"ALEmgK6ZrQsC3QkF1LBKJSa2J81AnKVaxQGZyL_i_2YEHRaX_HQvOWPl4WtvEw_Xmcv3vq_frd_Hk_AbPN8BKwsLmqkyoTZ77D6RQ-uDvoURAc9AeV5DTvyuWsYlxWxPQ57AIe5OItZV4jNG-9Si9toIv8ccH-SEiA7bghlTGQThujyl9qtARRBqiP1TwnidH_fN0uKwdw8oP2qm1UAor2ydZwUVQIcbszZx3xAi-iouuj4Bkzmfuzw2pMbsL27wa9X_fg2Z_YEkhB8ULhwWRrjOWqP1TUwmJ77liBSdhd4XTAjbU78QQbI6LIvQ3pf8cd0j3OQBGi88xUqt0hLRoPM\",\"primeExponentP\":\"AKBOiD02pSmoborx25wYV1FUBH1GqNjXYfHG1dtsi7hVle-p1Qiprp8rnN81xleCz2tqP5Z0iXRamqImnq83qRcc_zczkfUG7uSd7kML20uyJg40ofg7w6xt37GRm8docnwqaeRD3nNrxSgSxLMoo74kgqm78Hib9w8JTK8WnAR3YoNVBFpQ0X8gHbbbH9iRLpBW0KNH0Kxr9poVPkUuY2b34K_LegwTWAv9zL0qsZSttWblUmjHFDCdpcKLJEgKSfi1PCGyd7tGbK0zZS2woQFE9CyIHVI6qBJXdil2Jx3QNffUj3MMirGR609iYG52cTz0afj9pjvdeyt6tqB_bDE\",\"primeExponentQ\":\"KiVm6CNXsA72V3czqt15CUS9I3AD1LNLu53CzSRMbxD7eqyeO2Yg2UuP3eeHOXWp-YTvsRgeXec1oyJX0RaODwqruSV6hWPmSNx2tEmbwjzRmWVVer-4wxUYM5w45BPXmqVLbU7ZqvSz5E83CtfasvTx64UdcVi2phJDWZMTmL27eUJi9UtNIyK1hM-wrNF1EZe-XIBvUwPYUp9ujN0hH04zfFoaCArnEET3NPedXPvRA3-Mb2E5QpIdkdYPUu2QOlGWw9WnIlp1tI8wiS4jlURC_E8YHM3XFuu0_HKdrsEMLe9AdWyAtM5yWrFOxAojbOFjZDt-504mAiZonGGTUQ\",\"crtCoefficient\":\"ALAm78KclBAY3Xe8G6LYgHBzBSCqUogrQ2U5R3rHCatrzpoIO7IbNGKiKFlDZBOQqLd-n3ueFclkl76KpRD8ZJ6AkIgbS0SCW_n0ure8idQepbbG4z8ZfuIRtVqESIb6EoKnY5ugG5vopOM0oT8_fCgFTaWUEzBPOV6MicsH0L-fvp_fatVi3n5ars2QSdVBje-MDmJpAaiiTJJoFInONPAnNk5DnU5hgKkyep_qFDrvw09j96eZoNX72kethPHU_Bou2oYlWuedVpAoQJINlWfNWa05K5Nr_QmfSZsB02yLx0QzHKWnB82npqHdp_WihduGkaPF4MNKljcs-vGnlIA\",\"size\":4096}";
    }
    
	public String getKey(int arg0){
        return getKey();
	}

    public String getMetadata(){
    	return "{\"name\":\"\",\"purpose\":\"DECRYPT_AND_ENCRYPT\",\"type\":\"RSA_PRIV\",\"versions\":[{\"exportable\":false,\"status\":\"PRIMARY\",\"versionNumber\":1}],\"encrypted\":false}";
    }
}