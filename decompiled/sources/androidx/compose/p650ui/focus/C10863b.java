package androidx.compose.p650ui.focus;

import android.view.KeyEvent;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p001A.AbstractC0010F;
import p001A.C0093v0;
import p003A1.C0283r;
import p003A1.C0292u;
import p003A1.C0295v;
import p003A1.C0298w;
import p003A1.C0307z;
import p045Bj.C1313k;
import p049Bm.InterfaceC1426a;
import p069Cf.C1650i;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p1140z1.C21658D;
import p1140z1.C21703l0;
import p392Q0.C6546d;
import p477Tb.AbstractC7294a;
import p523V9.AbstractC8111i5;
import p571X9.AbstractC9306j0;
import p635a1.AbstractC10458p;
import p635a1.InterfaceC10459q;
import p692d0.AbstractC12957J;
import p692d0.C12986y;
import p737f1.AbstractC13512d;
import p737f1.C13510b;
import p737f1.C13513e;
import p737f1.C13514f;
import p737f1.C13519k;
import p737f1.C13526r;
import p737f1.InterfaceC13515g;
import p759g1.C13801c;
import p978r1.AbstractC18857c;
import p978r1.InterfaceC18858d;

/* JADX INFO: renamed from: androidx.compose.ui.focus.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10863b implements InterfaceC13515g {

    /* JADX INFO: renamed from: a */
    public final C0295v f32693a;

    /* JADX INFO: renamed from: b */
    public final C0292u f32694b;

    /* JADX INFO: renamed from: c */
    public final C0283r f32695c;

    /* JADX INFO: renamed from: d */
    public final C0283r f32696d;

    /* JADX INFO: renamed from: e */
    public final C0298w f32697e;

    /* JADX INFO: renamed from: g */
    public final C13513e f32699g;

    /* JADX INFO: renamed from: j */
    public C12986y f32702j;

    /* JADX INFO: renamed from: f */
    public final C13526r f32698f = new C13526r();

    /* JADX INFO: renamed from: h */
    public final C0093v0 f32700h = new C0093v0(6);

    /* JADX INFO: renamed from: i */
    public final InterfaceC10459q f32701i = AbstractC9306j0.m9882a(new FocusPropertiesElement(new C13519k()), new AbstractC21672S() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        @Override // p1140z1.AbstractC21672S
        /* JADX INFO: renamed from: a */
        public final AbstractC10458p mo11196a() {
            return this.f32689Y.f32698f;
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.f32689Y.f32698f.hashCode();
        }

        @Override // p1140z1.AbstractC21672S
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ void mo11197i(AbstractC10458p abstractC10458p) {
        }
    });

    public C10863b(C0292u c0292u, C0295v c0295v, C0292u c0292u2, C0283r c0283r, C0283r c0283r2, C0298w c0298w) {
        this.f32693a = c0295v;
        this.f32694b = c0292u2;
        this.f32695c = c0283r;
        this.f32696d = c0283r2;
        this.f32697e = c0298w;
        this.f32699g = new C13513e(c0292u, new C0283r(0, this, C10863b.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 7));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11301a(int i10, boolean z6, boolean z10) {
        int iM24h;
        C0093v0 c0093v0 = this.f32700h;
        C13514f c13514f = C13514f.f42783o0;
        try {
            if (c0093v0.f403Z) {
                C0093v0.m329a(c0093v0);
            }
            c0093v0.f403Z = true;
            ((C6546d) c0093v0.f405p0).m7099c(c13514f);
            C13526r c13526r = this.f32698f;
            boolean zM15044e = (z6 || !((iM24h = AbstractC0010F.m24h(AbstractC13512d.m15059t(c13526r, i10))) == 1 || iM24h == 2 || iM24h == 3)) ? AbstractC13512d.m15044e(c13526r, z6, true) : false;
            C0093v0.m330b(c0093v0);
            if (zM15044e && z10) {
                this.f32695c.invoke();
            }
            return zM15044e;
        } catch (Throwable th2) {
            C0093v0.m330b(c0093v0);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0393  */
    /* JADX WARN: Code duplicated, block: B:103:0x0399  */
    /* JADX WARN: Code duplicated, block: B:106:0x039e  */
    /* JADX WARN: Code duplicated, block: B:108:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:111:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:113:0x03ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:116:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:118:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:120:0x03c6 A[ADDED_TO_REGION, LOOP:14: B:120:0x03c6->B:150:0x041b, LOOP_START, PHI: r7
      0x03c6: PHI (r7v29 a1.p) = (r7v23 a1.p), (r7v30 a1.p) binds: [B:119:0x03c4, B:150:0x041b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:123:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:125:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:128:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:130:0x03de  */
    /* JADX WARN: Code duplicated, block: B:153:0x0424  */
    /* JADX WARN: Code duplicated, block: B:160:0x0434  */
    /* JADX WARN: Code duplicated, block: B:161:0x043a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0440  */
    /* JADX WARN: Code duplicated, block: B:165:0x0446  */
    /* JADX WARN: Code duplicated, block: B:167:0x044e  */
    /* JADX WARN: Code duplicated, block: B:169:0x045a A[ADDED_TO_REGION, LOOP:18: B:169:0x045a->B:199:0x04ad, LOOP_START, PHI: r2
      0x045a: PHI (r2v25 a1.p) = (r2v19 a1.p), (r2v26 a1.p) binds: [B:168:0x0458, B:199:0x04ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:170:0x045c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0462  */
    /* JADX WARN: Code duplicated, block: B:174:0x0466  */
    /* JADX WARN: Code duplicated, block: B:177:0x046c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0472  */
    /* JADX WARN: Code duplicated, block: B:202:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:209:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:210:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:212:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:214:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:216:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:218:0x04e9 A[ADDED_TO_REGION, LOOP:4: B:218:0x04e9->B:250:0x0545, LOOP_START, PHI: r0 r6
      0x04e9: PHI (r0v64 a1.p) = (r0v18 a1.p), (r0v65 a1.p) binds: [B:217:0x04e7, B:250:0x0545] A[DONT_GENERATE, DONT_INLINE]
      0x04e9: PHI (r6v13 java.util.ArrayList) = (r6v11 java.util.ArrayList), (r6v14 java.util.ArrayList) binds: [B:217:0x04e7, B:250:0x0545] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:219:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:221:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:223:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:226:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:228:0x0504  */
    /* JADX WARN: Code duplicated, block: B:267:0x057a  */
    /* JADX WARN: Code duplicated, block: B:270:0x0581  */
    /* JADX WARN: Code duplicated, block: B:276:0x058f  */
    /* JADX WARN: Code duplicated, block: B:299:0x05d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:301:0x05db  */
    /* JADX WARN: Code duplicated, block: B:303:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:308:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:331:0x0631  */
    /* JADX WARN: Code duplicated, block: B:333:0x0638  */
    /* JADX WARN: Code duplicated, block: B:337:0x0646 A[LOOP:12: B:332:0x0636->B:337:0x0646, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:338:0x064a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:339:0x064c  */
    /* JADX WARN: Code duplicated, block: B:342:0x0653  */
    /* JADX WARN: Code duplicated, block: B:348:0x03a3 A[EDGE_INSN: B:348:0x03a3->B:109:0x03a3 BREAK  A[LOOP:2: B:100:0x0391->B:107:0x039f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x039f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x0545 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x04f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x058d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x0585 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x05ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x05e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x0644 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x042d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x042f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x0430 A[EDGE_INSN: B:407:0x0430->B:158:0x0430 BREAK  A[LOOP:13: B:117:0x03b8->B:409:0x03b8, LOOP_LABEL: LOOP:13: B:117:0x03b8->B:409:0x03b8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x041b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x0416 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x04bf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x04c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x04c2 A[EDGE_INSN: B:429:0x04c2->B:207:0x04c2 BREAK  A[LOOP:17: B:166:0x044c->B:431:0x044c, LOOP_LABEL: LOOP:17: B:166:0x044c->B:431:0x044c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x04ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x04a8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0382  */
    /* JADX WARN: Code duplicated, block: B:97:0x0388  */
    /* JADX WARN: Code duplicated, block: B:99:0x038e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r0v20, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r2v36, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r2v44, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v47, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v84 */
    /* JADX WARN: Type inference failed for: r9v85 */
    /* JADX WARN: Type inference failed for: r9v86 */
    /* JADX WARN: Type inference failed for: r9v87 */
    /* JADX WARN: Type inference failed for: r9v88 */
    /* JADX WARN: Type inference failed for: r9v89 */
    /* JADX WARN: Type inference failed for: r9v90 */
    /* JADX INFO: renamed from: b */
    public final boolean m11302b(KeyEvent keyEvent, InterfaceC1426a interfaceC1426a) {
        C10863b c10863b;
        int iNumberOfTrailingZeros;
        C13526r c13526r;
        C13526r c13526rM15046g;
        AbstractC10458p abstractC10458p;
        AbstractC10458p abstractC10458p2;
        C21658D c21658dM22217v;
        ?? M22201f;
        Object obj;
        AbstractC10458p abstractC10458p3;
        C1313k c1313k;
        ?? r10;
        AbstractC10458p abstractC10458p4;
        C21658D c21658dM22217v2;
        ?? M22201f2;
        Object obj2;
        C1313k c1313k2;
        ?? r11;
        AbstractC10458p abstractC10458p5;
        AbstractC10458p abstractC10458p6;
        C21658D c21658dM22217v3;
        ArrayList arrayList;
        KeyEvent keyEvent2;
        ?? M22201f3;
        ?? c6546d;
        boolean z6;
        ?? M22201f4;
        ?? r12;
        int size;
        int i10;
        int size2;
        C1313k c1313k3;
        AbstractC10458p abstractC10458pM22201f;
        C6546d c6546d2;
        AbstractC10458p abstractC10458p7;
        AbstractC10458p abstractC10458p8;
        int i11;
        long j10;
        long j11;
        int iM14715b;
        int iNumberOfTrailingZeros2;
        int i12;
        if (this.f32699g.m15066a()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
            return false;
        }
        long jM20157d = AbstractC18857c.m20157d(keyEvent);
        int iM20158e = AbstractC18857c.m20158e(keyEvent);
        int i13 = 3;
        if (!AbstractC7294a.m7746c(iM20158e, 2)) {
            if (AbstractC7294a.m7746c(iM20158e, 1)) {
                c10863b = this;
                C12986y c12986y = c10863b.f32702j;
                if (c12986y == null || !c12986y.m14714a(jM20157d)) {
                    return false;
                }
                C12986y c12986y2 = c10863b.f32702j;
                if (c12986y2 != null) {
                    int i14 = ((int) ((jM20157d >>> 32) ^ jM20157d)) * (-862048943);
                    int i15 = i14 ^ (i14 << 16);
                    int i16 = i15 & 127;
                    int i17 = c12986y2.f41229c;
                    int i18 = (i15 >>> 7) & i17;
                    int i19 = 0;
                    loop23: while (true) {
                        long[] jArr = c12986y2.f41227a;
                        int i20 = i18 >> 3;
                        int i21 = (i18 & 7) << 3;
                        long j12 = ((jArr[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr[i20] >>> i21);
                        long j13 = (((long) i16) * 72340172838076673L) ^ j12;
                        for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                            iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i18) & i17;
                            if (c12986y2.f41228b[iNumberOfTrailingZeros] == jM20157d) {
                                break loop23;
                            }
                        }
                        if ((j12 & ((~j12) << 6) & (-9187201950435737472L)) != 0) {
                            iNumberOfTrailingZeros = -1;
                            break;
                        }
                        i19 += 8;
                        i18 = (i18 + i19) & i17;
                    }
                    if (iNumberOfTrailingZeros >= 0) {
                        c12986y2.f41230d--;
                        long[] jArr2 = c12986y2.f41227a;
                        int i22 = c12986y2.f41229c;
                        int i23 = iNumberOfTrailingZeros >> 3;
                        int i24 = (iNumberOfTrailingZeros & 7) << 3;
                        long j15 = (jArr2[i23] & (~(255 << i24))) | (254 << i24);
                        jArr2[i23] = j15;
                        jArr2[(((iNumberOfTrailingZeros - 7) & i22) + (i22 & 7)) >> 3] = j15;
                    }
                }
            }
            c13526r = c10863b.f32698f;
            c13526rM15046g = AbstractC13512d.m15046g(c13526r);
            if (c13526rM15046g != null) {
                abstractC10458p7 = c13526rM15046g.f30960Y;
                if (abstractC10458p7.f30972y0) {
                    AbstractC8111i5.m8592c("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((abstractC10458p7.f30963p0 & 9216) != 0) {
                    abstractC10458p3 = null;
                    for (abstractC10458p8 = abstractC10458p7.f30965r0; abstractC10458p8 != null; abstractC10458p8 = abstractC10458p8.f30965r0) {
                        i11 = abstractC10458p8.f30962o0;
                        if ((i11 & 9216) == 0) {
                            if ((i11 & 1024) != 0) {
                                break;
                            }
                            abstractC10458p3 = abstractC10458p8;
                        }
                    }
                } else {
                    abstractC10458p3 = null;
                }
                if (abstractC10458p3 == null) {
                    if (c13526rM15046g != null) {
                        abstractC10458p4 = c13526rM15046g.f30960Y;
                        if (abstractC10458p4.f30972y0) {
                            throw new IllegalStateException("visitAncestors called on an unattached node");
                        }
                        c21658dM22217v2 = AbstractC21690f.m22217v(c13526rM15046g);
                        loop13: while (true) {
                            if (c21658dM22217v2 != null) {
                                M22201f2 = 0;
                                break;
                            }
                            if ((((AbstractC10458p) c21658dM22217v2.f68638I0.f3471f).f30963p0 & 8192) != 0) {
                                while (abstractC10458p4 != null) {
                                    if ((abstractC10458p4.f30962o0 & 8192) != 0) {
                                        r11 = 0;
                                        M22201f2 = abstractC10458p4;
                                        while (M22201f2 != 0) {
                                            if (M22201f2 instanceof InterfaceC18858d) {
                                                break loop13;
                                            }
                                            if ((M22201f2.f30962o0 & 8192) == 0 && (M22201f2 instanceof AbstractC21706n)) {
                                                AbstractC10458p abstractC10458p9 = ((AbstractC21706n) M22201f2).f68881A0;
                                                ?? c6546d3 = r11;
                                                ?? r13 = M22201f2;
                                                int i25 = 0;
                                                while (abstractC10458p9 != null) {
                                                    if ((abstractC10458p9.f30962o0 & 8192) != 0) {
                                                        i25++;
                                                        if (i25 == 1) {
                                                            c6546d3 = c6546d3;
                                                            r13 = abstractC10458p9;
                                                        } else {
                                                            if (c6546d3 == 0) {
                                                                c6546d3 = new C6546d(new AbstractC10458p[16]);
                                                            }
                                                            if (r13 != 0) {
                                                                c6546d3.m7099c(r13);
                                                                r13 = 0;
                                                            }
                                                            c6546d3.m7099c(abstractC10458p9);
                                                        }
                                                    }
                                                    abstractC10458p9 = abstractC10458p9.f30965r0;
                                                    r13 = r13;
                                                    c6546d3 = c6546d3;
                                                }
                                                if (i25 == 1) {
                                                    M22201f2 = r13;
                                                    r11 = c6546d3;
                                                } else {
                                                    r11 = c6546d3;
                                                }
                                            }
                                            M22201f2 = AbstractC21690f.m22201f(r11);
                                        }
                                    }
                                    abstractC10458p4 = abstractC10458p4.f30964q0;
                                }
                            }
                            c21658dM22217v2 = c21658dM22217v2.m22009G();
                            abstractC10458p4 = (c21658dM22217v2 != null || (c1313k2 = c21658dM22217v2.f68638I0) == null) ? null : (C21703l0) c1313k2.f3470e;
                        }
                        obj2 = (InterfaceC18858d) M22201f2;
                        if (obj2 != null) {
                            abstractC10458p3 = ((AbstractC10458p) obj2).f30960Y;
                        } else {
                            abstractC10458p = c13526r.f30960Y;
                            if (abstractC10458p.f30972y0) {
                                throw new IllegalStateException("visitAncestors called on an unattached node");
                            }
                            abstractC10458p2 = abstractC10458p.f30964q0;
                            c21658dM22217v = AbstractC21690f.m22217v(c13526r);
                            loop17: while (true) {
                                if (c21658dM22217v != null) {
                                    M22201f = 0;
                                    break;
                                }
                                if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 8192) != 0) {
                                    while (abstractC10458p2 != null) {
                                        if ((abstractC10458p2.f30962o0 & 8192) != 0) {
                                            M22201f = abstractC10458p2;
                                            r10 = 0;
                                            while (M22201f != 0) {
                                                if (M22201f instanceof InterfaceC18858d) {
                                                    break loop17;
                                                }
                                                if ((M22201f.f30962o0 & 8192) == 0 && (M22201f instanceof AbstractC21706n)) {
                                                    AbstractC10458p abstractC10458p10 = ((AbstractC21706n) M22201f).f68881A0;
                                                    ?? c6546d4 = r10;
                                                    int i26 = 0;
                                                    while (abstractC10458p10 != null) {
                                                        if ((abstractC10458p10.f30962o0 & 8192) != 0) {
                                                            i26++;
                                                            if (i26 == 1) {
                                                                M22201f = M22201f;
                                                                c6546d4 = c6546d4;
                                                                M22201f = abstractC10458p10;
                                                            } else {
                                                                if (c6546d4 == 0) {
                                                                    c6546d4 = new C6546d(new AbstractC10458p[16]);
                                                                }
                                                                if (M22201f != 0) {
                                                                    c6546d4.m7099c(M22201f);
                                                                    M22201f = 0;
                                                                }
                                                                c6546d4.m7099c(abstractC10458p10);
                                                            }
                                                        } else {
                                                            M22201f = M22201f;
                                                        }
                                                        abstractC10458p10 = abstractC10458p10.f30965r0;
                                                        M22201f = M22201f;
                                                        c6546d4 = c6546d4;
                                                    }
                                                    M22201f = M22201f;
                                                    if (i26 == 1) {
                                                        r10 = c6546d4;
                                                    } else {
                                                        r10 = c6546d4;
                                                    }
                                                }
                                                M22201f = AbstractC21690f.m22201f(r10);
                                            }
                                        }
                                        abstractC10458p2 = abstractC10458p2.f30964q0;
                                    }
                                }
                                c21658dM22217v = c21658dM22217v.m22009G();
                                abstractC10458p2 = (c21658dM22217v != null || (c1313k = c21658dM22217v.f68638I0) == null) ? null : (C21703l0) c1313k.f3470e;
                            }
                            obj = (InterfaceC18858d) M22201f;
                            if (obj != null) {
                                abstractC10458p3 = ((AbstractC10458p) obj).f30960Y;
                            } else {
                                abstractC10458p3 = null;
                            }
                        }
                    } else {
                        abstractC10458p = c13526r.f30960Y;
                        if (abstractC10458p.f30972y0) {
                            throw new IllegalStateException("visitAncestors called on an unattached node");
                        }
                        abstractC10458p2 = abstractC10458p.f30964q0;
                        c21658dM22217v = AbstractC21690f.m22217v(c13526r);
                        loop17: while (true) {
                            if (c21658dM22217v != null) {
                                M22201f = 0;
                                break;
                            }
                            if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 8192) != 0) {
                                while (abstractC10458p2 != null) {
                                    if ((abstractC10458p2.f30962o0 & 8192) != 0) {
                                        M22201f = abstractC10458p2;
                                        r10 = 0;
                                        while (M22201f != 0) {
                                            if (M22201f instanceof InterfaceC18858d) {
                                                break loop17;
                                                break loop17;
                                            }
                                            if ((M22201f.f30962o0 & 8192) == 0) {
                                            }
                                            M22201f = AbstractC21690f.m22201f(r10);
                                        }
                                    }
                                    abstractC10458p2 = abstractC10458p2.f30964q0;
                                }
                            }
                            c21658dM22217v = c21658dM22217v.m22009G();
                            if (c21658dM22217v != null) {
                            }
                        }
                        obj = (InterfaceC18858d) M22201f;
                        if (obj != null) {
                            abstractC10458p3 = ((AbstractC10458p) obj).f30960Y;
                        } else {
                            abstractC10458p3 = null;
                        }
                    }
                }
            } else if (c13526rM15046g != null) {
                abstractC10458p4 = c13526rM15046g.f30960Y;
                if (abstractC10458p4.f30972y0) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                c21658dM22217v2 = AbstractC21690f.m22217v(c13526rM15046g);
                loop13: while (true) {
                    if (c21658dM22217v2 != null) {
                        M22201f2 = 0;
                        break;
                    }
                    if ((((AbstractC10458p) c21658dM22217v2.f68638I0.f3471f).f30963p0 & 8192) != 0) {
                        while (abstractC10458p4 != null) {
                            if ((abstractC10458p4.f30962o0 & 8192) != 0) {
                                r11 = 0;
                                M22201f2 = abstractC10458p4;
                                while (M22201f2 != 0) {
                                    if (M22201f2 instanceof InterfaceC18858d) {
                                        break loop13;
                                        break loop13;
                                    }
                                    if ((M22201f2.f30962o0 & 8192) == 0) {
                                    }
                                    M22201f2 = AbstractC21690f.m22201f(r11);
                                }
                            }
                            abstractC10458p4 = abstractC10458p4.f30964q0;
                        }
                    }
                    c21658dM22217v2 = c21658dM22217v2.m22009G();
                    if (c21658dM22217v2 != null) {
                    }
                }
                obj2 = (InterfaceC18858d) M22201f2;
                if (obj2 != null) {
                    abstractC10458p3 = ((AbstractC10458p) obj2).f30960Y;
                } else {
                    abstractC10458p = c13526r.f30960Y;
                    if (abstractC10458p.f30972y0) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    abstractC10458p2 = abstractC10458p.f30964q0;
                    c21658dM22217v = AbstractC21690f.m22217v(c13526r);
                    loop17: while (true) {
                        if (c21658dM22217v != null) {
                            M22201f = 0;
                            break;
                        }
                        if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 8192) != 0) {
                            while (abstractC10458p2 != null) {
                                if ((abstractC10458p2.f30962o0 & 8192) != 0) {
                                    M22201f = abstractC10458p2;
                                    r10 = 0;
                                    while (M22201f != 0) {
                                        if (M22201f instanceof InterfaceC18858d) {
                                            break loop17;
                                            break loop17;
                                        }
                                        if ((M22201f.f30962o0 & 8192) == 0) {
                                        }
                                        M22201f = AbstractC21690f.m22201f(r10);
                                    }
                                }
                                abstractC10458p2 = abstractC10458p2.f30964q0;
                            }
                        }
                        c21658dM22217v = c21658dM22217v.m22009G();
                        if (c21658dM22217v != null) {
                        }
                    }
                    obj = (InterfaceC18858d) M22201f;
                    if (obj != null) {
                        abstractC10458p3 = ((AbstractC10458p) obj).f30960Y;
                    } else {
                        abstractC10458p3 = null;
                    }
                }
            } else {
                abstractC10458p = c13526r.f30960Y;
                if (abstractC10458p.f30972y0) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                abstractC10458p2 = abstractC10458p.f30964q0;
                c21658dM22217v = AbstractC21690f.m22217v(c13526r);
                loop17: while (true) {
                    if (c21658dM22217v != null) {
                        M22201f = 0;
                        break;
                    }
                    if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 8192) != 0) {
                        while (abstractC10458p2 != null) {
                            if ((abstractC10458p2.f30962o0 & 8192) != 0) {
                                M22201f = abstractC10458p2;
                                r10 = 0;
                                while (M22201f != 0) {
                                    if (M22201f instanceof InterfaceC18858d) {
                                        break loop17;
                                        break loop17;
                                    }
                                    if ((M22201f.f30962o0 & 8192) == 0) {
                                    }
                                    M22201f = AbstractC21690f.m22201f(r10);
                                }
                            }
                            abstractC10458p2 = abstractC10458p2.f30964q0;
                        }
                    }
                    c21658dM22217v = c21658dM22217v.m22009G();
                    if (c21658dM22217v != null) {
                    }
                }
                obj = (InterfaceC18858d) M22201f;
                if (obj != null) {
                    abstractC10458p3 = ((AbstractC10458p) obj).f30960Y;
                } else {
                    abstractC10458p3 = null;
                }
            }
            if (abstractC10458p3 != null) {
                return false;
            }
            abstractC10458p5 = abstractC10458p3.f30960Y;
            if (abstractC10458p5.f30972y0) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            abstractC10458p6 = abstractC10458p5.f30964q0;
            c21658dM22217v3 = AbstractC21690f.m22217v(abstractC10458p3);
            arrayList = null;
            while (c21658dM22217v3 != null) {
                if ((((AbstractC10458p) c21658dM22217v3.f68638I0.f3471f).f30963p0 & 8192) != 0) {
                    while (abstractC10458p6 != null) {
                        if ((abstractC10458p6.f30962o0 & 8192) != 0) {
                            abstractC10458pM22201f = abstractC10458p6;
                            c6546d2 = null;
                            while (abstractC10458pM22201f != null) {
                                if (abstractC10458pM22201f instanceof InterfaceC18858d) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC10458pM22201f);
                                } else if ((abstractC10458pM22201f.f30962o0 & 8192) == 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                    C6546d c6546d5 = c6546d2;
                                    int i27 = 0;
                                    for (AbstractC10458p abstractC10458p11 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p11 != null; abstractC10458p11 = abstractC10458p11.f30965r0) {
                                        if ((abstractC10458p11.f30962o0 & 8192) != 0) {
                                            i27++;
                                            if (i27 == 1) {
                                                abstractC10458pM22201f = abstractC10458p11;
                                            } else {
                                                if (c6546d5 == null) {
                                                    c6546d5 = new C6546d(new AbstractC10458p[16]);
                                                }
                                                if (abstractC10458pM22201f != null) {
                                                    c6546d5.m7099c(abstractC10458pM22201f);
                                                    abstractC10458pM22201f = null;
                                                }
                                                c6546d5.m7099c(abstractC10458p11);
                                            }
                                        }
                                    }
                                    if (i27 == 1) {
                                        c6546d2 = c6546d5;
                                    } else {
                                        c6546d2 = c6546d5;
                                    }
                                }
                                abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d2);
                            }
                        }
                        abstractC10458p6 = abstractC10458p6.f30964q0;
                    }
                }
                c21658dM22217v3 = c21658dM22217v3.m22009G();
                abstractC10458p6 = (c21658dM22217v3 != null || (c1313k3 = c21658dM22217v3.f68638I0) == null) ? null : (C21703l0) c1313k3.f3470e;
            }
            if (arrayList != null || (size2 = arrayList.size() - 1) < 0) {
                keyEvent2 = keyEvent;
            } else {
                while (true) {
                    int i28 = size2 - 1;
                    keyEvent2 = keyEvent;
                    if (((InterfaceC18858d) arrayList.get(size2)).mo15576l(keyEvent2)) {
                        return true;
                    }
                    if (i28 < 0) {
                        break;
                    }
                    size2 = i28;
                }
            }
            M22201f3 = abstractC10458p3.f30960Y;
            c6546d = 0;
            while (M22201f3 != 0) {
                if (M22201f3 instanceof InterfaceC18858d) {
                    if (((InterfaceC18858d) M22201f3).mo15576l(keyEvent2)) {
                        return true;
                    }
                } else if ((M22201f3.f30962o0 & 8192) == 0 && (M22201f3 instanceof AbstractC21706n)) {
                    AbstractC10458p abstractC10458p12 = ((AbstractC21706n) M22201f3).f68881A0;
                    int i29 = 0;
                    while (abstractC10458p12 != null) {
                        if ((abstractC10458p12.f30962o0 & 8192) != 0) {
                            i29++;
                            if (i29 == 1) {
                                M22201f3 = M22201f3;
                                c6546d = c6546d;
                                c6546d = c6546d;
                                M22201f3 = abstractC10458p12;
                            } else {
                                if (c6546d == 0) {
                                    c6546d = new C6546d(new AbstractC10458p[16]);
                                }
                                if (M22201f3 != 0) {
                                    c6546d.m7099c(M22201f3);
                                    M22201f3 = 0;
                                }
                                c6546d.m7099c(abstractC10458p12);
                            }
                        } else {
                            M22201f3 = M22201f3;
                            c6546d = c6546d;
                        }
                        abstractC10458p12 = abstractC10458p12.f30965r0;
                        M22201f3 = M22201f3;
                        c6546d = c6546d;
                    }
                    M22201f3 = M22201f3;
                    c6546d = c6546d;
                    if (i29 == 1) {
                    }
                }
                M22201f3 = AbstractC21690f.m22201f(c6546d);
            }
            if (((Boolean) interfaceC1426a.invoke()).booleanValue()) {
                return true;
            }
            z6 = true;
            M22201f4 = abstractC10458p3.f30960Y;
            r12 = 0;
            while (M22201f4 != 0) {
                if (M22201f4 instanceof InterfaceC18858d) {
                    if (((InterfaceC18858d) M22201f4).mo15577z(keyEvent2)) {
                        return z6;
                    }
                } else if ((M22201f4.f30962o0 & 8192) == 0 && (M22201f4 instanceof AbstractC21706n)) {
                    AbstractC10458p abstractC10458p13 = ((AbstractC21706n) M22201f4).f68881A0;
                    ?? c6546d6 = r12;
                    int i30 = 0;
                    while (abstractC10458p13 != null) {
                        if ((abstractC10458p13.f30962o0 & 8192) != 0) {
                            i30++;
                            if (i30 == 1) {
                                M22201f4 = M22201f4;
                                c6546d6 = c6546d6;
                                M22201f4 = abstractC10458p13;
                            } else {
                                if (c6546d6 == 0) {
                                    c6546d6 = new C6546d(new AbstractC10458p[16]);
                                }
                                if (M22201f4 != 0) {
                                    c6546d6.m7099c(M22201f4);
                                    M22201f4 = 0;
                                }
                                c6546d6.m7099c(abstractC10458p13);
                            }
                        } else {
                            M22201f4 = M22201f4;
                        }
                        abstractC10458p13 = abstractC10458p13.f30965r0;
                        M22201f4 = M22201f4;
                        c6546d6 = c6546d6;
                    }
                    M22201f4 = M22201f4;
                    z6 = true;
                    if (i30 == 1) {
                        r12 = c6546d6;
                    } else {
                        r12 = c6546d6;
                    }
                }
                M22201f4 = AbstractC21690f.m22201f(r12);
                z6 = true;
            }
            if (arrayList != null) {
                return false;
            }
            size = arrayList.size();
            for (i10 = 0; i10 < size; i10++) {
                if (((InterfaceC18858d) arrayList.get(i10)).mo15577z(keyEvent2)) {
                    return true;
                }
            }
            return false;
        }
        C12986y c12986y3 = this.f32702j;
        if (c12986y3 == null) {
            c12986y3 = new C12986y(3);
            this.f32702j = c12986y3;
        }
        C12986y c12986y4 = c12986y3;
        int i31 = ((int) (jM20157d ^ (jM20157d >>> 32))) * (-862048943);
        int i32 = i31 ^ (i31 << 16);
        int i33 = i32 >>> 7;
        int i34 = i32 & 127;
        int i35 = c12986y4.f41229c;
        int i36 = i33 & i35;
        int i37 = 0;
        loop0: while (true) {
            long[] jArr3 = c12986y4.f41227a;
            int i38 = i36 >> 3;
            int i39 = (i36 & 7) << 3;
            long j16 = (jArr3[i38] >>> i39) | ((jArr3[i38 + 1] << (64 - i39)) & ((-i39) >> 63));
            int i40 = i33;
            long j17 = i34;
            long j18 = j16 ^ (j17 * 72340172838076673L);
            for (long j19 = (j18 - 72340172838076673L) & (~j18) & (-9187201950435737472L); j19 != 0; j19 &= j19 - 1) {
                iNumberOfTrailingZeros2 = (i36 + (Long.numberOfTrailingZeros(j19) >> 3)) & i35;
                if (c12986y4.f41228b[iNumberOfTrailingZeros2] == jM20157d) {
                    j10 = jM20157d;
                    break loop0;
                }
            }
            if ((j16 & ((~j16) << 6) & (-9187201950435737472L)) != 0) {
                int iM14715b2 = c12986y4.m14715b(i40);
                long j20 = 128;
                if (c12986y4.f41231e != 0 || ((c12986y4.f41227a[iM14715b2 >> 3] >> ((iM14715b2 & 7) << i13)) & 255) == 254) {
                    j10 = jM20157d;
                    j11 = j17;
                    iM14715b = iM14715b2;
                } else {
                    int i41 = c12986y4.f41229c;
                    if (i41 <= 8 || Long.compare((((long) c12986y4.f41230d) * 32) ^ Long.MIN_VALUE, (((long) i41) * 25) ^ Long.MIN_VALUE) > 0) {
                        j10 = jM20157d;
                        j11 = j17;
                        int iM14638d = AbstractC12957J.m14638d(c12986y4.f41229c);
                        long[] jArr4 = c12986y4.f41227a;
                        long[] jArr5 = c12986y4.f41228b;
                        c12986y4.m14716c(iM14638d);
                        long[] jArr6 = c12986y4.f41227a;
                        long[] jArr7 = c12986y4.f41228b;
                        int i42 = c12986y4.f41229c;
                        int i43 = 0;
                        for (int i44 = c12986y4.f41229c; i43 < i44; i44 = i44) {
                            if (((jArr4[i43 >> 3] >> ((i43 & 7) << 3)) & 255) < 128) {
                                long j21 = jArr5[i43];
                                int i45 = ((int) ((j21 >>> 32) ^ j21)) * (-862048943);
                                int i46 = i45 ^ (i45 << 16);
                                int iM14715b3 = c12986y4.m14715b(i46 >>> 7);
                                long j22 = i46 & 127;
                                int i47 = iM14715b3 >> 3;
                                int i48 = (iM14715b3 & 7) << 3;
                                long j23 = (jArr6[i47] & (~(255 << i48))) | (j22 << i48);
                                jArr6[i47] = j23;
                                jArr6[(((iM14715b3 - 7) & i42) + (i42 & 7)) >> 3] = j23;
                                jArr7[iM14715b3] = j21;
                            }
                            i43++;
                        }
                    } else {
                        long[] jArr8 = c12986y4.f41227a;
                        int i49 = c12986y4.f41229c;
                        long[] jArr9 = c12986y4.f41228b;
                        AbstractC12957J.m14635a(jArr8, i49);
                        int i50 = 0;
                        int iM14636b = -1;
                        while (i50 != i49) {
                            int i51 = i50 >> 3;
                            int i52 = (i50 & 7) << 3;
                            long j24 = (jArr8[i51] >> i52) & 255;
                            if (j24 == j20) {
                                iM14636b = i50;
                                i50++;
                            } else if (j24 != 254) {
                                i50++;
                            } else {
                                long j25 = jArr9[i50];
                                int i53 = ((int) (j25 ^ (j25 >>> 32))) * (-862048943);
                                int i54 = i53 ^ (i53 << 16);
                                int i55 = i54 >>> 7;
                                int iM14715b4 = c12986y4.m14715b(i55);
                                int i56 = i55 & i49;
                                if (((iM14715b4 - i56) & i49) / 8 == ((i50 - i56) & i49) / 8) {
                                    jArr8[i51] = (jArr8[i51] & (~(255 << i52))) | (((long) (i54 & 127)) << i52);
                                    jArr8[jArr8.length - 1] = (jArr8[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i50++;
                                } else {
                                    int i57 = i50;
                                    int i58 = iM14715b4 >> 3;
                                    long j26 = jArr8[i58];
                                    int i59 = (iM14715b4 & 7) << 3;
                                    if (((j26 >> i59) & 255) == 128) {
                                        jArr8[i58] = (j26 & (~(255 << i59))) | (((long) (i54 & 127)) << i59);
                                        jArr8[i51] = (jArr8[i51] & (~(255 << i52))) | (128 << i52);
                                        jArr9[iM14715b4] = jArr9[i57];
                                        jArr9[i57] = 0;
                                        i12 = i57;
                                        iM14636b = i12;
                                    } else {
                                        jArr8[i58] = (((long) (i54 & 127)) << i59) | (j26 & (~(255 << i59)));
                                        int i60 = iM14636b;
                                        iM14636b = i60 == -1 ? AbstractC12957J.m14636b(jArr8, i57 + 1, i49) : i60;
                                        jArr9[iM14636b] = jArr9[iM14715b4];
                                        jArr9[iM14715b4] = jArr9[i57];
                                        jArr9[i57] = jArr9[iM14636b];
                                        i12 = i57 - 1;
                                    }
                                    jArr8[jArr8.length - 1] = (jArr8[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i50 = i12 + 1;
                                    jM20157d = jM20157d;
                                    j17 = j17;
                                }
                                j20 = 128;
                            }
                        }
                        j10 = jM20157d;
                        j11 = j17;
                        c12986y4.f41231e = AbstractC12957J.m14637c(c12986y4.f41229c) - c12986y4.f41230d;
                    }
                    iM14715b = c12986y4.m14715b(i40);
                }
                c12986y4.f41230d++;
                int i61 = c12986y4.f41231e;
                long[] jArr10 = c12986y4.f41227a;
                int i62 = iM14715b >> 3;
                long j27 = jArr10[i62];
                int i63 = (iM14715b & 7) << 3;
                c12986y4.f41231e = i61 - (((j27 >> i63) & 255) == 128 ? 1 : 0);
                int i64 = c12986y4.f41229c;
                long j28 = (j27 & (~(255 << i63))) | (j11 << i63);
                jArr10[i62] = j28;
                jArr10[(((iM14715b - 7) & i64) + (i64 & 7)) >> 3] = j28;
                iNumberOfTrailingZeros2 = iM14715b;
                break;
            }
            i37 += 8;
            i36 = (i36 + i37) & i35;
            i33 = i40;
            i13 = 3;
        }
        c12986y4.f41228b[iNumberOfTrailingZeros2] = j10;
        c10863b = this;
        c13526r = c10863b.f32698f;
        c13526rM15046g = AbstractC13512d.m15046g(c13526r);
        if (c13526rM15046g != null) {
            abstractC10458p7 = c13526rM15046g.f30960Y;
            if (abstractC10458p7.f30972y0) {
                AbstractC8111i5.m8592c("visitLocalDescendants called on an unattached node");
                throw null;
            }
            if ((abstractC10458p7.f30963p0 & 9216) != 0) {
                abstractC10458p3 = null;
                while (abstractC10458p8 != null) {
                    i11 = abstractC10458p8.f30962o0;
                    if ((i11 & 9216) == 0) {
                        if ((i11 & 1024) != 0) {
                            break;
                            break;
                        }
                        abstractC10458p3 = abstractC10458p8;
                    }
                }
            } else {
                abstractC10458p3 = null;
            }
            if (abstractC10458p3 == null) {
                if (c13526rM15046g != null) {
                    abstractC10458p4 = c13526rM15046g.f30960Y;
                    if (abstractC10458p4.f30972y0) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    c21658dM22217v2 = AbstractC21690f.m22217v(c13526rM15046g);
                    loop13: while (true) {
                        if (c21658dM22217v2 != null) {
                            M22201f2 = 0;
                            break;
                        }
                        if ((((AbstractC10458p) c21658dM22217v2.f68638I0.f3471f).f30963p0 & 8192) != 0) {
                            while (abstractC10458p4 != null) {
                                if ((abstractC10458p4.f30962o0 & 8192) != 0) {
                                    r11 = 0;
                                    M22201f2 = abstractC10458p4;
                                    while (M22201f2 != 0) {
                                        if (M22201f2 instanceof InterfaceC18858d) {
                                            break loop13;
                                            break loop13;
                                        }
                                        if ((M22201f2.f30962o0 & 8192) == 0) {
                                        }
                                        M22201f2 = AbstractC21690f.m22201f(r11);
                                    }
                                }
                                abstractC10458p4 = abstractC10458p4.f30964q0;
                            }
                        }
                        c21658dM22217v2 = c21658dM22217v2.m22009G();
                        if (c21658dM22217v2 != null) {
                        }
                    }
                    obj2 = (InterfaceC18858d) M22201f2;
                    if (obj2 != null) {
                        abstractC10458p3 = ((AbstractC10458p) obj2).f30960Y;
                    } else {
                        abstractC10458p = c13526r.f30960Y;
                        if (abstractC10458p.f30972y0) {
                            throw new IllegalStateException("visitAncestors called on an unattached node");
                        }
                        abstractC10458p2 = abstractC10458p.f30964q0;
                        c21658dM22217v = AbstractC21690f.m22217v(c13526r);
                        loop17: while (true) {
                            if (c21658dM22217v != null) {
                                M22201f = 0;
                                break;
                            }
                            if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 8192) != 0) {
                                while (abstractC10458p2 != null) {
                                    if ((abstractC10458p2.f30962o0 & 8192) != 0) {
                                        M22201f = abstractC10458p2;
                                        r10 = 0;
                                        while (M22201f != 0) {
                                            if (M22201f instanceof InterfaceC18858d) {
                                                break loop17;
                                                break loop17;
                                            }
                                            if ((M22201f.f30962o0 & 8192) == 0) {
                                            }
                                            M22201f = AbstractC21690f.m22201f(r10);
                                        }
                                    }
                                    abstractC10458p2 = abstractC10458p2.f30964q0;
                                }
                            }
                            c21658dM22217v = c21658dM22217v.m22009G();
                            if (c21658dM22217v != null) {
                            }
                        }
                        obj = (InterfaceC18858d) M22201f;
                        if (obj != null) {
                            abstractC10458p3 = ((AbstractC10458p) obj).f30960Y;
                        } else {
                            abstractC10458p3 = null;
                        }
                    }
                } else {
                    abstractC10458p = c13526r.f30960Y;
                    if (abstractC10458p.f30972y0) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    abstractC10458p2 = abstractC10458p.f30964q0;
                    c21658dM22217v = AbstractC21690f.m22217v(c13526r);
                    loop17: while (true) {
                        if (c21658dM22217v != null) {
                            M22201f = 0;
                            break;
                        }
                        if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 8192) != 0) {
                            while (abstractC10458p2 != null) {
                                if ((abstractC10458p2.f30962o0 & 8192) != 0) {
                                    M22201f = abstractC10458p2;
                                    r10 = 0;
                                    while (M22201f != 0) {
                                        if (M22201f instanceof InterfaceC18858d) {
                                            break loop17;
                                            break loop17;
                                        }
                                        if ((M22201f.f30962o0 & 8192) == 0) {
                                        }
                                        M22201f = AbstractC21690f.m22201f(r10);
                                    }
                                }
                                abstractC10458p2 = abstractC10458p2.f30964q0;
                            }
                        }
                        c21658dM22217v = c21658dM22217v.m22009G();
                        if (c21658dM22217v != null) {
                        }
                    }
                    obj = (InterfaceC18858d) M22201f;
                    if (obj != null) {
                        abstractC10458p3 = ((AbstractC10458p) obj).f30960Y;
                    } else {
                        abstractC10458p3 = null;
                    }
                }
            }
        } else if (c13526rM15046g != null) {
            abstractC10458p4 = c13526rM15046g.f30960Y;
            if (abstractC10458p4.f30972y0) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            c21658dM22217v2 = AbstractC21690f.m22217v(c13526rM15046g);
            loop13: while (true) {
                if (c21658dM22217v2 != null) {
                    M22201f2 = 0;
                    break;
                }
                if ((((AbstractC10458p) c21658dM22217v2.f68638I0.f3471f).f30963p0 & 8192) != 0) {
                    while (abstractC10458p4 != null) {
                        if ((abstractC10458p4.f30962o0 & 8192) != 0) {
                            r11 = 0;
                            M22201f2 = abstractC10458p4;
                            while (M22201f2 != 0) {
                                if (M22201f2 instanceof InterfaceC18858d) {
                                    break loop13;
                                    break loop13;
                                }
                                if ((M22201f2.f30962o0 & 8192) == 0) {
                                }
                                M22201f2 = AbstractC21690f.m22201f(r11);
                            }
                        }
                        abstractC10458p4 = abstractC10458p4.f30964q0;
                    }
                }
                c21658dM22217v2 = c21658dM22217v2.m22009G();
                if (c21658dM22217v2 != null) {
                }
            }
            obj2 = (InterfaceC18858d) M22201f2;
            if (obj2 != null) {
                abstractC10458p3 = ((AbstractC10458p) obj2).f30960Y;
            } else {
                abstractC10458p = c13526r.f30960Y;
                if (abstractC10458p.f30972y0) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                abstractC10458p2 = abstractC10458p.f30964q0;
                c21658dM22217v = AbstractC21690f.m22217v(c13526r);
                loop17: while (true) {
                    if (c21658dM22217v != null) {
                        M22201f = 0;
                        break;
                    }
                    if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 8192) != 0) {
                        while (abstractC10458p2 != null) {
                            if ((abstractC10458p2.f30962o0 & 8192) != 0) {
                                M22201f = abstractC10458p2;
                                r10 = 0;
                                while (M22201f != 0) {
                                    if (M22201f instanceof InterfaceC18858d) {
                                        break loop17;
                                        break loop17;
                                    }
                                    if ((M22201f.f30962o0 & 8192) == 0) {
                                    }
                                    M22201f = AbstractC21690f.m22201f(r10);
                                }
                            }
                            abstractC10458p2 = abstractC10458p2.f30964q0;
                        }
                    }
                    c21658dM22217v = c21658dM22217v.m22009G();
                    if (c21658dM22217v != null) {
                    }
                }
                obj = (InterfaceC18858d) M22201f;
                if (obj != null) {
                    abstractC10458p3 = ((AbstractC10458p) obj).f30960Y;
                } else {
                    abstractC10458p3 = null;
                }
            }
        } else {
            abstractC10458p = c13526r.f30960Y;
            if (abstractC10458p.f30972y0) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            abstractC10458p2 = abstractC10458p.f30964q0;
            c21658dM22217v = AbstractC21690f.m22217v(c13526r);
            loop17: while (true) {
                if (c21658dM22217v != null) {
                    M22201f = 0;
                    break;
                }
                if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 8192) != 0) {
                    while (abstractC10458p2 != null) {
                        if ((abstractC10458p2.f30962o0 & 8192) != 0) {
                            M22201f = abstractC10458p2;
                            r10 = 0;
                            while (M22201f != 0) {
                                if (M22201f instanceof InterfaceC18858d) {
                                    break loop17;
                                    break loop17;
                                }
                                if ((M22201f.f30962o0 & 8192) == 0) {
                                }
                                M22201f = AbstractC21690f.m22201f(r10);
                            }
                        }
                        abstractC10458p2 = abstractC10458p2.f30964q0;
                    }
                }
                c21658dM22217v = c21658dM22217v.m22009G();
                if (c21658dM22217v != null) {
                }
            }
            obj = (InterfaceC18858d) M22201f;
            if (obj != null) {
                abstractC10458p3 = ((AbstractC10458p) obj).f30960Y;
            } else {
                abstractC10458p3 = null;
            }
        }
        if (abstractC10458p3 != null) {
            return false;
        }
        abstractC10458p5 = abstractC10458p3.f30960Y;
        if (abstractC10458p5.f30972y0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        abstractC10458p6 = abstractC10458p5.f30964q0;
        c21658dM22217v3 = AbstractC21690f.m22217v(abstractC10458p3);
        arrayList = null;
        while (c21658dM22217v3 != null) {
            if ((((AbstractC10458p) c21658dM22217v3.f68638I0.f3471f).f30963p0 & 8192) != 0) {
                while (abstractC10458p6 != null) {
                    if ((abstractC10458p6.f30962o0 & 8192) != 0) {
                        abstractC10458pM22201f = abstractC10458p6;
                        c6546d2 = null;
                        while (abstractC10458pM22201f != null) {
                            if (abstractC10458pM22201f instanceof InterfaceC18858d) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(abstractC10458pM22201f);
                            } else if ((abstractC10458pM22201f.f30962o0 & 8192) == 0) {
                            }
                            abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d2);
                        }
                    }
                    abstractC10458p6 = abstractC10458p6.f30964q0;
                }
            }
            c21658dM22217v3 = c21658dM22217v3.m22009G();
            if (c21658dM22217v3 != null) {
            }
        }
        if (arrayList != null) {
            keyEvent2 = keyEvent;
        } else {
            keyEvent2 = keyEvent;
        }
        M22201f3 = abstractC10458p3.f30960Y;
        c6546d = 0;
        while (M22201f3 != 0) {
            if (M22201f3 instanceof InterfaceC18858d) {
                if (((InterfaceC18858d) M22201f3).mo15576l(keyEvent2)) {
                    return true;
                }
            } else if ((M22201f3.f30962o0 & 8192) == 0) {
            }
            M22201f3 = AbstractC21690f.m22201f(c6546d);
        }
        if (((Boolean) interfaceC1426a.invoke()).booleanValue()) {
            return true;
        }
        z6 = true;
        M22201f4 = abstractC10458p3.f30960Y;
        r12 = 0;
        while (M22201f4 != 0) {
            if (M22201f4 instanceof InterfaceC18858d) {
                if (((InterfaceC18858d) M22201f4).mo15577z(keyEvent2)) {
                    return z6;
                }
            } else if ((M22201f4.f30962o0 & 8192) == 0) {
            }
            M22201f4 = AbstractC21690f.m22201f(r12);
            z6 = true;
        }
        if (arrayList != null) {
            return false;
        }
        size = arrayList.size();
        while (i10 < size) {
            if (((InterfaceC18858d) arrayList.get(i10)).mo15577z(keyEvent2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[PHI: r11
      0x0070: PHI (r11v16 f1.n) = (r11v13 f1.n), (r11v20 f1.n) binds: [B:43:0x0090, B:28:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [Bm.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [Bm.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [Q0.d] */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    /* JADX INFO: renamed from: c */
    public final java.lang.Boolean m11303c(int r19, p759g1.C13801c r20, p049Bm.InterfaceC1436k r21) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p650ui.focus.C10863b.m11303c(int, g1.c, Bm.k):java.lang.Boolean");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11304d(int i10) {
        C16525B c16525b = new C16525B();
        c16525b.f51262Y = Boolean.FALSE;
        Boolean boolM11303c = m11303c(i10, (C13801c) this.f32696d.invoke(), new C1650i(c16525b, i10, 3));
        if (boolM11303c == null || c16525b.f51262Y == null) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (boolM11303c.equals(bool) && AbstractC16544l.m18089b(c16525b.f51262Y, bool)) {
            return true;
        }
        if (!(C13510b.m15026a(i10, 1) ? true : C13510b.m15026a(i10, 2))) {
            return ((Boolean) this.f32694b.invoke(new C13510b(i10))).booleanValue();
        }
        if (!m11301a(i10, false, false)) {
            return false;
        }
        Boolean boolM11303c2 = m11303c(i10, null, new C0307z(i10, 3));
        return boolM11303c2 != null ? boolM11303c2.booleanValue() : false;
    }
}
