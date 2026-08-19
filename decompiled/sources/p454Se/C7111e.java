package p454Se;

import android.app.Application;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import io.sentry.android.core.AbstractC15256t;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.C16644c;
import mm.C17296C;
import p025An.C0644w;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2142L;
import p103Dn.C2176e;
import p103Dn.InterfaceC2186j;
import p1111xl.C21296a;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21903D;
import p1155zi.C21907E;
import p1155zi.C21908E0;
import p1155zi.C21929J1;
import p1155zi.C21941M1;
import p1155zi.C21945N1;
import p1155zi.C21952P1;
import p1155zi.C21965U0;
import p1155zi.C22071w0;
import p1155zi.EnumC21968V0;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p232J3.C4206F;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6228b;
import p364Oh.C6248v;
import p434Rk.C6911c;
import p480Te.C7388m;
import p480Te.C7391p;
import p480Te.C7392q;
import p523V9.AbstractC7934L5;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC8160o6;
import p538W2.C8422g;
import p556Wk.C8920e;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p792hl.AbstractC14527b;
import p909nm.AbstractC17680n;
import p967qh.C18711a;
import p967qh.C18712b;
import p967qh.C18713c;
import p967qh.C18714d;
import p967qh.C18716f;
import p972qm.InterfaceC18770c;
import p991rh.C18997f;
import p991rh.EnumC18991F;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Se.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C7111e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C18711a f22628Y;

    /* JADX INFO: renamed from: Z */
    public String f22629Z;

    /* JADX INFO: renamed from: o0 */
    public String f22630o0;

    /* JADX INFO: renamed from: p0 */
    public AbstractC6224C f22631p0;

    /* JADX INFO: renamed from: q0 */
    public C16525B f22632q0;

    /* JADX INFO: renamed from: r0 */
    public int f22633r0;

    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ Object f22634s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ EnumC18991F f22635t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C7112f f22636u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ Uri f22637v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ Uri f22638w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ String f22639x0;

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ String f22640y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7111e(EnumC18991F enumC18991F, C7112f c7112f, Uri uri, Uri uri2, String str, String str2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f22635t0 = enumC18991F;
        this.f22636u0 = c7112f;
        this.f22637v0 = uri;
        this.f22638w0 = uri2;
        this.f22639x0 = str;
        this.f22640y0 = str2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C7111e c7111e = new C7111e(this.f22635t0, this.f22636u0, this.f22637v0, this.f22638w0, this.f22639x0, this.f22640y0, interfaceC18770c);
        c7111e.f22634s0 = obj;
        return c7111e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7111e) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:127:0x031e A[Catch: all -> 0x0311, TRY_LEAVE, TryCatch #21 {all -> 0x0311, blocks: (B:111:0x02e2, B:115:0x0308, B:127:0x031e, B:125:0x031a, B:126:0x031d, B:113:0x02ee, B:122:0x0317), top: B:393:0x02e2, inners: #22, #25 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x033e  */
    /* JADX WARN: Code duplicated, block: B:133:0x034f  */
    /* JADX WARN: Code duplicated, block: B:141:0x035e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0387 A[Catch: all -> 0x0399, Exception -> 0x039d, TryCatch #11 {Exception -> 0x039d, blocks: (B:143:0x0381, B:145:0x0387, B:147:0x038e), top: B:374:0x0381 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:177:0x03fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:178:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:183:0x0412 A[Catch: Exception -> 0x0415, TryCatch #20 {Exception -> 0x0415, blocks: (B:181:0x0409, B:183:0x0412, B:188:0x0422, B:190:0x0428, B:192:0x042c, B:195:0x0432, B:197:0x0436, B:201:0x0448), top: B:391:0x0409 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x041f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0422 A[Catch: Exception -> 0x0415, TryCatch #20 {Exception -> 0x0415, blocks: (B:181:0x0409, B:183:0x0412, B:188:0x0422, B:190:0x0428, B:192:0x042c, B:195:0x0432, B:197:0x0436, B:201:0x0448), top: B:391:0x0409 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0427  */
    /* JADX WARN: Code duplicated, block: B:192:0x042c A[Catch: Exception -> 0x0415, TryCatch #20 {Exception -> 0x0415, blocks: (B:181:0x0409, B:183:0x0412, B:188:0x0422, B:190:0x0428, B:192:0x042c, B:195:0x0432, B:197:0x0436, B:201:0x0448), top: B:391:0x0409 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x042f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0432 A[Catch: Exception -> 0x0415, TryCatch #20 {Exception -> 0x0415, blocks: (B:181:0x0409, B:183:0x0412, B:188:0x0422, B:190:0x0428, B:192:0x042c, B:195:0x0432, B:197:0x0436, B:201:0x0448), top: B:391:0x0409 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x0468 A[Catch: Exception -> 0x0473, TRY_ENTER, TryCatch #6 {Exception -> 0x0473, blocks: (B:206:0x0468, B:212:0x0485, B:214:0x0489, B:217:0x048f, B:219:0x0498, B:209:0x0477, B:210:0x047e), top: B:368:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x0477 A[Catch: Exception -> 0x0473, TryCatch #6 {Exception -> 0x0473, blocks: (B:206:0x0468, B:212:0x0485, B:214:0x0489, B:217:0x048f, B:219:0x0498, B:209:0x0477, B:210:0x047e), top: B:368:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:214:0x0489 A[Catch: Exception -> 0x0473, TryCatch #6 {Exception -> 0x0473, blocks: (B:206:0x0468, B:212:0x0485, B:214:0x0489, B:217:0x048f, B:219:0x0498, B:209:0x0477, B:210:0x047e), top: B:368:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x048c  */
    /* JADX WARN: Code duplicated, block: B:217:0x048f A[Catch: Exception -> 0x0473, TryCatch #6 {Exception -> 0x0473, blocks: (B:206:0x0468, B:212:0x0485, B:214:0x0489, B:217:0x048f, B:219:0x0498, B:209:0x0477, B:210:0x047e), top: B:368:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x050f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:245:0x0511  */
    /* JADX WARN: Code duplicated, block: B:246:0x0518  */
    /* JADX WARN: Code duplicated, block: B:248:0x051c  */
    /* JADX WARN: Code duplicated, block: B:249:0x051f  */
    /* JADX WARN: Code duplicated, block: B:251:0x0523  */
    /* JADX WARN: Code duplicated, block: B:254:0x0546 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:256:0x0548  */
    /* JADX WARN: Code duplicated, block: B:258:0x054e  */
    /* JADX WARN: Code duplicated, block: B:260:0x0594 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:261:0x0595  */
    /* JADX WARN: Code duplicated, block: B:264:0x059f  */
    /* JADX WARN: Code duplicated, block: B:266:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:267:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:269:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:270:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:272:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:275:0x05dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:277:0x05df  */
    /* JADX WARN: Code duplicated, block: B:279:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:281:0x05fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:282:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:289:0x063c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:292:0x0643 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:293:0x0645  */
    /* JADX WARN: Code duplicated, block: B:294:0x064c  */
    /* JADX WARN: Code duplicated, block: B:296:0x0650  */
    /* JADX WARN: Code duplicated, block: B:297:0x0653  */
    /* JADX WARN: Code duplicated, block: B:299:0x0657  */
    /* JADX WARN: Code duplicated, block: B:302:0x067b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:304:0x067d  */
    /* JADX WARN: Code duplicated, block: B:306:0x0683  */
    /* JADX WARN: Code duplicated, block: B:308:0x068e  */
    /* JADX WARN: Code duplicated, block: B:310:0x06ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:313:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:315:0x06ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:319:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:321:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:322:0x0700  */
    /* JADX WARN: Code duplicated, block: B:324:0x0704  */
    /* JADX WARN: Code duplicated, block: B:325:0x0735  */
    /* JADX WARN: Code duplicated, block: B:327:0x075b  */
    /* JADX WARN: Code duplicated, block: B:329:0x075f  */
    /* JADX WARN: Code duplicated, block: B:330:0x0762  */
    /* JADX WARN: Code duplicated, block: B:332:0x0766  */
    /* JADX WARN: Code duplicated, block: B:335:0x078a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:337:0x078c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0151  */
    /* JADX WARN: Code duplicated, block: B:346:0x079c  */
    /* JADX WARN: Code duplicated, block: B:348:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:349:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:352:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:356:0x07da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:373:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0166 A[Catch: all -> 0x02a8, TRY_LEAVE, TryCatch #5 {all -> 0x02a8, blocks: (B:35:0x0162, B:37:0x0166), top: B:366:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:391:0x0409 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x02ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0794 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x017a A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #24 {all -> 0x0196, blocks: (B:40:0x0174, B:42:0x017a, B:66:0x0215, B:79:0x0280, B:86:0x0293, B:87:0x0296, B:47:0x0198, B:59:0x01c1, B:65:0x0212, B:78:0x027d, B:84:0x028f, B:85:0x0292, B:54:0x01ad, B:57:0x01b6, B:58:0x01bc, B:60:0x01dd, B:62:0x01e7, B:64:0x01ed, B:71:0x0228, B:73:0x0232, B:75:0x024e, B:77:0x027a, B:82:0x028b, B:83:0x028e, B:74:0x023e, B:76:0x0257), top: B:398:0x0174, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ad A[Catch: all -> 0x01b3, TryCatch #10 {all -> 0x01b3, blocks: (B:47:0x0198, B:59:0x01c1, B:65:0x0212, B:78:0x027d, B:84:0x028f, B:85:0x0292, B:54:0x01ad, B:57:0x01b6, B:58:0x01bc, B:60:0x01dd, B:62:0x01e7, B:64:0x01ed, B:71:0x0228, B:73:0x0232, B:75:0x024e, B:77:0x027a, B:82:0x028b, B:83:0x028e, B:74:0x023e, B:76:0x0257), top: B:373:0x0198, outer: #24, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x01b6 A[Catch: all -> 0x01b3, TryCatch #10 {all -> 0x01b3, blocks: (B:47:0x0198, B:59:0x01c1, B:65:0x0212, B:78:0x027d, B:84:0x028f, B:85:0x0292, B:54:0x01ad, B:57:0x01b6, B:58:0x01bc, B:60:0x01dd, B:62:0x01e7, B:64:0x01ed, B:71:0x0228, B:73:0x0232, B:75:0x024e, B:77:0x027a, B:82:0x028b, B:83:0x028e, B:74:0x023e, B:76:0x0257), top: B:373:0x0198, outer: #24, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01bc A[Catch: all -> 0x01b3, TryCatch #10 {all -> 0x01b3, blocks: (B:47:0x0198, B:59:0x01c1, B:65:0x0212, B:78:0x027d, B:84:0x028f, B:85:0x0292, B:54:0x01ad, B:57:0x01b6, B:58:0x01bc, B:60:0x01dd, B:62:0x01e7, B:64:0x01ed, B:71:0x0228, B:73:0x0232, B:75:0x024e, B:77:0x027a, B:82:0x028b, B:83:0x028e, B:74:0x023e, B:76:0x0257), top: B:373:0x0198, outer: #24, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0226  */
    /* JADX WARN: Code duplicated, block: B:73:0x0232 A[Catch: all -> 0x0224, TryCatch #2 {all -> 0x0224, blocks: (B:60:0x01dd, B:62:0x01e7, B:64:0x01ed, B:71:0x0228, B:73:0x0232, B:75:0x024e, B:77:0x027a, B:82:0x028b, B:83:0x028e, B:74:0x023e, B:76:0x0257), top: B:365:0x01dd, outer: #10, inners: #19 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x023e A[Catch: all -> 0x0224, TryCatch #2 {all -> 0x0224, blocks: (B:60:0x01dd, B:62:0x01e7, B:64:0x01ed, B:71:0x0228, B:73:0x0232, B:75:0x024e, B:77:0x027a, B:82:0x028b, B:83:0x028e, B:74:0x023e, B:76:0x0257), top: B:365:0x01dd, outer: #10, inners: #19 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02b3  */
    /* JADX WARN: Instruction removed from duplicated block: B:127:0x031e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:346:0x079c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00e5: MOVE (r7 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:230), block:B:20:0x00e1 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0474: MOVE (r7 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:1140), block:B:208:0x0474 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00e6: MOVE (r8 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:231), block:B:20:0x00e1 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0475: MOVE (r8 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:1141), block:B:208:0x0474 */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x00e8: MOVE (r3 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]) (LINE:234), block:B:20:0x00e1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v213 */
    /* JADX WARN: Type inference failed for: r0v214 */
    /* JADX WARN: Type inference failed for: r0v215 */
    /* JADX WARN: Type inference failed for: r0v216 */
    /* JADX WARN: Type inference failed for: r0v218 */
    /* JADX WARN: Type inference failed for: r0v219 */
    /* JADX WARN: Type inference failed for: r0v220 */
    /* JADX WARN: Type inference failed for: r0v221 */
    /* JADX WARN: Type inference failed for: r0v224 */
    /* JADX WARN: Type inference failed for: r0v227 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v39, types: [Oh.C] */
    /* JADX WARN: Type inference failed for: r0v40, types: [Oh.C] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3, types: [Dn.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [Dn.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r2v1, types: [Oh.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [Dn.j] */
    /* JADX WARN: Type inference failed for: r2v3, types: [Dn.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v7, types: [Oh.C] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [Dn.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3, types: [Oh.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C21929J1 c21929j1;
        String str;
        String str2;
        C18711a c18711a;
        C18711a c18711a2;
        Object obj2;
        Object obj3;
        ?? r6;
        String str3;
        C18711a c18711a3;
        ?? r10;
        AbstractC21955Q1 abstractC21955Q1M6734a;
        ?? r11;
        String str4;
        ?? r13;
        C21929J1 c21929j2;
        C18711a c18711a4;
        String str5;
        String str6;
        Object obj4;
        ?? r12;
        ?? r14;
        boolean z6;
        C16525B c16525b;
        C2176e c2176eM3210i;
        C2142L c2142l;
        ?? r15;
        ?? r16;
        String str7;
        C18711a c18711a5;
        AbstractC21955Q1 abstractC21955Q1M6734a2;
        C18712b c18712b;
        ?? r32;
        C21929J1 c21929j3;
        Object obj5;
        ?? r17;
        C21929J1 c21929j4;
        Object obj6;
        C21929J1 c21929j5;
        Object obj7;
        Object obj8;
        C18716f c18716f;
        ?? r18;
        String str8;
        String str9;
        AbstractC6224C abstractC6224C;
        AbstractC21955Q1 abstractC21955Q1M6734a3;
        C18712b c18712b2;
        C21929J1 c21929j6;
        ?? r19;
        Object obj9;
        InterfaceC3777y interfaceC3777yM18075c;
        Object objM9690b;
        C21929J1 c21929j7;
        ?? r110;
        Object obj10;
        ?? r20;
        AbstractC6224C abstractC6224C2;
        boolean z10;
        Object objM7518a;
        Object objM7519e;
        AbstractC21955Q1 abstractC21955Q1M6734a4;
        C18712b c18712b3;
        C21929J1 c21929j8;
        ?? r111;
        Object obj11;
        ?? r21;
        AbstractC6224C abstractC6224C3;
        C21929J1 c21929j9;
        ?? r112;
        Object obj12;
        ?? r22;
        String str10;
        ?? r23;
        AbstractC21955Q1 c21952p1;
        C18712b c18712b4;
        Object c21908e0;
        C21929J1 c21929j10;
        ?? r113;
        Object obj13;
        ?? r24;
        InterfaceC2186j interfaceC2186j;
        InterfaceC2186j interfaceC2186j2;
        EnumC18991F enumC18991F;
        Uri imageFile;
        Class<C16644c> cls;
        EnumC19250a enumC19250a;
        C21929J1 c21929j11;
        AbstractC21955Q1 c21945n1;
        AbstractC21955Q1 c21952p2;
        InputStream inputStreamOpenInputStream;
        EnumC19250a enumC19250a2;
        Class<C16644c> cls2;
        C21929J1 c21929j12;
        EnumC19250a enumC19250a3;
        Class<C16644c> cls3;
        C21929J1 c21929j13;
        boolean z11;
        EnumC19250a enumC19250a4;
        C18712b c18712b5;
        C18711a c18711a6;
        Cursor cursor;
        Cursor cursorQuery;
        String string;
        String type;
        Object objM7793c;
        EnumC19250a enumC19250a5;
        InterfaceC2186j interfaceC2186j3;
        Application application;
        InputStream inputStreamOpenInputStream2;
        Throwable th2;
        C8422g c8422g;
        InputStream inputStreamOpenInputStream3;
        Bitmap bitmapDecodeStream;
        int iM9002d;
        Matrix matrix;
        Bitmap bitmapCreateBitmap;
        int width;
        boolean z12;
        int height;
        Bitmap bitmapCreateScaledBitmap;
        Class<C16644c> cls4;
        C21929J1 c21929j14;
        EnumC19250a enumC19250a6;
        AbstractC6224C abstractC6224C4;
        boolean z13;
        Throwable th3;
        C6228b c6228b;
        Throwable cause;
        C8920e c8920e;
        AbstractC16643b abstractC16643b;
        InterfaceC2186j interfaceC2186j4;
        AbstractC6224C abstractC6224C5;
        AbstractC14527b abstractC14527b;
        InterfaceC3777y interfaceC3777yM18075c2;
        Object objM7294a;
        InterfaceC2186j interfaceC2186j5;
        AbstractC6224C abstractC6224C6;
        C21929J1 c21929j15;
        EnumC19250a enumC19250a7;
        C16644c c16644c;
        InterfaceC2186j interfaceC2186j6;
        C21929J1 c21929j16;
        EnumC19250a enumC19250a8;
        C21929J1 c21929j17;
        EnumC19250a enumC19250a9;
        AbstractC6224C abstractC6224C7;
        Class<C16644c> cls5 = C16644c.class;
        EnumC19250a enumC19250a10 = EnumC19250a.f61036Y;
        int i10 = this.f22633r0;
        EnumC18991F enumC18991F2 = this.f22635t0;
        C17296C c17296c = C17296C.f55119a;
        C21929J1 c21929j18 = C21929J1.f69476a;
        C7112f c7112f = this.f22636u0;
        try {
            try {
                switch (i10) {
                    case 0:
                        AbstractC9233X.m9807c(obj);
                        interfaceC2186j = (InterfaceC2186j) this.f22634s0;
                        C18714d c18714d = C18714d.f59548a;
                        this.f22634s0 = interfaceC2186j;
                        this.f22633r0 = 1;
                        if (interfaceC2186j.mo395a(c18714d, this) == enumC19250a10) {
                            return enumC19250a10;
                        }
                        interfaceC2186j2 = interfaceC2186j;
                        enumC18991F = EnumC18991F.f60566p0;
                        imageFile = this.f22637v0;
                        if (enumC18991F2 == enumC18991F) {
                            application = c7112f.f22643o0.f22655a;
                            AbstractC16544l.m18094g(imageFile, "imageFile");
                            try {
                                inputStreamOpenInputStream2 = application.getContentResolver().openInputStream(imageFile);
                                try {
                                    if (inputStreamOpenInputStream2 == null) {
                                        c8422g = new C8422g(inputStreamOpenInputStream2);
                                        AbstractC7942M5.m8232a(inputStreamOpenInputStream2, null);
                                        inputStreamOpenInputStream3 = application.getContentResolver().openInputStream(imageFile);
                                        try {
                                            bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream3);
                                            if (bitmapDecodeStream != null) {
                                                c21952p2 = new C21941M1(new C4206F("Failed to decode bitmap"));
                                                AbstractC7942M5.m8232a(inputStreamOpenInputStream3, null);
                                                cls3 = cls5;
                                                enumC19250a3 = enumC19250a10;
                                                c17296c = c17296c;
                                                c21929j13 = c21929j18;
                                            } else {
                                                try {
                                                    iM9002d = c8422g.m9002d(1, "Orientation");
                                                    matrix = new Matrix();
                                                    if (iM9002d != 3) {
                                                        matrix.postRotate(180.0f);
                                                    } else if (iM9002d != 6) {
                                                        matrix.postRotate(90.0f);
                                                    } else if (iM9002d != 8) {
                                                        matrix.postRotate(270.0f);
                                                    }
                                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                                                    AbstractC16544l.m18093f(bitmapCreateBitmap, QzvfuIgrngtl.ouh);
                                                    try {
                                                        width = 1536;
                                                        if (bitmapCreateBitmap.getWidth() <= 1536 || bitmapCreateBitmap.getHeight() > 1536) {
                                                            c21929j13 = c21929j18;
                                                            if (bitmapCreateBitmap.getWidth() > bitmapCreateBitmap.getHeight()) {
                                                                height = (bitmapCreateBitmap.getHeight() * 1536) / bitmapCreateBitmap.getWidth();
                                                                z12 = true;
                                                            } else {
                                                                z12 = true;
                                                                width = (bitmapCreateBitmap.getWidth() * 1536) / bitmapCreateBitmap.getHeight();
                                                                height = 1536;
                                                            }
                                                            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, width, height, z12);
                                                            AbstractC16544l.m18093f(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                                                            try {
                                                                c17296c = c17296c;
                                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                                cls3 = cls5;
                                                                enumC19250a3 = enumC19250a10;
                                                                bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
                                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                                AbstractC16544l.m18093f(byteArray, "toByteArray(...)");
                                                                C21952P1 c21952p3 = new C21952P1(new C7114h(byteArray, width, height));
                                                                bitmapCreateScaledBitmap.recycle();
                                                                bitmapCreateBitmap.recycle();
                                                                bitmapDecodeStream.recycle();
                                                                AbstractC7942M5.m8232a(inputStreamOpenInputStream3, null);
                                                                c21952p2 = c21952p3;
                                                            } catch (Throwable th4) {
                                                                bitmapCreateScaledBitmap.recycle();
                                                                throw th4;
                                                            }
                                                        } else {
                                                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                                            c21929j13 = c21929j18;
                                                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream2);
                                                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                                            AbstractC16544l.m18093f(byteArray2, "toByteArray(...)");
                                                            c21952p2 = new C21952P1(new C7114h(byteArray2, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()));
                                                            bitmapCreateBitmap.recycle();
                                                            bitmapDecodeStream.recycle();
                                                            AbstractC7942M5.m8232a(inputStreamOpenInputStream3, null);
                                                            cls3 = cls5;
                                                            enumC19250a3 = enumC19250a10;
                                                            c17296c = c17296c;
                                                        }
                                                    } catch (Throwable th5) {
                                                        bitmapCreateBitmap.recycle();
                                                        throw th5;
                                                    }
                                                } catch (Throwable th6) {
                                                    bitmapDecodeStream.recycle();
                                                    throw th6;
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            try {
                                                throw th7;
                                            } catch (Throwable th8) {
                                                AbstractC7942M5.m8232a(inputStreamOpenInputStream3, th7);
                                                throw th8;
                                            }
                                        }
                                    } else {
                                        try {
                                            throw new IllegalArgumentException("Required value was null.");
                                        } catch (Throwable th9) {
                                            th = th9;
                                        }
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                                th2 = th;
                                try {
                                    throw th2;
                                } catch (Throwable th11) {
                                    try {
                                        AbstractC7942M5.m8232a(inputStreamOpenInputStream2, th2);
                                        throw th11;
                                    } catch (Exception e10) {
                                        e = e10;
                                        c21945n1 = new C21941M1(e);
                                        c21929j12 = c21929j18;
                                        cls2 = cls5;
                                        enumC19250a2 = enumC19250a10;
                                        c21929j12 = c21929j11;
                                        cls2 = cls;
                                        enumC19250a2 = enumC19250a;
                                        c21929j12 = c21929j11;
                                        cls2 = cls;
                                        enumC19250a2 = enumC19250a;
                                        c21929j12 = c21929j11;
                                        cls2 = cls;
                                        enumC19250a2 = enumC19250a;
                                        c21952p2 = c21945n1;
                                        c21929j13 = c21929j12;
                                        cls3 = cls2;
                                        enumC19250a3 = enumC19250a2;
                                        z11 = c21952p2 instanceof C21952P1;
                                        if (!z11) {
                                            enumC19250a4 = enumC19250a3;
                                            AbstractC8160o6.m8731f(c7112f.f22644p0, "Unable to process file: " + imageFile, null, null, 6);
                                            if (z11) {
                                                c21952p2 = new C21952P1(null);
                                            } else if (!(c21952p2 instanceof C21929J1)) {
                                                throw new C0644w();
                                            }
                                            c18712b5 = new C18712b(c21952p2);
                                            this.f22634s0 = null;
                                            this.f22633r0 = 2;
                                            if (interfaceC2186j2.mo395a(c18712b5, this) == enumC19250a4) {
                                                return enumC19250a4;
                                            }
                                            return c17296c;
                                        }
                                        c18711a6 = (C18711a) ((C21952P1) c21952p2).f69511a;
                                        try {
                                            try {
                                                cursorQuery = c7112f.f22641Y.getContentResolver().query(this.f22637v0, new String[]{"_display_name"}, null, null, null);
                                                try {
                                                    try {
                                                        if (cursorQuery.moveToFirst()) {
                                                        }
                                                        try {
                                                            cursorQuery.close();
                                                        } catch (RuntimeException e11) {
                                                            throw e11;
                                                        }
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        AbstractC15256t.m16482t("DocumentFile", "Failed query: " + e);
                                                        if (cursorQuery != null) {
                                                            try {
                                                                cursorQuery.close();
                                                            } catch (RuntimeException e13) {
                                                                throw e13;
                                                            }
                                                            break;
                                                        }
                                                        string = null;
                                                        if (string == null) {
                                                            List<String> pathSegments = imageFile.getPathSegments();
                                                            AbstractC16544l.m18093f(pathSegments, "getPathSegments(...)");
                                                            string = (String) AbstractC17680n.m19351a0(pathSegments);
                                                        }
                                                        type = c7112f.f22641Y.getContentResolver().getType(imageFile);
                                                        C7392q c7392q = c7112f.f22642Z;
                                                        AbstractC16544l.m18091d(string);
                                                        int length = c18711a6.f59545a.length;
                                                        this.f22634s0 = interfaceC2186j2;
                                                        this.f22628Y = c18711a6;
                                                        this.f22629Z = string;
                                                        this.f22630o0 = type;
                                                        this.f22633r0 = 3;
                                                        objM7793c = c7392q.m7793c(string, length, enumC18991F2, this);
                                                        enumC19250a5 = enumC19250a3;
                                                        if (objM7793c == enumC19250a5) {
                                                            return enumC19250a5;
                                                        }
                                                        str5 = string;
                                                        c18711a4 = c18711a6;
                                                        interfaceC2186j3 = interfaceC2186j2;
                                                        str6 = type;
                                                        enumC19250a6 = enumC19250a5;
                                                        c21929j14 = c21929j13;
                                                        cls4 = cls3;
                                                        abstractC6224C4 = (AbstractC6224C) objM7793c;
                                                        z13 = abstractC6224C4 instanceof AbstractC6249w;
                                                        r14 = interfaceC2186j3;
                                                        r12 = abstractC6224C4;
                                                        obj4 = enumC19250a6;
                                                        c21929j2 = c21929j14;
                                                        if (z13) {
                                                            try {
                                                                th3 = ((AbstractC6249w) abstractC6224C4).f20328a;
                                                                if (th3 instanceof C6228b) {
                                                                    c6228b = (C6228b) th3;
                                                                } else {
                                                                    c6228b = null;
                                                                }
                                                                if (c6228b != null) {
                                                                    cause = c6228b.getCause();
                                                                } else {
                                                                    cause = null;
                                                                }
                                                                if (cause instanceof C8920e) {
                                                                    c8920e = (C8920e) cause;
                                                                } else {
                                                                    c8920e = null;
                                                                }
                                                                if (c8920e != null) {
                                                                }
                                                                abstractC16643b = null;
                                                                interfaceC2186j4 = interfaceC2186j3;
                                                                abstractC6224C5 = abstractC6224C4;
                                                                enumC19250a7 = enumC19250a6;
                                                                c21929j15 = c21929j14;
                                                                if (abstractC16643b instanceof C16644c) {
                                                                    c16644c = (C16644c) abstractC16643b;
                                                                } else {
                                                                    c16644c = null;
                                                                }
                                                                if (c16644c == null) {
                                                                }
                                                                r32 = interfaceC2186j4;
                                                                r17 = abstractC6224C5;
                                                                obj5 = enumC19250a7;
                                                                c21929j3 = c21929j15;
                                                            } catch (Exception e14) {
                                                                e = e14;
                                                                str2 = str5;
                                                                c18711a2 = c18711a4;
                                                                r6 = interfaceC2186j3;
                                                                r10 = abstractC6224C4;
                                                                obj2 = enumC19250a6;
                                                                c21929j1 = c21929j14;
                                                                AbstractC8160o6.m8731f(c7112f.f22644p0, "Error getting upload link", e, null, 4);
                                                                if (r10 instanceof C6223B) {
                                                                    abstractC21955Q1M6734a = new C21941M1(e);
                                                                } else if (r10 instanceof C6248v) {
                                                                    abstractC21955Q1M6734a = c21929j1;
                                                                } else {
                                                                    if (!(r10 instanceof AbstractC6249w)) {
                                                                        throw new C0644w();
                                                                    }
                                                                    r10.getClass();
                                                                    abstractC21955Q1M6734a = AbstractC6224C.m6734a((AbstractC6249w) r10);
                                                                }
                                                                C18712b c18712b6 = new C18712b(abstractC21955Q1M6734a);
                                                                this.f22634s0 = r6;
                                                                this.f22628Y = c18711a2;
                                                                this.f22629Z = str2;
                                                                this.f22630o0 = str6;
                                                                this.f22631p0 = r10;
                                                                this.f22633r0 = 6;
                                                                if (r6.mo395a(c18712b6, this) == obj2) {
                                                                    return obj2;
                                                                }
                                                                r11 = r10;
                                                                str4 = str6;
                                                                r13 = r6;
                                                                obj6 = obj2;
                                                                c21929j4 = c21929j1;
                                                                r17 = r11;
                                                                str5 = str2;
                                                                c18711a4 = c18711a2;
                                                                r32 = r13;
                                                                str6 = str4;
                                                                obj5 = obj6;
                                                                c21929j3 = c21929j4;
                                                            }
                                                            r14 = r32;
                                                            r12 = r17;
                                                            obj4 = obj5;
                                                            c21929j2 = c21929j3;
                                                        }
                                                        z6 = r12 instanceof C6223B;
                                                        if (!z6) {
                                                            if (z6) {
                                                                abstractC21955Q1M6734a2 = new C21952P1(null);
                                                            } else if (r12 instanceof C6248v) {
                                                                abstractC21955Q1M6734a2 = c21929j2;
                                                            } else {
                                                                if (r12 instanceof AbstractC6249w) {
                                                                    throw new C0644w();
                                                                }
                                                                r12.getClass();
                                                                abstractC21955Q1M6734a2 = AbstractC6224C.m6734a((AbstractC6249w) r12);
                                                            }
                                                            c18712b = new C18712b(abstractC21955Q1M6734a2);
                                                            this.f22634s0 = null;
                                                            this.f22628Y = null;
                                                            this.f22629Z = null;
                                                            this.f22630o0 = null;
                                                            this.f22631p0 = null;
                                                            this.f22633r0 = 7;
                                                            if (r14.mo395a(c18712b, this) == obj4) {
                                                                return obj4;
                                                            }
                                                            return c17296c;
                                                        }
                                                        c16525b = new C16525B();
                                                        c16525b.f51262Y = C6248v.f20327a;
                                                        C7392q c7392q2 = c7112f.f22642Z;
                                                        String url = ((C18997f) ((C6223B) r12).f20258a).f60576a;
                                                        byte[] data = c18711a4.f59545a;
                                                        AbstractC16544l.m18094g(url, "url");
                                                        AbstractC16544l.m18094g(data, "data");
                                                        c2176eM3210i = AbstractC2124C.m3210i(new C7391p(c7392q2, url, data, null));
                                                        c2142l = new C2142L(r14, c16525b, 1);
                                                        this.f22634s0 = r14;
                                                        this.f22628Y = c18711a4;
                                                        this.f22629Z = str5;
                                                        this.f22630o0 = str6;
                                                        this.f22631p0 = r12;
                                                        this.f22632q0 = c16525b;
                                                        this.f22633r0 = 8;
                                                        if (c2176eM3210i.mo3141d(c2142l, this) == obj4) {
                                                            return obj4;
                                                        }
                                                        r15 = r14;
                                                        r16 = r12;
                                                        str7 = str6;
                                                        c18711a5 = c18711a4;
                                                        obj7 = obj4;
                                                        c21929j5 = c21929j2;
                                                        obj8 = c16525b.f51262Y;
                                                        if (!(obj8 instanceof C6223B)) {
                                                            abstractC6224C = (AbstractC6224C) obj8;
                                                            if (abstractC6224C instanceof C6223B) {
                                                                abstractC21955Q1M6734a3 = new C21952P1(null);
                                                            } else if (abstractC6224C instanceof C6248v) {
                                                                abstractC21955Q1M6734a3 = c21929j5;
                                                            } else {
                                                                if (!(abstractC6224C instanceof AbstractC6249w)) {
                                                                    throw new C0644w();
                                                                }
                                                                abstractC6224C.getClass();
                                                                abstractC21955Q1M6734a3 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
                                                            }
                                                            c18712b2 = new C18712b(abstractC21955Q1M6734a3);
                                                            this.f22634s0 = null;
                                                            this.f22628Y = null;
                                                            this.f22629Z = null;
                                                            this.f22630o0 = null;
                                                            this.f22631p0 = null;
                                                            this.f22632q0 = null;
                                                            this.f22633r0 = 9;
                                                            if (r15.mo395a(c18712b2, this) == obj7) {
                                                                return obj7;
                                                            }
                                                            return c17296c;
                                                        }
                                                        c18716f = C18716f.f59550a;
                                                        this.f22634s0 = r15;
                                                        this.f22628Y = c18711a5;
                                                        this.f22629Z = str5;
                                                        this.f22630o0 = str7;
                                                        this.f22631p0 = r16;
                                                        this.f22632q0 = null;
                                                        this.f22633r0 = 10;
                                                        if (r15.mo395a(c18716f, this) == obj7) {
                                                            return obj7;
                                                        }
                                                        r18 = r16;
                                                        str8 = str7;
                                                        str9 = str5;
                                                        obj9 = obj7;
                                                        r19 = r15;
                                                        c21929j6 = c21929j5;
                                                        C7392q c7392q3 = c7112f.f22642Z;
                                                        String str11 = ((C18997f) ((C6223B) r18).f20258a).f60577b;
                                                        this.f22634s0 = r19;
                                                        this.f22628Y = c18711a5;
                                                        this.f22629Z = str9;
                                                        this.f22630o0 = str8;
                                                        this.f22631p0 = r18;
                                                        this.f22633r0 = 11;
                                                        C7388m c7388m = new C7388m(str11, null);
                                                        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                                                        try {
                                                            interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
                                                            break;
                                                        } catch (Throwable unused) {
                                                            interfaceC3777yM18075c = null;
                                                        }
                                                        objM9690b = AbstractC9144I.m9690b(c7392q3.f23420a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c7388m, this);
                                                        r20 = r18;
                                                        obj10 = obj9;
                                                        r110 = r19;
                                                        c21929j7 = c21929j6;
                                                        if (objM9690b == obj9) {
                                                            return obj9;
                                                        }
                                                        abstractC6224C2 = (AbstractC6224C) objM9690b;
                                                        z10 = abstractC6224C2 instanceof C6223B;
                                                        if (!z10) {
                                                            if (z10) {
                                                                abstractC21955Q1M6734a4 = new C21952P1(null);
                                                            } else if (abstractC6224C2 instanceof C6248v) {
                                                                abstractC21955Q1M6734a4 = c21929j7;
                                                            } else {
                                                                if (!(abstractC6224C2 instanceof AbstractC6249w)) {
                                                                    throw new C0644w();
                                                                }
                                                                abstractC6224C2.getClass();
                                                                abstractC21955Q1M6734a4 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C2);
                                                            }
                                                            c18712b3 = new C18712b(abstractC21955Q1M6734a4);
                                                            this.f22634s0 = null;
                                                            this.f22628Y = null;
                                                            this.f22629Z = null;
                                                            this.f22630o0 = null;
                                                            this.f22631p0 = null;
                                                            this.f22633r0 = 12;
                                                            if (r110.mo395a(c18712b3, this) == obj10) {
                                                                return obj10;
                                                            }
                                                            return c17296c;
                                                        }
                                                        if (AbstractC7110d.f22627a[enumC18991F2.ordinal()] == 1) {
                                                            String str12 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                                                            this.f22634s0 = r110;
                                                            this.f22628Y = c18711a5;
                                                            this.f22629Z = str9;
                                                            this.f22630o0 = str8;
                                                            this.f22631p0 = r20;
                                                            this.f22633r0 = 13;
                                                            objM7519e = C7112f.m7519e(c7112f, str12, this);
                                                            if (objM7519e == obj10) {
                                                                r21 = r20;
                                                                obj11 = obj10;
                                                                r111 = r110;
                                                                c21929j8 = c21929j7;
                                                                return obj10;
                                                            }
                                                            r21 = r20;
                                                            obj11 = obj10;
                                                            r111 = r110;
                                                            c21929j8 = c21929j7;
                                                            abstractC6224C3 = (AbstractC6224C) objM7519e;
                                                            r22 = r21;
                                                            obj12 = obj11;
                                                            r112 = r111;
                                                            c21929j9 = c21929j8;
                                                            str10 = str8;
                                                            r23 = r112;
                                                            if (abstractC6224C3 instanceof C6223B) {
                                                                if (c18711a5 instanceof C7114h) {
                                                                    C21903D c21903d = C21907E.Companion;
                                                                    String str13 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                                                    c21903d.getClass();
                                                                    String strM22336a = C21903D.m22336a(str13);
                                                                    int length2 = c18711a5.f59545a.length;
                                                                    C7114h c7114h = (C7114h) c18711a5;
                                                                    c21908e0 = new C21965U0(strM22336a, length2, c7114h.f22653b, c7114h.f22654c, str10, 96);
                                                                } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                                                    EnumC21968V0 enumC21968V0 = EnumC21968V0.Inpainting;
                                                                    C21903D c21903d2 = C21907E.Companion;
                                                                    String str14 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                                                    c21903d2.getClass();
                                                                    c21908e0 = new C22071w0(enumC21968V0, this.f22639x0, C21903D.m22336a(str14), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                                                                } else {
                                                                    C21903D c21903d3 = C21907E.Companion;
                                                                    String str15 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                                                    c21903d3.getClass();
                                                                    String strM22336a2 = C21903D.m22336a(str15);
                                                                    AbstractC16544l.m18091d(str9);
                                                                    c21908e0 = new C21908E0(strM22336a2, str9, new Integer(c18711a5.f59545a.length), str10);
                                                                }
                                                                c21952p1 = new C21952P1(c21908e0);
                                                            } else if (abstractC6224C3 instanceof C6248v) {
                                                                c21952p1 = c21929j9;
                                                            } else {
                                                                if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                                                    throw new C0644w();
                                                                }
                                                                abstractC6224C3.getClass();
                                                                c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                                                            }
                                                            c18712b4 = new C18712b(c21952p1);
                                                            this.f22634s0 = null;
                                                            this.f22628Y = null;
                                                            this.f22629Z = null;
                                                            this.f22630o0 = null;
                                                            this.f22631p0 = null;
                                                            this.f22633r0 = 15;
                                                            if (r23.mo395a(c18712b4, this) == obj12) {
                                                                return obj12;
                                                            }
                                                            return c17296c;
                                                        }
                                                        String str16 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                                                        this.f22634s0 = r110;
                                                        this.f22628Y = c18711a5;
                                                        this.f22629Z = str9;
                                                        this.f22630o0 = str8;
                                                        this.f22631p0 = r20;
                                                        this.f22633r0 = 14;
                                                        objM7518a = C7112f.m7518a(c7112f, str16, this);
                                                        if (objM7518a == obj10) {
                                                            r24 = r20;
                                                            obj13 = obj10;
                                                            r113 = r110;
                                                            c21929j10 = c21929j7;
                                                            return obj10;
                                                        }
                                                        r24 = r20;
                                                        obj13 = obj10;
                                                        r113 = r110;
                                                        c21929j10 = c21929j7;
                                                        abstractC6224C3 = (AbstractC6224C) objM7518a;
                                                        r22 = r24;
                                                        obj12 = obj13;
                                                        r112 = r113;
                                                        c21929j9 = c21929j10;
                                                        str10 = str8;
                                                        r23 = r112;
                                                        if (abstractC6224C3 instanceof C6223B) {
                                                            if (c18711a5 instanceof C7114h) {
                                                                C21903D c21903d4 = C21907E.Companion;
                                                                String str17 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                                                c21903d4.getClass();
                                                                String strM22336a3 = C21903D.m22336a(str17);
                                                                int length3 = c18711a5.f59545a.length;
                                                                C7114h c7114h2 = (C7114h) c18711a5;
                                                                c21908e0 = new C21965U0(strM22336a3, length3, c7114h2.f22653b, c7114h2.f22654c, str10, 96);
                                                            } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                                                EnumC21968V0 enumC21968V1 = EnumC21968V0.Inpainting;
                                                                C21903D c21903d5 = C21907E.Companion;
                                                                String str18 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                                                c21903d5.getClass();
                                                                c21908e0 = new C22071w0(enumC21968V1, this.f22639x0, C21903D.m22336a(str18), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                                                            } else {
                                                                C21903D c21903d6 = C21907E.Companion;
                                                                String str19 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                                                c21903d6.getClass();
                                                                String strM22336a4 = C21903D.m22336a(str19);
                                                                AbstractC16544l.m18091d(str9);
                                                                c21908e0 = new C21908E0(strM22336a4, str9, new Integer(c18711a5.f59545a.length), str10);
                                                            }
                                                            c21952p1 = new C21952P1(c21908e0);
                                                        } else if (abstractC6224C3 instanceof C6248v) {
                                                            c21952p1 = c21929j9;
                                                        } else {
                                                            if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                                                throw new C0644w();
                                                            }
                                                            abstractC6224C3.getClass();
                                                            c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                                                        }
                                                        c18712b4 = new C18712b(c21952p1);
                                                        this.f22634s0 = null;
                                                        this.f22628Y = null;
                                                        this.f22629Z = null;
                                                        this.f22630o0 = null;
                                                        this.f22631p0 = null;
                                                        this.f22633r0 = 15;
                                                        if (r23.mo395a(c18712b4, this) == obj12) {
                                                            return obj12;
                                                        }
                                                        return c17296c;
                                                    }
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    cursor = cursorQuery;
                                                    if (cursor != null) {
                                                        try {
                                                            cursor.close();
                                                            break;
                                                        } catch (RuntimeException e15) {
                                                            throw e15;
                                                        } catch (Exception unused2) {
                                                        }
                                                    }
                                                    throw th;
                                                }
                                                break;
                                            } catch (Exception unused3) {
                                            }
                                        } catch (Exception e16) {
                                            e = e16;
                                            cursorQuery = null;
                                        } catch (Throwable th13) {
                                            th = th13;
                                            cursor = null;
                                            if (cursor != null) {
                                                cursor.close();
                                                break;
                                            }
                                            throw th;
                                        }
                                        string = null;
                                        if (string == null) {
                                            List<String> pathSegments2 = imageFile.getPathSegments();
                                            AbstractC16544l.m18093f(pathSegments2, "getPathSegments(...)");
                                            string = (String) AbstractC17680n.m19351a0(pathSegments2);
                                        }
                                        type = c7112f.f22641Y.getContentResolver().getType(imageFile);
                                        C7392q c7392q4 = c7112f.f22642Z;
                                        AbstractC16544l.m18091d(string);
                                        int length4 = c18711a6.f59545a.length;
                                        this.f22634s0 = interfaceC2186j2;
                                        this.f22628Y = c18711a6;
                                        this.f22629Z = string;
                                        this.f22630o0 = type;
                                        this.f22633r0 = 3;
                                        objM7793c = c7392q4.m7793c(string, length4, enumC18991F2, this);
                                        enumC19250a5 = enumC19250a3;
                                        if (objM7793c == enumC19250a5) {
                                            return enumC19250a5;
                                        }
                                        str5 = string;
                                        c18711a4 = c18711a6;
                                        interfaceC2186j3 = interfaceC2186j2;
                                        str6 = type;
                                        enumC19250a6 = enumC19250a5;
                                        c21929j14 = c21929j13;
                                        cls4 = cls3;
                                        abstractC6224C4 = (AbstractC6224C) objM7793c;
                                        z13 = abstractC6224C4 instanceof AbstractC6249w;
                                        r14 = interfaceC2186j3;
                                        r12 = abstractC6224C4;
                                        obj4 = enumC19250a6;
                                        c21929j2 = c21929j14;
                                        if (z13) {
                                            th3 = ((AbstractC6249w) abstractC6224C4).f20328a;
                                            if (th3 instanceof C6228b) {
                                                c6228b = (C6228b) th3;
                                            } else {
                                                c6228b = null;
                                            }
                                            if (c6228b != null) {
                                                cause = c6228b.getCause();
                                            } else {
                                                cause = null;
                                            }
                                            if (cause instanceof C8920e) {
                                                c8920e = (C8920e) cause;
                                            } else {
                                                c8920e = null;
                                            }
                                            if (c8920e != null) {
                                            }
                                            abstractC16643b = null;
                                            interfaceC2186j4 = interfaceC2186j3;
                                            abstractC6224C5 = abstractC6224C4;
                                            enumC19250a7 = enumC19250a6;
                                            c21929j15 = c21929j14;
                                            if (abstractC16643b instanceof C16644c) {
                                                c16644c = (C16644c) abstractC16643b;
                                            } else {
                                                c16644c = null;
                                            }
                                            if (c16644c == null) {
                                            }
                                            r32 = interfaceC2186j4;
                                            r17 = abstractC6224C5;
                                            obj5 = enumC19250a7;
                                            c21929j3 = c21929j15;
                                            r14 = r32;
                                            r12 = r17;
                                            obj4 = obj5;
                                            c21929j2 = c21929j3;
                                        }
                                        z6 = r12 instanceof C6223B;
                                        if (!z6) {
                                            if (z6) {
                                                abstractC21955Q1M6734a2 = new C21952P1(null);
                                            } else if (r12 instanceof C6248v) {
                                                abstractC21955Q1M6734a2 = c21929j2;
                                            } else {
                                                if (r12 instanceof AbstractC6249w) {
                                                    throw new C0644w();
                                                }
                                                r12.getClass();
                                                abstractC21955Q1M6734a2 = AbstractC6224C.m6734a((AbstractC6249w) r12);
                                            }
                                            c18712b = new C18712b(abstractC21955Q1M6734a2);
                                            this.f22634s0 = null;
                                            this.f22628Y = null;
                                            this.f22629Z = null;
                                            this.f22630o0 = null;
                                            this.f22631p0 = null;
                                            this.f22633r0 = 7;
                                            if (r14.mo395a(c18712b, this) == obj4) {
                                                return obj4;
                                            }
                                            return c17296c;
                                        }
                                        c16525b = new C16525B();
                                        c16525b.f51262Y = C6248v.f20327a;
                                        C7392q c7392q5 = c7112f.f22642Z;
                                        String url2 = ((C18997f) ((C6223B) r12).f20258a).f60576a;
                                        byte[] data2 = c18711a4.f59545a;
                                        AbstractC16544l.m18094g(url2, "url");
                                        AbstractC16544l.m18094g(data2, "data");
                                        c2176eM3210i = AbstractC2124C.m3210i(new C7391p(c7392q5, url2, data2, null));
                                        c2142l = new C2142L(r14, c16525b, 1);
                                        this.f22634s0 = r14;
                                        this.f22628Y = c18711a4;
                                        this.f22629Z = str5;
                                        this.f22630o0 = str6;
                                        this.f22631p0 = r12;
                                        this.f22632q0 = c16525b;
                                        this.f22633r0 = 8;
                                        if (c2176eM3210i.mo3141d(c2142l, this) == obj4) {
                                            return obj4;
                                        }
                                        r15 = r14;
                                        r16 = r12;
                                        str7 = str6;
                                        c18711a5 = c18711a4;
                                        obj7 = obj4;
                                        c21929j5 = c21929j2;
                                        obj8 = c16525b.f51262Y;
                                        if (!(obj8 instanceof C6223B)) {
                                            abstractC6224C = (AbstractC6224C) obj8;
                                            if (abstractC6224C instanceof C6223B) {
                                                abstractC21955Q1M6734a3 = new C21952P1(null);
                                            } else if (abstractC6224C instanceof C6248v) {
                                                abstractC21955Q1M6734a3 = c21929j5;
                                            } else {
                                                if (!(abstractC6224C instanceof AbstractC6249w)) {
                                                    throw new C0644w();
                                                }
                                                abstractC6224C.getClass();
                                                abstractC21955Q1M6734a3 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
                                            }
                                            c18712b2 = new C18712b(abstractC21955Q1M6734a3);
                                            this.f22634s0 = null;
                                            this.f22628Y = null;
                                            this.f22629Z = null;
                                            this.f22630o0 = null;
                                            this.f22631p0 = null;
                                            this.f22632q0 = null;
                                            this.f22633r0 = 9;
                                            if (r15.mo395a(c18712b2, this) == obj7) {
                                                return obj7;
                                            }
                                            return c17296c;
                                        }
                                        c18716f = C18716f.f59550a;
                                        this.f22634s0 = r15;
                                        this.f22628Y = c18711a5;
                                        this.f22629Z = str5;
                                        this.f22630o0 = str7;
                                        this.f22631p0 = r16;
                                        this.f22632q0 = null;
                                        this.f22633r0 = 10;
                                        if (r15.mo395a(c18716f, this) == obj7) {
                                            return obj7;
                                        }
                                        r18 = r16;
                                        str8 = str7;
                                        str9 = str5;
                                        obj9 = obj7;
                                        r19 = r15;
                                        c21929j6 = c21929j5;
                                        C7392q c7392q6 = c7112f.f22642Z;
                                        String str110 = ((C18997f) ((C6223B) r18).f20258a).f60577b;
                                        this.f22634s0 = r19;
                                        this.f22628Y = c18711a5;
                                        this.f22629Z = str9;
                                        this.f22630o0 = str8;
                                        this.f22631p0 = r18;
                                        this.f22633r0 = 11;
                                        C7388m c7388m2 = new C7388m(str110, null);
                                        InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                                        interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
                                        objM9690b = AbstractC9144I.m9690b(c7392q6.f23420a, new C21296a(interfaceC3756dMo5693b2, interfaceC3777yM18075c), c7388m2, this);
                                        r20 = r18;
                                        obj10 = obj9;
                                        r110 = r19;
                                        c21929j7 = c21929j6;
                                        if (objM9690b == obj9) {
                                            return obj9;
                                        }
                                        abstractC6224C2 = (AbstractC6224C) objM9690b;
                                        z10 = abstractC6224C2 instanceof C6223B;
                                        if (!z10) {
                                            if (z10) {
                                                abstractC21955Q1M6734a4 = new C21952P1(null);
                                            } else if (abstractC6224C2 instanceof C6248v) {
                                                abstractC21955Q1M6734a4 = c21929j7;
                                            } else {
                                                if (!(abstractC6224C2 instanceof AbstractC6249w)) {
                                                    throw new C0644w();
                                                }
                                                abstractC6224C2.getClass();
                                                abstractC21955Q1M6734a4 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C2);
                                            }
                                            c18712b3 = new C18712b(abstractC21955Q1M6734a4);
                                            this.f22634s0 = null;
                                            this.f22628Y = null;
                                            this.f22629Z = null;
                                            this.f22630o0 = null;
                                            this.f22631p0 = null;
                                            this.f22633r0 = 12;
                                            if (r110.mo395a(c18712b3, this) == obj10) {
                                                return obj10;
                                            }
                                            return c17296c;
                                        }
                                        if (AbstractC7110d.f22627a[enumC18991F2.ordinal()] == 1) {
                                            String str111 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                                            this.f22634s0 = r110;
                                            this.f22628Y = c18711a5;
                                            this.f22629Z = str9;
                                            this.f22630o0 = str8;
                                            this.f22631p0 = r20;
                                            this.f22633r0 = 13;
                                            objM7519e = C7112f.m7519e(c7112f, str111, this);
                                            if (objM7519e == obj10) {
                                                r21 = r20;
                                                obj11 = obj10;
                                                r111 = r110;
                                                c21929j8 = c21929j7;
                                                return obj10;
                                            }
                                            r21 = r20;
                                            obj11 = obj10;
                                            r111 = r110;
                                            c21929j8 = c21929j7;
                                            abstractC6224C3 = (AbstractC6224C) objM7519e;
                                            r22 = r21;
                                            obj12 = obj11;
                                            r112 = r111;
                                            c21929j9 = c21929j8;
                                            str10 = str8;
                                            r23 = r112;
                                            if (abstractC6224C3 instanceof C6223B) {
                                                if (c18711a5 instanceof C7114h) {
                                                    C21903D c21903d7 = C21907E.Companion;
                                                    String str112 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                                    c21903d7.getClass();
                                                    String strM22336a5 = C21903D.m22336a(str112);
                                                    int length5 = c18711a5.f59545a.length;
                                                    C7114h c7114h3 = (C7114h) c18711a5;
                                                    c21908e0 = new C21965U0(strM22336a5, length5, c7114h3.f22653b, c7114h3.f22654c, str10, 96);
                                                } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                                    EnumC21968V0 enumC21968V2 = EnumC21968V0.Inpainting;
                                                    C21903D c21903d8 = C21907E.Companion;
                                                    String str113 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                                    c21903d8.getClass();
                                                    c21908e0 = new C22071w0(enumC21968V2, this.f22639x0, C21903D.m22336a(str113), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                                                } else {
                                                    C21903D c21903d9 = C21907E.Companion;
                                                    String str114 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                                    c21903d9.getClass();
                                                    String strM22336a6 = C21903D.m22336a(str114);
                                                    AbstractC16544l.m18091d(str9);
                                                    c21908e0 = new C21908E0(strM22336a6, str9, new Integer(c18711a5.f59545a.length), str10);
                                                }
                                                c21952p1 = new C21952P1(c21908e0);
                                            } else if (abstractC6224C3 instanceof C6248v) {
                                                c21952p1 = c21929j9;
                                            } else {
                                                if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                                    throw new C0644w();
                                                }
                                                abstractC6224C3.getClass();
                                                c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                                            }
                                            c18712b4 = new C18712b(c21952p1);
                                            this.f22634s0 = null;
                                            this.f22628Y = null;
                                            this.f22629Z = null;
                                            this.f22630o0 = null;
                                            this.f22631p0 = null;
                                            this.f22633r0 = 15;
                                            if (r23.mo395a(c18712b4, this) == obj12) {
                                                return obj12;
                                            }
                                            return c17296c;
                                        }
                                        String str115 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                                        this.f22634s0 = r110;
                                        this.f22628Y = c18711a5;
                                        this.f22629Z = str9;
                                        this.f22630o0 = str8;
                                        this.f22631p0 = r20;
                                        this.f22633r0 = 14;
                                        objM7518a = C7112f.m7518a(c7112f, str115, this);
                                        if (objM7518a == obj10) {
                                            r24 = r20;
                                            obj13 = obj10;
                                            r113 = r110;
                                            c21929j10 = c21929j7;
                                            return obj10;
                                        }
                                        r24 = r20;
                                        obj13 = obj10;
                                        r113 = r110;
                                        c21929j10 = c21929j7;
                                        abstractC6224C3 = (AbstractC6224C) objM7518a;
                                        r22 = r24;
                                        obj12 = obj13;
                                        r112 = r113;
                                        c21929j9 = c21929j10;
                                        str10 = str8;
                                        r23 = r112;
                                        if (abstractC6224C3 instanceof C6223B) {
                                            if (c18711a5 instanceof C7114h) {
                                                C21903D c21903d10 = C21907E.Companion;
                                                String str116 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                                c21903d10.getClass();
                                                String strM22336a7 = C21903D.m22336a(str116);
                                                int length6 = c18711a5.f59545a.length;
                                                C7114h c7114h4 = (C7114h) c18711a5;
                                                c21908e0 = new C21965U0(strM22336a7, length6, c7114h4.f22653b, c7114h4.f22654c, str10, 96);
                                            } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                                EnumC21968V0 enumC21968V3 = EnumC21968V0.Inpainting;
                                                C21903D c21903d11 = C21907E.Companion;
                                                String str117 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                                c21903d11.getClass();
                                                c21908e0 = new C22071w0(enumC21968V3, this.f22639x0, C21903D.m22336a(str117), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                                            } else {
                                                C21903D c21903d12 = C21907E.Companion;
                                                String str118 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                                c21903d12.getClass();
                                                String strM22336a8 = C21903D.m22336a(str118);
                                                AbstractC16544l.m18091d(str9);
                                                c21908e0 = new C21908E0(strM22336a8, str9, new Integer(c18711a5.f59545a.length), str10);
                                            }
                                            c21952p1 = new C21952P1(c21908e0);
                                        } else if (abstractC6224C3 instanceof C6248v) {
                                            c21952p1 = c21929j9;
                                        } else {
                                            if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                                throw new C0644w();
                                            }
                                            abstractC6224C3.getClass();
                                            c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                                        }
                                        c18712b4 = new C18712b(c21952p1);
                                        this.f22634s0 = null;
                                        this.f22628Y = null;
                                        this.f22629Z = null;
                                        this.f22630o0 = null;
                                        this.f22631p0 = null;
                                        this.f22633r0 = 15;
                                        if (r23.mo395a(c18712b4, this) == obj12) {
                                            return obj12;
                                        }
                                        return c17296c;
                                    }
                                }
                            } catch (Exception e17) {
                                e = e17;
                                cls5 = cls5;
                                enumC19250a10 = enumC19250a10;
                                c17296c = c17296c;
                                c21929j18 = c21929j18;
                            }
                        } else {
                            cls = cls5;
                            enumC19250a = enumC19250a10;
                            c17296c = c17296c;
                            c21929j11 = c21929j18;
                            c7112f.getClass();
                            try {
                                inputStreamOpenInputStream = c7112f.f22641Y.getContentResolver().openInputStream(imageFile);
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(Math.max(8192, inputStreamOpenInputStream.available()));
                                        AbstractC7934L5.m8227a(inputStreamOpenInputStream, byteArrayOutputStream3);
                                        byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                        AbstractC16544l.m18093f(byteArray3, "toByteArray(...)");
                                        AbstractC7942M5.m8232a(inputStreamOpenInputStream, null);
                                        c21945n1 = new C21952P1(byteArray3);
                                    } catch (Throwable th14) {
                                        try {
                                            throw th14;
                                        } catch (Throwable th15) {
                                            AbstractC7942M5.m8232a(inputStreamOpenInputStream, th14);
                                            throw th15;
                                        }
                                    }
                                } else {
                                    c21945n1 = new C21945N1(new IOException("Unable to open stream: " + imageFile));
                                }
                            } catch (Throwable th16) {
                                c21945n1 = new C21945N1(th16);
                            }
                            if (c21945n1 instanceof C21952P1) {
                                c21952p2 = new C21952P1(new C18711a((byte[]) ((C21952P1) c21945n1).f69511a));
                                c21929j13 = c21929j11;
                                cls3 = cls;
                                enumC19250a3 = enumC19250a;
                            } else {
                                if (!(c21945n1 instanceof C21929J1) && !(c21945n1 instanceof AbstractC21933K1)) {
                                    c21929j12 = c21929j11;
                                    cls2 = cls;
                                    enumC19250a2 = enumC19250a;
                                    c21929j12 = c21929j11;
                                    cls2 = cls;
                                    enumC19250a2 = enumC19250a;
                                    throw new C0644w();
                                }
                                c21929j12 = c21929j11;
                                cls2 = cls;
                                enumC19250a2 = enumC19250a;
                                c21929j12 = c21929j11;
                                cls2 = cls;
                                enumC19250a2 = enumC19250a;
                                c21929j12 = c21929j11;
                                cls2 = cls;
                                enumC19250a2 = enumC19250a;
                                c21952p2 = c21945n1;
                                c21929j13 = c21929j12;
                                cls3 = cls2;
                                enumC19250a3 = enumC19250a2;
                            }
                        }
                        z11 = c21952p2 instanceof C21952P1;
                        if (!z11) {
                            enumC19250a4 = enumC19250a3;
                            AbstractC8160o6.m8731f(c7112f.f22644p0, "Unable to process file: " + imageFile, null, null, 6);
                            if (z11) {
                                c21952p2 = new C21952P1(null);
                            } else if (!(c21952p2 instanceof C21929J1) && !(c21952p2 instanceof AbstractC21933K1)) {
                                throw new C0644w();
                            }
                            c18712b5 = new C18712b(c21952p2);
                            this.f22634s0 = null;
                            this.f22633r0 = 2;
                            if (interfaceC2186j2.mo395a(c18712b5, this) == enumC19250a4) {
                                return enumC19250a4;
                            }
                            return c17296c;
                        }
                        c18711a6 = (C18711a) ((C21952P1) c21952p2).f69511a;
                        cursorQuery = c7112f.f22641Y.getContentResolver().query(this.f22637v0, new String[]{"_display_name"}, null, null, null);
                        if (cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                            cursorQuery.close();
                            string = null;
                        } else {
                            string = cursorQuery.getString(0);
                            try {
                                cursorQuery.close();
                                break;
                            } catch (RuntimeException e18) {
                                throw e18;
                            } catch (Exception unused4) {
                            }
                        }
                        if (string == null) {
                            List<String> pathSegments3 = imageFile.getPathSegments();
                            AbstractC16544l.m18093f(pathSegments3, "getPathSegments(...)");
                            string = (String) AbstractC17680n.m19351a0(pathSegments3);
                        }
                        type = c7112f.f22641Y.getContentResolver().getType(imageFile);
                        C7392q c7392q7 = c7112f.f22642Z;
                        AbstractC16544l.m18091d(string);
                        int length7 = c18711a6.f59545a.length;
                        this.f22634s0 = interfaceC2186j2;
                        this.f22628Y = c18711a6;
                        this.f22629Z = string;
                        this.f22630o0 = type;
                        this.f22633r0 = 3;
                        objM7793c = c7392q7.m7793c(string, length7, enumC18991F2, this);
                        enumC19250a5 = enumC19250a3;
                        if (objM7793c == enumC19250a5) {
                            return enumC19250a5;
                        }
                        str5 = string;
                        c18711a4 = c18711a6;
                        interfaceC2186j3 = interfaceC2186j2;
                        str6 = type;
                        enumC19250a6 = enumC19250a5;
                        c21929j14 = c21929j13;
                        cls4 = cls3;
                        abstractC6224C4 = (AbstractC6224C) objM7793c;
                        z13 = abstractC6224C4 instanceof AbstractC6249w;
                        r14 = interfaceC2186j3;
                        r12 = abstractC6224C4;
                        obj4 = enumC19250a6;
                        c21929j2 = c21929j14;
                        if (z13) {
                            th3 = ((AbstractC6249w) abstractC6224C4).f20328a;
                            if (th3 instanceof C6228b) {
                                c6228b = (C6228b) th3;
                            } else {
                                c6228b = null;
                            }
                            if (c6228b != null) {
                                cause = c6228b.getCause();
                            } else {
                                cause = null;
                            }
                            if (cause instanceof C8920e) {
                                c8920e = (C8920e) cause;
                            } else {
                                c8920e = null;
                            }
                            if (c8920e != null || (abstractC14527b = c8920e.f27285Y) == null) {
                                abstractC16643b = null;
                                interfaceC2186j4 = interfaceC2186j3;
                                abstractC6224C5 = abstractC6224C4;
                                enumC19250a7 = enumC19250a6;
                                c21929j15 = c21929j14;
                            } else {
                                C6911c c6911cMo7303b = abstractC14527b.mo7303b();
                                Class<C16644c> cls6 = cls4;
                                InterfaceC3756d interfaceC3756dMo5693b3 = AbstractC16526C.f51263a.mo5693b(cls6);
                                try {
                                    interfaceC3777yM18075c2 = AbstractC16526C.m18075c(cls6);
                                } catch (Throwable unused5) {
                                    interfaceC3777yM18075c2 = null;
                                }
                                C21296a c21296a = new C21296a(interfaceC3756dMo5693b3, interfaceC3777yM18075c2);
                                this.f22634s0 = interfaceC2186j3;
                                this.f22628Y = c18711a4;
                                this.f22629Z = str5;
                                this.f22630o0 = str6;
                                this.f22631p0 = abstractC6224C4;
                                this.f22633r0 = 4;
                                objM7294a = c6911cMo7303b.m7294a(c21296a, this);
                                if (objM7294a == enumC19250a6) {
                                    return enumC19250a6;
                                }
                                interfaceC2186j5 = interfaceC2186j3;
                                abstractC6224C6 = abstractC6224C4;
                                if (objM7294a != null) {
                                    enumC19250a8 = enumC19250a6;
                                    c21929j16 = c21929j14;
                                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
                                }
                                enumC19250a8 = enumC19250a6;
                                c21929j16 = c21929j14;
                                abstractC16643b = (AbstractC16643b) ((C16644c) objM7294a).get("detail");
                                abstractC6224C5 = abstractC6224C6;
                                interfaceC2186j4 = interfaceC2186j5;
                                enumC19250a7 = enumC19250a8;
                                c21929j15 = c21929j16;
                            }
                            if (abstractC16643b instanceof C16644c) {
                                c16644c = (C16644c) abstractC16643b;
                            } else {
                                c16644c = null;
                            }
                            if (c16644c == null && c16644c.containsKey("conversation_message_metadata")) {
                                C18713c c18713c = C18713c.f59547a;
                                this.f22634s0 = interfaceC2186j4;
                                this.f22628Y = c18711a4;
                                this.f22629Z = str5;
                                this.f22630o0 = str6;
                                this.f22631p0 = abstractC6224C5;
                                this.f22633r0 = 5;
                                if (interfaceC2186j4.mo395a(c18713c, this) == enumC19250a7) {
                                    return enumC19250a7;
                                }
                                interfaceC2186j6 = interfaceC2186j4;
                                abstractC6224C7 = abstractC6224C5;
                                enumC19250a9 = enumC19250a7;
                                c21929j17 = c21929j15;
                                r12 = abstractC6224C7;
                                r14 = interfaceC2186j6;
                                obj4 = enumC19250a9;
                                c21929j2 = c21929j17;
                            } else {
                                r32 = interfaceC2186j4;
                                r17 = abstractC6224C5;
                                obj5 = enumC19250a7;
                                c21929j3 = c21929j15;
                                r14 = r32;
                                r12 = r17;
                                obj4 = obj5;
                                c21929j2 = c21929j3;
                            }
                            break;
                        }
                        z6 = r12 instanceof C6223B;
                        if (!z6) {
                            if (z6) {
                                abstractC21955Q1M6734a2 = new C21952P1(null);
                            } else if (r12 instanceof C6248v) {
                                abstractC21955Q1M6734a2 = c21929j2;
                            } else {
                                if (r12 instanceof AbstractC6249w) {
                                    throw new C0644w();
                                }
                                r12.getClass();
                                abstractC21955Q1M6734a2 = AbstractC6224C.m6734a((AbstractC6249w) r12);
                            }
                            c18712b = new C18712b(abstractC21955Q1M6734a2);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 7;
                            if (r14.mo395a(c18712b, this) == obj4) {
                                return obj4;
                            }
                            return c17296c;
                        }
                        c16525b = new C16525B();
                        c16525b.f51262Y = C6248v.f20327a;
                        C7392q c7392q8 = c7112f.f22642Z;
                        String url3 = ((C18997f) ((C6223B) r12).f20258a).f60576a;
                        byte[] data3 = c18711a4.f59545a;
                        AbstractC16544l.m18094g(url3, "url");
                        AbstractC16544l.m18094g(data3, "data");
                        c2176eM3210i = AbstractC2124C.m3210i(new C7391p(c7392q8, url3, data3, null));
                        c2142l = new C2142L(r14, c16525b, 1);
                        this.f22634s0 = r14;
                        this.f22628Y = c18711a4;
                        this.f22629Z = str5;
                        this.f22630o0 = str6;
                        this.f22631p0 = r12;
                        this.f22632q0 = c16525b;
                        this.f22633r0 = 8;
                        if (c2176eM3210i.mo3141d(c2142l, this) == obj4) {
                            return obj4;
                        }
                        r15 = r14;
                        r16 = r12;
                        str7 = str6;
                        c18711a5 = c18711a4;
                        obj7 = obj4;
                        c21929j5 = c21929j2;
                        obj8 = c16525b.f51262Y;
                        if (!(obj8 instanceof C6223B)) {
                            abstractC6224C = (AbstractC6224C) obj8;
                            if (abstractC6224C instanceof C6223B) {
                                abstractC21955Q1M6734a3 = new C21952P1(null);
                            } else if (abstractC6224C instanceof C6248v) {
                                abstractC21955Q1M6734a3 = c21929j5;
                            } else {
                                if (!(abstractC6224C instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C.getClass();
                                abstractC21955Q1M6734a3 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
                            }
                            c18712b2 = new C18712b(abstractC21955Q1M6734a3);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22632q0 = null;
                            this.f22633r0 = 9;
                            if (r15.mo395a(c18712b2, this) == obj7) {
                                return obj7;
                            }
                            return c17296c;
                        }
                        c18716f = C18716f.f59550a;
                        this.f22634s0 = r15;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str5;
                        this.f22630o0 = str7;
                        this.f22631p0 = r16;
                        this.f22632q0 = null;
                        this.f22633r0 = 10;
                        if (r15.mo395a(c18716f, this) == obj7) {
                            return obj7;
                        }
                        r18 = r16;
                        str8 = str7;
                        str9 = str5;
                        obj9 = obj7;
                        r19 = r15;
                        c21929j6 = c21929j5;
                        C7392q c7392q9 = c7112f.f22642Z;
                        String str119 = ((C18997f) ((C6223B) r18).f20258a).f60577b;
                        this.f22634s0 = r19;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r18;
                        this.f22633r0 = 11;
                        C7388m c7388m3 = new C7388m(str119, null);
                        InterfaceC3756d interfaceC3756dMo5693b4 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                        interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
                        objM9690b = AbstractC9144I.m9690b(c7392q9.f23420a, new C21296a(interfaceC3756dMo5693b4, interfaceC3777yM18075c), c7388m3, this);
                        r20 = r18;
                        obj10 = obj9;
                        r110 = r19;
                        c21929j7 = c21929j6;
                        if (objM9690b == obj9) {
                            return obj9;
                        }
                        abstractC6224C2 = (AbstractC6224C) objM9690b;
                        z10 = abstractC6224C2 instanceof C6223B;
                        if (!z10) {
                            if (z10) {
                                abstractC21955Q1M6734a4 = new C21952P1(null);
                            } else if (abstractC6224C2 instanceof C6248v) {
                                abstractC21955Q1M6734a4 = c21929j7;
                            } else {
                                if (!(abstractC6224C2 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C2.getClass();
                                abstractC21955Q1M6734a4 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C2);
                            }
                            c18712b3 = new C18712b(abstractC21955Q1M6734a4);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 12;
                            if (r110.mo395a(c18712b3, this) == obj10) {
                                return obj10;
                            }
                            return c17296c;
                        }
                        if (AbstractC7110d.f22627a[enumC18991F2.ordinal()] == 1) {
                            String str1110 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                            this.f22634s0 = r110;
                            this.f22628Y = c18711a5;
                            this.f22629Z = str9;
                            this.f22630o0 = str8;
                            this.f22631p0 = r20;
                            this.f22633r0 = 13;
                            objM7519e = C7112f.m7519e(c7112f, str1110, this);
                            if (objM7519e == obj10) {
                                r21 = r20;
                                obj11 = obj10;
                                r111 = r110;
                                c21929j8 = c21929j7;
                                return obj10;
                            }
                            r21 = r20;
                            obj11 = obj10;
                            r111 = r110;
                            c21929j8 = c21929j7;
                            abstractC6224C3 = (AbstractC6224C) objM7519e;
                            r22 = r21;
                            obj12 = obj11;
                            r112 = r111;
                            c21929j9 = c21929j8;
                            str10 = str8;
                            r23 = r112;
                            if (abstractC6224C3 instanceof C6223B) {
                                if (c18711a5 instanceof C7114h) {
                                    C21903D c21903d13 = C21907E.Companion;
                                    String str1111 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d13.getClass();
                                    String strM22336a9 = C21903D.m22336a(str1111);
                                    int length8 = c18711a5.f59545a.length;
                                    C7114h c7114h5 = (C7114h) c18711a5;
                                    c21908e0 = new C21965U0(strM22336a9, length8, c7114h5.f22653b, c7114h5.f22654c, str10, 96);
                                } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                    EnumC21968V0 enumC21968V4 = EnumC21968V0.Inpainting;
                                    C21903D c21903d14 = C21907E.Companion;
                                    String str1112 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d14.getClass();
                                    c21908e0 = new C22071w0(enumC21968V4, this.f22639x0, C21903D.m22336a(str1112), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                                } else {
                                    C21903D c21903d15 = C21907E.Companion;
                                    String str1113 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d15.getClass();
                                    String strM22336a10 = C21903D.m22336a(str1113);
                                    AbstractC16544l.m18091d(str9);
                                    c21908e0 = new C21908E0(strM22336a10, str9, new Integer(c18711a5.f59545a.length), str10);
                                }
                                c21952p1 = new C21952P1(c21908e0);
                            } else if (abstractC6224C3 instanceof C6248v) {
                                c21952p1 = c21929j9;
                            } else {
                                if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C3.getClass();
                                c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                            }
                            c18712b4 = new C18712b(c21952p1);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 15;
                            if (r23.mo395a(c18712b4, this) == obj12) {
                                return obj12;
                            }
                            return c17296c;
                        }
                        String str1114 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                        this.f22634s0 = r110;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r20;
                        this.f22633r0 = 14;
                        objM7518a = C7112f.m7518a(c7112f, str1114, this);
                        if (objM7518a == obj10) {
                            r24 = r20;
                            obj13 = obj10;
                            r113 = r110;
                            c21929j10 = c21929j7;
                            return obj10;
                        }
                        r24 = r20;
                        obj13 = obj10;
                        r113 = r110;
                        c21929j10 = c21929j7;
                        abstractC6224C3 = (AbstractC6224C) objM7518a;
                        r22 = r24;
                        obj12 = obj13;
                        r112 = r113;
                        c21929j9 = c21929j10;
                        str10 = str8;
                        r23 = r112;
                        if (abstractC6224C3 instanceof C6223B) {
                            if (c18711a5 instanceof C7114h) {
                                C21903D c21903d16 = C21907E.Companion;
                                String str1115 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d16.getClass();
                                String strM22336a11 = C21903D.m22336a(str1115);
                                int length9 = c18711a5.f59545a.length;
                                C7114h c7114h6 = (C7114h) c18711a5;
                                c21908e0 = new C21965U0(strM22336a11, length9, c7114h6.f22653b, c7114h6.f22654c, str10, 96);
                            } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                EnumC21968V0 enumC21968V5 = EnumC21968V0.Inpainting;
                                C21903D c21903d17 = C21907E.Companion;
                                String str1116 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d17.getClass();
                                c21908e0 = new C22071w0(enumC21968V5, this.f22639x0, C21903D.m22336a(str1116), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                            } else {
                                C21903D c21903d18 = C21907E.Companion;
                                String str1117 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d18.getClass();
                                String strM22336a12 = C21903D.m22336a(str1117);
                                AbstractC16544l.m18091d(str9);
                                c21908e0 = new C21908E0(strM22336a12, str9, new Integer(c18711a5.f59545a.length), str10);
                            }
                            c21952p1 = new C21952P1(c21908e0);
                        } else if (abstractC6224C3 instanceof C6248v) {
                            c21952p1 = c21929j9;
                        } else {
                            if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                throw new C0644w();
                            }
                            abstractC6224C3.getClass();
                            c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                        }
                        c18712b4 = new C18712b(c21952p1);
                        this.f22634s0 = null;
                        this.f22628Y = null;
                        this.f22629Z = null;
                        this.f22630o0 = null;
                        this.f22631p0 = null;
                        this.f22633r0 = 15;
                        if (r23.mo395a(c18712b4, this) == obj12) {
                            return obj12;
                        }
                        return c17296c;
                    case 1:
                        interfaceC2186j = (InterfaceC2186j) this.f22634s0;
                        AbstractC9233X.m9807c(obj);
                        interfaceC2186j2 = interfaceC2186j;
                        enumC18991F = EnumC18991F.f60566p0;
                        imageFile = this.f22637v0;
                        if (enumC18991F2 == enumC18991F) {
                            application = c7112f.f22643o0.f22655a;
                            AbstractC16544l.m18094g(imageFile, "imageFile");
                            inputStreamOpenInputStream2 = application.getContentResolver().openInputStream(imageFile);
                            if (inputStreamOpenInputStream2 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            c8422g = new C8422g(inputStreamOpenInputStream2);
                            AbstractC7942M5.m8232a(inputStreamOpenInputStream2, null);
                            inputStreamOpenInputStream3 = application.getContentResolver().openInputStream(imageFile);
                            bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream3);
                            if (bitmapDecodeStream != null) {
                                iM9002d = c8422g.m9002d(1, "Orientation");
                                matrix = new Matrix();
                                if (iM9002d != 3) {
                                    matrix.postRotate(180.0f);
                                } else if (iM9002d != 6) {
                                    matrix.postRotate(90.0f);
                                } else if (iM9002d != 8) {
                                    matrix.postRotate(270.0f);
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                                AbstractC16544l.m18093f(bitmapCreateBitmap, QzvfuIgrngtl.ouh);
                                width = 1536;
                                if (bitmapCreateBitmap.getWidth() <= 1536) {
                                    c21929j13 = c21929j18;
                                    if (bitmapCreateBitmap.getWidth() > bitmapCreateBitmap.getHeight()) {
                                        height = (bitmapCreateBitmap.getHeight() * 1536) / bitmapCreateBitmap.getWidth();
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                        width = (bitmapCreateBitmap.getWidth() * 1536) / bitmapCreateBitmap.getHeight();
                                        height = 1536;
                                    }
                                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, width, height, z12);
                                    AbstractC16544l.m18093f(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                                    c17296c = c17296c;
                                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    cls3 = cls5;
                                    enumC19250a3 = enumC19250a10;
                                    bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream4);
                                    byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                    AbstractC16544l.m18093f(byteArray4, "toByteArray(...)");
                                    C21952P1 c21952p4 = new C21952P1(new C7114h(byteArray4, width, height));
                                    bitmapCreateScaledBitmap.recycle();
                                    bitmapCreateBitmap.recycle();
                                    bitmapDecodeStream.recycle();
                                    AbstractC7942M5.m8232a(inputStreamOpenInputStream3, null);
                                    c21952p2 = c21952p4;
                                } else {
                                    c21929j13 = c21929j18;
                                    if (bitmapCreateBitmap.getWidth() > bitmapCreateBitmap.getHeight()) {
                                        height = (bitmapCreateBitmap.getHeight() * 1536) / bitmapCreateBitmap.getWidth();
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                        width = (bitmapCreateBitmap.getWidth() * 1536) / bitmapCreateBitmap.getHeight();
                                        height = 1536;
                                    }
                                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, width, height, z12);
                                    AbstractC16544l.m18093f(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                                    c17296c = c17296c;
                                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                    cls3 = cls5;
                                    enumC19250a3 = enumC19250a10;
                                    bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream5);
                                    byte[] byteArray5 = byteArrayOutputStream5.toByteArray();
                                    AbstractC16544l.m18093f(byteArray5, "toByteArray(...)");
                                    C21952P1 c21952p5 = new C21952P1(new C7114h(byteArray5, width, height));
                                    bitmapCreateScaledBitmap.recycle();
                                    bitmapCreateBitmap.recycle();
                                    bitmapDecodeStream.recycle();
                                    AbstractC7942M5.m8232a(inputStreamOpenInputStream3, null);
                                    c21952p2 = c21952p5;
                                }
                                str10 = str8;
                                r23 = r112;
                                if (abstractC6224C3 instanceof C6223B) {
                                    if (c18711a5 instanceof C7114h) {
                                        C21903D c21903d19 = C21907E.Companion;
                                        String str1118 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                        c21903d19.getClass();
                                        String strM22336a13 = C21903D.m22336a(str1118);
                                        int length10 = c18711a5.f59545a.length;
                                        C7114h c7114h7 = (C7114h) c18711a5;
                                        c21908e0 = new C21965U0(strM22336a13, length10, c7114h7.f22653b, c7114h7.f22654c, str10, 96);
                                    } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                        EnumC21968V0 enumC21968V6 = EnumC21968V0.Inpainting;
                                        C21903D c21903d110 = C21907E.Companion;
                                        String str1119 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                        c21903d110.getClass();
                                        c21908e0 = new C22071w0(enumC21968V6, this.f22639x0, C21903D.m22336a(str1119), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                                    } else {
                                        C21903D c21903d111 = C21907E.Companion;
                                        String str11110 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                        c21903d111.getClass();
                                        String strM22336a14 = C21903D.m22336a(str11110);
                                        AbstractC16544l.m18091d(str9);
                                        c21908e0 = new C21908E0(strM22336a14, str9, new Integer(c18711a5.f59545a.length), str10);
                                    }
                                    c21952p1 = new C21952P1(c21908e0);
                                } else if (abstractC6224C3 instanceof C6248v) {
                                    c21952p1 = c21929j9;
                                } else {
                                    if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                        throw new C0644w();
                                    }
                                    abstractC6224C3.getClass();
                                    c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                                }
                                c18712b4 = new C18712b(c21952p1);
                                this.f22634s0 = null;
                                this.f22628Y = null;
                                this.f22629Z = null;
                                this.f22630o0 = null;
                                this.f22631p0 = null;
                                this.f22633r0 = 15;
                                if (r23.mo395a(c18712b4, this) == obj12) {
                                    return obj12;
                                }
                                return c17296c;
                            }
                            c21952p2 = new C21941M1(new C4206F("Failed to decode bitmap"));
                            AbstractC7942M5.m8232a(inputStreamOpenInputStream3, null);
                            cls3 = cls5;
                            enumC19250a3 = enumC19250a10;
                            c17296c = c17296c;
                            c21929j13 = c21929j18;
                            th2 = th;
                            throw th2;
                        }
                        cls = cls5;
                        enumC19250a = enumC19250a10;
                        c17296c = c17296c;
                        c21929j11 = c21929j18;
                        c7112f.getClass();
                        inputStreamOpenInputStream = c7112f.f22641Y.getContentResolver().openInputStream(imageFile);
                        if (inputStreamOpenInputStream != null) {
                            ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream(Math.max(8192, inputStreamOpenInputStream.available()));
                            AbstractC7934L5.m8227a(inputStreamOpenInputStream, byteArrayOutputStream6);
                            byte[] byteArray6 = byteArrayOutputStream6.toByteArray();
                            AbstractC16544l.m18093f(byteArray6, "toByteArray(...)");
                            AbstractC7942M5.m8232a(inputStreamOpenInputStream, null);
                            c21945n1 = new C21952P1(byteArray6);
                        } else {
                            c21945n1 = new C21945N1(new IOException("Unable to open stream: " + imageFile));
                        }
                        if (c21945n1 instanceof C21952P1) {
                            c21952p2 = new C21952P1(new C18711a((byte[]) ((C21952P1) c21945n1).f69511a));
                            c21929j13 = c21929j11;
                            cls3 = cls;
                            enumC19250a3 = enumC19250a;
                        } else {
                            if (!(c21945n1 instanceof C21929J1)) {
                                c21929j12 = c21929j11;
                                cls2 = cls;
                                enumC19250a2 = enumC19250a;
                                c21929j12 = c21929j11;
                                cls2 = cls;
                                enumC19250a2 = enumC19250a;
                                throw new C0644w();
                            }
                            c21929j12 = c21929j11;
                            cls2 = cls;
                            enumC19250a2 = enumC19250a;
                            c21929j12 = c21929j11;
                            cls2 = cls;
                            enumC19250a2 = enumC19250a;
                            c21929j12 = c21929j11;
                            cls2 = cls;
                            enumC19250a2 = enumC19250a;
                            c21952p2 = c21945n1;
                            c21929j13 = c21929j12;
                            cls3 = cls2;
                            enumC19250a3 = enumC19250a2;
                        }
                        z11 = c21952p2 instanceof C21952P1;
                        if (!z11) {
                            enumC19250a4 = enumC19250a3;
                            AbstractC8160o6.m8731f(c7112f.f22644p0, "Unable to process file: " + imageFile, null, null, 6);
                            if (z11) {
                                c21952p2 = new C21952P1(null);
                            } else if (!(c21952p2 instanceof C21929J1)) {
                                throw new C0644w();
                            }
                            c18712b5 = new C18712b(c21952p2);
                            this.f22634s0 = null;
                            this.f22633r0 = 2;
                            if (interfaceC2186j2.mo395a(c18712b5, this) == enumC19250a4) {
                                return enumC19250a4;
                            }
                            return c17296c;
                        }
                        c18711a6 = (C18711a) ((C21952P1) c21952p2).f69511a;
                        cursorQuery = c7112f.f22641Y.getContentResolver().query(this.f22637v0, new String[]{"_display_name"}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            break;
                        }
                        cursorQuery.close();
                        string = null;
                        if (string == null) {
                            List<String> pathSegments4 = imageFile.getPathSegments();
                            AbstractC16544l.m18093f(pathSegments4, "getPathSegments(...)");
                            string = (String) AbstractC17680n.m19351a0(pathSegments4);
                        }
                        type = c7112f.f22641Y.getContentResolver().getType(imageFile);
                        C7392q c7392q10 = c7112f.f22642Z;
                        AbstractC16544l.m18091d(string);
                        int length11 = c18711a6.f59545a.length;
                        this.f22634s0 = interfaceC2186j2;
                        this.f22628Y = c18711a6;
                        this.f22629Z = string;
                        this.f22630o0 = type;
                        this.f22633r0 = 3;
                        objM7793c = c7392q10.m7793c(string, length11, enumC18991F2, this);
                        enumC19250a5 = enumC19250a3;
                        if (objM7793c == enumC19250a5) {
                            return enumC19250a5;
                        }
                        str5 = string;
                        c18711a4 = c18711a6;
                        interfaceC2186j3 = interfaceC2186j2;
                        str6 = type;
                        enumC19250a6 = enumC19250a5;
                        c21929j14 = c21929j13;
                        cls4 = cls3;
                        abstractC6224C4 = (AbstractC6224C) objM7793c;
                        z13 = abstractC6224C4 instanceof AbstractC6249w;
                        r14 = interfaceC2186j3;
                        r12 = abstractC6224C4;
                        obj4 = enumC19250a6;
                        c21929j2 = c21929j14;
                        if (z13) {
                            th3 = ((AbstractC6249w) abstractC6224C4).f20328a;
                            if (th3 instanceof C6228b) {
                                c6228b = (C6228b) th3;
                            } else {
                                c6228b = null;
                            }
                            if (c6228b != null) {
                                cause = c6228b.getCause();
                            } else {
                                cause = null;
                            }
                            if (cause instanceof C8920e) {
                                c8920e = (C8920e) cause;
                            } else {
                                c8920e = null;
                            }
                            if (c8920e != null) {
                            }
                            abstractC16643b = null;
                            interfaceC2186j4 = interfaceC2186j3;
                            abstractC6224C5 = abstractC6224C4;
                            enumC19250a7 = enumC19250a6;
                            c21929j15 = c21929j14;
                            if (abstractC16643b instanceof C16644c) {
                                c16644c = (C16644c) abstractC16643b;
                            } else {
                                c16644c = null;
                            }
                            if (c16644c == null) {
                            }
                            r32 = interfaceC2186j4;
                            r17 = abstractC6224C5;
                            obj5 = enumC19250a7;
                            c21929j3 = c21929j15;
                            r14 = r32;
                            r12 = r17;
                            obj4 = obj5;
                            c21929j2 = c21929j3;
                            break;
                        }
                        z6 = r12 instanceof C6223B;
                        if (!z6) {
                            if (z6) {
                                abstractC21955Q1M6734a2 = new C21952P1(null);
                            } else if (r12 instanceof C6248v) {
                                abstractC21955Q1M6734a2 = c21929j2;
                            } else {
                                if (r12 instanceof AbstractC6249w) {
                                    throw new C0644w();
                                }
                                r12.getClass();
                                abstractC21955Q1M6734a2 = AbstractC6224C.m6734a((AbstractC6249w) r12);
                            }
                            c18712b = new C18712b(abstractC21955Q1M6734a2);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 7;
                            if (r14.mo395a(c18712b, this) == obj4) {
                                return obj4;
                            }
                            return c17296c;
                        }
                        c16525b = new C16525B();
                        c16525b.f51262Y = C6248v.f20327a;
                        C7392q c7392q11 = c7112f.f22642Z;
                        String url4 = ((C18997f) ((C6223B) r12).f20258a).f60576a;
                        byte[] data4 = c18711a4.f59545a;
                        AbstractC16544l.m18094g(url4, "url");
                        AbstractC16544l.m18094g(data4, "data");
                        c2176eM3210i = AbstractC2124C.m3210i(new C7391p(c7392q11, url4, data4, null));
                        c2142l = new C2142L(r14, c16525b, 1);
                        this.f22634s0 = r14;
                        this.f22628Y = c18711a4;
                        this.f22629Z = str5;
                        this.f22630o0 = str6;
                        this.f22631p0 = r12;
                        this.f22632q0 = c16525b;
                        this.f22633r0 = 8;
                        if (c2176eM3210i.mo3141d(c2142l, this) == obj4) {
                            return obj4;
                        }
                        r15 = r14;
                        r16 = r12;
                        str7 = str6;
                        c18711a5 = c18711a4;
                        obj7 = obj4;
                        c21929j5 = c21929j2;
                        obj8 = c16525b.f51262Y;
                        if (!(obj8 instanceof C6223B)) {
                            abstractC6224C = (AbstractC6224C) obj8;
                            if (abstractC6224C instanceof C6223B) {
                                abstractC21955Q1M6734a3 = new C21952P1(null);
                            } else if (abstractC6224C instanceof C6248v) {
                                abstractC21955Q1M6734a3 = c21929j5;
                            } else {
                                if (!(abstractC6224C instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C.getClass();
                                abstractC21955Q1M6734a3 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
                            }
                            c18712b2 = new C18712b(abstractC21955Q1M6734a3);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22632q0 = null;
                            this.f22633r0 = 9;
                            if (r15.mo395a(c18712b2, this) == obj7) {
                                return obj7;
                            }
                            return c17296c;
                        }
                        c18716f = C18716f.f59550a;
                        this.f22634s0 = r15;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str5;
                        this.f22630o0 = str7;
                        this.f22631p0 = r16;
                        this.f22632q0 = null;
                        this.f22633r0 = 10;
                        if (r15.mo395a(c18716f, this) == obj7) {
                            return obj7;
                        }
                        r18 = r16;
                        str8 = str7;
                        str9 = str5;
                        obj9 = obj7;
                        r19 = r15;
                        c21929j6 = c21929j5;
                        C7392q c7392q12 = c7112f.f22642Z;
                        String str1120 = ((C18997f) ((C6223B) r18).f20258a).f60577b;
                        this.f22634s0 = r19;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r18;
                        this.f22633r0 = 11;
                        C7388m c7388m4 = new C7388m(str1120, null);
                        InterfaceC3756d interfaceC3756dMo5693b5 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                        interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
                        objM9690b = AbstractC9144I.m9690b(c7392q12.f23420a, new C21296a(interfaceC3756dMo5693b5, interfaceC3777yM18075c), c7388m4, this);
                        r20 = r18;
                        obj10 = obj9;
                        r110 = r19;
                        c21929j7 = c21929j6;
                        if (objM9690b == obj9) {
                            return obj9;
                        }
                        abstractC6224C2 = (AbstractC6224C) objM9690b;
                        z10 = abstractC6224C2 instanceof C6223B;
                        if (!z10) {
                            if (z10) {
                                abstractC21955Q1M6734a4 = new C21952P1(null);
                            } else if (abstractC6224C2 instanceof C6248v) {
                                abstractC21955Q1M6734a4 = c21929j7;
                            } else {
                                if (!(abstractC6224C2 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C2.getClass();
                                abstractC21955Q1M6734a4 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C2);
                            }
                            c18712b3 = new C18712b(abstractC21955Q1M6734a4);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 12;
                            if (r110.mo395a(c18712b3, this) == obj10) {
                                return obj10;
                            }
                            return c17296c;
                        }
                        if (AbstractC7110d.f22627a[enumC18991F2.ordinal()] == 1) {
                            String str11111 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                            this.f22634s0 = r110;
                            this.f22628Y = c18711a5;
                            this.f22629Z = str9;
                            this.f22630o0 = str8;
                            this.f22631p0 = r20;
                            this.f22633r0 = 13;
                            objM7519e = C7112f.m7519e(c7112f, str11111, this);
                            if (objM7519e == obj10) {
                                r21 = r20;
                                obj11 = obj10;
                                r111 = r110;
                                c21929j8 = c21929j7;
                                return obj10;
                            }
                            r21 = r20;
                            obj11 = obj10;
                            r111 = r110;
                            c21929j8 = c21929j7;
                            abstractC6224C3 = (AbstractC6224C) objM7519e;
                            r22 = r21;
                            obj12 = obj11;
                            r112 = r111;
                            c21929j9 = c21929j8;
                            str10 = str8;
                            r23 = r112;
                            if (abstractC6224C3 instanceof C6223B) {
                                if (c18711a5 instanceof C7114h) {
                                    C21903D c21903d112 = C21907E.Companion;
                                    String str11112 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d112.getClass();
                                    String strM22336a15 = C21903D.m22336a(str11112);
                                    int length12 = c18711a5.f59545a.length;
                                    C7114h c7114h8 = (C7114h) c18711a5;
                                    c21908e0 = new C21965U0(strM22336a15, length12, c7114h8.f22653b, c7114h8.f22654c, str10, 96);
                                } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                    EnumC21968V0 enumC21968V7 = EnumC21968V0.Inpainting;
                                    C21903D c21903d113 = C21907E.Companion;
                                    String str11113 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d113.getClass();
                                    c21908e0 = new C22071w0(enumC21968V7, this.f22639x0, C21903D.m22336a(str11113), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                                } else {
                                    C21903D c21903d114 = C21907E.Companion;
                                    String str11114 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d114.getClass();
                                    String strM22336a16 = C21903D.m22336a(str11114);
                                    AbstractC16544l.m18091d(str9);
                                    c21908e0 = new C21908E0(strM22336a16, str9, new Integer(c18711a5.f59545a.length), str10);
                                }
                                c21952p1 = new C21952P1(c21908e0);
                            } else if (abstractC6224C3 instanceof C6248v) {
                                c21952p1 = c21929j9;
                            } else {
                                if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C3.getClass();
                                c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                            }
                            c18712b4 = new C18712b(c21952p1);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 15;
                            if (r23.mo395a(c18712b4, this) == obj12) {
                                return obj12;
                            }
                            return c17296c;
                        }
                        String str11115 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                        this.f22634s0 = r110;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r20;
                        this.f22633r0 = 14;
                        objM7518a = C7112f.m7518a(c7112f, str11115, this);
                        if (objM7518a == obj10) {
                            r24 = r20;
                            obj13 = obj10;
                            r113 = r110;
                            c21929j10 = c21929j7;
                            return obj10;
                        }
                        r24 = r20;
                        obj13 = obj10;
                        r113 = r110;
                        c21929j10 = c21929j7;
                        abstractC6224C3 = (AbstractC6224C) objM7518a;
                        r22 = r24;
                        obj12 = obj13;
                        r112 = r113;
                        c21929j9 = c21929j10;
                        str10 = str8;
                        r23 = r112;
                        if (abstractC6224C3 instanceof C6223B) {
                            if (c18711a5 instanceof C7114h) {
                                C21903D c21903d115 = C21907E.Companion;
                                String str11116 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d115.getClass();
                                String strM22336a17 = C21903D.m22336a(str11116);
                                int length13 = c18711a5.f59545a.length;
                                C7114h c7114h9 = (C7114h) c18711a5;
                                c21908e0 = new C21965U0(strM22336a17, length13, c7114h9.f22653b, c7114h9.f22654c, str10, 96);
                            } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                EnumC21968V0 enumC21968V8 = EnumC21968V0.Inpainting;
                                C21903D c21903d116 = C21907E.Companion;
                                String str11117 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d116.getClass();
                                c21908e0 = new C22071w0(enumC21968V8, this.f22639x0, C21903D.m22336a(str11117), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                            } else {
                                C21903D c21903d117 = C21907E.Companion;
                                String str11118 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d117.getClass();
                                String strM22336a18 = C21903D.m22336a(str11118);
                                AbstractC16544l.m18091d(str9);
                                c21908e0 = new C21908E0(strM22336a18, str9, new Integer(c18711a5.f59545a.length), str10);
                            }
                            c21952p1 = new C21952P1(c21908e0);
                        } else if (abstractC6224C3 instanceof C6248v) {
                            c21952p1 = c21929j9;
                        } else {
                            if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                throw new C0644w();
                            }
                            abstractC6224C3.getClass();
                            c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                        }
                        c18712b4 = new C18712b(c21952p1);
                        this.f22634s0 = null;
                        this.f22628Y = null;
                        this.f22629Z = null;
                        this.f22630o0 = null;
                        this.f22631p0 = null;
                        this.f22633r0 = 15;
                        if (r23.mo395a(c18712b4, this) == obj12) {
                            return obj12;
                        }
                        return c17296c;
                    case 2:
                        AbstractC9233X.m9807c(obj);
                        return c17296c;
                    case 3:
                        String str20 = this.f22630o0;
                        String str21 = this.f22629Z;
                        C18711a c18711a7 = this.f22628Y;
                        InterfaceC2186j interfaceC2186j7 = (InterfaceC2186j) this.f22634s0;
                        AbstractC9233X.m9807c(obj);
                        cls4 = cls5;
                        c17296c = c17296c;
                        c21929j14 = c21929j18;
                        interfaceC2186j3 = interfaceC2186j7;
                        objM7793c = obj;
                        enumC19250a6 = enumC19250a10;
                        c18711a4 = c18711a7;
                        str5 = str21;
                        str6 = str20;
                        abstractC6224C4 = (AbstractC6224C) objM7793c;
                        z13 = abstractC6224C4 instanceof AbstractC6249w;
                        r14 = interfaceC2186j3;
                        r12 = abstractC6224C4;
                        obj4 = enumC19250a6;
                        c21929j2 = c21929j14;
                        if (z13) {
                            th3 = ((AbstractC6249w) abstractC6224C4).f20328a;
                            if (th3 instanceof C6228b) {
                                c6228b = (C6228b) th3;
                            } else {
                                c6228b = null;
                            }
                            if (c6228b != null) {
                                cause = c6228b.getCause();
                            } else {
                                cause = null;
                            }
                            if (cause instanceof C8920e) {
                                c8920e = (C8920e) cause;
                            } else {
                                c8920e = null;
                            }
                            if (c8920e != null) {
                            }
                            abstractC16643b = null;
                            interfaceC2186j4 = interfaceC2186j3;
                            abstractC6224C5 = abstractC6224C4;
                            enumC19250a7 = enumC19250a6;
                            c21929j15 = c21929j14;
                            if (abstractC16643b instanceof C16644c) {
                                c16644c = (C16644c) abstractC16643b;
                            } else {
                                c16644c = null;
                            }
                            if (c16644c == null) {
                            }
                            r32 = interfaceC2186j4;
                            r17 = abstractC6224C5;
                            obj5 = enumC19250a7;
                            c21929j3 = c21929j15;
                            r14 = r32;
                            r12 = r17;
                            obj4 = obj5;
                            c21929j2 = c21929j3;
                            break;
                        }
                        z6 = r12 instanceof C6223B;
                        if (!z6) {
                            if (z6) {
                                abstractC21955Q1M6734a2 = new C21952P1(null);
                            } else if (r12 instanceof C6248v) {
                                abstractC21955Q1M6734a2 = c21929j2;
                            } else {
                                if (r12 instanceof AbstractC6249w) {
                                    throw new C0644w();
                                }
                                r12.getClass();
                                abstractC21955Q1M6734a2 = AbstractC6224C.m6734a((AbstractC6249w) r12);
                            }
                            c18712b = new C18712b(abstractC21955Q1M6734a2);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 7;
                            if (r14.mo395a(c18712b, this) == obj4) {
                                return obj4;
                            }
                            return c17296c;
                        }
                        c16525b = new C16525B();
                        c16525b.f51262Y = C6248v.f20327a;
                        C7392q c7392q13 = c7112f.f22642Z;
                        String url5 = ((C18997f) ((C6223B) r12).f20258a).f60576a;
                        byte[] data5 = c18711a4.f59545a;
                        AbstractC16544l.m18094g(url5, "url");
                        AbstractC16544l.m18094g(data5, "data");
                        c2176eM3210i = AbstractC2124C.m3210i(new C7391p(c7392q13, url5, data5, null));
                        c2142l = new C2142L(r14, c16525b, 1);
                        this.f22634s0 = r14;
                        this.f22628Y = c18711a4;
                        this.f22629Z = str5;
                        this.f22630o0 = str6;
                        this.f22631p0 = r12;
                        this.f22632q0 = c16525b;
                        this.f22633r0 = 8;
                        if (c2176eM3210i.mo3141d(c2142l, this) == obj4) {
                            return obj4;
                        }
                        r15 = r14;
                        r16 = r12;
                        str7 = str6;
                        c18711a5 = c18711a4;
                        obj7 = obj4;
                        c21929j5 = c21929j2;
                        obj8 = c16525b.f51262Y;
                        if (!(obj8 instanceof C6223B)) {
                            abstractC6224C = (AbstractC6224C) obj8;
                            if (abstractC6224C instanceof C6223B) {
                                abstractC21955Q1M6734a3 = new C21952P1(null);
                            } else if (abstractC6224C instanceof C6248v) {
                                abstractC21955Q1M6734a3 = c21929j5;
                            } else {
                                if (!(abstractC6224C instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C.getClass();
                                abstractC21955Q1M6734a3 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
                            }
                            c18712b2 = new C18712b(abstractC21955Q1M6734a3);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22632q0 = null;
                            this.f22633r0 = 9;
                            if (r15.mo395a(c18712b2, this) == obj7) {
                                return obj7;
                            }
                            return c17296c;
                        }
                        c18716f = C18716f.f59550a;
                        this.f22634s0 = r15;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str5;
                        this.f22630o0 = str7;
                        this.f22631p0 = r16;
                        this.f22632q0 = null;
                        this.f22633r0 = 10;
                        if (r15.mo395a(c18716f, this) == obj7) {
                            return obj7;
                        }
                        r18 = r16;
                        str8 = str7;
                        str9 = str5;
                        obj9 = obj7;
                        r19 = r15;
                        c21929j6 = c21929j5;
                        C7392q c7392q14 = c7112f.f22642Z;
                        String str1121 = ((C18997f) ((C6223B) r18).f20258a).f60577b;
                        this.f22634s0 = r19;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r18;
                        this.f22633r0 = 11;
                        C7388m c7388m5 = new C7388m(str1121, null);
                        InterfaceC3756d interfaceC3756dMo5693b6 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                        interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
                        objM9690b = AbstractC9144I.m9690b(c7392q14.f23420a, new C21296a(interfaceC3756dMo5693b6, interfaceC3777yM18075c), c7388m5, this);
                        r20 = r18;
                        obj10 = obj9;
                        r110 = r19;
                        c21929j7 = c21929j6;
                        if (objM9690b == obj9) {
                            return obj9;
                        }
                        abstractC6224C2 = (AbstractC6224C) objM9690b;
                        z10 = abstractC6224C2 instanceof C6223B;
                        if (!z10) {
                            if (z10) {
                                abstractC21955Q1M6734a4 = new C21952P1(null);
                            } else if (abstractC6224C2 instanceof C6248v) {
                                abstractC21955Q1M6734a4 = c21929j7;
                            } else {
                                if (!(abstractC6224C2 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C2.getClass();
                                abstractC21955Q1M6734a4 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C2);
                            }
                            c18712b3 = new C18712b(abstractC21955Q1M6734a4);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 12;
                            if (r110.mo395a(c18712b3, this) == obj10) {
                                return obj10;
                            }
                            return c17296c;
                        }
                        if (AbstractC7110d.f22627a[enumC18991F2.ordinal()] == 1) {
                            String str11119 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                            this.f22634s0 = r110;
                            this.f22628Y = c18711a5;
                            this.f22629Z = str9;
                            this.f22630o0 = str8;
                            this.f22631p0 = r20;
                            this.f22633r0 = 13;
                            objM7519e = C7112f.m7519e(c7112f, str11119, this);
                            if (objM7519e == obj10) {
                                r21 = r20;
                                obj11 = obj10;
                                r111 = r110;
                                c21929j8 = c21929j7;
                                return obj10;
                            }
                            r21 = r20;
                            obj11 = obj10;
                            r111 = r110;
                            c21929j8 = c21929j7;
                            abstractC6224C3 = (AbstractC6224C) objM7519e;
                            r22 = r21;
                            obj12 = obj11;
                            r112 = r111;
                            c21929j9 = c21929j8;
                            str10 = str8;
                            r23 = r112;
                            if (abstractC6224C3 instanceof C6223B) {
                                if (c18711a5 instanceof C7114h) {
                                    C21903D c21903d118 = C21907E.Companion;
                                    String str111110 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d118.getClass();
                                    String strM22336a19 = C21903D.m22336a(str111110);
                                    int length14 = c18711a5.f59545a.length;
                                    C7114h c7114h10 = (C7114h) c18711a5;
                                    c21908e0 = new C21965U0(strM22336a19, length14, c7114h10.f22653b, c7114h10.f22654c, str10, 96);
                                } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                    EnumC21968V0 enumC21968V9 = EnumC21968V0.Inpainting;
                                    C21903D c21903d119 = C21907E.Companion;
                                    String str111111 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d119.getClass();
                                    c21908e0 = new C22071w0(enumC21968V9, this.f22639x0, C21903D.m22336a(str111111), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                                } else {
                                    C21903D c21903d1110 = C21907E.Companion;
                                    String str111112 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d1110.getClass();
                                    String strM22336a110 = C21903D.m22336a(str111112);
                                    AbstractC16544l.m18091d(str9);
                                    c21908e0 = new C21908E0(strM22336a110, str9, new Integer(c18711a5.f59545a.length), str10);
                                }
                                c21952p1 = new C21952P1(c21908e0);
                            } else if (abstractC6224C3 instanceof C6248v) {
                                c21952p1 = c21929j9;
                            } else {
                                if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C3.getClass();
                                c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                            }
                            c18712b4 = new C18712b(c21952p1);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 15;
                            if (r23.mo395a(c18712b4, this) == obj12) {
                                return obj12;
                            }
                            return c17296c;
                        }
                        String str111113 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                        this.f22634s0 = r110;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r20;
                        this.f22633r0 = 14;
                        objM7518a = C7112f.m7518a(c7112f, str111113, this);
                        if (objM7518a == obj10) {
                            r24 = r20;
                            obj13 = obj10;
                            r113 = r110;
                            c21929j10 = c21929j7;
                            return obj10;
                        }
                        r24 = r20;
                        obj13 = obj10;
                        r113 = r110;
                        c21929j10 = c21929j7;
                        abstractC6224C3 = (AbstractC6224C) objM7518a;
                        r22 = r24;
                        obj12 = obj13;
                        r112 = r113;
                        c21929j9 = c21929j10;
                        str10 = str8;
                        r23 = r112;
                        if (abstractC6224C3 instanceof C6223B) {
                            if (c18711a5 instanceof C7114h) {
                                C21903D c21903d1111 = C21907E.Companion;
                                String str111114 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d1111.getClass();
                                String strM22336a111 = C21903D.m22336a(str111114);
                                int length15 = c18711a5.f59545a.length;
                                C7114h c7114h11 = (C7114h) c18711a5;
                                c21908e0 = new C21965U0(strM22336a111, length15, c7114h11.f22653b, c7114h11.f22654c, str10, 96);
                            } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                EnumC21968V0 enumC21968V10 = EnumC21968V0.Inpainting;
                                C21903D c21903d1112 = C21907E.Companion;
                                String str111115 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d1112.getClass();
                                c21908e0 = new C22071w0(enumC21968V10, this.f22639x0, C21903D.m22336a(str111115), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                            } else {
                                C21903D c21903d1113 = C21907E.Companion;
                                String str111116 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d1113.getClass();
                                String strM22336a112 = C21903D.m22336a(str111116);
                                AbstractC16544l.m18091d(str9);
                                c21908e0 = new C21908E0(strM22336a112, str9, new Integer(c18711a5.f59545a.length), str10);
                            }
                            c21952p1 = new C21952P1(c21908e0);
                        } else if (abstractC6224C3 instanceof C6248v) {
                            c21952p1 = c21929j9;
                        } else {
                            if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                throw new C0644w();
                            }
                            abstractC6224C3.getClass();
                            c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                        }
                        c18712b4 = new C18712b(c21952p1);
                        this.f22634s0 = null;
                        this.f22628Y = null;
                        this.f22629Z = null;
                        this.f22630o0 = null;
                        this.f22631p0 = null;
                        this.f22633r0 = 15;
                        if (r23.mo395a(c18712b4, this) == obj12) {
                            return obj12;
                        }
                        return c17296c;
                    case 4:
                        AbstractC6224C abstractC6224C8 = this.f22631p0;
                        str6 = this.f22630o0;
                        str5 = this.f22629Z;
                        c18711a4 = this.f22628Y;
                        InterfaceC2186j interfaceC2186j8 = (InterfaceC2186j) this.f22634s0;
                        AbstractC9233X.m9807c(obj);
                        objM7294a = obj;
                        c17296c = c17296c;
                        c21929j16 = c21929j18;
                        enumC19250a8 = enumC19250a10;
                        interfaceC2186j5 = interfaceC2186j8;
                        abstractC6224C6 = abstractC6224C8;
                        if (objM7294a != null) {
                            enumC19250a8 = enumC19250a6;
                            c21929j16 = c21929j14;
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
                        }
                        enumC19250a8 = enumC19250a6;
                        c21929j16 = c21929j14;
                        abstractC16643b = (AbstractC16643b) ((C16644c) objM7294a).get("detail");
                        abstractC6224C5 = abstractC6224C6;
                        interfaceC2186j4 = interfaceC2186j5;
                        enumC19250a7 = enumC19250a8;
                        c21929j15 = c21929j16;
                        if (abstractC16643b instanceof C16644c) {
                            c16644c = (C16644c) abstractC16643b;
                        } else {
                            c16644c = null;
                        }
                        if (c16644c == null) {
                            break;
                        }
                        r32 = interfaceC2186j4;
                        r17 = abstractC6224C5;
                        obj5 = enumC19250a7;
                        c21929j3 = c21929j15;
                        r14 = r32;
                        r12 = r17;
                        obj4 = obj5;
                        c21929j2 = c21929j3;
                        z6 = r12 instanceof C6223B;
                        if (!z6) {
                            if (z6) {
                                abstractC21955Q1M6734a2 = new C21952P1(null);
                            } else if (r12 instanceof C6248v) {
                                abstractC21955Q1M6734a2 = c21929j2;
                            } else {
                                if (r12 instanceof AbstractC6249w) {
                                    throw new C0644w();
                                }
                                r12.getClass();
                                abstractC21955Q1M6734a2 = AbstractC6224C.m6734a((AbstractC6249w) r12);
                            }
                            c18712b = new C18712b(abstractC21955Q1M6734a2);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 7;
                            if (r14.mo395a(c18712b, this) == obj4) {
                                return obj4;
                            }
                            return c17296c;
                        }
                        c16525b = new C16525B();
                        c16525b.f51262Y = C6248v.f20327a;
                        C7392q c7392q15 = c7112f.f22642Z;
                        String url6 = ((C18997f) ((C6223B) r12).f20258a).f60576a;
                        byte[] data6 = c18711a4.f59545a;
                        AbstractC16544l.m18094g(url6, "url");
                        AbstractC16544l.m18094g(data6, "data");
                        c2176eM3210i = AbstractC2124C.m3210i(new C7391p(c7392q15, url6, data6, null));
                        c2142l = new C2142L(r14, c16525b, 1);
                        this.f22634s0 = r14;
                        this.f22628Y = c18711a4;
                        this.f22629Z = str5;
                        this.f22630o0 = str6;
                        this.f22631p0 = r12;
                        this.f22632q0 = c16525b;
                        this.f22633r0 = 8;
                        if (c2176eM3210i.mo3141d(c2142l, this) == obj4) {
                            return obj4;
                        }
                        r15 = r14;
                        r16 = r12;
                        str7 = str6;
                        c18711a5 = c18711a4;
                        obj7 = obj4;
                        c21929j5 = c21929j2;
                        obj8 = c16525b.f51262Y;
                        if (!(obj8 instanceof C6223B)) {
                            abstractC6224C = (AbstractC6224C) obj8;
                            if (abstractC6224C instanceof C6223B) {
                                abstractC21955Q1M6734a3 = new C21952P1(null);
                            } else if (abstractC6224C instanceof C6248v) {
                                abstractC21955Q1M6734a3 = c21929j5;
                            } else {
                                if (!(abstractC6224C instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C.getClass();
                                abstractC21955Q1M6734a3 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
                            }
                            c18712b2 = new C18712b(abstractC21955Q1M6734a3);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22632q0 = null;
                            this.f22633r0 = 9;
                            if (r15.mo395a(c18712b2, this) == obj7) {
                                return obj7;
                            }
                            return c17296c;
                        }
                        c18716f = C18716f.f59550a;
                        this.f22634s0 = r15;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str5;
                        this.f22630o0 = str7;
                        this.f22631p0 = r16;
                        this.f22632q0 = null;
                        this.f22633r0 = 10;
                        if (r15.mo395a(c18716f, this) == obj7) {
                            return obj7;
                        }
                        r18 = r16;
                        str8 = str7;
                        str9 = str5;
                        obj9 = obj7;
                        r19 = r15;
                        c21929j6 = c21929j5;
                        C7392q c7392q16 = c7112f.f22642Z;
                        String str1122 = ((C18997f) ((C6223B) r18).f20258a).f60577b;
                        this.f22634s0 = r19;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r18;
                        this.f22633r0 = 11;
                        C7388m c7388m6 = new C7388m(str1122, null);
                        InterfaceC3756d interfaceC3756dMo5693b7 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                        interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
                        objM9690b = AbstractC9144I.m9690b(c7392q16.f23420a, new C21296a(interfaceC3756dMo5693b7, interfaceC3777yM18075c), c7388m6, this);
                        r20 = r18;
                        obj10 = obj9;
                        r110 = r19;
                        c21929j7 = c21929j6;
                        if (objM9690b == obj9) {
                            return obj9;
                        }
                        abstractC6224C2 = (AbstractC6224C) objM9690b;
                        z10 = abstractC6224C2 instanceof C6223B;
                        if (!z10) {
                            if (z10) {
                                abstractC21955Q1M6734a4 = new C21952P1(null);
                            } else if (abstractC6224C2 instanceof C6248v) {
                                abstractC21955Q1M6734a4 = c21929j7;
                            } else {
                                if (!(abstractC6224C2 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C2.getClass();
                                abstractC21955Q1M6734a4 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C2);
                            }
                            c18712b3 = new C18712b(abstractC21955Q1M6734a4);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 12;
                            if (r110.mo395a(c18712b3, this) == obj10) {
                                return obj10;
                            }
                            return c17296c;
                        }
                        if (AbstractC7110d.f22627a[enumC18991F2.ordinal()] == 1) {
                            String str111117 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                            this.f22634s0 = r110;
                            this.f22628Y = c18711a5;
                            this.f22629Z = str9;
                            this.f22630o0 = str8;
                            this.f22631p0 = r20;
                            this.f22633r0 = 13;
                            objM7519e = C7112f.m7519e(c7112f, str111117, this);
                            if (objM7519e == obj10) {
                                r21 = r20;
                                obj11 = obj10;
                                r111 = r110;
                                c21929j8 = c21929j7;
                                return obj10;
                            }
                            r21 = r20;
                            obj11 = obj10;
                            r111 = r110;
                            c21929j8 = c21929j7;
                            abstractC6224C3 = (AbstractC6224C) objM7519e;
                            r22 = r21;
                            obj12 = obj11;
                            r112 = r111;
                            c21929j9 = c21929j8;
                            str10 = str8;
                            r23 = r112;
                            if (abstractC6224C3 instanceof C6223B) {
                                if (c18711a5 instanceof C7114h) {
                                    C21903D c21903d1114 = C21907E.Companion;
                                    String str111118 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d1114.getClass();
                                    String strM22336a113 = C21903D.m22336a(str111118);
                                    int length16 = c18711a5.f59545a.length;
                                    C7114h c7114h12 = (C7114h) c18711a5;
                                    c21908e0 = new C21965U0(strM22336a113, length16, c7114h12.f22653b, c7114h12.f22654c, str10, 96);
                                } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                    EnumC21968V0 enumC21968V11 = EnumC21968V0.Inpainting;
                                    C21903D c21903d1115 = C21907E.Companion;
                                    String str111119 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d1115.getClass();
                                    c21908e0 = new C22071w0(enumC21968V11, this.f22639x0, C21903D.m22336a(str111119), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                                } else {
                                    C21903D c21903d1116 = C21907E.Companion;
                                    String str1111110 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d1116.getClass();
                                    String strM22336a114 = C21903D.m22336a(str1111110);
                                    AbstractC16544l.m18091d(str9);
                                    c21908e0 = new C21908E0(strM22336a114, str9, new Integer(c18711a5.f59545a.length), str10);
                                }
                                c21952p1 = new C21952P1(c21908e0);
                            } else if (abstractC6224C3 instanceof C6248v) {
                                c21952p1 = c21929j9;
                            } else {
                                if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C3.getClass();
                                c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                            }
                            c18712b4 = new C18712b(c21952p1);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 15;
                            if (r23.mo395a(c18712b4, this) == obj12) {
                                return obj12;
                            }
                            return c17296c;
                        }
                        String str1111111 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                        this.f22634s0 = r110;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r20;
                        this.f22633r0 = 14;
                        objM7518a = C7112f.m7518a(c7112f, str1111111, this);
                        if (objM7518a == obj10) {
                            r24 = r20;
                            obj13 = obj10;
                            r113 = r110;
                            c21929j10 = c21929j7;
                            return obj10;
                        }
                        r24 = r20;
                        obj13 = obj10;
                        r113 = r110;
                        c21929j10 = c21929j7;
                        abstractC6224C3 = (AbstractC6224C) objM7518a;
                        r22 = r24;
                        obj12 = obj13;
                        r112 = r113;
                        c21929j9 = c21929j10;
                        str10 = str8;
                        r23 = r112;
                        if (abstractC6224C3 instanceof C6223B) {
                            if (c18711a5 instanceof C7114h) {
                                C21903D c21903d1117 = C21907E.Companion;
                                String str1111112 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d1117.getClass();
                                String strM22336a115 = C21903D.m22336a(str1111112);
                                int length17 = c18711a5.f59545a.length;
                                C7114h c7114h13 = (C7114h) c18711a5;
                                c21908e0 = new C21965U0(strM22336a115, length17, c7114h13.f22653b, c7114h13.f22654c, str10, 96);
                            } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                EnumC21968V0 enumC21968V12 = EnumC21968V0.Inpainting;
                                C21903D c21903d1118 = C21907E.Companion;
                                String str1111113 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d1118.getClass();
                                c21908e0 = new C22071w0(enumC21968V12, this.f22639x0, C21903D.m22336a(str1111113), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                            } else {
                                C21903D c21903d1119 = C21907E.Companion;
                                String str1111114 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d1119.getClass();
                                String strM22336a116 = C21903D.m22336a(str1111114);
                                AbstractC16544l.m18091d(str9);
                                c21908e0 = new C21908E0(strM22336a116, str9, new Integer(c18711a5.f59545a.length), str10);
                            }
                            c21952p1 = new C21952P1(c21908e0);
                        } else if (abstractC6224C3 instanceof C6248v) {
                            c21952p1 = c21929j9;
                        } else {
                            if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                throw new C0644w();
                            }
                            abstractC6224C3.getClass();
                            c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                        }
                        c18712b4 = new C18712b(c21952p1);
                        this.f22634s0 = null;
                        this.f22628Y = null;
                        this.f22629Z = null;
                        this.f22630o0 = null;
                        this.f22631p0 = null;
                        this.f22633r0 = 15;
                        if (r23.mo395a(c18712b4, this) == obj12) {
                            return obj12;
                        }
                        return c17296c;
                    case 5:
                        AbstractC6224C abstractC6224C9 = this.f22631p0;
                        str6 = this.f22630o0;
                        str5 = this.f22629Z;
                        c18711a4 = this.f22628Y;
                        InterfaceC2186j interfaceC2186j9 = (InterfaceC2186j) this.f22634s0;
                        AbstractC9233X.m9807c(obj);
                        c17296c = c17296c;
                        c21929j17 = c21929j18;
                        enumC19250a9 = enumC19250a10;
                        abstractC6224C7 = abstractC6224C9;
                        interfaceC2186j6 = interfaceC2186j9;
                        r12 = abstractC6224C7;
                        r14 = interfaceC2186j6;
                        obj4 = enumC19250a9;
                        c21929j2 = c21929j17;
                        z6 = r12 instanceof C6223B;
                        if (!z6) {
                            if (z6) {
                                abstractC21955Q1M6734a2 = new C21952P1(null);
                            } else if (r12 instanceof C6248v) {
                                abstractC21955Q1M6734a2 = c21929j2;
                            } else {
                                if (r12 instanceof AbstractC6249w) {
                                    throw new C0644w();
                                }
                                r12.getClass();
                                abstractC21955Q1M6734a2 = AbstractC6224C.m6734a((AbstractC6249w) r12);
                            }
                            c18712b = new C18712b(abstractC21955Q1M6734a2);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 7;
                            if (r14.mo395a(c18712b, this) == obj4) {
                                return obj4;
                            }
                            return c17296c;
                        }
                        c16525b = new C16525B();
                        c16525b.f51262Y = C6248v.f20327a;
                        C7392q c7392q17 = c7112f.f22642Z;
                        String url7 = ((C18997f) ((C6223B) r12).f20258a).f60576a;
                        byte[] data7 = c18711a4.f59545a;
                        AbstractC16544l.m18094g(url7, "url");
                        AbstractC16544l.m18094g(data7, "data");
                        c2176eM3210i = AbstractC2124C.m3210i(new C7391p(c7392q17, url7, data7, null));
                        c2142l = new C2142L(r14, c16525b, 1);
                        this.f22634s0 = r14;
                        this.f22628Y = c18711a4;
                        this.f22629Z = str5;
                        this.f22630o0 = str6;
                        this.f22631p0 = r12;
                        this.f22632q0 = c16525b;
                        this.f22633r0 = 8;
                        if (c2176eM3210i.mo3141d(c2142l, this) == obj4) {
                            return obj4;
                        }
                        r15 = r14;
                        r16 = r12;
                        str7 = str6;
                        c18711a5 = c18711a4;
                        obj7 = obj4;
                        c21929j5 = c21929j2;
                        obj8 = c16525b.f51262Y;
                        if (!(obj8 instanceof C6223B)) {
                            abstractC6224C = (AbstractC6224C) obj8;
                            if (abstractC6224C instanceof C6223B) {
                                abstractC21955Q1M6734a3 = new C21952P1(null);
                            } else if (abstractC6224C instanceof C6248v) {
                                abstractC21955Q1M6734a3 = c21929j5;
                            } else {
                                if (!(abstractC6224C instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C.getClass();
                                abstractC21955Q1M6734a3 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
                            }
                            c18712b2 = new C18712b(abstractC21955Q1M6734a3);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22632q0 = null;
                            this.f22633r0 = 9;
                            if (r15.mo395a(c18712b2, this) == obj7) {
                                return obj7;
                            }
                            return c17296c;
                        }
                        c18716f = C18716f.f59550a;
                        this.f22634s0 = r15;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str5;
                        this.f22630o0 = str7;
                        this.f22631p0 = r16;
                        this.f22632q0 = null;
                        this.f22633r0 = 10;
                        if (r15.mo395a(c18716f, this) == obj7) {
                            return obj7;
                        }
                        r18 = r16;
                        str8 = str7;
                        str9 = str5;
                        obj9 = obj7;
                        r19 = r15;
                        c21929j6 = c21929j5;
                        C7392q c7392q18 = c7112f.f22642Z;
                        String str1123 = ((C18997f) ((C6223B) r18).f20258a).f60577b;
                        this.f22634s0 = r19;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r18;
                        this.f22633r0 = 11;
                        C7388m c7388m7 = new C7388m(str1123, null);
                        InterfaceC3756d interfaceC3756dMo5693b8 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                        interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
                        objM9690b = AbstractC9144I.m9690b(c7392q18.f23420a, new C21296a(interfaceC3756dMo5693b8, interfaceC3777yM18075c), c7388m7, this);
                        r20 = r18;
                        obj10 = obj9;
                        r110 = r19;
                        c21929j7 = c21929j6;
                        if (objM9690b == obj9) {
                            return obj9;
                        }
                        abstractC6224C2 = (AbstractC6224C) objM9690b;
                        z10 = abstractC6224C2 instanceof C6223B;
                        if (!z10) {
                            if (z10) {
                                abstractC21955Q1M6734a4 = new C21952P1(null);
                            } else if (abstractC6224C2 instanceof C6248v) {
                                abstractC21955Q1M6734a4 = c21929j7;
                            } else {
                                if (!(abstractC6224C2 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C2.getClass();
                                abstractC21955Q1M6734a4 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C2);
                            }
                            c18712b3 = new C18712b(abstractC21955Q1M6734a4);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 12;
                            if (r110.mo395a(c18712b3, this) == obj10) {
                                return obj10;
                            }
                            return c17296c;
                        }
                        if (AbstractC7110d.f22627a[enumC18991F2.ordinal()] == 1) {
                            String str1111115 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                            this.f22634s0 = r110;
                            this.f22628Y = c18711a5;
                            this.f22629Z = str9;
                            this.f22630o0 = str8;
                            this.f22631p0 = r20;
                            this.f22633r0 = 13;
                            objM7519e = C7112f.m7519e(c7112f, str1111115, this);
                            if (objM7519e == obj10) {
                                r21 = r20;
                                obj11 = obj10;
                                r111 = r110;
                                c21929j8 = c21929j7;
                                return obj10;
                            }
                            r21 = r20;
                            obj11 = obj10;
                            r111 = r110;
                            c21929j8 = c21929j7;
                            abstractC6224C3 = (AbstractC6224C) objM7519e;
                            r22 = r21;
                            obj12 = obj11;
                            r112 = r111;
                            c21929j9 = c21929j8;
                            str10 = str8;
                            r23 = r112;
                            if (abstractC6224C3 instanceof C6223B) {
                                if (c18711a5 instanceof C7114h) {
                                    C21903D c21903d11110 = C21907E.Companion;
                                    String str1111116 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d11110.getClass();
                                    String strM22336a117 = C21903D.m22336a(str1111116);
                                    int length18 = c18711a5.f59545a.length;
                                    C7114h c7114h14 = (C7114h) c18711a5;
                                    c21908e0 = new C21965U0(strM22336a117, length18, c7114h14.f22653b, c7114h14.f22654c, str10, 96);
                                } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                    EnumC21968V0 enumC21968V13 = EnumC21968V0.Inpainting;
                                    C21903D c21903d11111 = C21907E.Companion;
                                    String str1111117 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d11111.getClass();
                                    c21908e0 = new C22071w0(enumC21968V13, this.f22639x0, C21903D.m22336a(str1111117), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                                } else {
                                    C21903D c21903d11112 = C21907E.Companion;
                                    String str1111118 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d11112.getClass();
                                    String strM22336a118 = C21903D.m22336a(str1111118);
                                    AbstractC16544l.m18091d(str9);
                                    c21908e0 = new C21908E0(strM22336a118, str9, new Integer(c18711a5.f59545a.length), str10);
                                }
                                c21952p1 = new C21952P1(c21908e0);
                            } else if (abstractC6224C3 instanceof C6248v) {
                                c21952p1 = c21929j9;
                            } else {
                                if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C3.getClass();
                                c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                            }
                            c18712b4 = new C18712b(c21952p1);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 15;
                            if (r23.mo395a(c18712b4, this) == obj12) {
                                return obj12;
                            }
                            return c17296c;
                        }
                        String str1111119 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                        this.f22634s0 = r110;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r20;
                        this.f22633r0 = 14;
                        objM7518a = C7112f.m7518a(c7112f, str1111119, this);
                        if (objM7518a == obj10) {
                            r24 = r20;
                            obj13 = obj10;
                            r113 = r110;
                            c21929j10 = c21929j7;
                            return obj10;
                        }
                        r24 = r20;
                        obj13 = obj10;
                        r113 = r110;
                        c21929j10 = c21929j7;
                        abstractC6224C3 = (AbstractC6224C) objM7518a;
                        r22 = r24;
                        obj12 = obj13;
                        r112 = r113;
                        c21929j9 = c21929j10;
                        str10 = str8;
                        r23 = r112;
                        if (abstractC6224C3 instanceof C6223B) {
                            if (c18711a5 instanceof C7114h) {
                                C21903D c21903d11113 = C21907E.Companion;
                                String str11111110 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d11113.getClass();
                                String strM22336a119 = C21903D.m22336a(str11111110);
                                int length19 = c18711a5.f59545a.length;
                                C7114h c7114h15 = (C7114h) c18711a5;
                                c21908e0 = new C21965U0(strM22336a119, length19, c7114h15.f22653b, c7114h15.f22654c, str10, 96);
                            } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                EnumC21968V0 enumC21968V14 = EnumC21968V0.Inpainting;
                                C21903D c21903d11114 = C21907E.Companion;
                                String str11111111 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d11114.getClass();
                                c21908e0 = new C22071w0(enumC21968V14, this.f22639x0, C21903D.m22336a(str11111111), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                            } else {
                                C21903D c21903d11115 = C21907E.Companion;
                                String str11111112 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d11115.getClass();
                                String strM22336a1110 = C21903D.m22336a(str11111112);
                                AbstractC16544l.m18091d(str9);
                                c21908e0 = new C21908E0(strM22336a1110, str9, new Integer(c18711a5.f59545a.length), str10);
                            }
                            c21952p1 = new C21952P1(c21908e0);
                        } else if (abstractC6224C3 instanceof C6248v) {
                            c21952p1 = c21929j9;
                        } else {
                            if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                throw new C0644w();
                            }
                            abstractC6224C3.getClass();
                            c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                        }
                        c18712b4 = new C18712b(c21952p1);
                        this.f22634s0 = null;
                        this.f22628Y = null;
                        this.f22629Z = null;
                        this.f22630o0 = null;
                        this.f22631p0 = null;
                        this.f22633r0 = 15;
                        if (r23.mo395a(c18712b4, this) == obj12) {
                            return obj12;
                        }
                        return c17296c;
                    case 6:
                        AbstractC6224C abstractC6224C10 = this.f22631p0;
                        str4 = this.f22630o0;
                        str2 = this.f22629Z;
                        c18711a2 = this.f22628Y;
                        InterfaceC2186j interfaceC2186j10 = (InterfaceC2186j) this.f22634s0;
                        AbstractC9233X.m9807c(obj);
                        c17296c = c17296c;
                        c21929j4 = c21929j18;
                        obj6 = enumC19250a10;
                        r11 = abstractC6224C10;
                        r13 = interfaceC2186j10;
                        r17 = r11;
                        str5 = str2;
                        c18711a4 = c18711a2;
                        r32 = r13;
                        str6 = str4;
                        obj5 = obj6;
                        c21929j3 = c21929j4;
                        r14 = r32;
                        r12 = r17;
                        obj4 = obj5;
                        c21929j2 = c21929j3;
                        z6 = r12 instanceof C6223B;
                        if (!z6) {
                            if (z6) {
                                abstractC21955Q1M6734a2 = new C21952P1(null);
                            } else if (r12 instanceof C6248v) {
                                abstractC21955Q1M6734a2 = c21929j2;
                            } else {
                                if (r12 instanceof AbstractC6249w) {
                                    throw new C0644w();
                                }
                                r12.getClass();
                                abstractC21955Q1M6734a2 = AbstractC6224C.m6734a((AbstractC6249w) r12);
                            }
                            c18712b = new C18712b(abstractC21955Q1M6734a2);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 7;
                            if (r14.mo395a(c18712b, this) == obj4) {
                                return obj4;
                            }
                            return c17296c;
                        }
                        c16525b = new C16525B();
                        c16525b.f51262Y = C6248v.f20327a;
                        C7392q c7392q19 = c7112f.f22642Z;
                        String url8 = ((C18997f) ((C6223B) r12).f20258a).f60576a;
                        byte[] data8 = c18711a4.f59545a;
                        AbstractC16544l.m18094g(url8, "url");
                        AbstractC16544l.m18094g(data8, "data");
                        c2176eM3210i = AbstractC2124C.m3210i(new C7391p(c7392q19, url8, data8, null));
                        c2142l = new C2142L(r14, c16525b, 1);
                        this.f22634s0 = r14;
                        this.f22628Y = c18711a4;
                        this.f22629Z = str5;
                        this.f22630o0 = str6;
                        this.f22631p0 = r12;
                        this.f22632q0 = c16525b;
                        this.f22633r0 = 8;
                        if (c2176eM3210i.mo3141d(c2142l, this) == obj4) {
                            return obj4;
                        }
                        r15 = r14;
                        r16 = r12;
                        str7 = str6;
                        c18711a5 = c18711a4;
                        obj7 = obj4;
                        c21929j5 = c21929j2;
                        obj8 = c16525b.f51262Y;
                        if (!(obj8 instanceof C6223B)) {
                            abstractC6224C = (AbstractC6224C) obj8;
                            if (abstractC6224C instanceof C6223B) {
                                abstractC21955Q1M6734a3 = new C21952P1(null);
                            } else if (abstractC6224C instanceof C6248v) {
                                abstractC21955Q1M6734a3 = c21929j5;
                            } else {
                                if (!(abstractC6224C instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C.getClass();
                                abstractC21955Q1M6734a3 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
                            }
                            c18712b2 = new C18712b(abstractC21955Q1M6734a3);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22632q0 = null;
                            this.f22633r0 = 9;
                            if (r15.mo395a(c18712b2, this) == obj7) {
                                return obj7;
                            }
                            return c17296c;
                        }
                        c18716f = C18716f.f59550a;
                        this.f22634s0 = r15;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str5;
                        this.f22630o0 = str7;
                        this.f22631p0 = r16;
                        this.f22632q0 = null;
                        this.f22633r0 = 10;
                        if (r15.mo395a(c18716f, this) == obj7) {
                            return obj7;
                        }
                        r18 = r16;
                        str8 = str7;
                        str9 = str5;
                        obj9 = obj7;
                        r19 = r15;
                        c21929j6 = c21929j5;
                        C7392q c7392q110 = c7112f.f22642Z;
                        String str1124 = ((C18997f) ((C6223B) r18).f20258a).f60577b;
                        this.f22634s0 = r19;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r18;
                        this.f22633r0 = 11;
                        C7388m c7388m8 = new C7388m(str1124, null);
                        InterfaceC3756d interfaceC3756dMo5693b9 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                        interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
                        objM9690b = AbstractC9144I.m9690b(c7392q110.f23420a, new C21296a(interfaceC3756dMo5693b9, interfaceC3777yM18075c), c7388m8, this);
                        r20 = r18;
                        obj10 = obj9;
                        r110 = r19;
                        c21929j7 = c21929j6;
                        if (objM9690b == obj9) {
                            return obj9;
                        }
                        abstractC6224C2 = (AbstractC6224C) objM9690b;
                        z10 = abstractC6224C2 instanceof C6223B;
                        if (!z10) {
                            if (z10) {
                                abstractC21955Q1M6734a4 = new C21952P1(null);
                            } else if (abstractC6224C2 instanceof C6248v) {
                                abstractC21955Q1M6734a4 = c21929j7;
                            } else {
                                if (!(abstractC6224C2 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C2.getClass();
                                abstractC21955Q1M6734a4 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C2);
                            }
                            c18712b3 = new C18712b(abstractC21955Q1M6734a4);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 12;
                            if (r110.mo395a(c18712b3, this) == obj10) {
                                return obj10;
                            }
                            return c17296c;
                        }
                        if (AbstractC7110d.f22627a[enumC18991F2.ordinal()] == 1) {
                            String str11111113 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                            this.f22634s0 = r110;
                            this.f22628Y = c18711a5;
                            this.f22629Z = str9;
                            this.f22630o0 = str8;
                            this.f22631p0 = r20;
                            this.f22633r0 = 13;
                            objM7519e = C7112f.m7519e(c7112f, str11111113, this);
                            if (objM7519e == obj10) {
                                r21 = r20;
                                obj11 = obj10;
                                r111 = r110;
                                c21929j8 = c21929j7;
                                return obj10;
                            }
                            r21 = r20;
                            obj11 = obj10;
                            r111 = r110;
                            c21929j8 = c21929j7;
                            abstractC6224C3 = (AbstractC6224C) objM7519e;
                            r22 = r21;
                            obj12 = obj11;
                            r112 = r111;
                            c21929j9 = c21929j8;
                            str10 = str8;
                            r23 = r112;
                            if (abstractC6224C3 instanceof C6223B) {
                                if (c18711a5 instanceof C7114h) {
                                    C21903D c21903d11116 = C21907E.Companion;
                                    String str11111114 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d11116.getClass();
                                    String strM22336a1111 = C21903D.m22336a(str11111114);
                                    int length110 = c18711a5.f59545a.length;
                                    C7114h c7114h16 = (C7114h) c18711a5;
                                    c21908e0 = new C21965U0(strM22336a1111, length110, c7114h16.f22653b, c7114h16.f22654c, str10, 96);
                                } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                    EnumC21968V0 enumC21968V15 = EnumC21968V0.Inpainting;
                                    C21903D c21903d11117 = C21907E.Companion;
                                    String str11111115 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d11117.getClass();
                                    c21908e0 = new C22071w0(enumC21968V15, this.f22639x0, C21903D.m22336a(str11111115), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                                } else {
                                    C21903D c21903d11118 = C21907E.Companion;
                                    String str11111116 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d11118.getClass();
                                    String strM22336a1112 = C21903D.m22336a(str11111116);
                                    AbstractC16544l.m18091d(str9);
                                    c21908e0 = new C21908E0(strM22336a1112, str9, new Integer(c18711a5.f59545a.length), str10);
                                }
                                c21952p1 = new C21952P1(c21908e0);
                            } else if (abstractC6224C3 instanceof C6248v) {
                                c21952p1 = c21929j9;
                            } else {
                                if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C3.getClass();
                                c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                            }
                            c18712b4 = new C18712b(c21952p1);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 15;
                            if (r23.mo395a(c18712b4, this) == obj12) {
                                return obj12;
                            }
                            return c17296c;
                        }
                        String str11111117 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                        this.f22634s0 = r110;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r20;
                        this.f22633r0 = 14;
                        objM7518a = C7112f.m7518a(c7112f, str11111117, this);
                        if (objM7518a == obj10) {
                            r24 = r20;
                            obj13 = obj10;
                            r113 = r110;
                            c21929j10 = c21929j7;
                            return obj10;
                        }
                        r24 = r20;
                        obj13 = obj10;
                        r113 = r110;
                        c21929j10 = c21929j7;
                        abstractC6224C3 = (AbstractC6224C) objM7518a;
                        r22 = r24;
                        obj12 = obj13;
                        r112 = r113;
                        c21929j9 = c21929j10;
                        str10 = str8;
                        r23 = r112;
                        if (abstractC6224C3 instanceof C6223B) {
                            if (c18711a5 instanceof C7114h) {
                                C21903D c21903d11119 = C21907E.Companion;
                                String str11111118 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d11119.getClass();
                                String strM22336a1113 = C21903D.m22336a(str11111118);
                                int length111 = c18711a5.f59545a.length;
                                C7114h c7114h17 = (C7114h) c18711a5;
                                c21908e0 = new C21965U0(strM22336a1113, length111, c7114h17.f22653b, c7114h17.f22654c, str10, 96);
                            } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                EnumC21968V0 enumC21968V16 = EnumC21968V0.Inpainting;
                                C21903D c21903d111110 = C21907E.Companion;
                                String str11111119 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d111110.getClass();
                                c21908e0 = new C22071w0(enumC21968V16, this.f22639x0, C21903D.m22336a(str11111119), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                            } else {
                                C21903D c21903d111111 = C21907E.Companion;
                                String str111111110 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d111111.getClass();
                                String strM22336a1114 = C21903D.m22336a(str111111110);
                                AbstractC16544l.m18091d(str9);
                                c21908e0 = new C21908E0(strM22336a1114, str9, new Integer(c18711a5.f59545a.length), str10);
                            }
                            c21952p1 = new C21952P1(c21908e0);
                        } else if (abstractC6224C3 instanceof C6248v) {
                            c21952p1 = c21929j9;
                        } else {
                            if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                throw new C0644w();
                            }
                            abstractC6224C3.getClass();
                            c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                        }
                        c18712b4 = new C18712b(c21952p1);
                        this.f22634s0 = null;
                        this.f22628Y = null;
                        this.f22629Z = null;
                        this.f22630o0 = null;
                        this.f22631p0 = null;
                        this.f22633r0 = 15;
                        if (r23.mo395a(c18712b4, this) == obj12) {
                            return obj12;
                        }
                        return c17296c;
                    case 7:
                        AbstractC9233X.m9807c(obj);
                        return c17296c;
                    case 8:
                        c16525b = this.f22632q0;
                        AbstractC6224C abstractC6224C11 = this.f22631p0;
                        str7 = this.f22630o0;
                        String str22 = this.f22629Z;
                        C18711a c18711a8 = this.f22628Y;
                        InterfaceC2186j interfaceC2186j11 = (InterfaceC2186j) this.f22634s0;
                        AbstractC9233X.m9807c(obj);
                        c17296c = c17296c;
                        c21929j5 = c21929j18;
                        str5 = str22;
                        c18711a5 = c18711a8;
                        r15 = interfaceC2186j11;
                        obj7 = enumC19250a10;
                        r16 = abstractC6224C11;
                        obj8 = c16525b.f51262Y;
                        if (!(obj8 instanceof C6223B)) {
                            abstractC6224C = (AbstractC6224C) obj8;
                            if (abstractC6224C instanceof C6223B) {
                                abstractC21955Q1M6734a3 = new C21952P1(null);
                            } else if (abstractC6224C instanceof C6248v) {
                                abstractC21955Q1M6734a3 = c21929j5;
                            } else {
                                if (!(abstractC6224C instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C.getClass();
                                abstractC21955Q1M6734a3 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
                            }
                            c18712b2 = new C18712b(abstractC21955Q1M6734a3);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22632q0 = null;
                            this.f22633r0 = 9;
                            if (r15.mo395a(c18712b2, this) == obj7) {
                                return obj7;
                            }
                            return c17296c;
                        }
                        c18716f = C18716f.f59550a;
                        this.f22634s0 = r15;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str5;
                        this.f22630o0 = str7;
                        this.f22631p0 = r16;
                        this.f22632q0 = null;
                        this.f22633r0 = 10;
                        if (r15.mo395a(c18716f, this) == obj7) {
                            return obj7;
                        }
                        r18 = r16;
                        str8 = str7;
                        str9 = str5;
                        obj9 = obj7;
                        r19 = r15;
                        c21929j6 = c21929j5;
                        C7392q c7392q111 = c7112f.f22642Z;
                        String str1125 = ((C18997f) ((C6223B) r18).f20258a).f60577b;
                        this.f22634s0 = r19;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r18;
                        this.f22633r0 = 11;
                        C7388m c7388m9 = new C7388m(str1125, null);
                        InterfaceC3756d interfaceC3756dMo5693b10 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                        interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
                        objM9690b = AbstractC9144I.m9690b(c7392q111.f23420a, new C21296a(interfaceC3756dMo5693b10, interfaceC3777yM18075c), c7388m9, this);
                        r20 = r18;
                        obj10 = obj9;
                        r110 = r19;
                        c21929j7 = c21929j6;
                        if (objM9690b == obj9) {
                            return obj9;
                        }
                        abstractC6224C2 = (AbstractC6224C) objM9690b;
                        z10 = abstractC6224C2 instanceof C6223B;
                        if (!z10) {
                            if (z10) {
                                abstractC21955Q1M6734a4 = new C21952P1(null);
                            } else if (abstractC6224C2 instanceof C6248v) {
                                abstractC21955Q1M6734a4 = c21929j7;
                            } else {
                                if (!(abstractC6224C2 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C2.getClass();
                                abstractC21955Q1M6734a4 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C2);
                            }
                            c18712b3 = new C18712b(abstractC21955Q1M6734a4);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 12;
                            if (r110.mo395a(c18712b3, this) == obj10) {
                                return obj10;
                            }
                            return c17296c;
                        }
                        if (AbstractC7110d.f22627a[enumC18991F2.ordinal()] == 1) {
                            String str111111111 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                            this.f22634s0 = r110;
                            this.f22628Y = c18711a5;
                            this.f22629Z = str9;
                            this.f22630o0 = str8;
                            this.f22631p0 = r20;
                            this.f22633r0 = 13;
                            objM7519e = C7112f.m7519e(c7112f, str111111111, this);
                            if (objM7519e == obj10) {
                                r21 = r20;
                                obj11 = obj10;
                                r111 = r110;
                                c21929j8 = c21929j7;
                                return obj10;
                            }
                            r21 = r20;
                            obj11 = obj10;
                            r111 = r110;
                            c21929j8 = c21929j7;
                            abstractC6224C3 = (AbstractC6224C) objM7519e;
                            r22 = r21;
                            obj12 = obj11;
                            r112 = r111;
                            c21929j9 = c21929j8;
                            str10 = str8;
                            r23 = r112;
                            if (abstractC6224C3 instanceof C6223B) {
                                if (c18711a5 instanceof C7114h) {
                                    C21903D c21903d111112 = C21907E.Companion;
                                    String str111111112 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d111112.getClass();
                                    String strM22336a1115 = C21903D.m22336a(str111111112);
                                    int length112 = c18711a5.f59545a.length;
                                    C7114h c7114h18 = (C7114h) c18711a5;
                                    c21908e0 = new C21965U0(strM22336a1115, length112, c7114h18.f22653b, c7114h18.f22654c, str10, 96);
                                } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                    EnumC21968V0 enumC21968V17 = EnumC21968V0.Inpainting;
                                    C21903D c21903d111113 = C21907E.Companion;
                                    String str111111113 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d111113.getClass();
                                    c21908e0 = new C22071w0(enumC21968V17, this.f22639x0, C21903D.m22336a(str111111113), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                                } else {
                                    C21903D c21903d111114 = C21907E.Companion;
                                    String str111111114 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d111114.getClass();
                                    String strM22336a1116 = C21903D.m22336a(str111111114);
                                    AbstractC16544l.m18091d(str9);
                                    c21908e0 = new C21908E0(strM22336a1116, str9, new Integer(c18711a5.f59545a.length), str10);
                                }
                                c21952p1 = new C21952P1(c21908e0);
                            } else if (abstractC6224C3 instanceof C6248v) {
                                c21952p1 = c21929j9;
                            } else {
                                if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C3.getClass();
                                c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                            }
                            c18712b4 = new C18712b(c21952p1);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 15;
                            if (r23.mo395a(c18712b4, this) == obj12) {
                                return obj12;
                            }
                            return c17296c;
                        }
                        String str111111115 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                        this.f22634s0 = r110;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r20;
                        this.f22633r0 = 14;
                        objM7518a = C7112f.m7518a(c7112f, str111111115, this);
                        if (objM7518a == obj10) {
                            r24 = r20;
                            obj13 = obj10;
                            r113 = r110;
                            c21929j10 = c21929j7;
                            return obj10;
                        }
                        r24 = r20;
                        obj13 = obj10;
                        r113 = r110;
                        c21929j10 = c21929j7;
                        abstractC6224C3 = (AbstractC6224C) objM7518a;
                        r22 = r24;
                        obj12 = obj13;
                        r112 = r113;
                        c21929j9 = c21929j10;
                        str10 = str8;
                        r23 = r112;
                        if (abstractC6224C3 instanceof C6223B) {
                            if (c18711a5 instanceof C7114h) {
                                C21903D c21903d111115 = C21907E.Companion;
                                String str111111116 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d111115.getClass();
                                String strM22336a1117 = C21903D.m22336a(str111111116);
                                int length113 = c18711a5.f59545a.length;
                                C7114h c7114h19 = (C7114h) c18711a5;
                                c21908e0 = new C21965U0(strM22336a1117, length113, c7114h19.f22653b, c7114h19.f22654c, str10, 96);
                            } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                EnumC21968V0 enumC21968V18 = EnumC21968V0.Inpainting;
                                C21903D c21903d111116 = C21907E.Companion;
                                String str111111117 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d111116.getClass();
                                c21908e0 = new C22071w0(enumC21968V18, this.f22639x0, C21903D.m22336a(str111111117), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                            } else {
                                C21903D c21903d111117 = C21907E.Companion;
                                String str111111118 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d111117.getClass();
                                String strM22336a1118 = C21903D.m22336a(str111111118);
                                AbstractC16544l.m18091d(str9);
                                c21908e0 = new C21908E0(strM22336a1118, str9, new Integer(c18711a5.f59545a.length), str10);
                            }
                            c21952p1 = new C21952P1(c21908e0);
                        } else if (abstractC6224C3 instanceof C6248v) {
                            c21952p1 = c21929j9;
                        } else {
                            if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                throw new C0644w();
                            }
                            abstractC6224C3.getClass();
                            c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                        }
                        c18712b4 = new C18712b(c21952p1);
                        this.f22634s0 = null;
                        this.f22628Y = null;
                        this.f22629Z = null;
                        this.f22630o0 = null;
                        this.f22631p0 = null;
                        this.f22633r0 = 15;
                        if (r23.mo395a(c18712b4, this) == obj12) {
                            return obj12;
                        }
                        return c17296c;
                    case 9:
                        AbstractC9233X.m9807c(obj);
                        return c17296c;
                    case 10:
                        AbstractC6224C abstractC6224C12 = this.f22631p0;
                        str8 = this.f22630o0;
                        str9 = this.f22629Z;
                        c18711a5 = this.f22628Y;
                        InterfaceC2186j interfaceC2186j12 = (InterfaceC2186j) this.f22634s0;
                        AbstractC9233X.m9807c(obj);
                        c17296c = c17296c;
                        c21929j6 = c21929j18;
                        obj9 = enumC19250a10;
                        r18 = abstractC6224C12;
                        r19 = interfaceC2186j12;
                        C7392q c7392q112 = c7112f.f22642Z;
                        String str1126 = ((C18997f) ((C6223B) r18).f20258a).f60577b;
                        this.f22634s0 = r19;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r18;
                        this.f22633r0 = 11;
                        C7388m c7388m10 = new C7388m(str1126, null);
                        InterfaceC3756d interfaceC3756dMo5693b11 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
                        interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
                        objM9690b = AbstractC9144I.m9690b(c7392q112.f23420a, new C21296a(interfaceC3756dMo5693b11, interfaceC3777yM18075c), c7388m10, this);
                        r20 = r18;
                        obj10 = obj9;
                        r110 = r19;
                        c21929j7 = c21929j6;
                        if (objM9690b == obj9) {
                            return obj9;
                        }
                        abstractC6224C2 = (AbstractC6224C) objM9690b;
                        z10 = abstractC6224C2 instanceof C6223B;
                        if (!z10) {
                            if (z10) {
                                abstractC21955Q1M6734a4 = new C21952P1(null);
                            } else if (abstractC6224C2 instanceof C6248v) {
                                abstractC21955Q1M6734a4 = c21929j7;
                            } else {
                                if (!(abstractC6224C2 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C2.getClass();
                                abstractC21955Q1M6734a4 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C2);
                            }
                            c18712b3 = new C18712b(abstractC21955Q1M6734a4);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 12;
                            if (r110.mo395a(c18712b3, this) == obj10) {
                                return obj10;
                            }
                            return c17296c;
                        }
                        if (AbstractC7110d.f22627a[enumC18991F2.ordinal()] == 1) {
                            String str111111119 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                            this.f22634s0 = r110;
                            this.f22628Y = c18711a5;
                            this.f22629Z = str9;
                            this.f22630o0 = str8;
                            this.f22631p0 = r20;
                            this.f22633r0 = 13;
                            objM7519e = C7112f.m7519e(c7112f, str111111119, this);
                            if (objM7519e == obj10) {
                                r21 = r20;
                                obj11 = obj10;
                                r111 = r110;
                                c21929j8 = c21929j7;
                                return obj10;
                            }
                            r21 = r20;
                            obj11 = obj10;
                            r111 = r110;
                            c21929j8 = c21929j7;
                            abstractC6224C3 = (AbstractC6224C) objM7519e;
                            r22 = r21;
                            obj12 = obj11;
                            r112 = r111;
                            c21929j9 = c21929j8;
                            str10 = str8;
                            r23 = r112;
                            if (abstractC6224C3 instanceof C6223B) {
                                if (c18711a5 instanceof C7114h) {
                                    C21903D c21903d111118 = C21907E.Companion;
                                    String str1111111110 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d111118.getClass();
                                    String strM22336a1119 = C21903D.m22336a(str1111111110);
                                    int length114 = c18711a5.f59545a.length;
                                    C7114h c7114h110 = (C7114h) c18711a5;
                                    c21908e0 = new C21965U0(strM22336a1119, length114, c7114h110.f22653b, c7114h110.f22654c, str10, 96);
                                } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                    EnumC21968V0 enumC21968V19 = EnumC21968V0.Inpainting;
                                    C21903D c21903d111119 = C21907E.Companion;
                                    String str1111111111 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d111119.getClass();
                                    c21908e0 = new C22071w0(enumC21968V19, this.f22639x0, C21903D.m22336a(str1111111111), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                                } else {
                                    C21903D c21903d1111110 = C21907E.Companion;
                                    String str1111111112 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d1111110.getClass();
                                    String strM22336a11110 = C21903D.m22336a(str1111111112);
                                    AbstractC16544l.m18091d(str9);
                                    c21908e0 = new C21908E0(strM22336a11110, str9, new Integer(c18711a5.f59545a.length), str10);
                                }
                                c21952p1 = new C21952P1(c21908e0);
                            } else if (abstractC6224C3 instanceof C6248v) {
                                c21952p1 = c21929j9;
                            } else {
                                if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C3.getClass();
                                c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                            }
                            c18712b4 = new C18712b(c21952p1);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 15;
                            if (r23.mo395a(c18712b4, this) == obj12) {
                                return obj12;
                            }
                            return c17296c;
                        }
                        String str1111111113 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                        this.f22634s0 = r110;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r20;
                        this.f22633r0 = 14;
                        objM7518a = C7112f.m7518a(c7112f, str1111111113, this);
                        if (objM7518a == obj10) {
                            r24 = r20;
                            obj13 = obj10;
                            r113 = r110;
                            c21929j10 = c21929j7;
                            return obj10;
                        }
                        r24 = r20;
                        obj13 = obj10;
                        r113 = r110;
                        c21929j10 = c21929j7;
                        abstractC6224C3 = (AbstractC6224C) objM7518a;
                        r22 = r24;
                        obj12 = obj13;
                        r112 = r113;
                        c21929j9 = c21929j10;
                        str10 = str8;
                        r23 = r112;
                        if (abstractC6224C3 instanceof C6223B) {
                            if (c18711a5 instanceof C7114h) {
                                C21903D c21903d1111111 = C21907E.Companion;
                                String str1111111114 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d1111111.getClass();
                                String strM22336a11111 = C21903D.m22336a(str1111111114);
                                int length115 = c18711a5.f59545a.length;
                                C7114h c7114h111 = (C7114h) c18711a5;
                                c21908e0 = new C21965U0(strM22336a11111, length115, c7114h111.f22653b, c7114h111.f22654c, str10, 96);
                            } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                EnumC21968V0 enumC21968V110 = EnumC21968V0.Inpainting;
                                C21903D c21903d1111112 = C21907E.Companion;
                                String str1111111115 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d1111112.getClass();
                                c21908e0 = new C22071w0(enumC21968V110, this.f22639x0, C21903D.m22336a(str1111111115), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                            } else {
                                C21903D c21903d1111113 = C21907E.Companion;
                                String str1111111116 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d1111113.getClass();
                                String strM22336a11112 = C21903D.m22336a(str1111111116);
                                AbstractC16544l.m18091d(str9);
                                c21908e0 = new C21908E0(strM22336a11112, str9, new Integer(c18711a5.f59545a.length), str10);
                            }
                            c21952p1 = new C21952P1(c21908e0);
                        } else if (abstractC6224C3 instanceof C6248v) {
                            c21952p1 = c21929j9;
                        } else {
                            if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                throw new C0644w();
                            }
                            abstractC6224C3.getClass();
                            c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                        }
                        c18712b4 = new C18712b(c21952p1);
                        this.f22634s0 = null;
                        this.f22628Y = null;
                        this.f22629Z = null;
                        this.f22630o0 = null;
                        this.f22631p0 = null;
                        this.f22633r0 = 15;
                        if (r23.mo395a(c18712b4, this) == obj12) {
                            return obj12;
                        }
                        return c17296c;
                    case 11:
                        AbstractC6224C abstractC6224C13 = this.f22631p0;
                        str8 = this.f22630o0;
                        str9 = this.f22629Z;
                        c18711a5 = this.f22628Y;
                        InterfaceC2186j interfaceC2186j13 = (InterfaceC2186j) this.f22634s0;
                        AbstractC9233X.m9807c(obj);
                        c17296c = c17296c;
                        c21929j7 = c21929j18;
                        obj10 = enumC19250a10;
                        objM9690b = obj;
                        r20 = abstractC6224C13;
                        r110 = interfaceC2186j13;
                        abstractC6224C2 = (AbstractC6224C) objM9690b;
                        z10 = abstractC6224C2 instanceof C6223B;
                        if (!z10) {
                            if (z10) {
                                abstractC21955Q1M6734a4 = new C21952P1(null);
                            } else if (abstractC6224C2 instanceof C6248v) {
                                abstractC21955Q1M6734a4 = c21929j7;
                            } else {
                                if (!(abstractC6224C2 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C2.getClass();
                                abstractC21955Q1M6734a4 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C2);
                            }
                            c18712b3 = new C18712b(abstractC21955Q1M6734a4);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 12;
                            if (r110.mo395a(c18712b3, this) == obj10) {
                                return obj10;
                            }
                            return c17296c;
                        }
                        if (AbstractC7110d.f22627a[enumC18991F2.ordinal()] == 1) {
                            String str1111111117 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                            this.f22634s0 = r110;
                            this.f22628Y = c18711a5;
                            this.f22629Z = str9;
                            this.f22630o0 = str8;
                            this.f22631p0 = r20;
                            this.f22633r0 = 13;
                            objM7519e = C7112f.m7519e(c7112f, str1111111117, this);
                            if (objM7519e == obj10) {
                                r21 = r20;
                                obj11 = obj10;
                                r111 = r110;
                                c21929j8 = c21929j7;
                                return obj10;
                            }
                            r21 = r20;
                            obj11 = obj10;
                            r111 = r110;
                            c21929j8 = c21929j7;
                            abstractC6224C3 = (AbstractC6224C) objM7519e;
                            r22 = r21;
                            obj12 = obj11;
                            r112 = r111;
                            c21929j9 = c21929j8;
                            str10 = str8;
                            r23 = r112;
                            if (abstractC6224C3 instanceof C6223B) {
                                if (c18711a5 instanceof C7114h) {
                                    C21903D c21903d1111114 = C21907E.Companion;
                                    String str1111111118 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d1111114.getClass();
                                    String strM22336a11113 = C21903D.m22336a(str1111111118);
                                    int length116 = c18711a5.f59545a.length;
                                    C7114h c7114h112 = (C7114h) c18711a5;
                                    c21908e0 = new C21965U0(strM22336a11113, length116, c7114h112.f22653b, c7114h112.f22654c, str10, 96);
                                } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                    EnumC21968V0 enumC21968V111 = EnumC21968V0.Inpainting;
                                    C21903D c21903d1111115 = C21907E.Companion;
                                    String str1111111119 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d1111115.getClass();
                                    c21908e0 = new C22071w0(enumC21968V111, this.f22639x0, C21903D.m22336a(str1111111119), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                                } else {
                                    C21903D c21903d1111116 = C21907E.Companion;
                                    String str11111111110 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                    c21903d1111116.getClass();
                                    String strM22336a11114 = C21903D.m22336a(str11111111110);
                                    AbstractC16544l.m18091d(str9);
                                    c21908e0 = new C21908E0(strM22336a11114, str9, new Integer(c18711a5.f59545a.length), str10);
                                }
                                c21952p1 = new C21952P1(c21908e0);
                            } else if (abstractC6224C3 instanceof C6248v) {
                                c21952p1 = c21929j9;
                            } else {
                                if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                    throw new C0644w();
                                }
                                abstractC6224C3.getClass();
                                c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                            }
                            c18712b4 = new C18712b(c21952p1);
                            this.f22634s0 = null;
                            this.f22628Y = null;
                            this.f22629Z = null;
                            this.f22630o0 = null;
                            this.f22631p0 = null;
                            this.f22633r0 = 15;
                            if (r23.mo395a(c18712b4, this) == obj12) {
                                return obj12;
                            }
                            return c17296c;
                        }
                        String str11111111111 = ((C18997f) ((C6223B) r20).f20258a).f60577b;
                        this.f22634s0 = r110;
                        this.f22628Y = c18711a5;
                        this.f22629Z = str9;
                        this.f22630o0 = str8;
                        this.f22631p0 = r20;
                        this.f22633r0 = 14;
                        objM7518a = C7112f.m7518a(c7112f, str11111111111, this);
                        if (objM7518a == obj10) {
                            r24 = r20;
                            obj13 = obj10;
                            r113 = r110;
                            c21929j10 = c21929j7;
                            return obj10;
                        }
                        r24 = r20;
                        obj13 = obj10;
                        r113 = r110;
                        c21929j10 = c21929j7;
                        abstractC6224C3 = (AbstractC6224C) objM7518a;
                        r22 = r24;
                        obj12 = obj13;
                        r112 = r113;
                        c21929j9 = c21929j10;
                        str10 = str8;
                        r23 = r112;
                        if (abstractC6224C3 instanceof C6223B) {
                            if (c18711a5 instanceof C7114h) {
                                C21903D c21903d1111117 = C21907E.Companion;
                                String str11111111112 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d1111117.getClass();
                                String strM22336a11115 = C21903D.m22336a(str11111111112);
                                int length117 = c18711a5.f59545a.length;
                                C7114h c7114h113 = (C7114h) c18711a5;
                                c21908e0 = new C21965U0(strM22336a11115, length117, c7114h113.f22653b, c7114h113.f22654c, str10, 96);
                            } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                EnumC21968V0 enumC21968V112 = EnumC21968V0.Inpainting;
                                C21903D c21903d1111118 = C21907E.Companion;
                                String str11111111113 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d1111118.getClass();
                                c21908e0 = new C22071w0(enumC21968V112, this.f22639x0, C21903D.m22336a(str11111111113), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                            } else {
                                C21903D c21903d1111119 = C21907E.Companion;
                                String str11111111114 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d1111119.getClass();
                                String strM22336a11116 = C21903D.m22336a(str11111111114);
                                AbstractC16544l.m18091d(str9);
                                c21908e0 = new C21908E0(strM22336a11116, str9, new Integer(c18711a5.f59545a.length), str10);
                            }
                            c21952p1 = new C21952P1(c21908e0);
                        } else if (abstractC6224C3 instanceof C6248v) {
                            c21952p1 = c21929j9;
                        } else {
                            if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                throw new C0644w();
                            }
                            abstractC6224C3.getClass();
                            c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                        }
                        c18712b4 = new C18712b(c21952p1);
                        this.f22634s0 = null;
                        this.f22628Y = null;
                        this.f22629Z = null;
                        this.f22630o0 = null;
                        this.f22631p0 = null;
                        this.f22633r0 = 15;
                        if (r23.mo395a(c18712b4, this) == obj12) {
                            return obj12;
                        }
                        return c17296c;
                    case 12:
                        AbstractC9233X.m9807c(obj);
                        return c17296c;
                    case 13:
                        AbstractC6224C abstractC6224C14 = this.f22631p0;
                        str8 = this.f22630o0;
                        str9 = this.f22629Z;
                        c18711a5 = this.f22628Y;
                        InterfaceC2186j interfaceC2186j14 = (InterfaceC2186j) this.f22634s0;
                        AbstractC9233X.m9807c(obj);
                        c17296c = c17296c;
                        c21929j8 = c21929j18;
                        obj11 = enumC19250a10;
                        objM7519e = obj;
                        r21 = abstractC6224C14;
                        r111 = interfaceC2186j14;
                        r21 = r20;
                        obj11 = obj10;
                        r111 = r110;
                        c21929j8 = c21929j7;
                        abstractC6224C3 = (AbstractC6224C) objM7519e;
                        r22 = r21;
                        obj12 = obj11;
                        r112 = r111;
                        c21929j9 = c21929j8;
                        str10 = str8;
                        r23 = r112;
                        if (abstractC6224C3 instanceof C6223B) {
                            if (c18711a5 instanceof C7114h) {
                                C21903D c21903d11111110 = C21907E.Companion;
                                String str11111111115 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d11111110.getClass();
                                String strM22336a11117 = C21903D.m22336a(str11111111115);
                                int length118 = c18711a5.f59545a.length;
                                C7114h c7114h114 = (C7114h) c18711a5;
                                c21908e0 = new C21965U0(strM22336a11117, length118, c7114h114.f22653b, c7114h114.f22654c, str10, 96);
                            } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                EnumC21968V0 enumC21968V113 = EnumC21968V0.Inpainting;
                                C21903D c21903d11111111 = C21907E.Companion;
                                String str11111111116 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d11111111.getClass();
                                c21908e0 = new C22071w0(enumC21968V113, this.f22639x0, C21903D.m22336a(str11111111116), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                            } else {
                                C21903D c21903d11111112 = C21907E.Companion;
                                String str11111111117 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d11111112.getClass();
                                String strM22336a11118 = C21903D.m22336a(str11111111117);
                                AbstractC16544l.m18091d(str9);
                                c21908e0 = new C21908E0(strM22336a11118, str9, new Integer(c18711a5.f59545a.length), str10);
                            }
                            c21952p1 = new C21952P1(c21908e0);
                        } else if (abstractC6224C3 instanceof C6248v) {
                            c21952p1 = c21929j9;
                        } else {
                            if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                throw new C0644w();
                            }
                            abstractC6224C3.getClass();
                            c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                        }
                        c18712b4 = new C18712b(c21952p1);
                        this.f22634s0 = null;
                        this.f22628Y = null;
                        this.f22629Z = null;
                        this.f22630o0 = null;
                        this.f22631p0 = null;
                        this.f22633r0 = 15;
                        if (r23.mo395a(c18712b4, this) == obj12) {
                            return obj12;
                        }
                        return c17296c;
                    case 14:
                        AbstractC6224C abstractC6224C15 = this.f22631p0;
                        str8 = this.f22630o0;
                        str9 = this.f22629Z;
                        c18711a5 = this.f22628Y;
                        InterfaceC2186j interfaceC2186j15 = (InterfaceC2186j) this.f22634s0;
                        AbstractC9233X.m9807c(obj);
                        c17296c = c17296c;
                        c21929j10 = c21929j18;
                        obj13 = enumC19250a10;
                        objM7518a = obj;
                        r24 = abstractC6224C15;
                        r113 = interfaceC2186j15;
                        r24 = r20;
                        obj13 = obj10;
                        r113 = r110;
                        c21929j10 = c21929j7;
                        abstractC6224C3 = (AbstractC6224C) objM7518a;
                        r22 = r24;
                        obj12 = obj13;
                        r112 = r113;
                        c21929j9 = c21929j10;
                        str10 = str8;
                        r23 = r112;
                        if (abstractC6224C3 instanceof C6223B) {
                            if (c18711a5 instanceof C7114h) {
                                C21903D c21903d11111113 = C21907E.Companion;
                                String str11111111118 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d11111113.getClass();
                                String strM22336a11119 = C21903D.m22336a(str11111111118);
                                int length119 = c18711a5.f59545a.length;
                                C7114h c7114h115 = (C7114h) c18711a5;
                                c21908e0 = new C21965U0(strM22336a11119, length119, c7114h115.f22653b, c7114h115.f22654c, str10, 96);
                            } else if (enumC18991F2 == EnumC18991F.f60567q0) {
                                EnumC21968V0 enumC21968V114 = EnumC21968V0.Inpainting;
                                C21903D c21903d11111114 = C21907E.Companion;
                                String str11111111119 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d11111114.getClass();
                                c21908e0 = new C22071w0(enumC21968V114, this.f22639x0, C21903D.m22336a(str11111111119), this.f22640y0, (String) null, String.valueOf(this.f22638w0), (String) null, (String) null, 192);
                            } else {
                                C21903D c21903d11111115 = C21907E.Companion;
                                String str111111111110 = ((C18997f) ((C6223B) r22).f20258a).f60577b;
                                c21903d11111115.getClass();
                                String strM22336a111110 = C21903D.m22336a(str111111111110);
                                AbstractC16544l.m18091d(str9);
                                c21908e0 = new C21908E0(strM22336a111110, str9, new Integer(c18711a5.f59545a.length), str10);
                            }
                            c21952p1 = new C21952P1(c21908e0);
                        } else if (abstractC6224C3 instanceof C6248v) {
                            c21952p1 = c21929j9;
                        } else {
                            if (!(abstractC6224C3 instanceof AbstractC6249w)) {
                                throw new C0644w();
                            }
                            abstractC6224C3.getClass();
                            c21952p1 = AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C3);
                        }
                        c18712b4 = new C18712b(c21952p1);
                        this.f22634s0 = null;
                        this.f22628Y = null;
                        this.f22629Z = null;
                        this.f22630o0 = null;
                        this.f22631p0 = null;
                        this.f22633r0 = 15;
                        if (r23.mo395a(c18712b4, this) == obj12) {
                            return obj12;
                        }
                        return c17296c;
                    case 15:
                        AbstractC9233X.m9807c(obj);
                        return c17296c;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e19) {
                e = e19;
                str2 = str3;
                c18711a2 = c18711a3;
                r10 = cls5;
                r6 = enumC19250a10;
                obj2 = c21929j18;
            }
        } catch (Exception e20) {
            e = e20;
            c17296c = c17296c;
            c21929j1 = c21929j18;
            str2 = str;
            c18711a2 = c18711a;
            obj2 = enumC19250a10;
            r6 = obj3;
            r10 = cls5;
        }
    }
}
