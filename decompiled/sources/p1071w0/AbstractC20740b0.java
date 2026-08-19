package p1071w0;

import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.foundation.AbstractC10838f;
import androidx.compose.foundation.text.handwriting.AbstractC10854a;
import androidx.compose.foundation.text.input.internal.AbstractC10855a;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.p650ui.draw.AbstractC10861a;
import androidx.compose.p650ui.focus.AbstractC10862a;
import androidx.compose.p650ui.graphics.AbstractC10864a;
import androidx.compose.p650ui.input.key.AbstractC10865a;
import androidx.compose.p650ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p650ui.layout.AbstractC10868a;
import com.google.protobuf.AbstractC12107L1;
import ge.C14103t0;
import gf.C14127l;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import mm.C17309l;
import p001A.AbstractC0010F;
import p002A0.C0120T;
import p002A0.C0122V;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.C0185L1;
import p003A1.C0280q;
import p003A1.InterfaceC0172H0;
import p003A1.InterfaceC0182K1;
import p003A1.InterfaceC0300w1;
import p003A1.InterfaceC0303x1;
import p017Af.C0468O;
import p017Af.C0478i;
import p017Af.C0494y;
import p025An.AbstractC0575H;
import p030B2.C0781s;
import p039Bc.C0886t;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p054C0.C1495h;
import p080D0.AbstractC1770D0;
import p080D0.AbstractC1807h0;
import p080D0.C1768C0;
import p080D0.C1773G;
import p080D0.C1781O;
import p080D0.C1803f0;
import p080D0.C1833u0;
import p080D0.C1837w0;
import p080D0.InterfaceC1818n;
import p1013t0.C19715c;
import p1014t1.AbstractC19736m;
import p1014t1.AbstractC19744u;
import p1014t1.C19723A;
import p1014t1.C19724a;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21098s;
import p1139z0.AbstractC21590M;
import p1139z0.C21585H;
import p1139z0.C21589L;
import p1139z0.C21611e;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p117Eb.C2385o;
import p124Ei.C2497c;
import p153Fn.C2925c;
import p156G1.AbstractC2965l;
import p204I1.C3573D;
import p204I1.C3578I;
import p204I1.C3581L;
import p204I1.C3582M;
import p204I1.C3587c;
import p204I1.C3588d;
import p204I1.C3590f;
import p204I1.C3606v;
import p229J0.C4018a0;
import p310M9.C5311e;
import p328N1.InterfaceC5598n;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p350O1.C6045C;
import p350O1.C6046D;
import p350O1.C6049G;
import p350O1.C6050H;
import p350O1.C6061j;
import p350O1.C6065n;
import p350O1.InterfaceC6073v;
import p350O1.InterfaceC6074w;
import p414R.C6769c;
import p467T1.C7200j;
import p467T1.EnumC7198h;
import p468T2.C7218j;
import p468T2.C7223o;
import p468T2.C7231w;
import p477Tb.C7296c;
import p492U1.C7544i;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC7849B0;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8096g6;
import p523V9.AbstractC8112i6;
import p530Vi.AbstractC8301I;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8572V3;
import p547Wc.C8761E;
import p563X1.C9024d;
import p571X9.AbstractC9107B4;
import p571X9.AbstractC9160K3;
import p571X9.AbstractC9388w4;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9567s;
import p594Y9.AbstractC9834X3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p666bl.C11500p;
import p737f1.C13522n;
import p737f1.InterfaceC13515g;
import p759g1.C13800b;
import p759g1.C13801c;
import p773h0.AbstractC14282f0;
import p774h1.AbstractC14360p;
import p774h1.InterfaceC14366v;
import p813ij.C15026j;
import p823j3.C16084f;
import p842k0.C16305n;
import p860l0.C16663C;
import p860l0.EnumC16673F0;
import p870le.C16878e0;
import p887m7.C17176b;
import p894n0.InterfaceC17406l;
import p909nm.C17689w;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17792x;
import p928oh.C18194a;
import p937p1.InterfaceC18285a;
import p963qd.C18685n;
import p978r1.AbstractC18857c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import td.C19843f;
import tf.C19899D;
import tf.C19941z;

/* JADX INFO: renamed from: w0.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20740b0 {

    /* JADX INFO: renamed from: a */
    public static final C20757k f65746a = new C20757k(2);

    /* JADX INFO: renamed from: b */
    public static final C19724a f65747b = new C19724a(1008);

    /* JADX INFO: renamed from: c */
    public static final C0781s f65748c = new C0781s(0, 0, 10);

    /* JADX INFO: renamed from: A */
    public static final void m21258A(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i11) {
            throw new IllegalStateException(AbstractC12107L1.m13826q(AbstractC0010F.m21e("OffsetMapping.originalToTransformed returned invalid mapping: ", i12, " -> ", i10, " is not in range of transformed text [0, "), i11, ']').toString());
        }
    }

    /* JADX INFO: renamed from: B */
    public static final void m21259B(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i11) {
            throw new IllegalStateException(AbstractC12107L1.m13826q(AbstractC0010F.m21e("OffsetMapping.transformedToOriginal returned invalid mapping: ", i12, " -> ", i10, " is not in range of original text [0, "), i11, ']').toString());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v15 ??, still in use, count: 1, list:
          (r10v15 ?? I:java.lang.Object) from 0x0171: INVOKE (r44v0 ?? I:O0.p), (r10v15 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:370)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: a */
    public static final void m21260a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v15 ??, still in use, count: 1, list:
          (r10v15 ?? I:java.lang.Object) from 0x0171: INVOKE (r44v0 ?? I:O0.p), (r10v15 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:370)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r34v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v25 ??, still in use, count: 1, list:
          (r0v25 ?? I:java.lang.Object) from 0x0191: INVOKE (r44v0 ?? I:O0.p), (r0v25 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:402)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: b */
    public static final void m21261b(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v25 ??, still in use, count: 1, list:
          (r0v25 ?? I:java.lang.Object) from 0x0191: INVOKE (r44v0 ?? I:O0.p), (r0v25 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:402)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: renamed from: c */
    public static final void m21262c(C0120T c0120t, boolean z6, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(2103477555);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c0120t) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = new C16305n();
                c6021p.m6537c0(objM6514H);
            }
            C16305n c16305n = (C16305n) objM6514H;
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = new C20783x(c16305n, 1);
                c6021p.m6537c0(objM6514H2);
            }
            int i12 = i11 << 9;
            AbstractC8572V3.m9237b(c16305n, (InterfaceC1426a) objM6514H2, new C0122V(c16305n, 0, c0120t), null, z6, c8410b, c6021p, (57344 & i12) | 54 | (i12 & 458752), 8);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0886t(c0120t, z6, c8410b, i10, 10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m21263d(C1803f0 c1803f0, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(605522716);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c1803f0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = new C16305n();
                c6021p.m6537c0(objM6514H);
            }
            C16305n c16305n = (C16305n) objM6514H;
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = new C20783x(c16305n, 2);
                c6021p.m6537c0(objM6514H2);
            }
            AbstractC8572V3.m9237b(c16305n, (InterfaceC1426a) objM6514H2, new C0122V(c16305n, 22, c1803f0), null, false, c8410b, c6021p, ((i11 << 12) & 458752) | 54, 24);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18685n(c1803f0, c8410b, i10, 6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m21264e(C1837w0 c1837w0, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1985516685);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c1837w0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = new C16305n();
                c6021p.m6537c0(objM6514H);
            }
            C16305n c16305n = (C16305n) objM6514H;
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = new C20783x(c16305n, 0);
                c6021p.m6537c0(objM6514H2);
            }
            AbstractC8572V3.m9237b(c16305n, (InterfaceC1426a) objM6514H2, new C0122V(c1837w0, c16305n), null, c1837w0.m2684h(), c8410b, c6021p, ((i11 << 12) & 458752) | 54, 8);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18685n(c1837w0, c8410b, i10, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:203:0x041e  */
    /* JADX WARN: Code duplicated, block: B:206:0x044b  */
    /* JADX WARN: Code duplicated, block: B:208:0x0455  */
    /* JADX WARN: Code duplicated, block: B:210:0x0461  */
    /* JADX WARN: Code duplicated, block: B:211:0x0473  */
    /* JADX WARN: Code duplicated, block: B:214:0x0478  */
    /* JADX WARN: Code duplicated, block: B:215:0x0481  */
    /* JADX WARN: Code duplicated, block: B:217:0x0489  */
    /* JADX WARN: Code duplicated, block: B:220:0x049d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:224:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:227:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:230:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:233:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:235:0x04da  */
    /* JADX WARN: Code duplicated, block: B:238:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:241:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:244:0x0551  */
    /* JADX WARN: Code duplicated, block: B:247:0x0563  */
    /* JADX WARN: Code duplicated, block: B:250:0x057b  */
    /* JADX WARN: Code duplicated, block: B:251:0x057e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0589  */
    /* JADX WARN: Code duplicated, block: B:255:0x058c  */
    /* JADX WARN: Code duplicated, block: B:258:0x059f  */
    /* JADX WARN: Code duplicated, block: B:259:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:262:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:266:0x05be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:269:0x05c7 A[PHI: r22
      0x05c7: PHI (r22v11 w0.N0) = (r22v12 w0.N0), (r22v14 w0.N0) binds: [B:268:0x05c5, B:265:0x05bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:270:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:273:0x05e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:276:0x0600  */
    /* JADX WARN: Code duplicated, block: B:279:0x064c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:281:0x0650  */
    /* JADX WARN: Code duplicated, block: B:284:0x067c  */
    /* JADX WARN: Code duplicated, block: B:286:0x0682  */
    /* JADX WARN: Code duplicated, block: B:292:0x0692 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:295:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:298:0x06cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:301:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:304:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:305:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:308:0x0704  */
    /* JADX WARN: Code duplicated, block: B:309:0x0706  */
    /* JADX WARN: Code duplicated, block: B:312:0x071a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:315:0x0725  */
    /* JADX WARN: Code duplicated, block: B:318:0x0746  */
    /* JADX WARN: Code duplicated, block: B:319:0x0755  */
    /* JADX WARN: Code duplicated, block: B:322:0x077d  */
    /* JADX WARN: Code duplicated, block: B:323:0x077f  */
    /* JADX WARN: Code duplicated, block: B:326:0x078e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:329:0x0794  */
    /* JADX WARN: Code duplicated, block: B:332:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:333:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:336:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:337:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:340:0x07d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:343:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:346:0x0819  */
    /* JADX WARN: Code duplicated, block: B:347:0x081b  */
    /* JADX WARN: Code duplicated, block: B:350:0x0821  */
    /* JADX WARN: Code duplicated, block: B:351:0x0823  */
    /* JADX WARN: Code duplicated, block: B:354:0x0831  */
    /* JADX WARN: Code duplicated, block: B:355:0x0833  */
    /* JADX WARN: Code duplicated, block: B:358:0x084c  */
    /* JADX WARN: Code duplicated, block: B:360:0x0852  */
    /* JADX WARN: Code duplicated, block: B:366:0x0862 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:369:0x0872  */
    /* JADX WARN: Code duplicated, block: B:372:0x08a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:381:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:384:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:385:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:388:0x0903 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:389:0x0905  */
    /* JADX WARN: Code duplicated, block: B:392:0x0921  */
    /* JADX WARN: Code duplicated, block: B:393:0x0923  */
    /* JADX WARN: Code duplicated, block: B:396:0x092e  */
    /* JADX WARN: Code duplicated, block: B:398:0x0934  */
    /* JADX WARN: Code duplicated, block: B:404:0x0942 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:407:0x0948  */
    /* JADX WARN: Code duplicated, block: B:410:0x0968  */
    /* JADX WARN: Code duplicated, block: B:411:0x096b  */
    /* JADX WARN: Code duplicated, block: B:414:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:416:0x09b7  */
    /* JADX WARN: Code duplicated, block: B:422:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:424:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:427:0x0a3e  */
    /* JADX WARN: Code duplicated, block: B:434:0x0a5d  */
    /* JADX WARN: Code duplicated, block: B:436:0x0a61  */
    /* JADX INFO: renamed from: f */
    public static final void m21265f(C6045C c6045c, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C3582M c3582m, C2385o c2385o, InterfaceC1436k interfaceC1436k2, InterfaceC17406l interfaceC17406l, AbstractC14360p abstractC14360p, boolean z6, int i10, int i11, C6065n c6065n, C20746e0 c20746e0, boolean z10, boolean z11, InterfaceC1440o interfaceC1440o, C6021p c6021p, int i12, int i13) {
        int i14;
        int i15;
        Object obj;
        C17689w c17689w;
        C6021p c6021p2;
        InterfaceC5598n interfaceC5598n;
        int i16;
        InterfaceC7537b interfaceC7537b;
        C20750g0 c20750g0;
        C6049G c6049g;
        C15026j c15026j;
        C3581L c3581l;
        C3590f c3590f;
        boolean zM18089b;
        C20750g0 c20750g1;
        long j10;
        boolean z12;
        boolean z13;
        long j11;
        C6045C c6045cM6612a;
        C6045C c6045c2;
        Object objM6514H;
        C20724N0 c20724n0;
        long jCurrentTimeMillis;
        Object objM6514H2;
        Object obj2;
        C1837w0 c1837w0;
        InterfaceC6073v interfaceC6073v;
        Object objM6514H3;
        Object objM529r;
        C2925c c2925c;
        Object objM6514H4;
        Object obj3;
        C19715c c19715c;
        InterfaceC10459q interfaceC10459qM10921b;
        int i17;
        boolean z14;
        int i18;
        boolean z15;
        int i19;
        boolean z16;
        int i20;
        C20724N0 c20724n1;
        boolean z17;
        boolean zM6545h;
        Object objM6514H5;
        C19715c c19715c2;
        InterfaceC6073v interfaceC6073v2;
        C13522n c13522n;
        C6046D c6046d;
        C20750g0 c20750g2;
        boolean z18;
        InterfaceC5985X interfaceC5985XM6435V;
        C20750g0 c20750g3;
        C6046D c6046d2;
        boolean zM6542f;
        Object objM6514H6;
        C6046D c6046d3;
        boolean zM6545h2;
        int i21;
        Object obj4;
        InterfaceC10459q interfaceC10459qM20694b;
        int i22;
        int i23;
        InterfaceC6073v interfaceC6073v3;
        boolean z19;
        Object objM6514H7;
        InterfaceC6073v interfaceC6073v4;
        InterfaceC1436k interfaceC1436k3;
        C0280q c0280q;
        int i24;
        InterfaceC10459q interfaceC10459qM10921b2;
        boolean z20;
        InterfaceC6073v interfaceC6073v5;
        boolean zM6545h3;
        Object obj5;
        boolean z21;
        boolean z22;
        boolean zM6545h4;
        Object objM6514H8;
        InterfaceC0182K1 interfaceC0182K1;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean zM6545h5;
        Object objM6514H9;
        int i25;
        C5975S c5975s;
        boolean z26;
        C0280q c0280q2;
        InterfaceC10459q interfaceC10459qM10921b3;
        boolean zM6545h6;
        Object obj6;
        C6046D c6046d4;
        boolean z27;
        boolean z28;
        Object objM6514H10;
        boolean z29;
        boolean z30;
        C0280q c0280q3;
        boolean zM6545h7;
        Object objM6514H11;
        Long l4;
        c6021p.m6526U(-958708118);
        if ((i12 & 6) == 0) {
            i14 = (c6021p.m6542f(c6045c) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= c6021p.m6542f(c3582m) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= c6021p.m6542f(c2385o) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i14 |= c6021p.m6545h(interfaceC1436k2) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= c6021p.m6542f(interfaceC17406l) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= c6021p.m6542f(abstractC14360p) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i14 |= c6021p.m6544g(z6) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i14 |= c6021p.m6538d(i10) ? 536870912 : 268435456;
        }
        if ((i13 & 6) == 0) {
            i15 = i13 | (c6021p.m6538d(i11) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c6021p.m6542f(c6065n) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c6021p.m6542f(c20746e0) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c6021p.m6544g(z10) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c6021p.m6544g(z11) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i15 |= c6021p.m6545h(interfaceC1440o) ? 131072 : 65536;
        }
        int i26 = i15;
        if ((i14 & 306783379) == 306783378 && (74899 & i26) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6519N();
            if ((i12 & 1) != 0 && !c6021p.m6561x()) {
                c6021p.m6517L();
            }
            c6021p.m6554q();
            Object objM6514H12 = c6021p.m6514H();
            C5975S c5975s2 = C6013l.f19514a;
            Object obj7 = objM6514H12;
            if (objM6514H12 == c5975s2) {
                C13522n c13522n2 = new C13522n();
                c6021p.m6537c0(c13522n2);
                obj7 = c13522n2;
            }
            C13522n c13522n3 = (C13522n) obj7;
            Object objM6514H13 = c6021p.m6514H();
            Object obj8 = objM6514H13;
            if (objM6514H13 == c5975s2) {
                C21589L c21589l = AbstractC21590M.f68371a;
                C21611e c21611e = new C21611e();
                c6021p.m6537c0(c21611e);
                obj8 = c21611e;
            }
            C21611e c21611e2 = (C21611e) obj8;
            Object objM6514H14 = c6021p.m6514H();
            Object obj9 = objM6514H14;
            if (objM6514H14 == c5975s2) {
                C6046D c6046d5 = new C6046D(c21611e2);
                c6021p.m6537c0(c6046d5);
                obj9 = c6046d5;
            }
            C6046D c6046d6 = (C6046D) obj9;
            InterfaceC7537b interfaceC7537b2 = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            InterfaceC5598n interfaceC5598n2 = (InterfaceC5598n) c6021p.m6548k(AbstractC0187M0.f707i);
            long j12 = ((C1768C0) c6021p.m6548k(AbstractC1770D0.f5051a)).f5046b;
            InterfaceC13515g interfaceC13515g = (InterfaceC13515g) c6021p.m6548k(AbstractC0187M0.f705g);
            InterfaceC0182K1 interfaceC0182K2 = (InterfaceC0182K1) c6021p.m6548k(AbstractC0187M0.f716r);
            InterfaceC0300w1 interfaceC0300w1 = (InterfaceC0300w1) c6021p.m6548k(AbstractC0187M0.f712n);
            EnumC16673F0 enumC16673F0 = (i10 == 1 && !z6 && c6065n.f19756a) ? EnumC16673F0.f53402Z : EnumC16673F0.f53401Y;
            Object[] objArr = {enumC16673F0};
            C21585H c21585h = C20706E0.f65618f;
            boolean zM6542f2 = c6021p.m6542f(enumC16673F0);
            Object objM6514H15 = c6021p.m6514H();
            if (zM6542f2 || objM6514H15 == c5975s2) {
                C17176b c17176b = new C17176b(enumC16673F0, 29);
                c6021p.m6537c0(c17176b);
                obj = c17176b;
            } else {
                obj = objM6514H15;
            }
            C20706E0 c20706e0 = (C20706E0) AbstractC9834X3.m10481d(objArr, c21585h, null, (InterfaceC1426a) obj, c6021p, 0, 4);
            int i27 = i14 & 14;
            boolean z31 = (i27 == 4) | ((i14 & 57344) == 16384);
            Object objM6514H16 = c6021p.m6514H();
            if (z31 || objM6514H16 == c5975s2) {
                C6050H c6050hM21277r = m21277r(c2385o, c6045c.f19682a);
                C3581L c3581l2 = c6045c.f19684c;
                if (c3581l2 != null) {
                    InterfaceC6073v interfaceC6073v6 = c6050hM21277r.f19709b;
                    int i28 = C3581L.f10907c;
                    long j13 = c3581l2.f10908a;
                    int iMo1766b = interfaceC6073v6.mo1766b((int) (j13 >> 32));
                    int iMo1766b2 = interfaceC6073v6.mo1766b((int) (j13 & 4294967295L));
                    int iMin = Math.min(iMo1766b, iMo1766b2);
                    int iMax = Math.max(iMo1766b, iMo1766b2);
                    C3587c c3587c = new C3587c(c6050hM21277r.f19708a);
                    c3587c.m4289a(new C3573D(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, C7200j.f22864c, null, 61439), iMin, iMax);
                    objM6514H16 = new C6050H(c3587c.m4297i(), interfaceC6073v6);
                } else {
                    objM6514H16 = c6050hM21277r;
                }
                c6021p.m6537c0(objM6514H16);
            } else {
                i27 = i27;
                c20706e0 = c20706e0;
            }
            C6050H c6050h = (C6050H) objM6514H16;
            C3590f c3590f2 = c6050h.f19708a;
            C6018n0 c6018n0M6560w = c6021p.m6560w();
            if (c6018n0M6560w == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            c6018n0M6560w.f19533a |= 1;
            boolean zM6542f3 = c6021p.m6542f(interfaceC0300w1);
            Object objM6514H17 = c6021p.m6514H();
            C17689w c17689w2 = C17689w.f56480Y;
            if (zM6542f3 || objM6514H17 == c5975s2) {
                c17689w = c17689w2;
                C20750g0 c20750g4 = new C20750g0(new C20770q0(c3590f2, c3582m, Integer.MAX_VALUE, 1, z6, 1, interfaceC7537b2, interfaceC5598n2, c17689w), c6018n0M6560w, interfaceC0300w1);
                c6021p2 = c6021p;
                c6021p2.m6537c0(c20750g4);
                objM6514H17 = c20750g4;
            } else {
                c6021p2 = c6021p;
                c17689w = c17689w2;
            }
            C20750g0 c20750g5 = (C20750g0) objM6514H17;
            C3590f c3590f3 = c6045c.f19682a;
            c20750g5.f65828s = interfaceC1436k;
            c20750g5.f65832w = j12;
            C20742c0 c20742c0 = c20750g5.f65827r;
            c20742c0.f65753b = c20746e0;
            c20742c0.f65754c = interfaceC13515g;
            c20750g5.f65819j = c3590f3;
            C20770q0 c20770q0 = c20750g5.f65810a;
            if (AbstractC16544l.m18089b(c20770q0.f65943a, c3590f2) && AbstractC16544l.m18089b(c20770q0.f65944b, c3582m) && c20770q0.f65947e == z6 && AbstractC9160K3.m9708a(c20770q0.f65948f, 1) && c20770q0.f65945c == Integer.MAX_VALUE) {
                i16 = 1;
                if (c20770q0.f65946d != 1) {
                    interfaceC5598n = interfaceC5598n2;
                } else {
                    if (AbstractC16544l.m18089b(c20770q0.f65949g, interfaceC7537b2)) {
                        C17689w c17689w3 = c17689w;
                        if (AbstractC16544l.m18089b(c20770q0.f65951i, c17689w3)) {
                            c17689w = c17689w3;
                            interfaceC5598n = interfaceC5598n2;
                            if (c20770q0.f65950h == interfaceC5598n) {
                                interfaceC7537b2 = interfaceC7537b2;
                                interfaceC7537b = interfaceC7537b2;
                                c20750g0 = c20750g5;
                            }
                        } else {
                            interfaceC7537b2 = interfaceC7537b2;
                            c17689w = c17689w3;
                        }
                    } else {
                        interfaceC7537b2 = interfaceC7537b2;
                    }
                    interfaceC5598n = interfaceC5598n2;
                }
                if (c20750g0.f65810a != c20770q0) {
                    c20750g0.f65825p = true;
                }
                c20750g0.f65810a = c20770q0;
                c6049g = c20750g0.f65814e;
                c15026j = c20750g0.f65813d;
                c15026j.getClass();
                C3581L c3581lM6632f = ((C6061j) c15026j.f46725Z).m6632f();
                c3581l = c6045c.f19684c;
                boolean zM18089b2 = AbstractC16544l.m18089b(c3581l, c3581lM6632f);
                C3590f c3590f4 = ((C6045C) c15026j.f46724Y).f19682a;
                c3590f = c6045c.f19682a;
                zM18089b = AbstractC16544l.m18089b(c3590f4, c3590f);
                c20750g1 = c20750g0;
                j10 = c6045c.f19683b;
                if (zM18089b) {
                    if (C3581L.m4266b(((C6045C) c15026j.f46724Y).f19683b, j10)) {
                        z12 = false;
                    } else {
                        ((C6061j) c15026j.f46725Z).m6635i(C3581L.m4270f(j10), C3581L.m4269e(j10));
                        z12 = false;
                        z13 = true;
                    }
                    if (c3581l == null) {
                        C6061j c6061j = (C6061j) c15026j.f46725Z;
                        c6061j.f19746p0 = -1;
                        c6061j.f19747q0 = -1;
                    } else {
                        j11 = c3581l.f10908a;
                        if (!C3581L.m4267c(j11)) {
                            ((C6061j) c15026j.f46725Z).m6634h(C3581L.m4270f(j11), C3581L.m4269e(j11));
                        }
                    }
                    if (z12 && (z13 || zM18089b2)) {
                        c6045cM6612a = c6045c;
                    } else {
                        C6061j c6061j2 = (C6061j) c15026j.f46725Z;
                        c6061j2.f19746p0 = -1;
                        c6061j2.f19747q0 = -1;
                        c6045cM6612a = C6045C.m6612a(c6045c, null, 0L, 3);
                    }
                    c6045c2 = (C6045C) c15026j.f46724Y;
                    c15026j.f46724Y = c6045cM6612a;
                    if (c6049g != null) {
                        c6049g.m6623a(c6045c2, c6045cM6612a);
                    }
                    objM6514H = c6021p.m6514H();
                    if (objM6514H == c5975s2) {
                        objM6514H = new C20724N0();
                        c6021p2.m6537c0(objM6514H);
                    }
                    c20724n0 = (C20724N0) objM6514H;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (c20724n0.f65710f) {
                        c20724n0.f65709e = Long.valueOf(jCurrentTimeMillis);
                        c20724n0.m21222a(c6045c);
                    } else {
                        l4 = c20724n0.f65709e;
                        if (jCurrentTimeMillis > (l4 != null ? l4.longValue() : 0L) + ((long) 5000)) {
                            c20724n0.f65709e = Long.valueOf(jCurrentTimeMillis);
                            c20724n0.m21222a(c6045c);
                        }
                    }
                    objM6514H2 = c6021p.m6514H();
                    obj2 = objM6514H2;
                    if (objM6514H2 == c5975s2) {
                        C1837w0 c1837w1 = new C1837w0(c20724n0);
                        c6021p2.m6537c0(c1837w1);
                        obj2 = c1837w1;
                    }
                    c1837w0 = (C1837w0) obj2;
                    interfaceC6073v = c6050h.f19709b;
                    c1837w0.f5306b = interfaceC6073v;
                    c1837w0.f5307c = c20750g1.f65829t;
                    c1837w0.f5308d = c20750g1;
                    c1837w0.f5309e.setValue(c6045c);
                    c1837w0.f5310f = (InterfaceC0172H0) c6021p2.m6548k(AbstractC0187M0.f702d);
                    c1837w0.f5311g = (InterfaceC0303x1) c6021p2.m6548k(AbstractC0187M0.f713o);
                    c1837w0.f5312h = (InterfaceC18285a) c6021p2.m6548k(AbstractC0187M0.f708j);
                    c1837w0.f5313i = c13522n3;
                    boolean z32 = !z11;
                    c1837w0.f5314j.setValue(Boolean.valueOf(z32));
                    c1837w0.f5315k.setValue(Boolean.valueOf(z10));
                    objM6514H3 = c6021p.m6514H();
                    objM529r = objM6514H3;
                    if (objM6514H3 == c5975s2) {
                        objM529r = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p2);
                    }
                    c2925c = ((C6035w) objM529r).f19668Y;
                    objM6514H4 = c6021p.m6514H();
                    obj3 = objM6514H4;
                    if (objM6514H4 == c5975s2) {
                        C19715c c19715c3 = new C19715c();
                        c6021p2.m6537c0(c19715c3);
                        obj3 = c19715c3;
                    }
                    c19715c = (C19715c) obj3;
                    interfaceC10459qM10921b = C10456n.f30959Y;
                    boolean zM6545h8 = c6021p2.m6545h(c20750g1);
                    i17 = i26 & 7168;
                    if (i17 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z33 = zM6545h8 | z14;
                    i18 = i26 & 57344;
                    if (i18 == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zM6545h9 = z15 | z33 | c6021p2.m6545h(c6046d6);
                    i19 = i27;
                    if (i19 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z34 = zM6545h9 | z16;
                    i20 = (i26 & 112) ^ 48;
                    if (i20 > 32 || !c6021p2.m6542f(c6065n)) {
                        c20724n1 = c20724n0;
                        if ((i26 & 48) != 32) {
                            z17 = false;
                        }
                        zM6545h = z34 | z17 | c6021p2.m6545h(interfaceC6073v) | c6021p2.m6545h(c2925c) | c6021p2.m6545h(c19715c) | c6021p2.m6545h(c1837w0);
                        objM6514H5 = c6021p.m6514H();
                        if (!zM6545h || objM6514H5 == c5975s2) {
                            c19715c2 = c19715c;
                            interfaceC6073v2 = interfaceC6073v;
                            c13522n = c13522n3;
                            c6046d = c6046d6;
                            c20750g2 = c20750g1;
                            C20713I c20713i = new C20713I(c20750g1, z10, z11, c6046d6, c6045c, c6065n, interfaceC6073v2, c1837w0, c2925c, c19715c2);
                            c6021p2.m6537c0(c20713i);
                            objM6514H5 = c20713i;
                        } else {
                            c19715c2 = c19715c;
                            c20750g2 = c20750g1;
                            interfaceC6073v2 = interfaceC6073v;
                            c6046d = c6046d6;
                            c13522n = c13522n3;
                        }
                        InterfaceC10459q interfaceC10459qM11213a = AbstractC10838f.m11213a(AbstractC10862a.m11300b(AbstractC10862a.m11299a(interfaceC10459qM10921b, c13522n), (InterfaceC1436k) objM6514H5), z10, interfaceC17406l);
                        if (z10 || z11) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        interfaceC5985XM6435V = C5997d.m6435V(Boolean.valueOf(z18), c6021p2);
                        C17296C c17296c = C17296C.f55119a;
                        c20750g3 = c20750g2;
                        c6046d2 = c6046d;
                        zM6542f = c6021p2.m6542f(interfaceC5985XM6435V) | c6021p2.m6545h(c20750g3) | c6021p2.m6545h(c6046d2) | c6021p2.m6545h(c1837w0) | ((i20 <= 32 && c6021p2.m6542f(c6065n)) || (r12 & 48) == 32);
                        objM6514H6 = c6021p.m6514H();
                        if (!zM6542f || objM6514H6 == c5975s2) {
                            c6046d3 = c6046d2;
                            C20785y c20785y = new C20785y(c20750g3, interfaceC5985XM6435V, c6046d3, c1837w0, c6065n, null);
                            c6021p2.m6537c0(c20785y);
                            objM6514H6 = c20785y;
                        } else {
                            c6046d3 = c6046d2;
                        }
                        C5997d.m6450f((InterfaceC1439n) objM6514H6, c6021p2, c17296c);
                        zM6545h2 = c6021p2.m6545h(c20750g3);
                        Object objM6514H18 = c6021p.m6514H();
                        if (!zM6545h2 || objM6514H18 == r3) {
                            i21 = 1;
                            C20709G c20709g = new C20709G(c20750g3, i21);
                            c6021p2.m6537c0(c20709g);
                            obj4 = c20709g;
                        } else {
                            i21 = 1;
                            obj4 = objM6514H18;
                        }
                        interfaceC10459qM20694b = AbstractC19744u.m20694b(interfaceC10459qM10921b, 8675309, new C1781O((InterfaceC1436k) obj4, null));
                        boolean zM6545h10 = c6021p2.m6545h(c20750g3);
                        if (i18 == 16384) {
                            i22 = i21;
                        } else {
                            i22 = 0;
                        }
                        int i29 = (zM6545h10 ? 1 : 0) | i22;
                        if (i17 == 2048) {
                            i23 = i21;
                        } else {
                            i23 = 0;
                        }
                        interfaceC6073v3 = interfaceC6073v2;
                        z19 = (((i29 | i23) | (c6021p2.m6545h(interfaceC6073v3) ? 1 : 0)) == true ? 1 : 0) | (c6021p2.m6545h(r6) ? 1 : 0);
                        objM6514H7 = c6021p.m6514H();
                        if (z19 == 0 || objM6514H7 == r3) {
                            interfaceC6073v4 = interfaceC6073v3;
                            C20715J c20715j = new C20715J(c20750g3, c13522n, z11, z10, r6, interfaceC6073v4);
                            c6021p2.m6537c0(c20715j);
                            objM6514H7 = c20715j;
                        } else {
                            interfaceC6073v4 = interfaceC6073v3;
                        }
                        interfaceC1436k3 = (InterfaceC1436k) objM6514H7;
                        c0280q = C0280q.f1030t0;
                        if (z10) {
                            i24 = 14;
                            interfaceC10459qM10921b2 = AbstractC10443a.m10921b(interfaceC10459qM20694b, c0280q, new C14127l(interfaceC1436k3, i24, interfaceC17406l));
                        } else {
                            i24 = 14;
                            interfaceC10459qM10921b2 = interfaceC10459qM20694b;
                        }
                        C7296c c7296c = c1837w0.f5325u;
                        C1833u0 c1833u0 = c1837w0.f5324t;
                        InterfaceC10459q interfaceC10459qM20686h = AbstractC19736m.m20686h(interfaceC10459qM10921b2.mo428M(new SuspendPointerInputElement(c7296c, c1833u0, new C1773G(c7296c, c1833u0, null), 4)), f65747b);
                        boolean zM6545h11 = c6021p2.m6545h(c20750g3);
                        if (i19 == 4) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        interfaceC6073v5 = interfaceC6073v4;
                        zM6545h3 = zM6545h11 | z20 | c6021p2.m6545h(interfaceC6073v5);
                        Object objM6514H19 = c6021p.m6514H();
                        if (!zM6545h3 || objM6514H19 == r3) {
                            C16663C c16663c = new C16663C(c20750g3, c6045c, interfaceC6073v5, i24);
                            c6021p2.m6537c0(c16663c);
                            obj5 = c16663c;
                        } else {
                            obj5 = objM6514H19;
                        }
                        InterfaceC10459q interfaceC10459qM11295a = AbstractC10861a.m11295a(interfaceC10459qM10921b, (InterfaceC1436k) obj5);
                        boolean zM6545h12 = c6021p2.m6545h(c20750g3);
                        if (i17 == 2048) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        boolean zM6542f4 = zM6545h12 | z21 | c6021p2.m6542f(r35) | c6021p2.m6545h(c1837w0);
                        if (i19 == 4) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        zM6545h4 = zM6542f4 | z22 | c6021p2.m6545h(interfaceC6073v5);
                        objM6514H8 = c6021p.m6514H();
                        if (!zM6545h4 || objM6514H8 == r3) {
                            interfaceC0182K1 = r35;
                            C4018a0 c4018a0 = new C4018a0(c20750g3, z10, interfaceC0182K1, c1837w0, c6045c, interfaceC6073v5, 1);
                            c6021p2.m6537c0(c4018a0);
                            objM6514H8 = c4018a0;
                        } else {
                            interfaceC0182K1 = interfaceC0182K2;
                        }
                        InterfaceC10459q interfaceC10459qM11318d = AbstractC10868a.m11318d(interfaceC10459qM10921b, (InterfaceC1436k) objM6514H8);
                        boolean zM6545h13 = c6021p2.m6545h(c6050h);
                        if (r4 == 4) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        boolean z35 = zM6545h13 | z23;
                        if (i17 == 2048) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolean zM6544g = z35 | z24 | c6021p2.m6544g(false);
                        if (i18 == 16384) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        zM6545h5 = zM6544g | z25 | c6021p2.m6545h(c20750g3) | c6021p2.m6545h(interfaceC6073v5) | c6021p2.m6545h(r6) | ((i20 <= 32 && c6021p2.m6542f(c6065n)) || (r12 & 48) == 32);
                        objM6514H9 = c6021p.m6514H();
                        if (!zM6545h5 || objM6514H9 == c5975s2) {
                            i25 = i20;
                            c5975s = c5975s2;
                            C20717K c20717k = new C20717K(c6050h, c6045c, z10, z11, c6065n, c20750g3, interfaceC6073v5, r6, c13522n);
                            c6021p2.m6537c0(c20717k);
                            objM6514H9 = c20717k;
                        } else {
                            i25 = i20;
                            c5975s = c5975s2;
                        }
                        InterfaceC10459q interfaceC10459qM3789a = AbstractC2965l.m3789a(interfaceC10459qM10921b, true, (InterfaceC1436k) objM6514H9);
                        if (!z10 && !z11 && ((C0185L1) interfaceC0182K1).m565a() && C3581L.m4267c(((C3581L) c20750g3.f65833x.getValue()).f10908a) && C3581L.m4267c(((C3581L) c20750g3.f65834y.getValue()).f10908a)) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        float f10 = AbstractC20776t0.f65981a;
                        if (z26) {
                            C2497c c2497c = new C2497c(abstractC14360p, c20750g3, c6045c, interfaceC6073v5, 14);
                            c0280q2 = c0280q;
                            interfaceC10459qM10921b3 = AbstractC10443a.m10921b(interfaceC10459qM10921b, c0280q2, c2497c);
                        } else {
                            c0280q2 = c0280q;
                            interfaceC10459qM10921b3 = interfaceC10459qM10921b;
                        }
                        zM6545h6 = c6021p2.m6545h(r6);
                        Object objM6514H20 = c6021p.m6514H();
                        obj6 = objM6514H20;
                        if (zM6545h6 || objM6514H20 == c5975s) {
                            C20787z c20787z = new C20787z(r6, 0);
                            c6021p2.m6537c0(c20787z);
                            obj6 = c20787z;
                        }
                        C5997d.m6444c(r6, (InterfaceC1436k) obj6, c6021p2);
                        c6046d4 = c6046d3;
                        boolean zM6545h14 = c6021p2.m6545h(c20750g3) | c6021p2.m6545h(c6046d4);
                        if (i19 == 4) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        int i30 = i25;
                        z28 = zM6545h14 | z27 | ((i30 <= 32 && c6021p2.m6542f(c6065n)) || (r12 & 48) == 32);
                        objM6514H10 = c6021p.m6514H();
                        if (z28 || objM6514H10 == c5975s) {
                            C20699B c20699b = new C20699B(c20750g3, c6046d4, c6045c, c6065n, 0);
                            c6021p2.m6537c0(c20699b);
                            objM6514H10 = c20699b;
                        }
                        C5997d.m6444c(c6065n, (InterfaceC1436k) objM6514H10, c6021p2);
                        if (i10 == 1) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z30 = true;
                        C5975S c5975s3 = c5975s;
                        c0280q3 = c0280q2;
                        InterfaceC10459q interfaceC10459qM10921b4 = AbstractC10443a.m10921b(interfaceC10459qM10921b, c0280q3, new C20782w0(c20750g3, r6, c6045c, z32, z29, interfaceC6073v5, c20724n1, c20750g3.f65829t, c6065n.f19760e));
                        boolean zBooleanValue = ((Boolean) interfaceC5985XM6435V.getValue()).booleanValue();
                        zM6545h7 = c6021p2.m6545h(c20750g3) | ((i30 <= 32 && c6021p2.m6542f(c6065n)) || (i26 & 48) == 32) | c6021p2.m6545h(c21611e2);
                        objM6514H11 = c6021p.m6514H();
                        if (zM6545h7 || objM6514H11 == c5975s3) {
                            C0494y c0494y = new C0494y(c20750g3, c13522n, c6065n, c21611e2, 18);
                            c6021p2.m6537c0(c0494y);
                            objM6514H11 = c0494y;
                        }
                        InterfaceC10459q interfaceC10459qMo428M = AbstractC10865a.m11312b(AbstractC10865a.m11312b(AbstractC10855a.m11277a(interfaceC10459q, c21611e2, c20750g3, c1837w0).mo428M(AbstractC10854a.m11276a(zBooleanValue, (InterfaceC1426a) objM6514H11)).mo428M(interfaceC10459qM11213a), new C18194a(interfaceC13515g, 28, c20750g3)), new C18194a(c20750g3, 26, c1837w0)).mo428M(interfaceC10459qM10921b4);
                        C20706E0 c20706e1 = c20706e0;
                        InterfaceC10459q interfaceC10459qM11318d2 = AbstractC10868a.m11318d(AbstractC10443a.m10921b(interfaceC10459qMo428M, c0280q3, new C16878e0(c20706e1, z10, interfaceC17406l)).mo428M(interfaceC10459qM20686h).mo428M(interfaceC10459qM3789a), new C20709G(c20750g3, 0));
                        if (z10 || !c20750g3.m21292b() || !((Boolean) c20750g3.f65826q.getValue()).booleanValue() || !((C0185L1) interfaceC0182K1).m565a()) {
                            z30 = false;
                        }
                        if (z30 && AbstractC14282f0.m15571a()) {
                            interfaceC10459qM10921b = AbstractC10443a.m10921b(interfaceC10459qM10921b, c0280q3, new C0468O(c1837w0, 4));
                        }
                        m21266g(interfaceC10459qM11318d2, c1837w0, AbstractC8411c.m8969c(-374338080, c6021p, new C20705E(interfaceC1440o, c20750g3, c3582m, i11, i10, c20706e1, c6045c, c2385o, interfaceC10459qM10921b3, interfaceC10459qM11295a, interfaceC10459qM11318d, interfaceC10459qM10921b, c19715c2, c1837w0, z30, z11, interfaceC1436k2, interfaceC6073v5, interfaceC7537b)), c6021p, 384);
                    } else {
                        c20724n1 = c20724n0;
                    }
                    z17 = true;
                    zM6545h = z34 | z17 | c6021p2.m6545h(interfaceC6073v) | c6021p2.m6545h(c2925c) | c6021p2.m6545h(c19715c) | c6021p2.m6545h(c1837w0);
                    objM6514H5 = c6021p.m6514H();
                    if (zM6545h) {
                        c19715c2 = c19715c;
                        interfaceC6073v2 = interfaceC6073v;
                        c13522n = c13522n3;
                        c6046d = c6046d6;
                        c20750g2 = c20750g1;
                        C20713I c20713i2 = new C20713I(c20750g1, z10, z11, c6046d6, c6045c, c6065n, interfaceC6073v2, c1837w0, c2925c, c19715c2);
                        c6021p2.m6537c0(c20713i2);
                        objM6514H5 = c20713i2;
                    } else {
                        c19715c2 = c19715c;
                        interfaceC6073v2 = interfaceC6073v;
                        c13522n = c13522n3;
                        c6046d = c6046d6;
                        c20750g2 = c20750g1;
                        C20713I c20713i3 = new C20713I(c20750g1, z10, z11, c6046d6, c6045c, c6065n, interfaceC6073v2, c1837w0, c2925c, c19715c2);
                        c6021p2.m6537c0(c20713i3);
                        objM6514H5 = c20713i3;
                    }
                    InterfaceC10459q interfaceC10459qM11213a2 = AbstractC10838f.m11213a(AbstractC10862a.m11300b(AbstractC10862a.m11299a(interfaceC10459qM10921b, c13522n), (InterfaceC1436k) objM6514H5), z10, interfaceC17406l);
                    if (z10) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    interfaceC5985XM6435V = C5997d.m6435V(Boolean.valueOf(z18), c6021p2);
                    C17296C c17296c2 = C17296C.f55119a;
                    c20750g3 = c20750g2;
                    c6046d2 = c6046d;
                    zM6542f = c6021p2.m6542f(interfaceC5985XM6435V) | c6021p2.m6545h(c20750g3) | c6021p2.m6545h(c6046d2) | c6021p2.m6545h(c1837w0) | ((i20 <= 32 && c6021p2.m6542f(c6065n)) || (r12 & 48) == 32);
                    objM6514H6 = c6021p.m6514H();
                    if (zM6542f) {
                        c6046d3 = c6046d2;
                        C20785y c20785y2 = new C20785y(c20750g3, interfaceC5985XM6435V, c6046d3, c1837w0, c6065n, null);
                        c6021p2.m6537c0(c20785y2);
                        objM6514H6 = c20785y2;
                    } else {
                        c6046d3 = c6046d2;
                        C20785y c20785y3 = new C20785y(c20750g3, interfaceC5985XM6435V, c6046d3, c1837w0, c6065n, null);
                        c6021p2.m6537c0(c20785y3);
                        objM6514H6 = c20785y3;
                    }
                    C5997d.m6450f((InterfaceC1439n) objM6514H6, c6021p2, c17296c2);
                    zM6545h2 = c6021p2.m6545h(c20750g3);
                    Object objM6514H110 = c6021p.m6514H();
                    if (zM6545h2) {
                        i21 = 1;
                        C20709G c20709g2 = new C20709G(c20750g3, i21);
                        c6021p2.m6537c0(c20709g2);
                        obj4 = c20709g2;
                    } else {
                        i21 = 1;
                        C20709G c20709g3 = new C20709G(c20750g3, i21);
                        c6021p2.m6537c0(c20709g3);
                        obj4 = c20709g3;
                    }
                    interfaceC10459qM20694b = AbstractC19744u.m20694b(interfaceC10459qM10921b, 8675309, new C1781O((InterfaceC1436k) obj4, null));
                    boolean zM6545h15 = c6021p2.m6545h(c20750g3);
                    if (i18 == 16384) {
                        i22 = i21;
                    } else {
                        i22 = 0;
                    }
                    int i210 = (zM6545h15 ? 1 : 0) | i22;
                    if (i17 == 2048) {
                        i23 = i21;
                    } else {
                        i23 = 0;
                    }
                    interfaceC6073v3 = interfaceC6073v2;
                    z19 = (((i210 | i23) | (c6021p2.m6545h(interfaceC6073v3) ? 1 : 0)) == true ? 1 : 0) | (c6021p2.m6545h(r6) ? 1 : 0);
                    objM6514H7 = c6021p.m6514H();
                    if (z19 == 0) {
                        interfaceC6073v4 = interfaceC6073v3;
                        C20715J c20715j2 = new C20715J(c20750g3, c13522n, z11, z10, r6, interfaceC6073v4);
                        c6021p2.m6537c0(c20715j2);
                        objM6514H7 = c20715j2;
                    } else {
                        interfaceC6073v4 = interfaceC6073v3;
                        C20715J c20715j3 = new C20715J(c20750g3, c13522n, z11, z10, r6, interfaceC6073v4);
                        c6021p2.m6537c0(c20715j3);
                        objM6514H7 = c20715j3;
                    }
                    interfaceC1436k3 = (InterfaceC1436k) objM6514H7;
                    c0280q = C0280q.f1030t0;
                    if (z10) {
                        i24 = 14;
                        interfaceC10459qM10921b2 = AbstractC10443a.m10921b(interfaceC10459qM20694b, c0280q, new C14127l(interfaceC1436k3, i24, interfaceC17406l));
                    } else {
                        i24 = 14;
                        interfaceC10459qM10921b2 = interfaceC10459qM20694b;
                    }
                    C7296c c7296c2 = c1837w0.f5325u;
                    C1833u0 c1833u1 = c1837w0.f5324t;
                    InterfaceC10459q interfaceC10459qM20686h2 = AbstractC19736m.m20686h(interfaceC10459qM10921b2.mo428M(new SuspendPointerInputElement(c7296c2, c1833u1, new C1773G(c7296c2, c1833u1, null), 4)), f65747b);
                    boolean zM6545h16 = c6021p2.m6545h(c20750g3);
                    if (i19 == 4) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    interfaceC6073v5 = interfaceC6073v4;
                    zM6545h3 = zM6545h16 | z20 | c6021p2.m6545h(interfaceC6073v5);
                    Object objM6514H111 = c6021p.m6514H();
                    if (zM6545h3) {
                        C16663C c16663c2 = new C16663C(c20750g3, c6045c, interfaceC6073v5, i24);
                        c6021p2.m6537c0(c16663c2);
                        obj5 = c16663c2;
                    } else {
                        C16663C c16663c3 = new C16663C(c20750g3, c6045c, interfaceC6073v5, i24);
                        c6021p2.m6537c0(c16663c3);
                        obj5 = c16663c3;
                    }
                    InterfaceC10459q interfaceC10459qM11295a2 = AbstractC10861a.m11295a(interfaceC10459qM10921b, (InterfaceC1436k) obj5);
                    boolean zM6545h17 = c6021p2.m6545h(c20750g3);
                    if (i17 == 2048) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    boolean zM6542f5 = zM6545h17 | z21 | c6021p2.m6542f(r35) | c6021p2.m6545h(c1837w0);
                    if (i19 == 4) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    zM6545h4 = zM6542f5 | z22 | c6021p2.m6545h(interfaceC6073v5);
                    objM6514H8 = c6021p.m6514H();
                    if (zM6545h4) {
                        interfaceC0182K1 = r35;
                        C4018a0 c4018a1 = new C4018a0(c20750g3, z10, interfaceC0182K1, c1837w0, c6045c, interfaceC6073v5, 1);
                        c6021p2.m6537c0(c4018a1);
                        objM6514H8 = c4018a1;
                    } else {
                        interfaceC0182K1 = r35;
                        C4018a0 c4018a2 = new C4018a0(c20750g3, z10, interfaceC0182K1, c1837w0, c6045c, interfaceC6073v5, 1);
                        c6021p2.m6537c0(c4018a2);
                        objM6514H8 = c4018a2;
                    }
                    InterfaceC10459q interfaceC10459qM11318d3 = AbstractC10868a.m11318d(interfaceC10459qM10921b, (InterfaceC1436k) objM6514H8);
                    boolean zM6545h18 = c6021p2.m6545h(c6050h);
                    if (r4 == 4) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    boolean z36 = zM6545h18 | z23;
                    if (i17 == 2048) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean zM6544g2 = z36 | z24 | c6021p2.m6544g(false);
                    if (i18 == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM6545h5 = zM6544g2 | z25 | c6021p2.m6545h(c20750g3) | c6021p2.m6545h(interfaceC6073v5) | c6021p2.m6545h(r6) | ((i20 <= 32 && c6021p2.m6542f(c6065n)) || (r12 & 48) == 32);
                    objM6514H9 = c6021p.m6514H();
                    if (zM6545h5) {
                        i25 = i20;
                        c5975s = c5975s2;
                        C20717K c20717k2 = new C20717K(c6050h, c6045c, z10, z11, c6065n, c20750g3, interfaceC6073v5, r6, c13522n);
                        c6021p2.m6537c0(c20717k2);
                        objM6514H9 = c20717k2;
                    } else {
                        i25 = i20;
                        c5975s = c5975s2;
                        C20717K c20717k3 = new C20717K(c6050h, c6045c, z10, z11, c6065n, c20750g3, interfaceC6073v5, r6, c13522n);
                        c6021p2.m6537c0(c20717k3);
                        objM6514H9 = c20717k3;
                    }
                    InterfaceC10459q interfaceC10459qM3789a2 = AbstractC2965l.m3789a(interfaceC10459qM10921b, true, (InterfaceC1436k) objM6514H9);
                    if (!z10) {
                        z26 = false;
                    } else {
                        z26 = false;
                    }
                    float f11 = AbstractC20776t0.f65981a;
                    if (z26) {
                        C2497c c2497c2 = new C2497c(abstractC14360p, c20750g3, c6045c, interfaceC6073v5, 14);
                        c0280q2 = c0280q;
                        interfaceC10459qM10921b3 = AbstractC10443a.m10921b(interfaceC10459qM10921b, c0280q2, c2497c2);
                    } else {
                        c0280q2 = c0280q;
                        interfaceC10459qM10921b3 = interfaceC10459qM10921b;
                    }
                    zM6545h6 = c6021p2.m6545h(r6);
                    Object objM6514H21 = c6021p.m6514H();
                    obj6 = objM6514H21;
                    if (zM6545h6) {
                        C20787z c20787z2 = new C20787z(r6, 0);
                        c6021p2.m6537c0(c20787z2);
                        obj6 = c20787z2;
                    } else {
                        C20787z c20787z3 = new C20787z(r6, 0);
                        c6021p2.m6537c0(c20787z3);
                        obj6 = c20787z3;
                    }
                    C5997d.m6444c(r6, (InterfaceC1436k) obj6, c6021p2);
                    c6046d4 = c6046d3;
                    boolean zM6545h19 = c6021p2.m6545h(c20750g3) | c6021p2.m6545h(c6046d4);
                    if (i19 == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    int i31 = i25;
                    z28 = zM6545h19 | z27 | ((i31 <= 32 && c6021p2.m6542f(c6065n)) || (r12 & 48) == 32);
                    objM6514H10 = c6021p.m6514H();
                    if (z28) {
                        C20699B c20699b2 = new C20699B(c20750g3, c6046d4, c6045c, c6065n, 0);
                        c6021p2.m6537c0(c20699b2);
                        objM6514H10 = c20699b2;
                    } else {
                        C20699B c20699b3 = new C20699B(c20750g3, c6046d4, c6045c, c6065n, 0);
                        c6021p2.m6537c0(c20699b3);
                        objM6514H10 = c20699b3;
                    }
                    C5997d.m6444c(c6065n, (InterfaceC1436k) objM6514H10, c6021p2);
                    if (i10 == 1) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z30 = true;
                    C5975S c5975s4 = c5975s;
                    c0280q3 = c0280q2;
                    InterfaceC10459q interfaceC10459qM10921b5 = AbstractC10443a.m10921b(interfaceC10459qM10921b, c0280q3, new C20782w0(c20750g3, r6, c6045c, z32, z29, interfaceC6073v5, c20724n1, c20750g3.f65829t, c6065n.f19760e));
                    boolean zBooleanValue2 = ((Boolean) interfaceC5985XM6435V.getValue()).booleanValue();
                    zM6545h7 = c6021p2.m6545h(c20750g3) | ((i31 <= 32 && c6021p2.m6542f(c6065n)) || (i26 & 48) == 32) | c6021p2.m6545h(c21611e2);
                    objM6514H11 = c6021p.m6514H();
                    if (zM6545h7) {
                        C0494y c0494y2 = new C0494y(c20750g3, c13522n, c6065n, c21611e2, 18);
                        c6021p2.m6537c0(c0494y2);
                        objM6514H11 = c0494y2;
                    } else {
                        C0494y c0494y3 = new C0494y(c20750g3, c13522n, c6065n, c21611e2, 18);
                        c6021p2.m6537c0(c0494y3);
                        objM6514H11 = c0494y3;
                    }
                    InterfaceC10459q interfaceC10459qMo428M2 = AbstractC10865a.m11312b(AbstractC10865a.m11312b(AbstractC10855a.m11277a(interfaceC10459q, c21611e2, c20750g3, c1837w0).mo428M(AbstractC10854a.m11276a(zBooleanValue2, (InterfaceC1426a) objM6514H11)).mo428M(interfaceC10459qM11213a2), new C18194a(interfaceC13515g, 28, c20750g3)), new C18194a(c20750g3, 26, c1837w0)).mo428M(interfaceC10459qM10921b5);
                    C20706E0 c20706e2 = c20706e0;
                    InterfaceC10459q interfaceC10459qM11318d4 = AbstractC10868a.m11318d(AbstractC10443a.m10921b(interfaceC10459qMo428M2, c0280q3, new C16878e0(c20706e2, z10, interfaceC17406l)).mo428M(interfaceC10459qM20686h2).mo428M(interfaceC10459qM3789a2), new C20709G(c20750g3, 0));
                    if (z10) {
                        z30 = false;
                    } else {
                        z30 = false;
                    }
                    if (z30) {
                        interfaceC10459qM10921b = AbstractC10443a.m10921b(interfaceC10459qM10921b, c0280q3, new C0468O(c1837w0, 4));
                    }
                    m21266g(interfaceC10459qM11318d4, c1837w0, AbstractC8411c.m8969c(-374338080, c6021p, new C20705E(interfaceC1440o, c20750g3, c3582m, i11, i10, c20706e2, c6045c, c2385o, interfaceC10459qM10921b3, interfaceC10459qM11295a2, interfaceC10459qM11318d3, interfaceC10459qM10921b, c19715c2, c1837w0, z30, z11, interfaceC1436k2, interfaceC6073v5, interfaceC7537b)), c6021p, 384);
                } else {
                    c15026j.f46725Z = new C6061j(c3590f, j10);
                    z12 = true;
                }
                z13 = false;
                if (c3581l == null) {
                    C6061j c6061j3 = (C6061j) c15026j.f46725Z;
                    c6061j3.f19746p0 = -1;
                    c6061j3.f19747q0 = -1;
                } else {
                    j11 = c3581l.f10908a;
                    if (!C3581L.m4267c(j11)) {
                        ((C6061j) c15026j.f46725Z).m6634h(C3581L.m4270f(j11), C3581L.m4269e(j11));
                    }
                }
                if (z12) {
                    C6061j c6061j4 = (C6061j) c15026j.f46725Z;
                    c6061j4.f19746p0 = -1;
                    c6061j4.f19747q0 = -1;
                    c6045cM6612a = C6045C.m6612a(c6045c, null, 0L, 3);
                } else {
                    C6061j c6061j5 = (C6061j) c15026j.f46725Z;
                    c6061j5.f19746p0 = -1;
                    c6061j5.f19747q0 = -1;
                    c6045cM6612a = C6045C.m6612a(c6045c, null, 0L, 3);
                }
                c6045c2 = (C6045C) c15026j.f46724Y;
                c15026j.f46724Y = c6045cM6612a;
                if (c6049g != null) {
                    c6049g.m6623a(c6045c2, c6045cM6612a);
                }
                objM6514H = c6021p.m6514H();
                if (objM6514H == c5975s2) {
                    objM6514H = new C20724N0();
                    c6021p2.m6537c0(objM6514H);
                }
                c20724n0 = (C20724N0) objM6514H;
                jCurrentTimeMillis = System.currentTimeMillis();
                if (c20724n0.f65710f) {
                    c20724n0.f65709e = Long.valueOf(jCurrentTimeMillis);
                    c20724n0.m21222a(c6045c);
                } else {
                    l4 = c20724n0.f65709e;
                    if (jCurrentTimeMillis > (l4 != null ? l4.longValue() : 0L) + ((long) 5000)) {
                        c20724n0.f65709e = Long.valueOf(jCurrentTimeMillis);
                        c20724n0.m21222a(c6045c);
                    }
                }
                objM6514H2 = c6021p.m6514H();
                obj2 = objM6514H2;
                if (objM6514H2 == c5975s2) {
                    C1837w0 c1837w2 = new C1837w0(c20724n0);
                    c6021p2.m6537c0(c1837w2);
                    obj2 = c1837w2;
                }
                c1837w0 = (C1837w0) obj2;
                interfaceC6073v = c6050h.f19709b;
                c1837w0.f5306b = interfaceC6073v;
                c1837w0.f5307c = c20750g1.f65829t;
                c1837w0.f5308d = c20750g1;
                c1837w0.f5309e.setValue(c6045c);
                c1837w0.f5310f = (InterfaceC0172H0) c6021p2.m6548k(AbstractC0187M0.f702d);
                c1837w0.f5311g = (InterfaceC0303x1) c6021p2.m6548k(AbstractC0187M0.f713o);
                c1837w0.f5312h = (InterfaceC18285a) c6021p2.m6548k(AbstractC0187M0.f708j);
                c1837w0.f5313i = c13522n3;
                boolean z37 = !z11;
                c1837w0.f5314j.setValue(Boolean.valueOf(z37));
                c1837w0.f5315k.setValue(Boolean.valueOf(z10));
                objM6514H3 = c6021p.m6514H();
                objM529r = objM6514H3;
                if (objM6514H3 == c5975s2) {
                    objM529r = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p2);
                }
                c2925c = ((C6035w) objM529r).f19668Y;
                objM6514H4 = c6021p.m6514H();
                obj3 = objM6514H4;
                if (objM6514H4 == c5975s2) {
                    C19715c c19715c4 = new C19715c();
                    c6021p2.m6537c0(c19715c4);
                    obj3 = c19715c4;
                }
                c19715c = (C19715c) obj3;
                interfaceC10459qM10921b = C10456n.f30959Y;
                boolean zM6545h20 = c6021p2.m6545h(c20750g1);
                i17 = i26 & 7168;
                if (i17 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z38 = zM6545h20 | z14;
                i18 = i26 & 57344;
                if (i18 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zM6545h21 = z15 | z38 | c6021p2.m6545h(c6046d6);
                i19 = i27;
                if (i19 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z39 = zM6545h21 | z16;
                i20 = (i26 & 112) ^ 48;
                if (i20 > 32) {
                }
                c20724n1 = c20724n0;
                if ((i26 & 48) != 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM6545h = z39 | z17 | c6021p2.m6545h(interfaceC6073v) | c6021p2.m6545h(c2925c) | c6021p2.m6545h(c19715c) | c6021p2.m6545h(c1837w0);
                objM6514H5 = c6021p.m6514H();
                if (zM6545h) {
                    c19715c2 = c19715c;
                    interfaceC6073v2 = interfaceC6073v;
                    c13522n = c13522n3;
                    c6046d = c6046d6;
                    c20750g2 = c20750g1;
                    C20713I c20713i4 = new C20713I(c20750g1, z10, z11, c6046d6, c6045c, c6065n, interfaceC6073v2, c1837w0, c2925c, c19715c2);
                    c6021p2.m6537c0(c20713i4);
                    objM6514H5 = c20713i4;
                } else {
                    c19715c2 = c19715c;
                    interfaceC6073v2 = interfaceC6073v;
                    c13522n = c13522n3;
                    c6046d = c6046d6;
                    c20750g2 = c20750g1;
                    C20713I c20713i5 = new C20713I(c20750g1, z10, z11, c6046d6, c6045c, c6065n, interfaceC6073v2, c1837w0, c2925c, c19715c2);
                    c6021p2.m6537c0(c20713i5);
                    objM6514H5 = c20713i5;
                }
                InterfaceC10459q interfaceC10459qM11213a3 = AbstractC10838f.m11213a(AbstractC10862a.m11300b(AbstractC10862a.m11299a(interfaceC10459qM10921b, c13522n), (InterfaceC1436k) objM6514H5), z10, interfaceC17406l);
                if (z10) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                interfaceC5985XM6435V = C5997d.m6435V(Boolean.valueOf(z18), c6021p2);
                C17296C c17296c3 = C17296C.f55119a;
                c20750g3 = c20750g2;
                c6046d2 = c6046d;
                zM6542f = c6021p2.m6542f(interfaceC5985XM6435V) | c6021p2.m6545h(c20750g3) | c6021p2.m6545h(c6046d2) | c6021p2.m6545h(c1837w0) | ((i20 <= 32 && c6021p2.m6542f(c6065n)) || (r12 & 48) == 32);
                objM6514H6 = c6021p.m6514H();
                if (zM6542f) {
                    c6046d3 = c6046d2;
                    C20785y c20785y4 = new C20785y(c20750g3, interfaceC5985XM6435V, c6046d3, c1837w0, c6065n, null);
                    c6021p2.m6537c0(c20785y4);
                    objM6514H6 = c20785y4;
                } else {
                    c6046d3 = c6046d2;
                    C20785y c20785y5 = new C20785y(c20750g3, interfaceC5985XM6435V, c6046d3, c1837w0, c6065n, null);
                    c6021p2.m6537c0(c20785y5);
                    objM6514H6 = c20785y5;
                }
                C5997d.m6450f((InterfaceC1439n) objM6514H6, c6021p2, c17296c3);
                zM6545h2 = c6021p2.m6545h(c20750g3);
                Object objM6514H112 = c6021p.m6514H();
                if (zM6545h2) {
                    i21 = 1;
                    C20709G c20709g4 = new C20709G(c20750g3, i21);
                    c6021p2.m6537c0(c20709g4);
                    obj4 = c20709g4;
                } else {
                    i21 = 1;
                    C20709G c20709g5 = new C20709G(c20750g3, i21);
                    c6021p2.m6537c0(c20709g5);
                    obj4 = c20709g5;
                }
                interfaceC10459qM20694b = AbstractC19744u.m20694b(interfaceC10459qM10921b, 8675309, new C1781O((InterfaceC1436k) obj4, null));
                boolean zM6545h110 = c6021p2.m6545h(c20750g3);
                if (i18 == 16384) {
                    i22 = i21;
                } else {
                    i22 = 0;
                }
                int i211 = (zM6545h110 ? 1 : 0) | i22;
                if (i17 == 2048) {
                    i23 = i21;
                } else {
                    i23 = 0;
                }
                interfaceC6073v3 = interfaceC6073v2;
                z19 = (((i211 | i23) | (c6021p2.m6545h(interfaceC6073v3) ? 1 : 0)) == true ? 1 : 0) | (c6021p2.m6545h(r6) ? 1 : 0);
                objM6514H7 = c6021p.m6514H();
                if (z19 == 0) {
                    interfaceC6073v4 = interfaceC6073v3;
                    C20715J c20715j4 = new C20715J(c20750g3, c13522n, z11, z10, r6, interfaceC6073v4);
                    c6021p2.m6537c0(c20715j4);
                    objM6514H7 = c20715j4;
                } else {
                    interfaceC6073v4 = interfaceC6073v3;
                    C20715J c20715j5 = new C20715J(c20750g3, c13522n, z11, z10, r6, interfaceC6073v4);
                    c6021p2.m6537c0(c20715j5);
                    objM6514H7 = c20715j5;
                }
                interfaceC1436k3 = (InterfaceC1436k) objM6514H7;
                c0280q = C0280q.f1030t0;
                if (z10) {
                    i24 = 14;
                    interfaceC10459qM10921b2 = AbstractC10443a.m10921b(interfaceC10459qM20694b, c0280q, new C14127l(interfaceC1436k3, i24, interfaceC17406l));
                } else {
                    i24 = 14;
                    interfaceC10459qM10921b2 = interfaceC10459qM20694b;
                }
                C7296c c7296c3 = c1837w0.f5325u;
                C1833u0 c1833u2 = c1837w0.f5324t;
                InterfaceC10459q interfaceC10459qM20686h3 = AbstractC19736m.m20686h(interfaceC10459qM10921b2.mo428M(new SuspendPointerInputElement(c7296c3, c1833u2, new C1773G(c7296c3, c1833u2, null), 4)), f65747b);
                boolean zM6545h111 = c6021p2.m6545h(c20750g3);
                if (i19 == 4) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                interfaceC6073v5 = interfaceC6073v4;
                zM6545h3 = zM6545h111 | z20 | c6021p2.m6545h(interfaceC6073v5);
                Object objM6514H113 = c6021p.m6514H();
                if (zM6545h3) {
                    C16663C c16663c4 = new C16663C(c20750g3, c6045c, interfaceC6073v5, i24);
                    c6021p2.m6537c0(c16663c4);
                    obj5 = c16663c4;
                } else {
                    C16663C c16663c5 = new C16663C(c20750g3, c6045c, interfaceC6073v5, i24);
                    c6021p2.m6537c0(c16663c5);
                    obj5 = c16663c5;
                }
                InterfaceC10459q interfaceC10459qM11295a3 = AbstractC10861a.m11295a(interfaceC10459qM10921b, (InterfaceC1436k) obj5);
                boolean zM6545h112 = c6021p2.m6545h(c20750g3);
                if (i17 == 2048) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                boolean zM6542f6 = zM6545h112 | z21 | c6021p2.m6542f(r35) | c6021p2.m6545h(c1837w0);
                if (i19 == 4) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                zM6545h4 = zM6542f6 | z22 | c6021p2.m6545h(interfaceC6073v5);
                objM6514H8 = c6021p.m6514H();
                if (zM6545h4) {
                    interfaceC0182K1 = r35;
                    C4018a0 c4018a3 = new C4018a0(c20750g3, z10, interfaceC0182K1, c1837w0, c6045c, interfaceC6073v5, 1);
                    c6021p2.m6537c0(c4018a3);
                    objM6514H8 = c4018a3;
                } else {
                    interfaceC0182K1 = r35;
                    C4018a0 c4018a4 = new C4018a0(c20750g3, z10, interfaceC0182K1, c1837w0, c6045c, interfaceC6073v5, 1);
                    c6021p2.m6537c0(c4018a4);
                    objM6514H8 = c4018a4;
                }
                InterfaceC10459q interfaceC10459qM11318d5 = AbstractC10868a.m11318d(interfaceC10459qM10921b, (InterfaceC1436k) objM6514H8);
                boolean zM6545h113 = c6021p2.m6545h(c6050h);
                if (r4 == 4) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                boolean z310 = zM6545h113 | z23;
                if (i17 == 2048) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean zM6544g3 = z310 | z24 | c6021p2.m6544g(false);
                if (i18 == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zM6545h5 = zM6544g3 | z25 | c6021p2.m6545h(c20750g3) | c6021p2.m6545h(interfaceC6073v5) | c6021p2.m6545h(r6) | ((i20 <= 32 && c6021p2.m6542f(c6065n)) || (r12 & 48) == 32);
                objM6514H9 = c6021p.m6514H();
                if (zM6545h5) {
                    i25 = i20;
                    c5975s = c5975s2;
                    C20717K c20717k4 = new C20717K(c6050h, c6045c, z10, z11, c6065n, c20750g3, interfaceC6073v5, r6, c13522n);
                    c6021p2.m6537c0(c20717k4);
                    objM6514H9 = c20717k4;
                } else {
                    i25 = i20;
                    c5975s = c5975s2;
                    C20717K c20717k5 = new C20717K(c6050h, c6045c, z10, z11, c6065n, c20750g3, interfaceC6073v5, r6, c13522n);
                    c6021p2.m6537c0(c20717k5);
                    objM6514H9 = c20717k5;
                }
                InterfaceC10459q interfaceC10459qM3789a3 = AbstractC2965l.m3789a(interfaceC10459qM10921b, true, (InterfaceC1436k) objM6514H9);
                if (!z10) {
                    z26 = false;
                } else {
                    z26 = false;
                }
                float f12 = AbstractC20776t0.f65981a;
                if (z26) {
                    C2497c c2497c3 = new C2497c(abstractC14360p, c20750g3, c6045c, interfaceC6073v5, 14);
                    c0280q2 = c0280q;
                    interfaceC10459qM10921b3 = AbstractC10443a.m10921b(interfaceC10459qM10921b, c0280q2, c2497c3);
                } else {
                    c0280q2 = c0280q;
                    interfaceC10459qM10921b3 = interfaceC10459qM10921b;
                }
                zM6545h6 = c6021p2.m6545h(r6);
                Object objM6514H22 = c6021p.m6514H();
                obj6 = objM6514H22;
                if (zM6545h6) {
                    C20787z c20787z4 = new C20787z(r6, 0);
                    c6021p2.m6537c0(c20787z4);
                    obj6 = c20787z4;
                } else {
                    C20787z c20787z5 = new C20787z(r6, 0);
                    c6021p2.m6537c0(c20787z5);
                    obj6 = c20787z5;
                }
                C5997d.m6444c(r6, (InterfaceC1436k) obj6, c6021p2);
                c6046d4 = c6046d3;
                boolean zM6545h114 = c6021p2.m6545h(c20750g3) | c6021p2.m6545h(c6046d4);
                if (i19 == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                int i32 = i25;
                z28 = zM6545h114 | z27 | ((i32 <= 32 && c6021p2.m6542f(c6065n)) || (r12 & 48) == 32);
                objM6514H10 = c6021p.m6514H();
                if (z28) {
                    C20699B c20699b4 = new C20699B(c20750g3, c6046d4, c6045c, c6065n, 0);
                    c6021p2.m6537c0(c20699b4);
                    objM6514H10 = c20699b4;
                } else {
                    C20699B c20699b5 = new C20699B(c20750g3, c6046d4, c6045c, c6065n, 0);
                    c6021p2.m6537c0(c20699b5);
                    objM6514H10 = c20699b5;
                }
                C5997d.m6444c(c6065n, (InterfaceC1436k) objM6514H10, c6021p2);
                if (i10 == 1) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                z30 = true;
                C5975S c5975s5 = c5975s;
                c0280q3 = c0280q2;
                InterfaceC10459q interfaceC10459qM10921b6 = AbstractC10443a.m10921b(interfaceC10459qM10921b, c0280q3, new C20782w0(c20750g3, r6, c6045c, z37, z29, interfaceC6073v5, c20724n1, c20750g3.f65829t, c6065n.f19760e));
                boolean zBooleanValue3 = ((Boolean) interfaceC5985XM6435V.getValue()).booleanValue();
                zM6545h7 = c6021p2.m6545h(c20750g3) | ((i32 <= 32 && c6021p2.m6542f(c6065n)) || (i26 & 48) == 32) | c6021p2.m6545h(c21611e2);
                objM6514H11 = c6021p.m6514H();
                if (zM6545h7) {
                    C0494y c0494y4 = new C0494y(c20750g3, c13522n, c6065n, c21611e2, 18);
                    c6021p2.m6537c0(c0494y4);
                    objM6514H11 = c0494y4;
                } else {
                    C0494y c0494y5 = new C0494y(c20750g3, c13522n, c6065n, c21611e2, 18);
                    c6021p2.m6537c0(c0494y5);
                    objM6514H11 = c0494y5;
                }
                InterfaceC10459q interfaceC10459qMo428M3 = AbstractC10865a.m11312b(AbstractC10865a.m11312b(AbstractC10855a.m11277a(interfaceC10459q, c21611e2, c20750g3, c1837w0).mo428M(AbstractC10854a.m11276a(zBooleanValue3, (InterfaceC1426a) objM6514H11)).mo428M(interfaceC10459qM11213a3), new C18194a(interfaceC13515g, 28, c20750g3)), new C18194a(c20750g3, 26, c1837w0)).mo428M(interfaceC10459qM10921b6);
                C20706E0 c20706e3 = c20706e0;
                InterfaceC10459q interfaceC10459qM11318d6 = AbstractC10868a.m11318d(AbstractC10443a.m10921b(interfaceC10459qMo428M3, c0280q3, new C16878e0(c20706e3, z10, interfaceC17406l)).mo428M(interfaceC10459qM20686h3).mo428M(interfaceC10459qM3789a3), new C20709G(c20750g3, 0));
                if (z10) {
                    z30 = false;
                } else {
                    z30 = false;
                }
                if (z30) {
                    interfaceC10459qM10921b = AbstractC10443a.m10921b(interfaceC10459qM10921b, c0280q3, new C0468O(c1837w0, 4));
                }
                m21266g(interfaceC10459qM11318d6, c1837w0, AbstractC8411c.m8969c(-374338080, c6021p, new C20705E(interfaceC1440o, c20750g3, c3582m, i11, i10, c20706e3, c6045c, c2385o, interfaceC10459qM10921b3, interfaceC10459qM11295a3, interfaceC10459qM11318d5, interfaceC10459qM10921b, c19715c2, c1837w0, z30, z11, interfaceC1436k2, interfaceC6073v5, interfaceC7537b)), c6021p, 384);
            } else {
                interfaceC5598n = interfaceC5598n2;
                i16 = 1;
            }
            interfaceC7537b2 = interfaceC7537b2;
            interfaceC7537b = interfaceC7537b2;
            c20770q0 = new C20770q0(c3590f2, c3582m, Integer.MAX_VALUE, i16, z6, 1, interfaceC7537b, interfaceC5598n, c17689w);
            c20750g0 = c20750g5;
            if (c20750g0.f65810a != c20770q0) {
                c20750g0.f65825p = true;
            }
            c20750g0.f65810a = c20770q0;
            c6049g = c20750g0.f65814e;
            c15026j = c20750g0.f65813d;
            c15026j.getClass();
            C3581L c3581lM6632f2 = ((C6061j) c15026j.f46725Z).m6632f();
            c3581l = c6045c.f19684c;
            boolean zM18089b3 = AbstractC16544l.m18089b(c3581l, c3581lM6632f2);
            C3590f c3590f5 = ((C6045C) c15026j.f46724Y).f19682a;
            c3590f = c6045c.f19682a;
            zM18089b = AbstractC16544l.m18089b(c3590f5, c3590f);
            c20750g1 = c20750g0;
            j10 = c6045c.f19683b;
            if (zM18089b) {
                c15026j.f46725Z = new C6061j(c3590f, j10);
                z12 = true;
            } else {
                if (C3581L.m4266b(((C6045C) c15026j.f46724Y).f19683b, j10)) {
                    ((C6061j) c15026j.f46725Z).m6635i(C3581L.m4270f(j10), C3581L.m4269e(j10));
                    z12 = false;
                    z13 = true;
                } else {
                    z12 = false;
                }
                if (c3581l == null) {
                    C6061j c6061j6 = (C6061j) c15026j.f46725Z;
                    c6061j6.f19746p0 = -1;
                    c6061j6.f19747q0 = -1;
                } else {
                    j11 = c3581l.f10908a;
                    if (!C3581L.m4267c(j11)) {
                        ((C6061j) c15026j.f46725Z).m6634h(C3581L.m4270f(j11), C3581L.m4269e(j11));
                    }
                }
                if (z12) {
                    C6061j c6061j7 = (C6061j) c15026j.f46725Z;
                    c6061j7.f19746p0 = -1;
                    c6061j7.f19747q0 = -1;
                    c6045cM6612a = C6045C.m6612a(c6045c, null, 0L, 3);
                } else {
                    C6061j c6061j8 = (C6061j) c15026j.f46725Z;
                    c6061j8.f19746p0 = -1;
                    c6061j8.f19747q0 = -1;
                    c6045cM6612a = C6045C.m6612a(c6045c, null, 0L, 3);
                }
                c6045c2 = (C6045C) c15026j.f46724Y;
                c15026j.f46724Y = c6045cM6612a;
                if (c6049g != null) {
                    c6049g.m6623a(c6045c2, c6045cM6612a);
                }
                objM6514H = c6021p.m6514H();
                if (objM6514H == c5975s2) {
                    objM6514H = new C20724N0();
                    c6021p2.m6537c0(objM6514H);
                }
                c20724n0 = (C20724N0) objM6514H;
                jCurrentTimeMillis = System.currentTimeMillis();
                if (c20724n0.f65710f) {
                    c20724n0.f65709e = Long.valueOf(jCurrentTimeMillis);
                    c20724n0.m21222a(c6045c);
                } else {
                    l4 = c20724n0.f65709e;
                    if (jCurrentTimeMillis > (l4 != null ? l4.longValue() : 0L) + ((long) 5000)) {
                        c20724n0.f65709e = Long.valueOf(jCurrentTimeMillis);
                        c20724n0.m21222a(c6045c);
                    }
                }
                objM6514H2 = c6021p.m6514H();
                obj2 = objM6514H2;
                if (objM6514H2 == c5975s2) {
                    C1837w0 c1837w3 = new C1837w0(c20724n0);
                    c6021p2.m6537c0(c1837w3);
                    obj2 = c1837w3;
                }
                c1837w0 = (C1837w0) obj2;
                interfaceC6073v = c6050h.f19709b;
                c1837w0.f5306b = interfaceC6073v;
                c1837w0.f5307c = c20750g1.f65829t;
                c1837w0.f5308d = c20750g1;
                c1837w0.f5309e.setValue(c6045c);
                c1837w0.f5310f = (InterfaceC0172H0) c6021p2.m6548k(AbstractC0187M0.f702d);
                c1837w0.f5311g = (InterfaceC0303x1) c6021p2.m6548k(AbstractC0187M0.f713o);
                c1837w0.f5312h = (InterfaceC18285a) c6021p2.m6548k(AbstractC0187M0.f708j);
                c1837w0.f5313i = c13522n3;
                boolean z311 = !z11;
                c1837w0.f5314j.setValue(Boolean.valueOf(z311));
                c1837w0.f5315k.setValue(Boolean.valueOf(z10));
                objM6514H3 = c6021p.m6514H();
                objM529r = objM6514H3;
                if (objM6514H3 == c5975s2) {
                    objM529r = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p2);
                }
                c2925c = ((C6035w) objM529r).f19668Y;
                objM6514H4 = c6021p.m6514H();
                obj3 = objM6514H4;
                if (objM6514H4 == c5975s2) {
                    C19715c c19715c5 = new C19715c();
                    c6021p2.m6537c0(c19715c5);
                    obj3 = c19715c5;
                }
                c19715c = (C19715c) obj3;
                interfaceC10459qM10921b = C10456n.f30959Y;
                boolean zM6545h22 = c6021p2.m6545h(c20750g1);
                i17 = i26 & 7168;
                if (i17 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z312 = zM6545h22 | z14;
                i18 = i26 & 57344;
                if (i18 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zM6545h23 = z15 | z312 | c6021p2.m6545h(c6046d6);
                i19 = i27;
                if (i19 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z313 = zM6545h23 | z16;
                i20 = (i26 & 112) ^ 48;
                if (i20 > 32) {
                }
                c20724n1 = c20724n0;
                if ((i26 & 48) != 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM6545h = z313 | z17 | c6021p2.m6545h(interfaceC6073v) | c6021p2.m6545h(c2925c) | c6021p2.m6545h(c19715c) | c6021p2.m6545h(c1837w0);
                objM6514H5 = c6021p.m6514H();
                if (zM6545h) {
                    c19715c2 = c19715c;
                    interfaceC6073v2 = interfaceC6073v;
                    c13522n = c13522n3;
                    c6046d = c6046d6;
                    c20750g2 = c20750g1;
                    C20713I c20713i6 = new C20713I(c20750g1, z10, z11, c6046d6, c6045c, c6065n, interfaceC6073v2, c1837w0, c2925c, c19715c2);
                    c6021p2.m6537c0(c20713i6);
                    objM6514H5 = c20713i6;
                } else {
                    c19715c2 = c19715c;
                    interfaceC6073v2 = interfaceC6073v;
                    c13522n = c13522n3;
                    c6046d = c6046d6;
                    c20750g2 = c20750g1;
                    C20713I c20713i7 = new C20713I(c20750g1, z10, z11, c6046d6, c6045c, c6065n, interfaceC6073v2, c1837w0, c2925c, c19715c2);
                    c6021p2.m6537c0(c20713i7);
                    objM6514H5 = c20713i7;
                }
                InterfaceC10459q interfaceC10459qM11213a4 = AbstractC10838f.m11213a(AbstractC10862a.m11300b(AbstractC10862a.m11299a(interfaceC10459qM10921b, c13522n), (InterfaceC1436k) objM6514H5), z10, interfaceC17406l);
                if (z10) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                interfaceC5985XM6435V = C5997d.m6435V(Boolean.valueOf(z18), c6021p2);
                C17296C c17296c4 = C17296C.f55119a;
                c20750g3 = c20750g2;
                c6046d2 = c6046d;
                zM6542f = c6021p2.m6542f(interfaceC5985XM6435V) | c6021p2.m6545h(c20750g3) | c6021p2.m6545h(c6046d2) | c6021p2.m6545h(c1837w0) | ((i20 <= 32 && c6021p2.m6542f(c6065n)) || (r12 & 48) == 32);
                objM6514H6 = c6021p.m6514H();
                if (zM6542f) {
                    c6046d3 = c6046d2;
                    C20785y c20785y6 = new C20785y(c20750g3, interfaceC5985XM6435V, c6046d3, c1837w0, c6065n, null);
                    c6021p2.m6537c0(c20785y6);
                    objM6514H6 = c20785y6;
                } else {
                    c6046d3 = c6046d2;
                    C20785y c20785y7 = new C20785y(c20750g3, interfaceC5985XM6435V, c6046d3, c1837w0, c6065n, null);
                    c6021p2.m6537c0(c20785y7);
                    objM6514H6 = c20785y7;
                }
                C5997d.m6450f((InterfaceC1439n) objM6514H6, c6021p2, c17296c4);
                zM6545h2 = c6021p2.m6545h(c20750g3);
                Object objM6514H114 = c6021p.m6514H();
                if (zM6545h2) {
                    i21 = 1;
                    C20709G c20709g6 = new C20709G(c20750g3, i21);
                    c6021p2.m6537c0(c20709g6);
                    obj4 = c20709g6;
                } else {
                    i21 = 1;
                    C20709G c20709g7 = new C20709G(c20750g3, i21);
                    c6021p2.m6537c0(c20709g7);
                    obj4 = c20709g7;
                }
                interfaceC10459qM20694b = AbstractC19744u.m20694b(interfaceC10459qM10921b, 8675309, new C1781O((InterfaceC1436k) obj4, null));
                boolean zM6545h115 = c6021p2.m6545h(c20750g3);
                if (i18 == 16384) {
                    i22 = i21;
                } else {
                    i22 = 0;
                }
                int i212 = (zM6545h115 ? 1 : 0) | i22;
                if (i17 == 2048) {
                    i23 = i21;
                } else {
                    i23 = 0;
                }
                interfaceC6073v3 = interfaceC6073v2;
                z19 = (((i212 | i23) | (c6021p2.m6545h(interfaceC6073v3) ? 1 : 0)) == true ? 1 : 0) | (c6021p2.m6545h(r6) ? 1 : 0);
                objM6514H7 = c6021p.m6514H();
                if (z19 == 0) {
                    interfaceC6073v4 = interfaceC6073v3;
                    C20715J c20715j6 = new C20715J(c20750g3, c13522n, z11, z10, r6, interfaceC6073v4);
                    c6021p2.m6537c0(c20715j6);
                    objM6514H7 = c20715j6;
                } else {
                    interfaceC6073v4 = interfaceC6073v3;
                    C20715J c20715j7 = new C20715J(c20750g3, c13522n, z11, z10, r6, interfaceC6073v4);
                    c6021p2.m6537c0(c20715j7);
                    objM6514H7 = c20715j7;
                }
                interfaceC1436k3 = (InterfaceC1436k) objM6514H7;
                c0280q = C0280q.f1030t0;
                if (z10) {
                    i24 = 14;
                    interfaceC10459qM10921b2 = AbstractC10443a.m10921b(interfaceC10459qM20694b, c0280q, new C14127l(interfaceC1436k3, i24, interfaceC17406l));
                } else {
                    i24 = 14;
                    interfaceC10459qM10921b2 = interfaceC10459qM20694b;
                }
                C7296c c7296c4 = c1837w0.f5325u;
                C1833u0 c1833u3 = c1837w0.f5324t;
                InterfaceC10459q interfaceC10459qM20686h4 = AbstractC19736m.m20686h(interfaceC10459qM10921b2.mo428M(new SuspendPointerInputElement(c7296c4, c1833u3, new C1773G(c7296c4, c1833u3, null), 4)), f65747b);
                boolean zM6545h116 = c6021p2.m6545h(c20750g3);
                if (i19 == 4) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                interfaceC6073v5 = interfaceC6073v4;
                zM6545h3 = zM6545h116 | z20 | c6021p2.m6545h(interfaceC6073v5);
                Object objM6514H115 = c6021p.m6514H();
                if (zM6545h3) {
                    C16663C c16663c6 = new C16663C(c20750g3, c6045c, interfaceC6073v5, i24);
                    c6021p2.m6537c0(c16663c6);
                    obj5 = c16663c6;
                } else {
                    C16663C c16663c7 = new C16663C(c20750g3, c6045c, interfaceC6073v5, i24);
                    c6021p2.m6537c0(c16663c7);
                    obj5 = c16663c7;
                }
                InterfaceC10459q interfaceC10459qM11295a4 = AbstractC10861a.m11295a(interfaceC10459qM10921b, (InterfaceC1436k) obj5);
                boolean zM6545h117 = c6021p2.m6545h(c20750g3);
                if (i17 == 2048) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                boolean zM6542f7 = zM6545h117 | z21 | c6021p2.m6542f(r35) | c6021p2.m6545h(c1837w0);
                if (i19 == 4) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                zM6545h4 = zM6542f7 | z22 | c6021p2.m6545h(interfaceC6073v5);
                objM6514H8 = c6021p.m6514H();
                if (zM6545h4) {
                    interfaceC0182K1 = r35;
                    C4018a0 c4018a5 = new C4018a0(c20750g3, z10, interfaceC0182K1, c1837w0, c6045c, interfaceC6073v5, 1);
                    c6021p2.m6537c0(c4018a5);
                    objM6514H8 = c4018a5;
                } else {
                    interfaceC0182K1 = r35;
                    C4018a0 c4018a6 = new C4018a0(c20750g3, z10, interfaceC0182K1, c1837w0, c6045c, interfaceC6073v5, 1);
                    c6021p2.m6537c0(c4018a6);
                    objM6514H8 = c4018a6;
                }
                InterfaceC10459q interfaceC10459qM11318d7 = AbstractC10868a.m11318d(interfaceC10459qM10921b, (InterfaceC1436k) objM6514H8);
                boolean zM6545h118 = c6021p2.m6545h(c6050h);
                if (r4 == 4) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                boolean z314 = zM6545h118 | z23;
                if (i17 == 2048) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean zM6544g4 = z314 | z24 | c6021p2.m6544g(false);
                if (i18 == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zM6545h5 = zM6544g4 | z25 | c6021p2.m6545h(c20750g3) | c6021p2.m6545h(interfaceC6073v5) | c6021p2.m6545h(r6) | ((i20 <= 32 && c6021p2.m6542f(c6065n)) || (r12 & 48) == 32);
                objM6514H9 = c6021p.m6514H();
                if (zM6545h5) {
                    i25 = i20;
                    c5975s = c5975s2;
                    C20717K c20717k6 = new C20717K(c6050h, c6045c, z10, z11, c6065n, c20750g3, interfaceC6073v5, r6, c13522n);
                    c6021p2.m6537c0(c20717k6);
                    objM6514H9 = c20717k6;
                } else {
                    i25 = i20;
                    c5975s = c5975s2;
                    C20717K c20717k7 = new C20717K(c6050h, c6045c, z10, z11, c6065n, c20750g3, interfaceC6073v5, r6, c13522n);
                    c6021p2.m6537c0(c20717k7);
                    objM6514H9 = c20717k7;
                }
                InterfaceC10459q interfaceC10459qM3789a4 = AbstractC2965l.m3789a(interfaceC10459qM10921b, true, (InterfaceC1436k) objM6514H9);
                if (!z10) {
                    z26 = false;
                } else {
                    z26 = false;
                }
                float f13 = AbstractC20776t0.f65981a;
                if (z26) {
                    C2497c c2497c4 = new C2497c(abstractC14360p, c20750g3, c6045c, interfaceC6073v5, 14);
                    c0280q2 = c0280q;
                    interfaceC10459qM10921b3 = AbstractC10443a.m10921b(interfaceC10459qM10921b, c0280q2, c2497c4);
                } else {
                    c0280q2 = c0280q;
                    interfaceC10459qM10921b3 = interfaceC10459qM10921b;
                }
                zM6545h6 = c6021p2.m6545h(r6);
                Object objM6514H23 = c6021p.m6514H();
                obj6 = objM6514H23;
                if (zM6545h6) {
                    C20787z c20787z6 = new C20787z(r6, 0);
                    c6021p2.m6537c0(c20787z6);
                    obj6 = c20787z6;
                } else {
                    C20787z c20787z7 = new C20787z(r6, 0);
                    c6021p2.m6537c0(c20787z7);
                    obj6 = c20787z7;
                }
                C5997d.m6444c(r6, (InterfaceC1436k) obj6, c6021p2);
                c6046d4 = c6046d3;
                boolean zM6545h119 = c6021p2.m6545h(c20750g3) | c6021p2.m6545h(c6046d4);
                if (i19 == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                int i33 = i25;
                z28 = zM6545h119 | z27 | ((i33 <= 32 && c6021p2.m6542f(c6065n)) || (r12 & 48) == 32);
                objM6514H10 = c6021p.m6514H();
                if (z28) {
                    C20699B c20699b6 = new C20699B(c20750g3, c6046d4, c6045c, c6065n, 0);
                    c6021p2.m6537c0(c20699b6);
                    objM6514H10 = c20699b6;
                } else {
                    C20699B c20699b7 = new C20699B(c20750g3, c6046d4, c6045c, c6065n, 0);
                    c6021p2.m6537c0(c20699b7);
                    objM6514H10 = c20699b7;
                }
                C5997d.m6444c(c6065n, (InterfaceC1436k) objM6514H10, c6021p2);
                if (i10 == 1) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                z30 = true;
                C5975S c5975s6 = c5975s;
                c0280q3 = c0280q2;
                InterfaceC10459q interfaceC10459qM10921b7 = AbstractC10443a.m10921b(interfaceC10459qM10921b, c0280q3, new C20782w0(c20750g3, r6, c6045c, z311, z29, interfaceC6073v5, c20724n1, c20750g3.f65829t, c6065n.f19760e));
                boolean zBooleanValue4 = ((Boolean) interfaceC5985XM6435V.getValue()).booleanValue();
                zM6545h7 = c6021p2.m6545h(c20750g3) | ((i33 <= 32 && c6021p2.m6542f(c6065n)) || (i26 & 48) == 32) | c6021p2.m6545h(c21611e2);
                objM6514H11 = c6021p.m6514H();
                if (zM6545h7) {
                    C0494y c0494y6 = new C0494y(c20750g3, c13522n, c6065n, c21611e2, 18);
                    c6021p2.m6537c0(c0494y6);
                    objM6514H11 = c0494y6;
                } else {
                    C0494y c0494y7 = new C0494y(c20750g3, c13522n, c6065n, c21611e2, 18);
                    c6021p2.m6537c0(c0494y7);
                    objM6514H11 = c0494y7;
                }
                InterfaceC10459q interfaceC10459qMo428M4 = AbstractC10865a.m11312b(AbstractC10865a.m11312b(AbstractC10855a.m11277a(interfaceC10459q, c21611e2, c20750g3, c1837w0).mo428M(AbstractC10854a.m11276a(zBooleanValue4, (InterfaceC1426a) objM6514H11)).mo428M(interfaceC10459qM11213a4), new C18194a(interfaceC13515g, 28, c20750g3)), new C18194a(c20750g3, 26, c1837w0)).mo428M(interfaceC10459qM10921b7);
                C20706E0 c20706e4 = c20706e0;
                InterfaceC10459q interfaceC10459qM11318d8 = AbstractC10868a.m11318d(AbstractC10443a.m10921b(interfaceC10459qMo428M4, c0280q3, new C16878e0(c20706e4, z10, interfaceC17406l)).mo428M(interfaceC10459qM20686h4).mo428M(interfaceC10459qM3789a4), new C20709G(c20750g3, 0));
                if (z10) {
                    z30 = false;
                } else {
                    z30 = false;
                }
                if (z30) {
                    interfaceC10459qM10921b = AbstractC10443a.m10921b(interfaceC10459qM10921b, c0280q3, new C0468O(c1837w0, 4));
                }
                m21266g(interfaceC10459qM11318d8, c1837w0, AbstractC8411c.m8969c(-374338080, c6021p, new C20705E(interfaceC1440o, c20750g3, c3582m, i11, i10, c20706e4, c6045c, c2385o, interfaceC10459qM10921b3, interfaceC10459qM11295a4, interfaceC10459qM11318d7, interfaceC10459qM10921b, c19715c2, c1837w0, z30, z11, interfaceC1436k2, interfaceC6073v5, interfaceC7537b)), c6021p, 384);
            }
            z13 = false;
            if (c3581l == null) {
                C6061j c6061j9 = (C6061j) c15026j.f46725Z;
                c6061j9.f19746p0 = -1;
                c6061j9.f19747q0 = -1;
            } else {
                j11 = c3581l.f10908a;
                if (!C3581L.m4267c(j11)) {
                    ((C6061j) c15026j.f46725Z).m6634h(C3581L.m4270f(j11), C3581L.m4269e(j11));
                }
            }
            if (z12) {
                C6061j c6061j10 = (C6061j) c15026j.f46725Z;
                c6061j10.f19746p0 = -1;
                c6061j10.f19747q0 = -1;
                c6045cM6612a = C6045C.m6612a(c6045c, null, 0L, 3);
            } else {
                C6061j c6061j11 = (C6061j) c15026j.f46725Z;
                c6061j11.f19746p0 = -1;
                c6061j11.f19747q0 = -1;
                c6045cM6612a = C6045C.m6612a(c6045c, null, 0L, 3);
            }
            c6045c2 = (C6045C) c15026j.f46724Y;
            c15026j.f46724Y = c6045cM6612a;
            if (c6049g != null) {
                c6049g.m6623a(c6045c2, c6045cM6612a);
            }
            objM6514H = c6021p.m6514H();
            if (objM6514H == c5975s2) {
                objM6514H = new C20724N0();
                c6021p2.m6537c0(objM6514H);
            }
            c20724n0 = (C20724N0) objM6514H;
            jCurrentTimeMillis = System.currentTimeMillis();
            if (c20724n0.f65710f) {
                c20724n0.f65709e = Long.valueOf(jCurrentTimeMillis);
                c20724n0.m21222a(c6045c);
            } else {
                l4 = c20724n0.f65709e;
                if (jCurrentTimeMillis > (l4 != null ? l4.longValue() : 0L) + ((long) 5000)) {
                    c20724n0.f65709e = Long.valueOf(jCurrentTimeMillis);
                    c20724n0.m21222a(c6045c);
                }
            }
            objM6514H2 = c6021p.m6514H();
            obj2 = objM6514H2;
            if (objM6514H2 == c5975s2) {
                C1837w0 c1837w4 = new C1837w0(c20724n0);
                c6021p2.m6537c0(c1837w4);
                obj2 = c1837w4;
            }
            c1837w0 = (C1837w0) obj2;
            interfaceC6073v = c6050h.f19709b;
            c1837w0.f5306b = interfaceC6073v;
            c1837w0.f5307c = c20750g1.f65829t;
            c1837w0.f5308d = c20750g1;
            c1837w0.f5309e.setValue(c6045c);
            c1837w0.f5310f = (InterfaceC0172H0) c6021p2.m6548k(AbstractC0187M0.f702d);
            c1837w0.f5311g = (InterfaceC0303x1) c6021p2.m6548k(AbstractC0187M0.f713o);
            c1837w0.f5312h = (InterfaceC18285a) c6021p2.m6548k(AbstractC0187M0.f708j);
            c1837w0.f5313i = c13522n3;
            boolean z315 = !z11;
            c1837w0.f5314j.setValue(Boolean.valueOf(z315));
            c1837w0.f5315k.setValue(Boolean.valueOf(z10));
            objM6514H3 = c6021p.m6514H();
            objM529r = objM6514H3;
            if (objM6514H3 == c5975s2) {
                objM529r = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p2);
            }
            c2925c = ((C6035w) objM529r).f19668Y;
            objM6514H4 = c6021p.m6514H();
            obj3 = objM6514H4;
            if (objM6514H4 == c5975s2) {
                C19715c c19715c6 = new C19715c();
                c6021p2.m6537c0(c19715c6);
                obj3 = c19715c6;
            }
            c19715c = (C19715c) obj3;
            interfaceC10459qM10921b = C10456n.f30959Y;
            boolean zM6545h24 = c6021p2.m6545h(c20750g1);
            i17 = i26 & 7168;
            if (i17 == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z316 = zM6545h24 | z14;
            i18 = i26 & 57344;
            if (i18 == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean zM6545h25 = z15 | z316 | c6021p2.m6545h(c6046d6);
            i19 = i27;
            if (i19 == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z317 = zM6545h25 | z16;
            i20 = (i26 & 112) ^ 48;
            if (i20 > 32) {
            }
            c20724n1 = c20724n0;
            if ((i26 & 48) != 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM6545h = z317 | z17 | c6021p2.m6545h(interfaceC6073v) | c6021p2.m6545h(c2925c) | c6021p2.m6545h(c19715c) | c6021p2.m6545h(c1837w0);
            objM6514H5 = c6021p.m6514H();
            if (zM6545h) {
                c19715c2 = c19715c;
                interfaceC6073v2 = interfaceC6073v;
                c13522n = c13522n3;
                c6046d = c6046d6;
                c20750g2 = c20750g1;
                C20713I c20713i8 = new C20713I(c20750g1, z10, z11, c6046d6, c6045c, c6065n, interfaceC6073v2, c1837w0, c2925c, c19715c2);
                c6021p2.m6537c0(c20713i8);
                objM6514H5 = c20713i8;
            } else {
                c19715c2 = c19715c;
                interfaceC6073v2 = interfaceC6073v;
                c13522n = c13522n3;
                c6046d = c6046d6;
                c20750g2 = c20750g1;
                C20713I c20713i9 = new C20713I(c20750g1, z10, z11, c6046d6, c6045c, c6065n, interfaceC6073v2, c1837w0, c2925c, c19715c2);
                c6021p2.m6537c0(c20713i9);
                objM6514H5 = c20713i9;
            }
            InterfaceC10459q interfaceC10459qM11213a5 = AbstractC10838f.m11213a(AbstractC10862a.m11300b(AbstractC10862a.m11299a(interfaceC10459qM10921b, c13522n), (InterfaceC1436k) objM6514H5), z10, interfaceC17406l);
            if (z10) {
                z18 = false;
            } else {
                z18 = false;
            }
            interfaceC5985XM6435V = C5997d.m6435V(Boolean.valueOf(z18), c6021p2);
            C17296C c17296c5 = C17296C.f55119a;
            c20750g3 = c20750g2;
            c6046d2 = c6046d;
            zM6542f = c6021p2.m6542f(interfaceC5985XM6435V) | c6021p2.m6545h(c20750g3) | c6021p2.m6545h(c6046d2) | c6021p2.m6545h(c1837w0) | ((i20 <= 32 && c6021p2.m6542f(c6065n)) || (r12 & 48) == 32);
            objM6514H6 = c6021p.m6514H();
            if (zM6542f) {
                c6046d3 = c6046d2;
                C20785y c20785y8 = new C20785y(c20750g3, interfaceC5985XM6435V, c6046d3, c1837w0, c6065n, null);
                c6021p2.m6537c0(c20785y8);
                objM6514H6 = c20785y8;
            } else {
                c6046d3 = c6046d2;
                C20785y c20785y9 = new C20785y(c20750g3, interfaceC5985XM6435V, c6046d3, c1837w0, c6065n, null);
                c6021p2.m6537c0(c20785y9);
                objM6514H6 = c20785y9;
            }
            C5997d.m6450f((InterfaceC1439n) objM6514H6, c6021p2, c17296c5);
            zM6545h2 = c6021p2.m6545h(c20750g3);
            Object objM6514H116 = c6021p.m6514H();
            if (zM6545h2) {
                i21 = 1;
                C20709G c20709g8 = new C20709G(c20750g3, i21);
                c6021p2.m6537c0(c20709g8);
                obj4 = c20709g8;
            } else {
                i21 = 1;
                C20709G c20709g9 = new C20709G(c20750g3, i21);
                c6021p2.m6537c0(c20709g9);
                obj4 = c20709g9;
            }
            interfaceC10459qM20694b = AbstractC19744u.m20694b(interfaceC10459qM10921b, 8675309, new C1781O((InterfaceC1436k) obj4, null));
            boolean zM6545h1110 = c6021p2.m6545h(c20750g3);
            if (i18 == 16384) {
                i22 = i21;
            } else {
                i22 = 0;
            }
            int i213 = (zM6545h1110 ? 1 : 0) | i22;
            if (i17 == 2048) {
                i23 = i21;
            } else {
                i23 = 0;
            }
            interfaceC6073v3 = interfaceC6073v2;
            z19 = (((i213 | i23) | (c6021p2.m6545h(interfaceC6073v3) ? 1 : 0)) == true ? 1 : 0) | (c6021p2.m6545h(r6) ? 1 : 0);
            objM6514H7 = c6021p.m6514H();
            if (z19 == 0) {
                interfaceC6073v4 = interfaceC6073v3;
                C20715J c20715j8 = new C20715J(c20750g3, c13522n, z11, z10, r6, interfaceC6073v4);
                c6021p2.m6537c0(c20715j8);
                objM6514H7 = c20715j8;
            } else {
                interfaceC6073v4 = interfaceC6073v3;
                C20715J c20715j9 = new C20715J(c20750g3, c13522n, z11, z10, r6, interfaceC6073v4);
                c6021p2.m6537c0(c20715j9);
                objM6514H7 = c20715j9;
            }
            interfaceC1436k3 = (InterfaceC1436k) objM6514H7;
            c0280q = C0280q.f1030t0;
            if (z10) {
                i24 = 14;
                interfaceC10459qM10921b2 = AbstractC10443a.m10921b(interfaceC10459qM20694b, c0280q, new C14127l(interfaceC1436k3, i24, interfaceC17406l));
            } else {
                i24 = 14;
                interfaceC10459qM10921b2 = interfaceC10459qM20694b;
            }
            C7296c c7296c5 = c1837w0.f5325u;
            C1833u0 c1833u4 = c1837w0.f5324t;
            InterfaceC10459q interfaceC10459qM20686h5 = AbstractC19736m.m20686h(interfaceC10459qM10921b2.mo428M(new SuspendPointerInputElement(c7296c5, c1833u4, new C1773G(c7296c5, c1833u4, null), 4)), f65747b);
            boolean zM6545h1111 = c6021p2.m6545h(c20750g3);
            if (i19 == 4) {
                z20 = true;
            } else {
                z20 = false;
            }
            interfaceC6073v5 = interfaceC6073v4;
            zM6545h3 = zM6545h1111 | z20 | c6021p2.m6545h(interfaceC6073v5);
            Object objM6514H117 = c6021p.m6514H();
            if (zM6545h3) {
                C16663C c16663c8 = new C16663C(c20750g3, c6045c, interfaceC6073v5, i24);
                c6021p2.m6537c0(c16663c8);
                obj5 = c16663c8;
            } else {
                C16663C c16663c9 = new C16663C(c20750g3, c6045c, interfaceC6073v5, i24);
                c6021p2.m6537c0(c16663c9);
                obj5 = c16663c9;
            }
            InterfaceC10459q interfaceC10459qM11295a5 = AbstractC10861a.m11295a(interfaceC10459qM10921b, (InterfaceC1436k) obj5);
            boolean zM6545h1112 = c6021p2.m6545h(c20750g3);
            if (i17 == 2048) {
                z21 = true;
            } else {
                z21 = false;
            }
            boolean zM6542f8 = zM6545h1112 | z21 | c6021p2.m6542f(r35) | c6021p2.m6545h(c1837w0);
            if (i19 == 4) {
                z22 = true;
            } else {
                z22 = false;
            }
            zM6545h4 = zM6542f8 | z22 | c6021p2.m6545h(interfaceC6073v5);
            objM6514H8 = c6021p.m6514H();
            if (zM6545h4) {
                interfaceC0182K1 = r35;
                C4018a0 c4018a7 = new C4018a0(c20750g3, z10, interfaceC0182K1, c1837w0, c6045c, interfaceC6073v5, 1);
                c6021p2.m6537c0(c4018a7);
                objM6514H8 = c4018a7;
            } else {
                interfaceC0182K1 = r35;
                C4018a0 c4018a8 = new C4018a0(c20750g3, z10, interfaceC0182K1, c1837w0, c6045c, interfaceC6073v5, 1);
                c6021p2.m6537c0(c4018a8);
                objM6514H8 = c4018a8;
            }
            InterfaceC10459q interfaceC10459qM11318d9 = AbstractC10868a.m11318d(interfaceC10459qM10921b, (InterfaceC1436k) objM6514H8);
            boolean zM6545h1113 = c6021p2.m6545h(c6050h);
            if (r4 == 4) {
                z23 = true;
            } else {
                z23 = false;
            }
            boolean z318 = zM6545h1113 | z23;
            if (i17 == 2048) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean zM6544g5 = z318 | z24 | c6021p2.m6544g(false);
            if (i18 == 16384) {
                z25 = true;
            } else {
                z25 = false;
            }
            zM6545h5 = zM6544g5 | z25 | c6021p2.m6545h(c20750g3) | c6021p2.m6545h(interfaceC6073v5) | c6021p2.m6545h(r6) | ((i20 <= 32 && c6021p2.m6542f(c6065n)) || (r12 & 48) == 32);
            objM6514H9 = c6021p.m6514H();
            if (zM6545h5) {
                i25 = i20;
                c5975s = c5975s2;
                C20717K c20717k8 = new C20717K(c6050h, c6045c, z10, z11, c6065n, c20750g3, interfaceC6073v5, r6, c13522n);
                c6021p2.m6537c0(c20717k8);
                objM6514H9 = c20717k8;
            } else {
                i25 = i20;
                c5975s = c5975s2;
                C20717K c20717k9 = new C20717K(c6050h, c6045c, z10, z11, c6065n, c20750g3, interfaceC6073v5, r6, c13522n);
                c6021p2.m6537c0(c20717k9);
                objM6514H9 = c20717k9;
            }
            InterfaceC10459q interfaceC10459qM3789a5 = AbstractC2965l.m3789a(interfaceC10459qM10921b, true, (InterfaceC1436k) objM6514H9);
            if (!z10) {
                z26 = false;
            } else {
                z26 = false;
            }
            float f14 = AbstractC20776t0.f65981a;
            if (z26) {
                C2497c c2497c5 = new C2497c(abstractC14360p, c20750g3, c6045c, interfaceC6073v5, 14);
                c0280q2 = c0280q;
                interfaceC10459qM10921b3 = AbstractC10443a.m10921b(interfaceC10459qM10921b, c0280q2, c2497c5);
            } else {
                c0280q2 = c0280q;
                interfaceC10459qM10921b3 = interfaceC10459qM10921b;
            }
            zM6545h6 = c6021p2.m6545h(r6);
            Object objM6514H24 = c6021p.m6514H();
            obj6 = objM6514H24;
            if (zM6545h6) {
                C20787z c20787z8 = new C20787z(r6, 0);
                c6021p2.m6537c0(c20787z8);
                obj6 = c20787z8;
            } else {
                C20787z c20787z9 = new C20787z(r6, 0);
                c6021p2.m6537c0(c20787z9);
                obj6 = c20787z9;
            }
            C5997d.m6444c(r6, (InterfaceC1436k) obj6, c6021p2);
            c6046d4 = c6046d3;
            boolean zM6545h1114 = c6021p2.m6545h(c20750g3) | c6021p2.m6545h(c6046d4);
            if (i19 == 4) {
                z27 = true;
            } else {
                z27 = false;
            }
            int i34 = i25;
            z28 = zM6545h1114 | z27 | ((i34 <= 32 && c6021p2.m6542f(c6065n)) || (r12 & 48) == 32);
            objM6514H10 = c6021p.m6514H();
            if (z28) {
                C20699B c20699b8 = new C20699B(c20750g3, c6046d4, c6045c, c6065n, 0);
                c6021p2.m6537c0(c20699b8);
                objM6514H10 = c20699b8;
            } else {
                C20699B c20699b9 = new C20699B(c20750g3, c6046d4, c6045c, c6065n, 0);
                c6021p2.m6537c0(c20699b9);
                objM6514H10 = c20699b9;
            }
            C5997d.m6444c(c6065n, (InterfaceC1436k) objM6514H10, c6021p2);
            if (i10 == 1) {
                z29 = true;
            } else {
                z29 = false;
            }
            z30 = true;
            C5975S c5975s7 = c5975s;
            c0280q3 = c0280q2;
            InterfaceC10459q interfaceC10459qM10921b8 = AbstractC10443a.m10921b(interfaceC10459qM10921b, c0280q3, new C20782w0(c20750g3, r6, c6045c, z315, z29, interfaceC6073v5, c20724n1, c20750g3.f65829t, c6065n.f19760e));
            boolean zBooleanValue5 = ((Boolean) interfaceC5985XM6435V.getValue()).booleanValue();
            zM6545h7 = c6021p2.m6545h(c20750g3) | ((i34 <= 32 && c6021p2.m6542f(c6065n)) || (i26 & 48) == 32) | c6021p2.m6545h(c21611e2);
            objM6514H11 = c6021p.m6514H();
            if (zM6545h7) {
                C0494y c0494y8 = new C0494y(c20750g3, c13522n, c6065n, c21611e2, 18);
                c6021p2.m6537c0(c0494y8);
                objM6514H11 = c0494y8;
            } else {
                C0494y c0494y9 = new C0494y(c20750g3, c13522n, c6065n, c21611e2, 18);
                c6021p2.m6537c0(c0494y9);
                objM6514H11 = c0494y9;
            }
            InterfaceC10459q interfaceC10459qMo428M5 = AbstractC10865a.m11312b(AbstractC10865a.m11312b(AbstractC10855a.m11277a(interfaceC10459q, c21611e2, c20750g3, c1837w0).mo428M(AbstractC10854a.m11276a(zBooleanValue5, (InterfaceC1426a) objM6514H11)).mo428M(interfaceC10459qM11213a5), new C18194a(interfaceC13515g, 28, c20750g3)), new C18194a(c20750g3, 26, c1837w0)).mo428M(interfaceC10459qM10921b8);
            C20706E0 c20706e5 = c20706e0;
            InterfaceC10459q interfaceC10459qM11318d10 = AbstractC10868a.m11318d(AbstractC10443a.m10921b(interfaceC10459qMo428M5, c0280q3, new C16878e0(c20706e5, z10, interfaceC17406l)).mo428M(interfaceC10459qM20686h5).mo428M(interfaceC10459qM3789a5), new C20709G(c20750g3, 0));
            if (z10) {
                z30 = false;
            } else {
                z30 = false;
            }
            if (z30) {
                interfaceC10459qM10921b = AbstractC10443a.m10921b(interfaceC10459qM10921b, c0280q3, new C0468O(c1837w0, 4));
            }
            m21266g(interfaceC10459qM11318d10, c1837w0, AbstractC8411c.m8969c(-374338080, c6021p, new C20705E(interfaceC1440o, c20750g3, c3582m, i11, i10, c20706e5, c6045c, c2385o, interfaceC10459qM10921b3, interfaceC10459qM11295a5, interfaceC10459qM11318d9, interfaceC10459qM10921b, c19715c2, c1837w0, z30, z11, interfaceC1436k2, interfaceC6073v5, interfaceC7537b)), c6021p, 384);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C20707F(c6045c, interfaceC1436k, interfaceC10459q, c3582m, c2385o, interfaceC1436k2, interfaceC17406l, abstractC14360p, z6, i10, i11, c6065n, c20746e0, z10, z11, interfaceC1440o, i12, i13);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m21266g(InterfaceC10459q interfaceC10459q, C1837w0 c1837w0, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-20551815);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c1837w0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, true);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            m21264e(c1837w0, c8410b, c6021p, (i11 >> 3) & 126);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C19843f(interfaceC10459q, c1837w0, c8410b, i10, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0247  */
    /* JADX INFO: renamed from: h */
    public static final void m21267h(InterfaceC10459q interfaceC10459q, C3590f c3590f, InterfaceC1436k interfaceC1436k, boolean z6, Map map, C3582M c3582m, int i10, boolean z10, int i11, int i12, InterfaceC5598n interfaceC5598n, C1495h c1495h, InterfaceC14366v interfaceC14366v, InterfaceC1436k interfaceC1436k2, C6021p c6021p, int i13, int i14) {
        int i15;
        int i16;
        C20718K0 c20718k0;
        InterfaceC1426a interfaceC1426a;
        C17309l c17309l;
        InterfaceC1436k interfaceC1436k3;
        InterfaceC5985X interfaceC5985X;
        InterfaceC1436k interfaceC1436k4;
        Object obj;
        Object c9024d;
        boolean z11;
        boolean z12;
        Object obj2;
        Object obj3;
        Object obj4;
        Map map2 = map;
        c6021p.m6526U(645129368);
        if ((i13 & 6) == 0) {
            i15 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c6021p.m6542f(c3590f) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c6021p.m6545h(map2) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i15 |= c6021p.m6542f(c3582m) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= c6021p.m6538d(i10) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= c6021p.m6544g(z10) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= c6021p.m6538d(i11) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= c6021p.m6538d(i12) ? 536870912 : 268435456;
        }
        if ((i14 & 6) == 0) {
            i16 = i14 | (c6021p.m6545h(interfaceC5598n) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c6021p.m6545h(c1495h) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c6021p.m6545h(interfaceC14366v) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c6021p.m6545h(interfaceC1436k2) ? 2048 : 1024;
        }
        int i17 = i16;
        if ((i15 & 306783379) == 306783378 && (i17 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            boolean zM8106a = AbstractC7849B0.m8106a(c3590f);
            Object obj5 = C6013l.f19514a;
            if (zM8106a) {
                c6021p.m6524S(-619323167);
                boolean z13 = (i15 & 112) == 32;
                Object objM6514H = c6021p.m6514H();
                Object obj6 = objM6514H;
                if (z13 || objM6514H == obj5) {
                    Object c20718k1 = new C20718K0(c3590f);
                    c6021p.m6537c0(c20718k1);
                    obj6 = c20718k1;
                }
                c20718k0 = (C20718K0) obj6;
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-619265198);
                c6021p.m6553p(false);
                c20718k0 = null;
            }
            if (AbstractC7849B0.m8106a(c3590f)) {
                c6021p.m6524S(-619074547);
                boolean zM6542f = ((i15 & 112) == 32) | c6021p.m6542f(c20718k0);
                Object objM6514H2 = c6021p.m6514H();
                Object obj7 = objM6514H2;
                if (zM6542f || objM6514H2 == obj5) {
                    Object c16084f = new C16084f(c20718k0, 23, c3590f);
                    c6021p.m6537c0(c16084f);
                    obj7 = c16084f;
                }
                interfaceC1426a = (InterfaceC1426a) obj7;
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-618966357);
                boolean z14 = (i15 & 112) == 32;
                Object objM6514H3 = c6021p.m6514H();
                Object obj8 = objM6514H3;
                if (z14 || objM6514H3 == obj5) {
                    Object c17176b = new C17176b(c3590f, 27);
                    c6021p.m6537c0(c17176b);
                    obj8 = c17176b;
                }
                interfaceC1426a = (InterfaceC1426a) obj8;
                c6021p.m6553p(false);
            }
            if (!z6) {
                c17309l = new C17309l(null, null);
            } else if (map2 != null) {
                C17309l c17309l2 = AbstractC20743d.f65755a;
                if (map.isEmpty()) {
                    c17309l = AbstractC20743d.f65755a;
                } else {
                    List listM4300c = c3590f.m4300c(0, c3590f.f10934Y.length(), "androidx.compose.foundation.text.inlineContent");
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int size = listM4300c.size();
                    int i18 = 0;
                    while (i18 < size) {
                        List list = listM4300c;
                        C3588d c3588d = (C3588d) listM4300c.get(i18);
                        int i19 = size;
                        C20733W c20733w = (C20733W) map2.get(c3588d.f10930a);
                        if (c20733w != null) {
                            C3606v c3606v = c20733w.f65739a;
                            int i20 = c3588d.f10931b;
                            int i21 = c3588d.f10932c;
                            arrayList.add(new C3588d(c3606v, i20, i21));
                            arrayList2.add(new C3588d(c20733w.f65740b, i20, i21));
                        }
                        i18++;
                        map2 = map;
                        size = i19;
                        listM4300c = list;
                    }
                    c17309l = new C17309l(arrayList, arrayList2);
                }
            } else {
                c17309l = AbstractC20743d.f65755a;
            }
            List list2 = (List) c17309l.f55136Y;
            List list3 = (List) c17309l.f55137Z;
            if (z6) {
                c6021p.m6524S(-618671702);
                Object objM6514H4 = c6021p.m6514H();
                if (objM6514H4 == obj5) {
                    interfaceC1436k3 = null;
                    Object objM6430Q = C5997d.m6430Q(null, C5975S.f19448r0);
                    c6021p.m6537c0(objM6430Q);
                    obj4 = objM6430Q;
                } else {
                    interfaceC1436k3 = null;
                    obj4 = objM6514H4;
                }
                interfaceC5985X = (InterfaceC5985X) obj4;
                c6021p.m6553p(false);
            } else {
                interfaceC1436k3 = null;
                c6021p.m6524S(-618591630);
                c6021p.m6553p(false);
                interfaceC5985X = null;
            }
            if (z6) {
                c6021p.m6524S(-618506565);
                boolean zM6542f2 = c6021p.m6542f(interfaceC5985X);
                Object objM6514H5 = c6021p.m6514H();
                if (zM6542f2 || objM6514H5 == obj5) {
                    obj3 = objM6514H5;
                    Object c19899d = new C19899D(interfaceC5985X, 2);
                    c6021p.m6537c0(c19899d);
                    obj3 = c19899d;
                }
                c6021p.m6553p(false);
                interfaceC1436k4 = (InterfaceC1436k) obj3;
            } else {
                c6021p.m6524S(-618442830);
                c6021p.m6553p(false);
                interfaceC1436k4 = interfaceC1436k3;
            }
            InterfaceC10459q interfaceC10459qM11306b = AbstractC10864a.m11306b(interfaceC10459q, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 0, 131071);
            C3590f c3590f2 = (C3590f) interfaceC1426a.invoke();
            boolean zM6545h = c6021p.m6545h(c20718k0) | ((i15 & 896) == 256);
            Object objM6514H6 = c6021p.m6514H();
            Object obj9 = objM6514H6;
            if (zM6545h || objM6514H6 == obj5) {
                Object c20777u = new C20777u(c20718k0, interfaceC1436k, 0);
                c6021p.m6537c0(c20777u);
                obj9 = c20777u;
            }
            InterfaceC10459q interfaceC10459qM21284y = m21284y(interfaceC10459qM11306b, c3590f2, c3582m, (InterfaceC1436k) obj9, i10, z10, i11, i12, interfaceC5598n, list2, interfaceC1436k4, c1495h, interfaceC14366v, interfaceC1436k2);
            if (z6) {
                c6021p.m6524S(-617202116);
                boolean zM6545h2 = c6021p.m6545h(c20718k0);
                Object objM6514H7 = c6021p.m6514H();
                if (zM6545h2 || objM6514H7 == obj5) {
                    obj = objM6514H7;
                    Object c20779v = new C20779v(c20718k0, 1);
                    c6021p.m6537c0(c20779v);
                    obj = c20779v;
                }
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) obj;
                boolean zM6542f3 = c6021p.m6542f(interfaceC5985X);
                Object objM6514H8 = c6021p.m6514H();
                Object obj10 = objM6514H8;
                if (zM6542f3 || objM6514H8 == obj5) {
                    Object c14103t0 = new C14103t0(interfaceC5985X, 18);
                    c6021p.m6537c0(c14103t0);
                    obj10 = c14103t0;
                }
                c9024d = new C9024d(interfaceC1426a2, 2, (InterfaceC1426a) obj10);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-617362851);
                boolean zM6545h3 = c6021p.m6545h(c20718k0);
                Object objM6514H9 = c6021p.m6514H();
                if (zM6545h3 || objM6514H9 == obj5) {
                    z12 = false;
                    Object c20779v2 = new C20779v(c20718k0, false ? 1 : 0);
                    c6021p.m6537c0(c20779v2);
                    obj2 = c20779v2;
                } else {
                    z12 = false;
                    obj2 = objM6514H9;
                }
                c9024d = new C20754i0((InterfaceC1426a) obj2);
                c6021p.m6553p(z12);
            }
            int i22 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM21284y);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a3 = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a3);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c9024d);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i22))) {
                AbstractC0168G.m537z(i22, c6021p, i22, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            if (c20718k0 == null) {
                c6021p.m6524S(-515480539);
                z11 = false;
            } else {
                z11 = false;
                c6021p.m6524S(537560924);
                c20718k0.m21220a(0, c6021p);
            }
            c6021p.m6553p(z11);
            if (list3 == null) {
                c6021p.m6524S(-515428893);
            } else {
                c6021p.m6524S(-515428892);
                AbstractC20743d.m21287a(c3590f, list3, c6021p, (i15 >> 3) & 14);
            }
            c6021p.m6553p(z11);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C20781w(interfaceC10459q, c3590f, interfaceC1436k, z6, map, c3582m, i10, z10, i11, i12, interfaceC5598n, c1495h, interfaceC14366v, interfaceC1436k2, i13, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX INFO: renamed from: i */
    public static final void m21268i(C1837w0 c1837w0, C6021p c6021p, int i10) {
        int i11;
        int i12 = 1;
        int i13 = 0;
        c6021p.m6526U(-1436003720);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c1837w0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C20750g0 c20750g0 = c1837w0.f5308d;
            if (c20750g0 == null || !((Boolean) c20750g0.f65824o.getValue()).booleanValue()) {
                c6021p.m6524S(-284257090);
                c6021p.m6553p(false);
            } else {
                C20750g0 c20750g1 = c1837w0.f5308d;
                C3590f c3590f = c20750g1 != null ? c20750g1.f65810a.f65943a : null;
                if (c3590f == null || c3590f.f10934Y.length() <= 0) {
                    c6021p.m6524S(-284257090);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-285446808);
                    boolean zM6542f = c6021p.m6542f(c1837w0);
                    Object objM6514H = c6021p.m6514H();
                    Object obj = C6013l.f19514a;
                    if (zM6542f || objM6514H == obj) {
                        objM6514H = new C1833u0(c1837w0, i13);
                        c6021p.m6537c0(objM6514H);
                    }
                    InterfaceC20772r0 interfaceC20772r0 = (InterfaceC20772r0) objM6514H;
                    InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
                    InterfaceC6073v interfaceC6073v = c1837w0.f5306b;
                    long j10 = c1837w0.m2686j().f19683b;
                    int i14 = C3581L.f10907c;
                    int iMo1766b = interfaceC6073v.mo1766b((int) (j10 >> 32));
                    C20750g0 c20750g2 = c1837w0.f5308d;
                    C20710G0 c20710g0M21294d = c20750g2 != null ? c20750g2.m21294d() : null;
                    AbstractC16544l.m18091d(c20710g0M21294d);
                    C3578I c3578i = c20710g0M21294d.f65650a;
                    C13801c c13801cM4253c = c3578i.m4253c(AbstractC8301I.m8921l(iMo1766b, 0, c3578i.f10892a.f10882a.f10934Y.length()));
                    long jM8536b = AbstractC8088f6.m8536b((interfaceC7537b.mo7864b0(AbstractC20776t0.f65981a) / 2) + c13801cM4253c.f43586a, c13801cM4253c.f43589d);
                    boolean zM6540e = c6021p.m6540e(jM8536b);
                    Object objM6514H2 = c6021p.m6514H();
                    if (zM6540e || objM6514H2 == obj) {
                        objM6514H2 = new C20719L(jM8536b);
                        c6021p.m6537c0(objM6514H2);
                    }
                    InterfaceC1818n interfaceC1818n = (InterfaceC1818n) objM6514H2;
                    boolean zM6545h = c6021p.m6545h(interfaceC20772r0) | c6021p.m6545h(c1837w0);
                    Object objM6514H3 = c6021p.m6514H();
                    if (zM6545h || objM6514H3 == obj) {
                        objM6514H3 = new C20727P(interfaceC20772r0, c1837w0, null);
                        c6021p.m6537c0(objM6514H3);
                    }
                    SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(interfaceC20772r0, null, (InterfaceC1439n) objM6514H3, 6);
                    boolean zM6540e2 = c6021p.m6540e(jM8536b);
                    Object objM6514H4 = c6021p.m6514H();
                    if (zM6540e2 || objM6514H4 == obj) {
                        objM6514H4 = new C0478i(jM8536b, 7);
                        c6021p.m6537c0(objM6514H4);
                    }
                    AbstractC20739b.m21256a(interfaceC1818n, AbstractC2965l.m3789a(suspendPointerInputElement, false, (InterfaceC1436k) objM6514H4), 0L, c6021p, 0, 4);
                    c6021p.m6553p(false);
                }
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C19941z(c1837w0, i10, i12);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m21269j(C1837w0 c1837w0, boolean z6, C6021p c6021p, int i10) {
        int i11;
        C20710G0 c20710g0M21294d;
        c6021p.m6526U(626339208);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c1837w0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else if (z6) {
            c6021p.m6524S(-1286242594);
            C20750g0 c20750g0 = c1837w0.f5308d;
            C3578I c3578i = null;
            if (c20750g0 != null && (c20710g0M21294d = c20750g0.m21294d()) != null) {
                C3578I c3578i2 = c20710g0M21294d.f65650a;
                C20750g0 c20750g1 = c1837w0.f5308d;
                if (!(c20750g1 != null ? c20750g1.f65825p : true)) {
                    c3578i = c3578i2;
                }
            }
            if (c3578i == null) {
                c6021p.m6524S(-1285984396);
            } else {
                c6021p.m6524S(-1285984395);
                if (C3581L.m4267c(c1837w0.m2686j().f19683b)) {
                    c6021p.m6524S(-1679637798);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-1680616096);
                    int iMo1766b = c1837w0.f5306b.mo1766b((int) (c1837w0.m2686j().f19683b >> 32));
                    int iMo1766b2 = c1837w0.f5306b.mo1766b((int) (c1837w0.m2686j().f19683b & 4294967295L));
                    EnumC7198h enumC7198hM4251a = c3578i.m4251a(iMo1766b);
                    EnumC7198h enumC7198hM4251a2 = c3578i.m4251a(Math.max(iMo1766b2 - 1, 0));
                    C20750g0 c20750g2 = c1837w0.f5308d;
                    if (c20750g2 == null || !((Boolean) c20750g2.f65822m.getValue()).booleanValue()) {
                        c6021p.m6524S(-1679975078);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-1680216289);
                        AbstractC1807h0.m2619h(true, enumC7198hM4251a, c1837w0, c6021p, ((i11 << 6) & 896) | 6);
                        c6021p.m6553p(false);
                    }
                    C20750g0 c20750g3 = c1837w0.f5308d;
                    if (c20750g3 == null || !((Boolean) c20750g3.f65823n.getValue()).booleanValue()) {
                        c6021p.m6524S(-1679655654);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-1679895904);
                        AbstractC1807h0.m2619h(false, enumC7198hM4251a2, c1837w0, c6021p, ((i11 << 6) & 896) | 6);
                        c6021p.m6553p(false);
                    }
                    c6021p.m6553p(false);
                }
                C20750g0 c20750g4 = c1837w0.f5308d;
                if (c20750g4 != null) {
                    boolean zM18089b = AbstractC16544l.m18089b(c1837w0.f5322r.f19682a.f10934Y, c1837w0.m2686j().f19682a.f10934Y);
                    C6002f0 c6002f0 = c20750g4.f65821l;
                    if (!zM18089b) {
                        c6002f0.setValue(Boolean.FALSE);
                    }
                    if (c20750g4.m21292b()) {
                        if (((Boolean) c6002f0.getValue()).booleanValue()) {
                            c1837w0.m2691o();
                        } else {
                            c1837w0.m2687k();
                        }
                    }
                }
            }
            c6021p.m6553p(false);
            c6021p.m6553p(false);
        } else {
            c6021p.m6524S(651305535);
            c6021p.m6553p(false);
            c1837w0.m2687k();
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8761E(c1837w0, z6, i10, 3);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m21270k(C20750g0 c20750g0) {
        C6049G c6049g = c20750g0.f65814e;
        if (c6049g != null) {
            c20750g0.f65829t.invoke(C6045C.m6612a((C6045C) c20750g0.f65813d.f46724Y, null, 0L, 3));
            C6046D c6046d = c6049g.f19706a;
            AtomicReference atomicReference = c6046d.f19686b;
            while (!atomicReference.compareAndSet(c6049g, null)) {
                if (atomicReference.get() != c6049g) {
                }
            }
            c6046d.f19685a.mo6617d();
        }
        c20750g0.f65814e = null;
    }

    /* JADX INFO: renamed from: l */
    public static final C13801c m21271l(InterfaceC7537b interfaceC7537b, int i10, C6050H c6050h, C3578I c3578i, boolean z6, int i11) {
        C13801c c13801cM4253c = c3578i != null ? c3578i.m4253c(c6050h.f19709b.mo1766b(i10)) : C13801c.f43585e;
        int iMo7866k0 = interfaceC7537b.mo7866k0(AbstractC20776t0.f65981a);
        float f10 = c13801cM4253c.f43586a;
        return C13801c.m15314b(c13801cM4253c, z6 ? (i11 - f10) - iMo7866k0 : f10, z6 ? i11 - f10 : iMo7866k0 + f10, 0.0f, 10);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m21272m(int i10, KeyEvent keyEvent) {
        return ((int) (AbstractC18857c.m20157d(keyEvent) >> 32)) == i10;
    }

    /* JADX INFO: renamed from: n */
    public static final ArrayList m21273n(List list, InterfaceC1426a interfaceC1426a) {
        C11500p c11500p;
        if (!((Boolean) interfaceC1426a.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC21056J interfaceC21056J = (InterfaceC21056J) list.get(i10);
            Object objMo21534t = interfaceC21056J.mo21534t();
            AbstractC16544l.m18092e(objMo21534t, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            C6769c c6769c = ((C20722M0) objMo21534t).f65701Y;
            C3578I c3578i = (C3578I) ((C20718K0) c6769c.f21718o0).f65691b.getValue();
            if (c3578i == null) {
                c11500p = new C11500p(0, 0, C20716J0.f65680Y);
            } else {
                C7544i c7544iM9638b = AbstractC9107B4.m9638b(c3578i.m4262l(c6769c.f21716Y, c6769c.f21717Z).m15729a());
                c11500p = new C11500p(c7544iM9638b.m7885b(), c7544iM9638b.m7884a(), new C20714I0(c7544iM9638b, 0));
            }
            int i11 = c11500p.f34808Z;
            int iMin = Math.min(i11, 262142);
            int iMin2 = Integer.MAX_VALUE;
            int iMin3 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
            int iM9960c = AbstractC9388w4.m9960c(iMin3 == Integer.MAX_VALUE ? iMin : iMin3);
            int i12 = c11500p.f34809o0;
            if (i12 != Integer.MAX_VALUE) {
                iMin2 = Math.min(iM9960c, i12);
            }
            arrayList.add(new C17309l(interfaceC21056J.mo21533p(AbstractC9388w4.m9958a(iMin, iMin3, Math.min(iM9960c, i12), iMin2)), (AbstractC16546n) c11500p.f34810p0));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static final void m21274o(C6046D c6046d, C20750g0 c20750g0, C6045C c6045c, C6065n c6065n, InterfaceC6073v interfaceC6073v) {
        C16525B c16525b = new C16525B();
        C16663C c16663c = new C16663C(c20750g0.f65813d, c20750g0.f65829t, c16525b, 15);
        InterfaceC6074w interfaceC6074w = c6046d.f19685a;
        interfaceC6074w.mo6619f(c6045c, c6065n, c16663c, c20750g0.f65830u);
        C6049G c6049g = new C6049G(c6046d, interfaceC6074w);
        c6046d.f19686b.set(c6049g);
        c16525b.f51262Y = c6049g;
        c20750g0.f65814e = c6049g;
        m21282w(c20750g0, c6045c, interfaceC6073v);
    }

    /* JADX INFO: renamed from: p */
    public static final int m21275p(float f10) {
        return Math.round((float) Math.ceil(f10));
    }

    /* JADX INFO: renamed from: q */
    public static final Object m21276q(C19723A c19723a, InterfaceC20772r0 interfaceC20772r0, AbstractC19694j abstractC19694j) {
        Object objM1183l = AbstractC0575H.m1183l(new C20760l0(c19723a, interfaceC20772r0, null), abstractC19694j);
        return objM1183l == EnumC19250a.f61036Y ? objM1183l : C17296C.f55119a;
    }

    /* JADX INFO: renamed from: r */
    public static final C6050H m21277r(C2385o c2385o, C3590f c3590f) {
        c2385o.getClass();
        int length = c3590f.f10934Y.length();
        int length2 = c3590f.f10934Y.length();
        int iMin = Math.min(length, 100);
        for (int i10 = 0; i10 < iMin; i10++) {
            m21258A(i10, length2, i10);
        }
        m21258A(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i11 = 0; i11 < iMin2; i11++) {
            m21259B(i11, length, i11);
        }
        m21259B(length2, length, length2);
        return new C6050H(c3590f, new C0781s(c3590f.f10934Y.length(), c3590f.f10934Y.length(), 10));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static final int m21278s(int i10, String str) {
        C7218j c7218jM7609a;
        int spanEnd;
        Integer num = null;
        if (C7218j.m7610c()) {
            c7218jM7609a = C7218j.m7609a();
            if (c7218jM7609a.m7611b() != 1) {
                c7218jM7609a = null;
            }
        } else {
            c7218jM7609a = null;
        }
        if (c7218jM7609a != null) {
            C5311e c5311e = (C5311e) c7218jM7609a.f22900e.f22888a;
            c5311e.getClass();
            if (i10 < 0 || i10 >= str.length()) {
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                C7231w[] c7231wArr = (C7231w[]) spanned.getSpans(i10, i10 + 1, C7231w.class);
                if (c7231wArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(c7231wArr[0]);
                } else {
                    spanEnd = ((C7223o) c5311e.m5869y(str, Math.max(0, i10 - 16), Math.min(str.length(), i10 + 16), Integer.MAX_VALUE, true, new C7223o(i10))).f22910o0;
                }
            } else {
                spanEnd = ((C7223o) c5311e.m5869y(str, Math.max(0, i10 - 16), Math.min(str.length(), i10 + 16), Integer.MAX_VALUE, true, new C7223o(i10))).f22910o0;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            if (spanEnd != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i10);
    }

    /* JADX INFO: renamed from: t */
    public static final int m21279t(int i10, CharSequence charSequence) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == '\n') {
                return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: u */
    public static final int m21280u(int i10, CharSequence charSequence) {
        while (i10 > 0) {
            if (charSequence.charAt(i10 - 1) == '\n') {
                return i10;
            }
            i10--;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static final int m21281v(int i10, String str) {
        C7218j c7218jM7609a;
        int spanStart;
        Integer num = null;
        if (C7218j.m7610c()) {
            c7218jM7609a = C7218j.m7609a();
            if (c7218jM7609a.m7611b() != 1) {
                c7218jM7609a = null;
            }
        } else {
            c7218jM7609a = null;
        }
        if (c7218jM7609a != null) {
            int iMax = Math.max(0, i10 - 1);
            C5311e c5311e = (C5311e) c7218jM7609a.f22900e.f22888a;
            c5311e.getClass();
            if (iMax < 0 || iMax >= str.length()) {
                spanStart = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                C7231w[] c7231wArr = (C7231w[]) spanned.getSpans(iMax, iMax + 1, C7231w.class);
                if (c7231wArr.length > 0) {
                    spanStart = spanned.getSpanStart(c7231wArr[0]);
                } else {
                    spanStart = ((C7223o) c5311e.m5869y(str, Math.max(0, iMax - 16), Math.min(str.length(), iMax + 16), Integer.MAX_VALUE, true, new C7223o(iMax))).f22909Z;
                }
            } else {
                spanStart = ((C7223o) c5311e.m5869y(str, Math.max(0, iMax - 16), Math.min(str.length(), iMax + 16), Integer.MAX_VALUE, true, new C7223o(iMax))).f22909Z;
            }
            Integer numValueOf = Integer.valueOf(spanStart);
            if (spanStart != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }

    /* JADX INFO: renamed from: w */
    public static final void m21282w(C20750g0 c20750g0, C6045C c6045c, InterfaceC6073v interfaceC6073v) {
        AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
        InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
        AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
        try {
            C20710G0 c20710g0M21294d = c20750g0.m21294d();
            if (c20710g0M21294d == null) {
                return;
            }
            C6049G c6049g = c20750g0.f65814e;
            if (c6049g == null) {
                return;
            }
            InterfaceC21098s interfaceC21098sM21293c = c20750g0.m21293c();
            if (interfaceC21098sM21293c == null) {
                return;
            }
            m21283x(c6045c, c20750g0.f65810a, c20710g0M21294d.f65650a, interfaceC21098sM21293c, c6049g, c20750g0.m21292b(), interfaceC6073v);
        } finally {
            AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m21283x(C6045C c6045c, C20770q0 c20770q0, C3578I c3578i, InterfaceC21098s interfaceC21098s, C6049G c6049g, boolean z6, InterfaceC6073v interfaceC6073v) {
        C13801c c13801c;
        if (z6) {
            int iMo1766b = interfaceC6073v.mo1766b(C3581L.m4269e(c6045c.f19683b));
            if (iMo1766b < c3578i.f10892a.f10882a.f10934Y.length()) {
                c13801c = c3578i.m4252b(iMo1766b);
            } else if (iMo1766b != 0) {
                c13801c = c3578i.m4252b(iMo1766b - 1);
            } else {
                c13801c = new C13801c(0.0f, 0.0f, 1.0f, (int) (AbstractC20778u0.m21304a(c20770q0.f65944b, c20770q0.f65949g, c20770q0.f65950h, AbstractC20778u0.f65985a, 1) & 4294967295L));
            }
            long jMo21517D = interfaceC21098s.mo21517D(AbstractC8088f6.m8536b(c13801c.f43586a, c13801c.f43587b));
            C13801c c13801cM8568b = AbstractC8096g6.m8568b(AbstractC8088f6.m8536b(C13800b.m15306g(jMo21517D), C13800b.m15307h(jMo21517D)), AbstractC8112i6.m8603a(c13801c.m15321h(), c13801c.m15318e()));
            if (AbstractC16544l.m18089b((C6049G) c6049g.f19706a.f19686b.get(), c6049g)) {
                c6049g.f19707b.mo6620g(c13801cM8568b);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static final InterfaceC10459q m21284y(InterfaceC10459q interfaceC10459q, C3590f c3590f, C3582M c3582m, InterfaceC1436k interfaceC1436k, int i10, boolean z6, int i11, int i12, InterfaceC5598n interfaceC5598n, List list, InterfaceC1436k interfaceC1436k2, C1495h c1495h, InterfaceC14366v interfaceC14366v, InterfaceC1436k interfaceC1436k3) {
        if (c1495h == null) {
            return interfaceC10459q.mo428M(C10456n.f30959Y).mo428M(new TextAnnotatedStringElement(c3590f, c3582m, interfaceC5598n, interfaceC1436k, i10, z6, i11, i12, list, interfaceC1436k2, interfaceC14366v, interfaceC1436k3));
        }
        return interfaceC10459q.mo428M(c1495h.f3964r0).mo428M(new SelectableTextAnnotatedStringElement(c3590f, c3582m, interfaceC5598n, interfaceC1436k, i10, z6, i11, i12, list, interfaceC1436k2, c1495h, interfaceC14366v));
    }

    /* JADX INFO: renamed from: z */
    public static final void m21285z(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException(AbstractC0168G.m532u("both minLines ", i10, " and maxLines ", i11, " must be greater than zero").toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("minLines ", i10, i11, " must be less than or equal to maxLines ").toString());
        }
    }
}
