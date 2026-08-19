package p015Ad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p025An.C0644w;
import p040Bd.AbstractC0888A0;
import p040Bd.C0935I;
import p040Bd.C0937I1;
import p040Bd.C1032Y1;
import p040Bd.C1140o3;
import p040Bd.C1158r3;
import p040Bd.InterfaceC1164s3;
import p1113xn.AbstractC21322p;
import p1126yd.C21494r;
import p1155zi.C21903D;
import p1155zi.C21907E;
import p1155zi.C21984a1;
import p1155zi.C22020j1;
import p381Pe.C6394e;
import p381Pe.C6397h;
import p479Td.AbstractC7343b0;
import p479Td.C7320F;
import p479Td.C7326L;
import p479Td.C7341a0;
import p479Td.C7351f0;
import p479Td.C7362m;
import p479Td.C7370u;
import p479Td.EnumC7355h0;
import p479Td.EnumC7359j0;
import p571X9.AbstractC9286f4;
import p621Zd.C10282c;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Ad.i */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0434i {

    /* JADX INFO: renamed from: a */
    public static final Object f1418a = AbstractC17659D.m19244f(new C17309l("canmore.create_textdoc", EnumC7359j0.f23352w0), new C17309l("canmore.update_textdoc", EnumC7359j0.f23353x0), new C17309l("canmore.comment_textdoc", EnumC7359j0.f23354y0));

    /* JADX INFO: renamed from: b */
    public static final Object f1419b;

    static {
        EnumC7359j0 enumC7359j0 = EnumC7359j0.f23348s0;
        f1419b = AbstractC17659D.m19244f(new C17309l("browser", enumC7359j0), new C17309l("bing_search", enumC7359j0), new C17309l("python", EnumC7359j0.f23350u0), new C17309l("dalle", EnumC7359j0.f23347r0), new C17309l("bio", EnumC7359j0.f23351v0), new C17309l("a8km123", EnumC7359j0.f23336A0), new C17309l("de1d73e", EnumC7359j0.f23337B0), new C17309l("canmore", EnumC7359j0.f23355z0));
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC0888A0 m1089a(InterfaceC1164s3 interfaceC1164s3, Integer num, Integer num2) {
        if (interfaceC1164s3 instanceof C1158r3) {
            C1158r3 c1158r3 = (C1158r3) interfaceC1164s3;
            return new C0937I1(num, num2, c1158r3.f3080a, c1158r3.f3081b, Boolean.TRUE, 208);
        }
        if (!(interfaceC1164s3 instanceof C1140o3)) {
            throw new C0644w();
        }
        C21903D c21903d = C21907E.Companion;
        String str = ((C1140o3) interfaceC1164s3).f3057a;
        c21903d.getClass();
        return new C0935I(num, num2, C21903D.m22336a(str));
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC7343b0 m1090b(String str, EnumC7359j0 enumC7359j0, EnumC7355h0 enumC7355h0, List list) {
        if (enumC7359j0 == EnumC7359j0.f23343Z) {
            return new C7326L(str);
        }
        if (enumC7355h0 == EnumC7355h0.f23330x0) {
            return new C7370u(str);
        }
        if (enumC7355h0 == EnumC7355h0.f23331y0) {
            return new C7341a0(str);
        }
        return enumC7355h0 == EnumC7355h0.f23332z0 ? new C7362m(str) : new C7320F(10, str, list, false, false);
    }

    /* JADX INFO: renamed from: d */
    public static final C6394e m1092d(Map toMessageTree, String conversationId, C10282c c10282c) {
        C7351f0 c7351f0M9862c;
        AbstractC16544l.m18094g(toMessageTree, "$this$toMessageTree");
        AbstractC16544l.m18094g(conversationId, "conversationId");
        ArrayList arrayList = new ArrayList(toMessageTree.size());
        Iterator it = toMessageTree.entrySet().iterator();
        while (it.hasNext()) {
            C21494r c21494r = (C21494r) ((Map.Entry) it.next()).getValue();
            C1032Y1 c1032y1 = c21494r.f68107d;
            if (c1032y1 != null) {
                c7351f0M9862c = m1091c(c1032y1, conversationId, c10282c);
            } else {
                C21984a1.Companion.getClass();
                String string = UUID.randomUUID().toString();
                AbstractC16544l.m18093f(string, "toString(...)");
                String value = AbstractC21322p.m21692Z(string, 0, 5, "bbb22").toString();
                AbstractC16544l.m18094g(value, "value");
                C22020j1.Companion.getClass();
                c7351f0M9862c = AbstractC9286f4.m9862c(conversationId, value, "gpt-4o-mini");
            }
            List listM19369s0 = AbstractC17680n.m19369s0(c21494r.f68106c);
            C21984a1 c21984a1 = new C21984a1(c21494r.f68104a);
            String str = c21494r.f68105b;
            arrayList.add(new C6397h(c21984a1, str != null ? new C21984a1(str) : null, listM19369s0, c7351f0M9862c));
        }
        return new C6394e(arrayList, conversationId);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:191:0x039d  */
    /* JADX WARN: Code duplicated, block: B:228:0x0442  */
    /* JADX WARN: Code duplicated, block: B:230:0x044d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0457  */
    /* JADX WARN: Code duplicated, block: B:233:0x045a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0463  */
    /* JADX WARN: Code duplicated, block: B:239:0x046d  */
    /* JADX WARN: Code duplicated, block: B:241:0x0473  */
    /* JADX WARN: Code duplicated, block: B:244:0x047c  */
    /* JADX WARN: Code duplicated, block: B:245:0x047f  */
    /* JADX WARN: Code duplicated, block: B:248:0x0488  */
    /* JADX WARN: Code duplicated, block: B:249:0x048b  */
    /* JADX WARN: Code duplicated, block: B:252:0x0494  */
    /* JADX WARN: Code duplicated, block: B:253:0x0497  */
    /* JADX WARN: Code duplicated, block: B:256:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:257:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:260:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:261:0x04af  */
    /* JADX WARN: Code duplicated, block: B:264:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:265:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:268:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:269:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:272:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:273:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:276:0x04de  */
    /* JADX WARN: Code duplicated, block: B:277:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:280:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:281:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:383:0x0727  */
    /* JADX WARN: Code duplicated, block: B:388:0x0746  */
    /* JADX WARN: Code duplicated, block: B:391:0x074c  */
    /* JADX WARN: Code duplicated, block: B:393:0x0750  */
    /* JADX WARN: Code duplicated, block: B:394:0x0752  */
    /* JADX WARN: Code duplicated, block: B:396:0x075e  */
    /* JADX WARN: Code duplicated, block: B:398:0x0780  */
    /* JADX WARN: Code duplicated, block: B:403:0x0796  */
    /* JADX WARN: Code duplicated, block: B:408:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:413:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:418:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:423:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:428:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:430:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:431:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:433:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:434:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:436:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:437:0x0802  */
    /* JADX WARN: Code duplicated, block: B:444:0x0832  */
    /* JADX WARN: Code duplicated, block: B:446:0x0836  */
    /* JADX WARN: Code duplicated, block: B:447:0x0839  */
    /* JADX WARN: Code duplicated, block: B:449:0x083c  */
    /* JADX WARN: Code duplicated, block: B:450:0x083f  */
    /* JADX WARN: Code duplicated, block: B:458:0x087e  */
    /* JADX WARN: Code duplicated, block: B:460:0x0881  */
    /* JADX WARN: Code duplicated, block: B:461:0x0884  */
    /* JADX WARN: Code duplicated, block: B:463:0x0888  */
    /* JADX WARN: Code duplicated, block: B:464:0x088b  */
    /* JADX WARN: Code duplicated, block: B:466:0x088e  */
    /* JADX WARN: Code duplicated, block: B:467:0x0891  */
    /* JADX WARN: Code duplicated, block: B:469:0x0895  */
    /* JADX WARN: Code duplicated, block: B:46:0x012d  */
    /* JADX WARN: Code duplicated, block: B:470:0x089a  */
    /* JADX WARN: Code duplicated, block: B:492:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:512:0x0967  */
    /* JADX WARN: Code duplicated, block: B:524:0x0994  */
    /* JADX WARN: Code duplicated, block: B:540:0x09e1  */
    /* JADX WARN: Code duplicated, block: B:544:0x09ef  */
    /* JADX WARN: Code duplicated, block: B:550:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:553:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:555:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:556:0x0a21  */
    /* JADX WARN: Code duplicated, block: B:558:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:559:0x0a2a  */
    /* JADX WARN: Code duplicated, block: B:562:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:563:0x0a37  */
    /* JADX WARN: Code duplicated, block: B:590:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:592:0x0aaf  */
    /* JADX WARN: Code duplicated, block: B:593:0x0ab4  */
    /* JADX WARN: Code duplicated, block: B:630:0x0a08 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x0a01 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x0aa3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x0a4a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v43, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v46, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v10 */
    /* JADX WARN: Type inference failed for: r38v11 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r38v6 */
    /* JADX WARN: Type inference failed for: r38v7 */
    /* JADX WARN: Type inference failed for: r38v8 */
    /* JADX WARN: Type inference failed for: r38v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v82, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v86, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v87, types: [java.util.ArrayList] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v33 java.lang.Object, still in use, count: 2, list:
          (r11v33 java.lang.Object) from 0x09dd: PHI (r11 I:??) = (r11v28 java.lang.Object), (r11v33 java.lang.Object) binds: [B:537:0x09dc, B:632:0x09dd] A[DONT_GENERATE, DONT_INLINE]
          (r11v33 java.lang.Object) from 0x09cf: CHECK_CAST (zi.f1) (r11v33 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: renamed from: c */
    public static final p479Td.C7351f0 m1091c(p040Bd.C1032Y1 r55, java.lang.String r56, p621Zd.C10282c r57) {
        /*
            Method dump skipped, instruction units count: 2872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p015Ad.AbstractC0434i.m1091c(Bd.Y1, java.lang.String, Zd.c):Td.f0");
    }
}
