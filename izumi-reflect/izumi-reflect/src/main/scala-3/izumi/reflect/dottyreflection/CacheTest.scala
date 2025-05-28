package izumi.reflect.dottyreflection

import izumi.reflect.Tag
import izumi.reflect.dottyreflection.TypeInspections

class TypeInspectionsCachingTest {

  // (1) Define 500 distinct case classes to trigger compile-time work
  case class A0(a: Int)

  case class A1(a: Int)

  case class A2(a: Int)

  case class A3(a: Int)

  case class A4(a: Int)

  case class A5(a: Int)

  case class A6(a: Int)

  case class A7(a: Int)

  case class A8(a: Int)

  case class A9(a: Int)

  case class A10(a: Int)

  case class A11(a: Int)

  case class A12(a: Int)

  case class A13(a: Int)

  case class A14(a: Int)

  case class A15(a: Int)

  case class A16(a: Int)

  case class A17(a: Int)

  case class A18(a: Int)

  case class A19(a: Int)

  case class A20(a: Int)

  case class A21(a: Int)

  case class A22(a: Int)

  case class A23(a: Int)

  case class A24(a: Int)

  case class A25(a: Int)

  case class A26(a: Int)

  case class A27(a: Int)

  case class A28(a: Int)

  case class A29(a: Int)

  case class A30(a: Int)

  case class A31(a: Int)

  case class A32(a: Int)

  case class A33(a: Int)

  case class A34(a: Int)

  case class A35(a: Int)

  case class A36(a: Int)

  case class A37(a: Int)

  case class A38(a: Int)

  case class A39(a: Int)

  case class A40(a: Int)

  case class A41(a: Int)

  case class A42(a: Int)

  case class A43(a: Int)

  case class A44(a: Int)

  case class A45(a: Int)

  case class A46(a: Int)

  case class A47(a: Int)

  case class A48(a: Int)

  case class A49(a: Int)

  case class A50(a: Int)

  case class A51(a: Int)

  case class A52(a: Int)

  case class A53(a: Int)

  case class A54(a: Int)

  case class A55(a: Int)

  case class A56(a: Int)

  case class A57(a: Int)

  case class A58(a: Int)

  case class A59(a: Int)

  case class A60(a: Int)

  case class A61(a: Int)

  case class A62(a: Int)

  case class A63(a: Int)

  case class A64(a: Int)

  case class A65(a: Int)

  case class A66(a: Int)

  case class A67(a: Int)

  case class A68(a: Int)

  case class A69(a: Int)

  case class A70(a: Int)

  case class A71(a: Int)

  case class A72(a: Int)

  case class A73(a: Int)

  case class A74(a: Int)

  case class A75(a: Int)

  case class A76(a: Int)

  case class A77(a: Int)

  case class A78(a: Int)

  case class A79(a: Int)

  case class A80(a: Int)

  case class A81(a: Int)

  case class A82(a: Int)

  case class A83(a: Int)

  case class A84(a: Int)

  case class A85(a: Int)

  case class A86(a: Int)

  case class A87(a: Int)

  case class A88(a: Int)

  case class A89(a: Int)

  case class A90(a: Int)

  case class A91(a: Int)

  case class A92(a: Int)

  case class A93(a: Int)

  case class A94(a: Int)

  case class A95(a: Int)

  case class A96(a: Int)

  case class A97(a: Int)

  case class A98(a: Int)

  case class A99(a: Int)

  case class A100(a: Int)

  case class A101(a: Int)

  case class A102(a: Int)

  case class A103(a: Int)

  case class A104(a: Int)

  case class A105(a: Int)

  case class A106(a: Int)

  case class A107(a: Int)

  case class A108(a: Int)

  case class A109(a: Int)

  case class A110(a: Int)

  case class A111(a: Int)

  case class A112(a: Int)

  case class A113(a: Int)

  case class A114(a: Int)

  case class A115(a: Int)

  case class A116(a: Int)

  case class A117(a: Int)

  case class A118(a: Int)

  case class A119(a: Int)

  case class A120(a: Int)

  case class A121(a: Int)

  case class A122(a: Int)

  case class A123(a: Int)

  case class A124(a: Int)

  case class A125(a: Int)

  case class A126(a: Int)

  case class A127(a: Int)

  case class A128(a: Int)

  case class A129(a: Int)

  case class A130(a: Int)

  case class A131(a: Int)

  case class A132(a: Int)

  case class A133(a: Int)

  case class A134(a: Int)

  case class A135(a: Int)

  case class A136(a: Int)

  case class A137(a: Int)

  case class A138(a: Int)

  case class A139(a: Int)

  case class A140(a: Int)

  case class A141(a: Int)

  case class A142(a: Int)

  case class A143(a: Int)

  case class A144(a: Int)

  case class A145(a: Int)

  case class A146(a: Int)

  case class A147(a: Int)

  case class A148(a: Int)

  case class A149(a: Int)

  case class A150(a: Int)

  case class A151(a: Int)

  case class A152(a: Int)

  case class A153(a: Int)

  case class A154(a: Int)

  case class A155(a: Int)

  case class A156(a: Int)

  case class A157(a: Int)

  case class A158(a: Int)

  case class A159(a: Int)

  case class A160(a: Int)

  case class A161(a: Int)

  case class A162(a: Int)

  case class A163(a: Int)

  case class A164(a: Int)

  case class A165(a: Int)

  case class A166(a: Int)

  case class A167(a: Int)

  case class A168(a: Int)

  case class A169(a: Int)

  case class A170(a: Int)

  case class A171(a: Int)

  case class A172(a: Int)

  case class A173(a: Int)

  case class A174(a: Int)

  case class A175(a: Int)

  case class A176(a: Int)

  case class A177(a: Int)

  case class A178(a: Int)

  case class A179(a: Int)

  case class A180(a: Int)

  case class A181(a: Int)

  case class A182(a: Int)

  case class A183(a: Int)

  case class A184(a: Int)

  case class A185(a: Int)

  case class A186(a: Int)

  case class A187(a: Int)

  case class A188(a: Int)

  case class A189(a: Int)

  case class A190(a: Int)

  case class A191(a: Int)

  case class A192(a: Int)

  case class A193(a: Int)

  case class A194(a: Int)

  case class A195(a: Int)

  case class A196(a: Int)

  case class A197(a: Int)

  case class A198(a: Int)

  case class A199(a: Int)

  case class A200(a: Int)

  case class A201(a: Int)

  case class A202(a: Int)

  case class A203(a: Int)

  case class A204(a: Int)

  case class A205(a: Int)

  case class A206(a: Int)

  case class A207(a: Int)

  case class A208(a: Int)

  case class A209(a: Int)

  case class A210(a: Int)

  case class A211(a: Int)

  case class A212(a: Int)

  case class A213(a: Int)

  case class A214(a: Int)

  case class A215(a: Int)

  case class A216(a: Int)

  case class A217(a: Int)

  case class A218(a: Int)

  case class A219(a: Int)

  case class A220(a: Int)

  case class A221(a: Int)

  case class A222(a: Int)

  case class A223(a: Int)

  case class A224(a: Int)

  case class A225(a: Int)

  case class A226(a: Int)

  case class A227(a: Int)

  case class A228(a: Int)

  case class A229(a: Int)

  case class A230(a: Int)

  case class A231(a: Int)

  case class A232(a: Int)

  case class A233(a: Int)

  case class A234(a: Int)

  case class A235(a: Int)

  case class A236(a: Int)

  case class A237(a: Int)

  case class A238(a: Int)

  case class A239(a: Int)

  case class A240(a: Int)

  case class A241(a: Int)

  case class A242(a: Int)

  case class A243(a: Int)

  case class A244(a: Int)

  case class A245(a: Int)

  case class A246(a: Int)

  case class A247(a: Int)

  case class A248(a: Int)

  case class A249(a: Int)

  case class A250(a: Int)

  case class A251(a: Int)

  case class A252(a: Int)

  case class A253(a: Int)

  case class A254(a: Int)

  case class A255(a: Int)

  case class A256(a: Int)

  case class A257(a: Int)

  case class A258(a: Int)

  case class A259(a: Int)

  case class A260(a: Int)

  case class A261(a: Int)

  case class A262(a: Int)

  case class A263(a: Int)

  case class A264(a: Int)

  case class A265(a: Int)

  case class A266(a: Int)

  case class A267(a: Int)

  case class A268(a: Int)

  case class A269(a: Int)

  case class A270(a: Int)

  case class A271(a: Int)

  case class A272(a: Int)

  case class A273(a: Int)

  case class A274(a: Int)

  case class A275(a: Int)

  case class A276(a: Int)

  case class A277(a: Int)

  case class A278(a: Int)

  case class A279(a: Int)

  case class A280(a: Int)

  case class A281(a: Int)

  case class A282(a: Int)

  case class A283(a: Int)

  case class A284(a: Int)

  case class A285(a: Int)

  case class A286(a: Int)

  case class A287(a: Int)

  case class A288(a: Int)

  case class A289(a: Int)

  case class A290(a: Int)

  case class A291(a: Int)

  case class A292(a: Int)

  case class A293(a: Int)

  case class A294(a: Int)

  case class A295(a: Int)

  case class A296(a: Int)

  case class A297(a: Int)

  case class A298(a: Int)

  case class A299(a: Int)

  case class A300(a: Int)

  case class A301(a: Int)

  case class A302(a: Int)

  case class A303(a: Int)

  case class A304(a: Int)

  case class A305(a: Int)

  case class A306(a: Int)

  case class A307(a: Int)

  case class A308(a: Int)

  case class A309(a: Int)

  case class A310(a: Int)

  case class A311(a: Int)

  case class A312(a: Int)

  case class A313(a: Int)

  case class A314(a: Int)

  case class A315(a: Int)

  case class A316(a: Int)

  case class A317(a: Int)

  case class A318(a: Int)

  case class A319(a: Int)

  case class A320(a: Int)

  case class A321(a: Int)

  case class A322(a: Int)

  case class A323(a: Int)

  case class A324(a: Int)

  case class A325(a: Int)

  case class A326(a: Int)

  case class A327(a: Int)

  case class A328(a: Int)

  case class A329(a: Int)

  case class A330(a: Int)

  case class A331(a: Int)

  case class A332(a: Int)

  case class A333(a: Int)

  case class A334(a: Int)

  case class A335(a: Int)

  case class A336(a: Int)

  case class A337(a: Int)

  case class A338(a: Int)

  case class A339(a: Int)

  case class A340(a: Int)

  case class A341(a: Int)

  case class A342(a: Int)

  case class A343(a: Int)

  case class A344(a: Int)

  case class A345(a: Int)

  case class A346(a: Int)

  case class A347(a: Int)

  case class A348(a: Int)

  case class A349(a: Int)

  case class A350(a: Int)

  case class A351(a: Int)

  case class A352(a: Int)

  case class A353(a: Int)

  case class A354(a: Int)

  case class A355(a: Int)

  case class A356(a: Int)

  case class A357(a: Int)

  case class A358(a: Int)

  case class A359(a: Int)

  case class A360(a: Int)

  case class A361(a: Int)

  case class A362(a: Int)

  case class A363(a: Int)

  case class A364(a: Int)

  case class A365(a: Int)

  case class A366(a: Int)

  case class A367(a: Int)

  case class A368(a: Int)

  case class A369(a: Int)

  case class A370(a: Int)

  case class A371(a: Int)

  case class A372(a: Int)

  case class A373(a: Int)

  case class A374(a: Int)

  case class A375(a: Int)

  case class A376(a: Int)

  case class A377(a: Int)

  case class A378(a: Int)

  case class A379(a: Int)

  case class A380(a: Int)

  case class A381(a: Int)

  case class A382(a: Int)

  case class A383(a: Int)

  case class A384(a: Int)

  case class A385(a: Int)

  case class A386(a: Int)

  case class A387(a: Int)

  case class A388(a: Int)

  case class A389(a: Int)

  case class A390(a: Int)

  case class A391(a: Int)

  case class A392(a: Int)

  case class A393(a: Int)

  case class A394(a: Int)

  case class A395(a: Int)

  case class A396(a: Int)

  case class A397(a: Int)

  case class A398(a: Int)

  case class A399(a: Int)

  case class A400(a: Int)

  case class A401(a: Int)

  case class A402(a: Int)

  case class A403(a: Int)

  case class A404(a: Int)

  case class A405(a: Int)

  case class A406(a: Int)

  case class A407(a: Int)

  case class A408(a: Int)
}