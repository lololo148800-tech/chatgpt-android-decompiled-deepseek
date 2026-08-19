package com.openai.feature.conversations.impl.input;

import android.content.Context;
import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.draw.AbstractC10861a;
import androidx.compose.p650ui.layout.AbstractC10868a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.google.protobuf.AbstractC12107L1;
import com.openai.chatgpt.R;
import com.openai.feature.conversations.impl.conversation.ConversationViewModel;
import com.openai.feature.conversations.input.InputViewModel;
import com.openai.feature.messages.MessagesViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import ge.C14103t0;
import ge.C14107v0;
import ge.C14111x0;
import ge.EnumC14057V0;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import mm.C17309l;
import ni.C17632f;
import p000.C17122m;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.AbstractC0233b1;
import p003A1.InterfaceC0300w1;
import p021Aj.C0537v;
import p025An.C0644w;
import p042Bf.C1275q;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p092Dc.C1996m;
import p098Di.InterfaceC2062k;
import p1025te.C19866Q;
import p1042uh.C20263a0;
import p1051v0.AbstractC20417e;
import p1095x1.InterfaceC21057K;
import p1113xn.AbstractC21322p;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21958S;
import p1155zi.C21987b0;
import p1155zi.C21995d0;
import p1155zi.C21999e0;
import p1155zi.EnumC21964U;
import p124Ei.C2452G;
import p124Ei.C2463L0;
import p124Ei.C2506f;
import p193Hf.C3371i0;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3759g;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4034c4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p270Ki.C4702c;
import p293Lh.C5062h;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p350O1.C6045C;
import p362Of.C6186a;
import p362Of.C6194i;
import p385Pj.C6427b;
import p478Tc.AbstractC7306j;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p478Tc.AbstractC7314r;
import p492U1.C7543h;
import p507Uh.InterfaceC7678d;
import p523V9.AbstractC8018W4;
import p523V9.AbstractC8025X4;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8571V2;
import p544W9.AbstractC8747y4;
import p547Wc.C8777V;
import p547Wc.C8805o;
import p552Wg.C8846h;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9183O2;
import p571X9.AbstractC9262b4;
import p594Y9.AbstractC9815U2;
import p594Y9.AbstractC9830X;
import p594Y9.AbstractC9856b0;
import p620Zc.InterfaceC10277b;
import p623Zf.C10312h;
import p624Zg.C10361c0;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p679ce.C11720k;
import p736f0.AbstractC13474L;
import p736f0.AbstractC13508z;
import p736f0.C13485c;
import p737f1.C13522n;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13795w0;
import p758g0.C13783q0;
import p774h1.C14365u;
import p795i.C14893g;
import p859l.C16653d;
import p870le.AbstractC16854K;
import p870le.AbstractC16868Z;
import p870le.AbstractC16877e;
import p870le.C16856M;
import p870le.C16857N;
import p870le.C16858O;
import p870le.C16859P;
import p870le.C16861S;
import p870le.C16862T;
import p870le.C16863U;
import p870le.C16864V;
import p870le.C16899p;
import p870le.C16901q;
import p870le.C16905s;
import p870le.C16907t;
import p870le.C16909u;
import p894n0.InterfaceC17406l;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17756f;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17790w;
import p926of.C18160X;
import p948pi.C18418a;
import p951pp.AbstractC18539i;
import ye.EnumC21517f;

/* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12341a {
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v15 ??, still in use, count: 1, list:
          (r6v15 ?? I:java.lang.Object) from 0x0364: INVOKE (r48v0 ?? I:O0.p), (r6v15 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:869)
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
    public static final void m14264a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v15 ??, still in use, count: 1, list:
          (r6v15 ?? I:java.lang.Object) from 0x0364: INVOKE (r48v0 ?? I:O0.p), (r6v15 ?? I:java.lang.Object) VIRTUAL call: O0.p.c0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:869)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r46v0 ??
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

    /* JADX INFO: renamed from: b */
    public static final void m14265b(C21987b0 banner, boolean z6, InterfaceC1436k onInputIntent, InterfaceC1436k onConversationIntent, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(banner, "banner");
        AbstractC16544l.m18094g(onInputIntent, "onInputIntent");
        AbstractC16544l.m18094g(onConversationIntent, "onConversationIntent");
        c6021p.m6526U(-1973151930);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(banner) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onInputIntent) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onConversationIntent) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(740098604);
            boolean z10 = ((i11 & 896) == 256) | ((i11 & 112) == 32);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (z10 || objM6514H == c5975s) {
                objM6514H = new C2506f(onInputIntent, z6, 2);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(740102273);
            int i12 = i11 & 7168;
            boolean z11 = i12 == 2048;
            Object objM6514H2 = c6021p.m6514H();
            if (z11 || objM6514H2 == c5975s) {
                objM6514H2 = new C10312h(24, onConversationIntent);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6524S(740111381);
            boolean z12 = i12 == 2048;
            Object objM6514H3 = c6021p.m6514H();
            if (z12 || objM6514H3 == c5975s) {
                objM6514H3 = new C10312h(25, onConversationIntent);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H3;
            c6021p.m6553p(false);
            c6021p.m6524S(740105642);
            boolean z13 = i12 == 2048;
            Object objM6514H4 = c6021p.m6514H();
            if (z13 || objM6514H4 == c5975s) {
                objM6514H4 = new C10312h(26, onConversationIntent);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            AbstractC8018W4.m8343c(banner, interfaceC1426a, null, interfaceC1426a2, interfaceC1426a3, (InterfaceC1426a) objM6514H4, c6021p, i11 & 14, 4);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(banner, z6, onInputIntent, onConversationIntent, i10, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0303 A[LOOP:0: B:95:0x02f2->B:100:0x0303, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:103:0x0309  */
    /* JADX WARN: Code duplicated, block: B:104:0x0310  */
    /* JADX WARN: Code duplicated, block: B:107:0x0321  */
    /* JADX WARN: Code duplicated, block: B:108:0x0325  */
    /* JADX WARN: Code duplicated, block: B:111:0x0356 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0358  */
    /* JADX WARN: Code duplicated, block: B:115:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:116:0x03c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:120:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:122:0x040f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0411  */
    /* JADX WARN: Code duplicated, block: B:125:0x0414 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0416  */
    /* JADX WARN: Code duplicated, block: B:129:0x0441 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x0443  */
    /* JADX WARN: Code duplicated, block: B:133:0x047c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x047e  */
    /* JADX WARN: Code duplicated, block: B:137:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:140:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:144:0x04da  */
    /* JADX WARN: Code duplicated, block: B:146:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:147:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:150:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:153:0x050a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x0518  */
    /* JADX WARN: Code duplicated, block: B:160:0x051d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0539 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x053b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0590  */
    /* JADX WARN: Code duplicated, block: B:168:0x05b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:172:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:174:0x05de  */
    /* JADX WARN: Code duplicated, block: B:175:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:178:0x05f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:183:0x060e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0619  */
    /* JADX WARN: Code duplicated, block: B:187:0x0625  */
    /* JADX WARN: Code duplicated, block: B:190:0x0630  */
    /* JADX WARN: Code duplicated, block: B:202:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:205:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:207:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:209:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:212:0x0716  */
    /* JADX WARN: Code duplicated, block: B:213:0x071a  */
    /* JADX WARN: Code duplicated, block: B:216:0x072f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0740  */
    /* JADX WARN: Code duplicated, block: B:223:0x0775  */
    /* JADX WARN: Code duplicated, block: B:224:0x0778  */
    /* JADX WARN: Code duplicated, block: B:227:0x077d  */
    /* JADX WARN: Code duplicated, block: B:230:0x079c  */
    /* JADX WARN: Code duplicated, block: B:232:0x07a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:234:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:237:0x07df  */
    /* JADX WARN: Code duplicated, block: B:238:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:241:0x0811  */
    /* JADX WARN: Code duplicated, block: B:243:0x0817  */
    /* JADX WARN: Code duplicated, block: B:246:0x0827  */
    /* JADX WARN: Code duplicated, block: B:248:0x0835  */
    /* JADX WARN: Code duplicated, block: B:254:0x0852  */
    /* JADX WARN: Code duplicated, block: B:257:0x0884 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:260:0x0889  */
    /* JADX WARN: Code duplicated, block: B:263:0x0987 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:266:0x098c  */
    /* JADX WARN: Code duplicated, block: B:269:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:271:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:274:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:276:0x0a36  */
    /* JADX WARN: Code duplicated, block: B:281:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:283:0x0a64 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:284:0x0a66  */
    /* JADX WARN: Code duplicated, block: B:286:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:289:0x0aae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:290:0x0ab0  */
    /* JADX WARN: Code duplicated, block: B:293:0x0ad6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:294:0x0ad8  */
    /* JADX WARN: Code duplicated, block: B:297:0x0b00 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:298:0x0b02  */
    /* JADX WARN: Code duplicated, block: B:301:0x0b33  */
    /* JADX WARN: Code duplicated, block: B:303:0x0b45  */
    /* JADX WARN: Code duplicated, block: B:306:0x0b4a  */
    /* JADX WARN: Code duplicated, block: B:310:0x0b62  */
    /* JADX WARN: Code duplicated, block: B:311:0x0b64  */
    /* JADX WARN: Code duplicated, block: B:314:0x0b75 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:315:0x0b77  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:320:0x0ba0  */
    /* JADX WARN: Code duplicated, block: B:322:0x0bae  */
    /* JADX WARN: Code duplicated, block: B:324:0x0bbe  */
    /* JADX WARN: Code duplicated, block: B:326:0x0bc4  */
    /* JADX WARN: Code duplicated, block: B:328:0x0bd5  */
    /* JADX WARN: Code duplicated, block: B:330:0x0bdd  */
    /* JADX WARN: Code duplicated, block: B:332:0x0be3  */
    /* JADX WARN: Code duplicated, block: B:334:0x0be9  */
    /* JADX WARN: Code duplicated, block: B:336:0x0bf9  */
    /* JADX WARN: Code duplicated, block: B:338:0x0c01  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:340:0x0c09  */
    /* JADX WARN: Code duplicated, block: B:342:0x0c11  */
    /* JADX WARN: Code duplicated, block: B:344:0x0c20  */
    /* JADX WARN: Code duplicated, block: B:346:0x0c27  */
    /* JADX WARN: Code duplicated, block: B:348:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0307 A[EDGE_INSN: B:349:0x0307->B:102:0x0307 BREAK  A[LOOP:0: B:95:0x02f2->B:100:0x0303], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x0164  */
    /* JADX WARN: Code duplicated, block: B:58:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x017a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0185  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:75:0x0219  */
    /* JADX WARN: Code duplicated, block: B:76:0x0222  */
    /* JADX WARN: Code duplicated, block: B:79:0x022e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0240  */
    /* JADX WARN: Code duplicated, block: B:85:0x026b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0291  */
    /* JADX WARN: Code duplicated, block: B:89:0x029e  */
    /* JADX WARN: Code duplicated, block: B:92:0x02be  */
    /* JADX WARN: Code duplicated, block: B:93:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX INFO: renamed from: c */
    public static final void m14266c(InterfaceC10459q interfaceC10459q, C13522n c13522n, C6021p c6021p, int i10, int i11) {
        InterfaceC10459q interfaceC10459q2;
        int i12;
        C13522n c13522n2;
        int i13;
        C10456n c10456n;
        Object obj;
        InterfaceC0300w1 interfaceC0300w1;
        C5984W0 c5984w0;
        Context context;
        C5984W0 c5984w1;
        boolean zBooleanValue;
        C5984W0 c5984w2;
        List list;
        InterfaceC2062k interfaceC2062k;
        ViewModelStoreOwner viewModelStoreOwnerM12165a;
        C16527D c16527d;
        InterfaceC10459q interfaceC10459q3;
        boolean zM6542f;
        Object objM6514H;
        ConversationViewModel conversationViewModel;
        Context context2;
        boolean zBooleanValue2;
        List list2;
        InterfaceC2062k interfaceC2062k2;
        ViewModelStoreOwner viewModelStoreOwnerM12165a2;
        boolean zM6542f2;
        Object objM6514H2;
        MessagesViewModel messagesViewModel;
        C14111x0 c14111x0;
        boolean zM6542f3;
        Object objM6514H3;
        InterfaceC3759g interfaceC3759g;
        Object objM530s;
        C5975S c5975s;
        Object obj2;
        InterfaceC5985X interfaceC5985X;
        Object objM530s2;
        InterfaceC5985X interfaceC5985X2;
        Object objM530s3;
        InterfaceC5985X interfaceC5985X3;
        InterfaceC7678d interfaceC7678dM10508c;
        Object objM6514H4;
        C14893g c14893gM9235b;
        Object objM6514H5;
        C14893g c14893gM9235b2;
        Object objM6514H6;
        C14893g c14893gM9235b3;
        C8870f c8870f;
        Iterator it;
        Object next;
        Object objM19235b;
        C1996m c1996m;
        C18418a c18418a;
        boolean zM6542f4;
        C18418a c18418a2;
        Object objM6514H7;
        InterfaceC1436k interfaceC1436k;
        Context context3;
        boolean zBooleanValue3;
        List list3;
        boolean z6;
        InterfaceC2062k interfaceC2062k3;
        ViewModelStoreOwner viewModelStoreOwnerM12165a3;
        C16527D c16527d2;
        C13522n c13522n3;
        boolean zM6542f5;
        Object objM6514H8;
        BaseViewModel baseViewModel;
        InterfaceC5985X interfaceC5985XM19531n;
        boolean zM6545h;
        Object objM6514H9;
        InputViewModel inputViewModel;
        C19866Q c19866q;
        boolean zM6545h2;
        Object objM6514H10;
        InterfaceC3759g interfaceC3759g2;
        Object objM6514H11;
        InterfaceC5985X interfaceC5985X4;
        boolean z10;
        Object objM6514H12;
        InterfaceC17406l interfaceC17406l;
        boolean zBooleanValue4;
        boolean z11;
        long jM15774b;
        boolean z12;
        InterfaceC5982V0 interfaceC5982V0M14999a;
        boolean zM6542f6;
        Object objM6514H13;
        C13522n c13522n4;
        InterfaceC0300w1 interfaceC0300w2;
        C21999e0 c21999e0;
        C21958S c21958sM22341a;
        C13522n c13522n5;
        InterfaceC3759g interfaceC3759g3;
        ?? r10;
        Object obj3;
        int i14;
        C21696i c21696i;
        C21694h c21694h;
        C21694h c21694h2;
        C21694h c21694h3;
        C21987b0 c21987b0;
        InterfaceC3759g interfaceC3759g4;
        float f10;
        float f11;
        int i15;
        C21694h c21694h4;
        Object objM6514H14;
        C5996c0 c5996c0;
        InterfaceC10277b interfaceC10277bM19906b;
        boolean zM6545h3;
        Object objM6514H15;
        int i16;
        InterfaceC1426a interfaceC1426a;
        C21694h c21694h5;
        Object obj4;
        InterfaceC3759g interfaceC3759g5;
        boolean zM6542f7;
        Object objM6514H16;
        int i17;
        int i18;
        int i19;
        Object obj5;
        InterfaceC3759g interfaceC3759g6;
        boolean zM6545h4;
        Object objM6514H17;
        boolean zM6545h5;
        Object objM6514H18;
        boolean zM6545h6;
        Object objM6514H19;
        Object obj6;
        InterfaceC3759g interfaceC3759g7;
        C13522n c13522n6;
        InterfaceC10459q interfaceC10459q4;
        boolean zM6542f8;
        Object objM6514H20;
        Object obj7;
        boolean z13;
        boolean zM6542f9;
        Object objM6514H21;
        boolean zM6542f10;
        Object objM6514H22;
        C21987b0 c21987b1;
        Object objM6514H23;
        boolean z14;
        boolean zM6542f11;
        Object objM6514H24;
        Iterator it2;
        Object objM6514H25;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(-2099067850);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i10 | 6;
            interfaceC10459q2 = interfaceC10459q;
        } else if ((i10 & 6) == 0) {
            interfaceC10459q2 = interfaceC10459q;
            i12 = i10 | (c6021p.m6542f(interfaceC10459q2) ? 4 : 2);
        } else {
            interfaceC10459q2 = interfaceC10459q;
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 48) == 0) {
                c13522n2 = c13522n;
                i12 |= c6021p.m6542f(c13522n2) ? 32 : 16;
            }
            i13 = i12;
            if ((i13 & 19) == 18 || !c6021p.m6562y()) {
                c10456n = C10456n.f30959Y;
                if (i20 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                obj = C6013l.f19514a;
                if (i21 != 0) {
                    c6021p.m6524S(-922087164);
                    objM6514H25 = c6021p.m6514H();
                    if (objM6514H25 == obj) {
                        objM6514H25 = new C13522n();
                        c6021p.m6537c0(objM6514H25);
                    }
                    c6021p.m6553p(false);
                    c13522n2 = (C13522n) objM6514H25;
                }
                interfaceC0300w1 = (InterfaceC0300w1) c6021p.m6548k(AbstractC0187M0.f712n);
                c6021p.m6524S(-1020152108);
                c5984w0 = AndroidCompositionLocals_androidKt.f32825b;
                context = (Context) c6021p.m6548k(c5984w0);
                c5984w1 = AbstractC0233b1.f873a;
                zBooleanValue = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
                c5984w2 = AbstractC16421b.f50950a;
                list = (List) c6021p.m6548k(c5984w2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14111x0.class));
                } else {
                    if (zBooleanValue) {
                        throw new C0644w(17);
                    }
                    interfaceC2062k = null;
                }
                c6021p.m6553p(false);
                LocalViewModelStoreOwner.f33491a.getClass();
                viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                c16527d = AbstractC16526C.f51263a;
                interfaceC10459q3 = interfaceC10459q2;
                InterfaceC3756d interfaceC3756dMo5693b = c16527d.mo5693b(ConversationViewModel.class);
                InterfaceC3756d interfaceC3756dMo5693b2 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(interfaceC3756dMo5693b2) | c6021p.m6542f(interfaceC3756dMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(AbstractC16526C.m18073a(C14111x0.class), AbstractC16526C.m18073a(ConversationViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w(17);
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel2 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
                c6021p.m6553p(false);
                conversationViewModel = (ConversationViewModel) baseViewModel2;
                c6021p.m6524S(-1020152108);
                context2 = (Context) c6021p.m6548k(c5984w0);
                zBooleanValue2 = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
                list2 = (List) c6021p.m6548k(c5984w2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue2) {
                    interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
                } else {
                    if (zBooleanValue2) {
                        throw new C0644w(17);
                    }
                    interfaceC2062k2 = null;
                }
                c6021p.m6553p(false);
                viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a2 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                InterfaceC3756d interfaceC3756dMo5693b3 = c16527d.mo5693b(MessagesViewModel.class);
                InterfaceC3756d interfaceC3756dMo5693b4 = c16527d.mo5693b(C18160X.class);
                c6021p.m6524S(-1395498839);
                zM6542f2 = c6021p.m6542f(interfaceC3756dMo5693b4) | c6021p.m6542f(interfaceC3756dMo5693b3) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == obj) {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM6514H2);
                }
                BaseViewModel baseViewModel3 = (BaseViewModel) objM6514H2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel3, c6021p, 0);
                c6021p.m6553p(false);
                messagesViewModel = (MessagesViewModel) baseViewModel3;
                c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
                c6021p.m6524S(-922075317);
                zM6542f3 = c6021p.m6542f(conversationViewModel);
                objM6514H3 = c6021p.m6514H();
                if (zM6542f3 || objM6514H3 == obj) {
                    objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 0);
                    c6021p.m6537c0(objM6514H3);
                }
                interfaceC3759g = (InterfaceC3759g) objM6514H3;
                objM530s = AbstractC0168G.m530s(-922073150, c6021p, false);
                c5975s = C5975S.f19448r0;
                if (objM530s == obj) {
                    obj2 = null;
                    objM530s = C5997d.m6430Q(null, c5975s);
                    c6021p.m6537c0(objM530s);
                } else {
                    obj2 = null;
                }
                interfaceC5985X = (InterfaceC5985X) objM530s;
                objM530s2 = AbstractC0168G.m530s(-922070162, c6021p, false);
                if (objM530s2 == obj) {
                    objM530s2 = C5997d.m6430Q(obj2, c5975s);
                    c6021p.m6537c0(objM530s2);
                }
                interfaceC5985X2 = (InterfaceC5985X) objM530s2;
                objM530s3 = AbstractC0168G.m530s(-922067671, c6021p, false);
                if (objM530s3 == obj) {
                    objM530s3 = C5997d.m6430Q(Boolean.FALSE, c5975s);
                    c6021p.m6537c0(objM530s3);
                }
                interfaceC5985X3 = (InterfaceC5985X) objM530s3;
                c6021p.m6553p(false);
                interfaceC7678dM10508c = AbstractC9856b0.m10508c("android.permission.CAMERA", null, c6021p, 6, 2);
                C6427b c6427b = new C6427b(9);
                c6021p.m6524S(-922060741);
                objM6514H4 = c6021p.m6514H();
                if (objM6514H4 == obj) {
                    objM6514H4 = new C4702c(interfaceC5985X2, interfaceC5985X, 2);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                c14893gM9235b = AbstractC8571V2.m9235b(c6427b, (InterfaceC1436k) objM6514H4, c6021p, 48);
                C16653d c16653d = new C16653d(4);
                c6021p.m6524S(-922050723);
                objM6514H5 = c6021p.m6514H();
                if (objM6514H5 == obj) {
                    objM6514H5 = new C6194i(interfaceC5985X, 21);
                    c6021p.m6537c0(objM6514H5);
                }
                c6021p.m6553p(false);
                c14893gM9235b2 = AbstractC8571V2.m9235b(c16653d, (InterfaceC1436k) objM6514H5, c6021p, 48);
                C6427b c6427b2 = new C6427b(3);
                c6021p.m6524S(-922044643);
                objM6514H6 = c6021p.m6514H();
                if (objM6514H6 == obj) {
                    objM6514H6 = new C6194i(interfaceC5985X, 20);
                    c6021p.m6537c0(objM6514H6);
                }
                c6021p.m6553p(false);
                c14893gM9235b3 = AbstractC8571V2.m9235b(c6427b2, (InterfaceC1436k) objM6514H6, c6021p, 48);
                c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                c6021p.m6524S(617413469);
                it = ((Iterable) c6021p.m6548k(c5984w2)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    it2 = it;
                    if (next instanceof C1996m) {
                        break;
                    } else {
                        it = it2;
                    }
                }
                if (next != null) {
                    objM19235b = (C1996m) next;
                    c6021p.m6553p(false);
                } else {
                    objM19235b = C17632f.f56419a.m19235b(C1996m.class);
                    c6021p.m6553p(false);
                }
                c1996m = (C1996m) objM19235b;
                if (c1996m != null) {
                    c18418a = c1996m.f5936a;
                } else {
                    c18418a = null;
                }
                c6021p.m6524S(-922034753);
                zM6542f4 = c6021p.m6542f(interfaceC7678dM10508c) | c6021p.m6545h(c14893gM9235b) | c6021p.m6545h(c8870f) | c6021p.m6545h(c14893gM9235b2) | c6021p.m6545h(c14893gM9235b3) | c6021p.m6542f(interfaceC0300w1);
                c18418a2 = c18418a;
                objM6514H7 = c6021p.m6514H();
                if (zM6542f4 || objM6514H7 == obj) {
                    objM6514H7 = new InputPanelKt$InputPanel$inputViewModel$1$1(interfaceC7678dM10508c, c14893gM9235b, c8870f, c14893gM9235b2, c14893gM9235b3, interfaceC0300w1, interfaceC5985X3);
                    c6021p.m6537c0(objM6514H7);
                }
                interfaceC1436k = (InterfaceC1436k) objM6514H7;
                c6021p.m6553p(false);
                c6021p.m6524S(189483815);
                c6021p.m6524S(-1020152108);
                context3 = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                zBooleanValue3 = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                list3 = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue3) {
                    interfaceC2062k3 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19866Q.class));
                    z6 = false;
                } else {
                    if (zBooleanValue3) {
                        throw new C0644w();
                    }
                    z6 = false;
                    interfaceC2062k3 = null;
                }
                c6021p.m6553p(z6);
                LocalViewModelStoreOwner.f33491a.getClass();
                viewModelStoreOwnerM12165a3 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a3 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                c16527d2 = AbstractC16526C.f51263a;
                InterfaceC3756d interfaceC3756dMo5693b5 = c16527d2.mo5693b(InputViewModel.class);
                c13522n3 = c13522n2;
                InterfaceC3756d interfaceC3756dMo5693b6 = c16527d2.mo5693b(C19866Q.class);
                c6021p.m6524S(-1395498839);
                zM6542f5 = c6021p.m6542f(interfaceC3756dMo5693b5) | c6021p.m6542f(interfaceC3756dMo5693b6) | c6021p.m6542f(list3) | c6021p.m6544g(zBooleanValue3) | c6021p.m6542f(interfaceC2062k3);
                objM6514H8 = c6021p.m6514H();
                if (zM6542f5 || objM6514H8 == obj) {
                    if (zBooleanValue3) {
                        ViewModelFactoryProviderKt.m14399b(c16527d2.mo5693b(C19866Q.class), c16527d2.mo5693b(InputViewModel.class), context3, interfaceC2062k3);
                        throw null;
                    }
                    if (zBooleanValue3) {
                        throw new C0644w();
                    }
                    objM6514H8 = ViewModelFactoryProviderKt.m14398a(c16527d2.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                    c6021p.m6537c0(objM6514H8);
                }
                baseViewModel = (BaseViewModel) objM6514H8;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
                zM6545h = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
                objM6514H9 = c6021p.m6514H();
                if (zM6545h || objM6514H9 == obj) {
                    objM6514H9 = new InputPanelKt$InputPanel$$inlined$injectViewModel$1(baseViewModel, interfaceC5985XM19531n, null);
                    c6021p.m6537c0(objM6514H9);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H9, c6021p, baseViewModel);
                c6021p.m6553p(false);
                inputViewModel = (InputViewModel) baseViewModel;
                c19866q = (C19866Q) AbstractC9112C3.m9642d(inputViewModel.f40343c, c6021p).getValue();
                interfaceC5985X2.setValue(c19866q.f62973d);
                c6021p.m6524S(-921987004);
                zM6545h2 = c6021p.m6545h(inputViewModel);
                objM6514H10 = c6021p.m6514H();
                if (zM6545h2 || objM6514H10 == obj) {
                    objM6514H10 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 1);
                    c6021p.m6537c0(objM6514H10);
                }
                interfaceC3759g2 = (InterfaceC3759g) objM6514H10;
                c6021p.m6553p(false);
                interfaceC5985X.setValue(interfaceC3759g2);
                boolean z15 = c14111x0.f44438z.f44212e;
                boolean z16 = !z15;
                c6021p.m6524S(-921981491);
                objM6514H11 = c6021p.m6514H();
                if (objM6514H11 == obj) {
                    objM6514H11 = C5997d.m6430Q(Boolean.valueOf(!c19866q.m20785h()), c5975s);
                    c6021p.m6537c0(objM6514H11);
                }
                interfaceC5985X4 = (InterfaceC5985X) objM6514H11;
                c6021p.m6553p(false);
                if (c19866q.m20784g() && !c19866q.m20783f() && !c19866q.f62994y) {
                    z10 = false;
                } else if (c19866q.f62977h != EnumC21517f.f68139o0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c6021p.m6524S(-921967986);
                objM6514H12 = c6021p.m6514H();
                if (objM6514H12 == obj) {
                    objM6514H12 = AbstractC0168G.m536y(c6021p);
                }
                interfaceC17406l = (InterfaceC17406l) objM6514H12;
                c6021p.m6553p(false);
                zBooleanValue4 = ((Boolean) interfaceC5985X4.getValue()).booleanValue();
                C6045C c6045c = c19866q.f62970a;
                if (zBooleanValue4 || !z10 || AbstractC21322p.m21681O(c6045c.f19682a.f10934Y)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    c6021p.m6524S(-921959943);
                    jM15774b = C14365u.m15774b(0.5f, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12190D);
                    c6021p.m6553p(false);
                    z12 = false;
                } else {
                    if (z11) {
                        c6021p.m6524S(-922298169);
                        c6021p.m6553p(false);
                        throw new C0644w();
                    }
                    c6021p.m6524S(-921957385);
                    jM15774b = C14365u.m15774b(0.0f, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12190D);
                    z12 = false;
                    c6021p.m6553p(false);
                }
                interfaceC5982V0M14999a = AbstractC13474L.m14999a(jM15774b, AbstractC13758e.m15254s(0.0f, 0.0f, null, 7), "Input Panel Scrim", c6021p, 432, 8);
                if (((Boolean) AbstractC9183O2.m9739b(interfaceC17406l, c6021p).getValue()).booleanValue()) {
                    interfaceC5985X4.setValue(Boolean.FALSE);
                }
                Integer numValueOf = Integer.valueOf(c19866q.f62975f.size());
                c6021p.m6524S(-921949248);
                zM6542f6 = c6021p.m6542f(c19866q);
                objM6514H13 = c6021p.m6514H();
                if (zM6542f6 || objM6514H13 == obj) {
                    objM6514H13 = new C16858O(c19866q, interfaceC5985X4, null);
                    c6021p.m6537c0(objM6514H13);
                }
                c6021p.m6553p(false);
                C5997d.m6451g(c6045c, numValueOf, (InterfaceC1439n) objM6514H13, c6021p);
                c6021p.m6524S(-921945071);
                if (c19866q.f62988s) {
                    C17296C c17296c = C17296C.f55119a;
                    c6021p.m6524S(-921943124);
                    if ((i13 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM6542f11 = z14 | c6021p.m6542f(interfaceC0300w2) | c6021p.m6545h(inputViewModel);
                    objM6514H24 = c6021p.m6514H();
                    if (!zM6542f11 || objM6514H24 == obj) {
                        c13522n4 = c13522n3;
                        objM6514H24 = new C16859P(c13522n4, interfaceC0300w1, inputViewModel, null);
                        c6021p.m6537c0(objM6514H24);
                    } else {
                        c13522n4 = c13522n3;
                    }
                    c6021p.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H24, c6021p, c17296c);
                } else {
                    c13522n4 = c13522n3;
                    interfaceC0300w2 = interfaceC0300w1;
                }
                c6021p.m6553p(false);
                c21999e0 = c19866q.f62989t;
                if (c21999e0 != null) {
                    C21995d0 c21995d0 = C21999e0.Companion;
                    EnumC21964U enumC21964U = EnumC21964U.FileUpload;
                    c21995d0.getClass();
                    c21958sM22341a = C21995d0.m22341a(c21999e0, enumC21964U);
                } else {
                    c21958sM22341a = null;
                }
                c6021p.m6524S(-921934800);
                if (c19866q.f62990u || !c19866q.m20785h() || c21958sM22341a == null) {
                    c13522n5 = c13522n4;
                    interfaceC3759g3 = interfaceC3759g;
                    r10 = 0;
                } else {
                    c6021p.m6524S(-921926281);
                    boolean zM6542f12 = c6021p.m6542f(interfaceC3759g);
                    Object objM6514H26 = c6021p.m6514H();
                    if (zM6542f12 || objM6514H26 == obj) {
                        objM6514H26 = new C8846h(interfaceC3759g, 23);
                        c6021p.m6537c0(objM6514H26);
                    }
                    InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H26;
                    C13522n c13522n7 = c13522n4;
                    boolean zM13832w = AbstractC12107L1.m13832w(c6021p, false, -921919937, interfaceC3759g2);
                    Object objM6514H27 = c6021p.m6514H();
                    if (zM13832w || objM6514H27 == obj) {
                        objM6514H27 = new C8846h(interfaceC3759g2, 24);
                        c6021p.m6537c0(objM6514H27);
                    }
                    c6021p.m6553p(false);
                    c13522n5 = c13522n7;
                    interfaceC3759g3 = interfaceC3759g;
                    r10 = 0;
                    AbstractC8025X4.m8366a(c21958sM22341a, interfaceC1426a2, (InterfaceC1426a) objM6514H27, null, null, c6021p, 0);
                }
                c6021p.m6553p(r10);
                c6021p.m6524S(-921917199);
                if (((Boolean) interfaceC5985X3.getValue()).booleanValue()) {
                    c6021p.m6524S(-921913524);
                    objM6514H23 = c6021p.m6514H();
                    obj3 = obj;
                    if (objM6514H23 == obj3) {
                        objM6514H23 = new C14103t0(interfaceC5985X3, 8);
                        c6021p.m6537c0(objM6514H23);
                    }
                    c6021p.m6553p(r10);
                    AbstractC9830X.m10473b(interfaceC7678dM10508c, R.string.conversation_camera_permission_request_rationale, (InterfaceC1426a) objM6514H23, c6021p, 384);
                } else {
                    obj3 = r5;
                }
                c6021p.m6553p(r10);
                C17756f c17756f = AbstractC17770m.f56726c;
                C10449g c10449g = C10444b.f30946y0;
                C17790w c17790wM19515a = AbstractC17788v.m19515a(c17756f, c10449g, c6021p, r10);
                i14 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                c21694h = C21698j.f68873f;
                C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
                C21694h c21694h6 = C21698j.f68872e;
                C5997d.m6439Z(c21694h6, c6021p, interfaceC6008i0M6550m);
                c21694h2 = C21698j.f68874g;
                if (c6021p.f19563O) {
                    c21694h3 = c21694h;
                } else {
                    c21694h3 = c21694h;
                    if (!AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                    }
                    C21694h c21694h7 = C21698j.f68871d;
                    C5997d.m6439Z(c21694h7, c6021p, interfaceC10459qM10923d);
                    InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) interfaceC3759g2;
                    C21694h c21694h8 = c21694h3;
                    AbstractC16854K.m18576b(c19866q, interfaceC1436k2, null, c6021p, 0, 4);
                    if (c21999e0 != null) {
                        c21987b0 = c21999e0.f69629b;
                    } else {
                        c21987b0 = null;
                    }
                    if (c19866q.f62991v || (c21987b1 = c19866q.f62993x) == null) {
                        interfaceC3759g4 = interfaceC3759g3;
                        if (c19866q.f62992w || c21987b0 == null) {
                            c6021p.m6524S(-637944548);
                            c6021p.m6553p(false);
                        } else {
                            c6021p.m6524S(-638040648);
                            m14265b(c21987b0, false, interfaceC1436k2, (InterfaceC1436k) interfaceC3759g4, c6021p, 48);
                            c6021p.m6553p(false);
                        }
                    } else {
                        c6021p.m6524S(-638210280);
                        interfaceC3759g4 = interfaceC3759g3;
                        m14265b(c21987b1, true, interfaceC1436k2, (InterfaceC1436k) interfaceC3759g4, c6021p, 48);
                        c6021p.m6553p(false);
                    }
                    f10 = AbstractC7313q.f23199d;
                    InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, f10, 0.0f, 11);
                    if (c19866q.f62976g.isEmpty()) {
                        f11 = f10;
                    } else {
                        f11 = AbstractC7313q.f23198c;
                    }
                    InterfaceC10459q interfaceC10459qM11237o2 = AbstractC10842a.m11237o(interfaceC10459qM11237o, 0.0f, f11, 0.0f, f10, 5);
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23198c), C10444b.f30945x0, c6021p, 48);
                    i15 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o2);
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(c21694h8, c6021p, c17781r0M19506b);
                    C5997d.m6439Z(c21694h6, c6021p, interfaceC6008i0M6550m2);
                    if (c6021p.f19563O && AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                        c21694h4 = c21694h2;
                    } else {
                        c21694h4 = c21694h2;
                        AbstractC0168G.m537z(i15, c6021p, i15, c21694h4);
                    }
                    C5997d.m6439Z(c21694h7, c6021p, interfaceC10459qM10923d2);
                    C17785t0 c17785t0 = C17785t0.f56761a;
                    c6021p.m6524S(-1357428602);
                    objM6514H14 = c6021p.m6514H();
                    if (objM6514H14 == obj3) {
                        objM6514H14 = C5997d.m6429P(1);
                        c6021p.m6537c0(objM6514H14);
                    }
                    c5996c0 = (C5996c0) objM6514H14;
                    c6021p.m6553p(false);
                    interfaceC10277bM19906b = AbstractC18539i.m19906b(c6021p);
                    c6021p.m6524S(-1357424814);
                    zM6545h3 = c6021p.m6545h(interfaceC10277bM19906b) | c6021p.m6542f(interfaceC0300w2) | c6021p.m6542f(interfaceC3759g4);
                    objM6514H15 = c6021p.m6514H();
                    if (!zM6545h3 || objM6514H15 == obj3) {
                        i16 = 1;
                        objM6514H15 = new C16905s(interfaceC10277bM19906b, interfaceC0300w2, interfaceC3759g4, 1);
                        c6021p.m6537c0(objM6514H15);
                    } else {
                        i16 = 1;
                    }
                    interfaceC1426a = (InterfaceC1426a) objM6514H15;
                    c6021p.m6553p(false);
                    C13783q0 c13783q0 = AbstractC13508z.f42768a;
                    Object obj8 = AbstractC13795w0.f43580a;
                    c21694h5 = c21694h4;
                    obj4 = obj3;
                    interfaceC3759g5 = interfaceC3759g4;
                    AbstractC10831a.m11200c(c17785t0, z10, null, AbstractC13508z.m15021m(new C0537v(21, C13485c.f42675G0), AbstractC13758e.m15254s(0.0f, 400.0f, new C7543h(AbstractC9101A4.m9631a(i16, i16)), i16)).m14995a(AbstractC13508z.m15009a(null, null, 15)), AbstractC13508z.m15023o(new C0537v(23, C13485c.f42677I0), AbstractC13758e.m15254s(0.0f, 400.0f, new C7543h(AbstractC9101A4.m9631a(1, 1)), 1)).m14996a(AbstractC13508z.m15017i(null, null, 15)), null, AbstractC8411c.m8969c(402487492, c6021p, new C8777V(c19866q, z16, interfaceC3759g2, c18418a2, c8870f, interfaceC5985X4)), c6021p, 1600518, 18);
                    AbstractC10831a.m11200c(c17785t0, !z10, null, AbstractC13508z.m15009a(null, null, 15), AbstractC13508z.m15017i(null, null, 15), null, AbstractC16877e.f54167a, c6021p, 1600518, 18);
                    float f12 = AbstractC7306j.f23145c;
                    InterfaceC10459q interfaceC10459qM8501a = AbstractC8079e5.m8501a(AbstractC9262b4.m9836a(c17785t0.m19513a(c10456n, 1.0f, true), z15), AbstractC20417e.m21079a(AbstractC7314r.f23209b));
                    c6021p.m6524S(-1357334599);
                    zM6542f7 = c6021p.m6542f(interfaceC5982V0M14999a);
                    objM6514H16 = c6021p.m6514H();
                    if (!zM6542f7 || objM6514H16 == obj4) {
                        i17 = 2;
                        objM6514H16 = new C17122m(interfaceC5982V0M14999a, 2);
                        c6021p.m6537c0(objM6514H16);
                    } else {
                        i17 = 2;
                    }
                    c6021p.m6553p(false);
                    i18 = i17;
                    C13522n c13522n8 = c13522n5;
                    AbstractC4034c4.m4725a(AbstractC10861a.m11297c(interfaceC10459qM8501a, (InterfaceC1436k) objM6514H16), null, 0L, 0L, f12, 0.0f, null, AbstractC8411c.m8969c(-1726524127, c6021p, new C16861S(c19866q, interfaceC3759g2, z10, c13522n5, interfaceC1426a, z16, interfaceC17406l, c5996c0, c14111x0, interfaceC3759g5)), c6021p, 12582912, 110);
                    C17790w c17790wM19515a2 = AbstractC17788v.m19515a(c17756f, c10449g, c6021p, 0);
                    i19 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, c10456n);
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(c21694h8, c6021p, c17790wM19515a2);
                    C5997d.m6439Z(c21694h6, c6021p, interfaceC6008i0M6550m3);
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i19))) {
                        AbstractC0168G.m537z(i19, c6021p, i19, c21694h5);
                    }
                    C5997d.m6439Z(c21694h7, c6021p, interfaceC10459qM10923d3);
                    c6021p.m6524S(251950728);
                    if (c5996c0.m6412g() >= 3) {
                        c6021p.m6524S(251954021);
                        interfaceC3759g6 = interfaceC3759g5;
                        zM6542f10 = c6021p.m6542f(interfaceC3759g6);
                        objM6514H22 = c6021p.m6514H();
                        obj5 = obj4;
                        if (zM6542f10 || objM6514H22 == obj5) {
                            objM6514H22 = new C8846h(interfaceC3759g6, 28);
                            c6021p.m6537c0(objM6514H22);
                        }
                        c6021p.m6553p(false);
                        AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H22, null, false, null, null, AbstractC16877e.f54168b, c6021p, 196608, 30);
                    } else {
                        obj5 = obj4;
                        interfaceC3759g6 = interfaceC3759g5;
                    }
                    c6021p.m6553p(false);
                    InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) interfaceC3759g6;
                    c6021p.m6524S(251973544);
                    zM6545h4 = c6021p.m6545h(c18418a2) | c6021p.m6545h(c8870f) | c6021p.m6542f(interfaceC3759g6);
                    objM6514H17 = c6021p.m6514H();
                    if (zM6545h4 || objM6514H17 == obj5) {
                        objM6514H17 = new C16899p(c18418a2, c8870f, interfaceC3759g6, i18);
                        c6021p.m6537c0(objM6514H17);
                    }
                    InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H17;
                    c6021p.m6553p(false);
                    c6021p.m6524S(251990535);
                    zM6545h5 = c6021p.m6545h(messagesViewModel) | c6021p.m6542f(c14111x0);
                    objM6514H18 = c6021p.m6514H();
                    if (zM6545h5 || objM6514H18 == obj5) {
                        objM6514H18 = new C16901q(messagesViewModel, c14111x0, 1);
                        c6021p.m6537c0(objM6514H18);
                    }
                    InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) objM6514H18;
                    c6021p.m6553p(false);
                    c6021p.m6524S(251982029);
                    zM6545h6 = c6021p.m6545h(c18418a2) | c6021p.m6545h(c8870f) | c6021p.m6542f(interfaceC3759g6);
                    objM6514H19 = c6021p.m6514H();
                    if (zM6545h6 || objM6514H19 == obj5) {
                        objM6514H19 = new C16899p(c18418a2, c8870f, interfaceC3759g6, 3);
                        c6021p.m6537c0(objM6514H19);
                    }
                    c6021p.m6553p(false);
                    obj6 = obj5;
                    interfaceC3759g7 = interfaceC3759g6;
                    AbstractC16868Z.m18578a(c14111x0, interfaceC1426a, interfaceC1436k3, interfaceC1426a3, interfaceC1426a4, (InterfaceC1426a) objM6514H19, null, null, null, c6021p, 0, 448);
                    c6021p.m6553p(true);
                    c6021p.m6524S(-1357129976);
                    if (c14111x0.f44422n) {
                        c6021p.m6524S(-1357125453);
                        zM6542f8 = c6021p.m6542f(interfaceC3759g2);
                        objM6514H20 = c6021p.m6514H();
                        if (zM6542f8) {
                            obj7 = obj6;
                        } else {
                            obj7 = obj6;
                            if (objM6514H20 == obj7) {
                            }
                            InterfaceC1436k interfaceC1436k4 = (InterfaceC1436k) objM6514H20;
                            c6021p.m6553p(false);
                            if (c14111x0.f44421m0 == EnumC14057V0.f44189o0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            c6021p.m6524S(-1357118105);
                            zM6542f9 = c6021p.m6542f(interfaceC3759g7);
                            objM6514H21 = c6021p.m6514H();
                            if (zM6542f9 || objM6514H21 == obj7) {
                                objM6514H21 = new C16862T(interfaceC3759g7, 1);
                                c6021p.m6537c0(objM6514H21);
                            }
                            c6021p.m6553p(false);
                            AbstractC8747y4.m9498a(c19866q.f62970a, interfaceC1436k4, z13, interfaceC1426a, (InterfaceC1426a) objM6514H21, c6021p, 0);
                        }
                        objM6514H20 = new C14107v0(interfaceC3759g2, 10);
                        c6021p.m6537c0(objM6514H20);
                        InterfaceC1436k interfaceC1436k5 = (InterfaceC1436k) objM6514H20;
                        c6021p.m6553p(false);
                        if (c14111x0.f44421m0 == EnumC14057V0.f44189o0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        c6021p.m6524S(-1357118105);
                        zM6542f9 = c6021p.m6542f(interfaceC3759g7);
                        objM6514H21 = c6021p.m6514H();
                        if (zM6542f9) {
                            objM6514H21 = new C16862T(interfaceC3759g7, 1);
                            c6021p.m6537c0(objM6514H21);
                        } else {
                            objM6514H21 = new C16862T(interfaceC3759g7, 1);
                            c6021p.m6537c0(objM6514H21);
                        }
                        c6021p.m6553p(false);
                        AbstractC8747y4.m9498a(c19866q.f62970a, interfaceC1436k5, z13, interfaceC1426a, (InterfaceC1426a) objM6514H21, c6021p, 0);
                    }
                    AbstractC3794B0.m4471F(c6021p, false, true, true);
                    c13522n6 = c13522n8;
                    interfaceC10459q4 = interfaceC10459q3;
                }
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h2);
                C21694h c21694h9 = C21698j.f68871d;
                C5997d.m6439Z(c21694h9, c6021p, interfaceC10459qM10923d);
                InterfaceC1436k interfaceC1436k6 = (InterfaceC1436k) interfaceC3759g2;
                C21694h c21694h10 = c21694h3;
                AbstractC16854K.m18576b(c19866q, interfaceC1436k6, null, c6021p, 0, 4);
                if (c21999e0 != null) {
                    c21987b0 = c21999e0.f69629b;
                } else {
                    c21987b0 = null;
                }
                if (c19866q.f62991v) {
                    interfaceC3759g4 = interfaceC3759g3;
                    if (c19866q.f62992w) {
                        c6021p.m6524S(-637944548);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-637944548);
                        c6021p.m6553p(false);
                    }
                } else {
                    interfaceC3759g4 = interfaceC3759g3;
                    if (c19866q.f62992w) {
                        c6021p.m6524S(-637944548);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-637944548);
                        c6021p.m6553p(false);
                    }
                }
                f10 = AbstractC7313q.f23199d;
                InterfaceC10459q interfaceC10459qM11237o3 = AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, f10, 0.0f, 11);
                if (c19866q.f62976g.isEmpty()) {
                    f11 = f10;
                } else {
                    f11 = AbstractC7313q.f23198c;
                }
                InterfaceC10459q interfaceC10459qM11237o4 = AbstractC10842a.m11237o(interfaceC10459qM11237o3, 0.0f, f11, 0.0f, f10, 5);
                C17781r0 c17781r0M19506b2 = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23198c), C10444b.f30945x0, c6021p, 48);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o4);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h10, c6021p, c17781r0M19506b2);
                C5997d.m6439Z(c21694h6, c6021p, interfaceC6008i0M6550m4);
                if (c6021p.f19563O) {
                    c21694h4 = c21694h2;
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h4);
                } else {
                    c21694h4 = c21694h2;
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h4);
                }
                C5997d.m6439Z(c21694h9, c6021p, interfaceC10459qM10923d4);
                C17785t0 c17785t1 = C17785t0.f56761a;
                c6021p.m6524S(-1357428602);
                objM6514H14 = c6021p.m6514H();
                if (objM6514H14 == obj3) {
                    objM6514H14 = C5997d.m6429P(1);
                    c6021p.m6537c0(objM6514H14);
                }
                c5996c0 = (C5996c0) objM6514H14;
                c6021p.m6553p(false);
                interfaceC10277bM19906b = AbstractC18539i.m19906b(c6021p);
                c6021p.m6524S(-1357424814);
                zM6545h3 = c6021p.m6545h(interfaceC10277bM19906b) | c6021p.m6542f(interfaceC0300w2) | c6021p.m6542f(interfaceC3759g4);
                objM6514H15 = c6021p.m6514H();
                if (zM6545h3) {
                    i16 = 1;
                    objM6514H15 = new C16905s(interfaceC10277bM19906b, interfaceC0300w2, interfaceC3759g4, 1);
                    c6021p.m6537c0(objM6514H15);
                } else {
                    i16 = 1;
                    objM6514H15 = new C16905s(interfaceC10277bM19906b, interfaceC0300w2, interfaceC3759g4, 1);
                    c6021p.m6537c0(objM6514H15);
                }
                interfaceC1426a = (InterfaceC1426a) objM6514H15;
                c6021p.m6553p(false);
                C13783q0 c13783q1 = AbstractC13508z.f42768a;
                Object obj9 = AbstractC13795w0.f43580a;
                c21694h5 = c21694h4;
                obj4 = obj3;
                interfaceC3759g5 = interfaceC3759g4;
                AbstractC10831a.m11200c(c17785t1, z10, null, AbstractC13508z.m15021m(new C0537v(21, C13485c.f42675G0), AbstractC13758e.m15254s(0.0f, 400.0f, new C7543h(AbstractC9101A4.m9631a(i16, i16)), i16)).m14995a(AbstractC13508z.m15009a(null, null, 15)), AbstractC13508z.m15023o(new C0537v(23, C13485c.f42677I0), AbstractC13758e.m15254s(0.0f, 400.0f, new C7543h(AbstractC9101A4.m9631a(1, 1)), 1)).m14996a(AbstractC13508z.m15017i(null, null, 15)), null, AbstractC8411c.m8969c(402487492, c6021p, new C8777V(c19866q, z16, interfaceC3759g2, c18418a2, c8870f, interfaceC5985X4)), c6021p, 1600518, 18);
                AbstractC10831a.m11200c(c17785t1, !z10, null, AbstractC13508z.m15009a(null, null, 15), AbstractC13508z.m15017i(null, null, 15), null, AbstractC16877e.f54167a, c6021p, 1600518, 18);
                float f13 = AbstractC7306j.f23145c;
                InterfaceC10459q interfaceC10459qM8501a2 = AbstractC8079e5.m8501a(AbstractC9262b4.m9836a(c17785t1.m19513a(c10456n, 1.0f, true), z15), AbstractC20417e.m21079a(AbstractC7314r.f23209b));
                c6021p.m6524S(-1357334599);
                zM6542f7 = c6021p.m6542f(interfaceC5982V0M14999a);
                objM6514H16 = c6021p.m6514H();
                if (zM6542f7) {
                    i17 = 2;
                    objM6514H16 = new C17122m(interfaceC5982V0M14999a, 2);
                    c6021p.m6537c0(objM6514H16);
                } else {
                    i17 = 2;
                    objM6514H16 = new C17122m(interfaceC5982V0M14999a, 2);
                    c6021p.m6537c0(objM6514H16);
                }
                c6021p.m6553p(false);
                i18 = i17;
                C13522n c13522n9 = c13522n5;
                AbstractC4034c4.m4725a(AbstractC10861a.m11297c(interfaceC10459qM8501a2, (InterfaceC1436k) objM6514H16), null, 0L, 0L, f13, 0.0f, null, AbstractC8411c.m8969c(-1726524127, c6021p, new C16861S(c19866q, interfaceC3759g2, z10, c13522n5, interfaceC1426a, z16, interfaceC17406l, c5996c0, c14111x0, interfaceC3759g5)), c6021p, 12582912, 110);
                C17790w c17790wM19515a3 = AbstractC17788v.m19515a(c17756f, c10449g, c6021p, 0);
                i19 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, c10456n);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h10, c6021p, c17790wM19515a3);
                C5997d.m6439Z(c21694h6, c6021p, interfaceC6008i0M6550m5);
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i19, c6021p, i19, c21694h5);
                } else {
                    AbstractC0168G.m537z(i19, c6021p, i19, c21694h5);
                }
                C5997d.m6439Z(c21694h9, c6021p, interfaceC10459qM10923d5);
                c6021p.m6524S(251950728);
                if (c5996c0.m6412g() >= 3) {
                    c6021p.m6524S(251954021);
                    interfaceC3759g6 = interfaceC3759g5;
                    zM6542f10 = c6021p.m6542f(interfaceC3759g6);
                    objM6514H22 = c6021p.m6514H();
                    obj5 = obj4;
                    if (zM6542f10) {
                        objM6514H22 = new C8846h(interfaceC3759g6, 28);
                        c6021p.m6537c0(objM6514H22);
                    } else {
                        objM6514H22 = new C8846h(interfaceC3759g6, 28);
                        c6021p.m6537c0(objM6514H22);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H22, null, false, null, null, AbstractC16877e.f54168b, c6021p, 196608, 30);
                } else {
                    obj5 = obj4;
                    interfaceC3759g6 = interfaceC3759g5;
                }
                c6021p.m6553p(false);
                InterfaceC1436k interfaceC1436k7 = (InterfaceC1436k) interfaceC3759g6;
                c6021p.m6524S(251973544);
                zM6545h4 = c6021p.m6545h(c18418a2) | c6021p.m6545h(c8870f) | c6021p.m6542f(interfaceC3759g6);
                objM6514H17 = c6021p.m6514H();
                if (zM6545h4) {
                    objM6514H17 = new C16899p(c18418a2, c8870f, interfaceC3759g6, i18);
                    c6021p.m6537c0(objM6514H17);
                } else {
                    objM6514H17 = new C16899p(c18418a2, c8870f, interfaceC3759g6, i18);
                    c6021p.m6537c0(objM6514H17);
                }
                InterfaceC1426a interfaceC1426a5 = (InterfaceC1426a) objM6514H17;
                c6021p.m6553p(false);
                c6021p.m6524S(251990535);
                zM6545h5 = c6021p.m6545h(messagesViewModel) | c6021p.m6542f(c14111x0);
                objM6514H18 = c6021p.m6514H();
                if (zM6545h5) {
                    objM6514H18 = new C16901q(messagesViewModel, c14111x0, 1);
                    c6021p.m6537c0(objM6514H18);
                } else {
                    objM6514H18 = new C16901q(messagesViewModel, c14111x0, 1);
                    c6021p.m6537c0(objM6514H18);
                }
                InterfaceC1426a interfaceC1426a6 = (InterfaceC1426a) objM6514H18;
                c6021p.m6553p(false);
                c6021p.m6524S(251982029);
                zM6545h6 = c6021p.m6545h(c18418a2) | c6021p.m6545h(c8870f) | c6021p.m6542f(interfaceC3759g6);
                objM6514H19 = c6021p.m6514H();
                if (zM6545h6) {
                    objM6514H19 = new C16899p(c18418a2, c8870f, interfaceC3759g6, 3);
                    c6021p.m6537c0(objM6514H19);
                } else {
                    objM6514H19 = new C16899p(c18418a2, c8870f, interfaceC3759g6, 3);
                    c6021p.m6537c0(objM6514H19);
                }
                c6021p.m6553p(false);
                obj6 = obj5;
                interfaceC3759g7 = interfaceC3759g6;
                AbstractC16868Z.m18578a(c14111x0, interfaceC1426a, interfaceC1436k7, interfaceC1426a5, interfaceC1426a6, (InterfaceC1426a) objM6514H19, null, null, null, c6021p, 0, 448);
                c6021p.m6553p(true);
                c6021p.m6524S(-1357129976);
                if (c14111x0.f44422n) {
                    c6021p.m6524S(-1357125453);
                    zM6542f8 = c6021p.m6542f(interfaceC3759g2);
                    objM6514H20 = c6021p.m6514H();
                    if (zM6542f8) {
                        obj7 = obj6;
                        if (objM6514H20 == obj7) {
                        }
                        InterfaceC1436k interfaceC1436k8 = (InterfaceC1436k) objM6514H20;
                        c6021p.m6553p(false);
                        if (c14111x0.f44421m0 == EnumC14057V0.f44189o0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        c6021p.m6524S(-1357118105);
                        zM6542f9 = c6021p.m6542f(interfaceC3759g7);
                        objM6514H21 = c6021p.m6514H();
                        if (zM6542f9) {
                            objM6514H21 = new C16862T(interfaceC3759g7, 1);
                            c6021p.m6537c0(objM6514H21);
                        } else {
                            objM6514H21 = new C16862T(interfaceC3759g7, 1);
                            c6021p.m6537c0(objM6514H21);
                        }
                        c6021p.m6553p(false);
                        AbstractC8747y4.m9498a(c19866q.f62970a, interfaceC1436k8, z13, interfaceC1426a, (InterfaceC1426a) objM6514H21, c6021p, 0);
                    } else {
                        obj7 = obj6;
                    }
                    objM6514H20 = new C14107v0(interfaceC3759g2, 10);
                    c6021p.m6537c0(objM6514H20);
                    InterfaceC1436k interfaceC1436k9 = (InterfaceC1436k) objM6514H20;
                    c6021p.m6553p(false);
                    if (c14111x0.f44421m0 == EnumC14057V0.f44189o0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c6021p.m6524S(-1357118105);
                    zM6542f9 = c6021p.m6542f(interfaceC3759g7);
                    objM6514H21 = c6021p.m6514H();
                    if (zM6542f9) {
                        objM6514H21 = new C16862T(interfaceC3759g7, 1);
                        c6021p.m6537c0(objM6514H21);
                    } else {
                        objM6514H21 = new C16862T(interfaceC3759g7, 1);
                        c6021p.m6537c0(objM6514H21);
                    }
                    c6021p.m6553p(false);
                    AbstractC8747y4.m9498a(c19866q.f62970a, interfaceC1436k9, z13, interfaceC1426a, (InterfaceC1426a) objM6514H21, c6021p, 0);
                }
                AbstractC3794B0.m4471F(c6021p, false, true, true);
                c13522n6 = c13522n9;
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c6021p.m6517L();
                interfaceC10459q4 = interfaceC10459q2;
                c13522n6 = c13522n2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C16907t(interfaceC10459q4, c13522n6, i10, i11, 1);
            }
        }
        i12 |= 48;
        c13522n2 = c13522n;
        i13 = i12;
        if ((i13 & 19) == 18) {
            c10456n = C10456n.f30959Y;
            if (i20 != 0) {
                interfaceC10459q2 = c10456n;
            }
            obj = C6013l.f19514a;
            if (i21 != 0) {
                c6021p.m6524S(-922087164);
                objM6514H25 = c6021p.m6514H();
                if (objM6514H25 == obj) {
                    objM6514H25 = new C13522n();
                    c6021p.m6537c0(objM6514H25);
                }
                c6021p.m6553p(false);
                c13522n2 = (C13522n) objM6514H25;
            }
            interfaceC0300w1 = (InterfaceC0300w1) c6021p.m6548k(AbstractC0187M0.f712n);
            c6021p.m6524S(-1020152108);
            c5984w0 = AndroidCompositionLocals_androidKt.f32825b;
            context = (Context) c6021p.m6548k(c5984w0);
            c5984w1 = AbstractC0233b1.f873a;
            zBooleanValue = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
            c5984w2 = AbstractC16421b.f50950a;
            list = (List) c6021p.m6548k(c5984w2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14111x0.class));
            } else {
                if (zBooleanValue) {
                    throw new C0644w(17);
                }
                interfaceC2062k = null;
            }
            c6021p.m6553p(false);
            LocalViewModelStoreOwner.f33491a.getClass();
            viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            c16527d = AbstractC16526C.f51263a;
            interfaceC10459q3 = interfaceC10459q2;
            InterfaceC3756d interfaceC3756dMo5693b7 = c16527d.mo5693b(ConversationViewModel.class);
            InterfaceC3756d interfaceC3756dMo5693b8 = c16527d.mo5693b(C14111x0.class);
            c6021p.m6524S(-1395498839);
            zM6542f = c6021p.m6542f(interfaceC3756dMo5693b8) | c6021p.m6542f(interfaceC3756dMo5693b7) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            objM6514H = c6021p.m6514H();
            if (zM6542f) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(AbstractC16526C.m18073a(C14111x0.class), AbstractC16526C.m18073a(ConversationViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w(17);
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            } else {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(AbstractC16526C.m18073a(C14111x0.class), AbstractC16526C.m18073a(ConversationViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w(17);
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel4 = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel4, c6021p, 0);
            c6021p.m6553p(false);
            conversationViewModel = (ConversationViewModel) baseViewModel4;
            c6021p.m6524S(-1020152108);
            context2 = (Context) c6021p.m6548k(c5984w0);
            zBooleanValue2 = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
            list2 = (List) c6021p.m6548k(c5984w2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue2) {
                interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
            } else {
                if (zBooleanValue2) {
                    throw new C0644w(17);
                }
                interfaceC2062k2 = null;
            }
            c6021p.m6553p(false);
            viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a2 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            InterfaceC3756d interfaceC3756dMo5693b9 = c16527d.mo5693b(MessagesViewModel.class);
            InterfaceC3756d interfaceC3756dMo5693b10 = c16527d.mo5693b(C18160X.class);
            c6021p.m6524S(-1395498839);
            zM6542f2 = c6021p.m6542f(interfaceC3756dMo5693b10) | c6021p.m6542f(interfaceC3756dMo5693b9) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f2) {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H2);
            } else {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H2);
            }
            BaseViewModel baseViewModel5 = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel5, c6021p, 0);
            c6021p.m6553p(false);
            messagesViewModel = (MessagesViewModel) baseViewModel5;
            c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(-922075317);
            zM6542f3 = c6021p.m6542f(conversationViewModel);
            objM6514H3 = c6021p.m6514H();
            if (zM6542f3) {
                objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 0);
                c6021p.m6537c0(objM6514H3);
            } else {
                objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 0);
                c6021p.m6537c0(objM6514H3);
            }
            interfaceC3759g = (InterfaceC3759g) objM6514H3;
            objM530s = AbstractC0168G.m530s(-922073150, c6021p, false);
            c5975s = C5975S.f19448r0;
            if (objM530s == obj) {
                obj2 = null;
                objM530s = C5997d.m6430Q(null, c5975s);
                c6021p.m6537c0(objM530s);
            } else {
                obj2 = null;
            }
            interfaceC5985X = (InterfaceC5985X) objM530s;
            objM530s2 = AbstractC0168G.m530s(-922070162, c6021p, false);
            if (objM530s2 == obj) {
                objM530s2 = C5997d.m6430Q(obj2, c5975s);
                c6021p.m6537c0(objM530s2);
            }
            interfaceC5985X2 = (InterfaceC5985X) objM530s2;
            objM530s3 = AbstractC0168G.m530s(-922067671, c6021p, false);
            if (objM530s3 == obj) {
                objM530s3 = C5997d.m6430Q(Boolean.FALSE, c5975s);
                c6021p.m6537c0(objM530s3);
            }
            interfaceC5985X3 = (InterfaceC5985X) objM530s3;
            c6021p.m6553p(false);
            interfaceC7678dM10508c = AbstractC9856b0.m10508c("android.permission.CAMERA", null, c6021p, 6, 2);
            C6427b c6427b3 = new C6427b(9);
            c6021p.m6524S(-922060741);
            objM6514H4 = c6021p.m6514H();
            if (objM6514H4 == obj) {
                objM6514H4 = new C4702c(interfaceC5985X2, interfaceC5985X, 2);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            c14893gM9235b = AbstractC8571V2.m9235b(c6427b3, (InterfaceC1436k) objM6514H4, c6021p, 48);
            C16653d c16653d2 = new C16653d(4);
            c6021p.m6524S(-922050723);
            objM6514H5 = c6021p.m6514H();
            if (objM6514H5 == obj) {
                objM6514H5 = new C6194i(interfaceC5985X, 21);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            c14893gM9235b2 = AbstractC8571V2.m9235b(c16653d2, (InterfaceC1436k) objM6514H5, c6021p, 48);
            C6427b c6427b4 = new C6427b(3);
            c6021p.m6524S(-922044643);
            objM6514H6 = c6021p.m6514H();
            if (objM6514H6 == obj) {
                objM6514H6 = new C6194i(interfaceC5985X, 20);
                c6021p.m6537c0(objM6514H6);
            }
            c6021p.m6553p(false);
            c14893gM9235b3 = AbstractC8571V2.m9235b(c6427b4, (InterfaceC1436k) objM6514H6, c6021p, 48);
            c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c6021p.m6524S(617413469);
            it = ((Iterable) c6021p.m6548k(c5984w2)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                it2 = it;
                if (next instanceof C1996m) {
                    break;
                    break;
                }
                it = it2;
            }
            if (next != null) {
                objM19235b = (C1996m) next;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(C1996m.class);
                c6021p.m6553p(false);
            }
            c1996m = (C1996m) objM19235b;
            if (c1996m != null) {
                c18418a = c1996m.f5936a;
            } else {
                c18418a = null;
            }
            c6021p.m6524S(-922034753);
            zM6542f4 = c6021p.m6542f(interfaceC7678dM10508c) | c6021p.m6545h(c14893gM9235b) | c6021p.m6545h(c8870f) | c6021p.m6545h(c14893gM9235b2) | c6021p.m6545h(c14893gM9235b3) | c6021p.m6542f(interfaceC0300w1);
            c18418a2 = c18418a;
            objM6514H7 = c6021p.m6514H();
            if (zM6542f4) {
                objM6514H7 = new InputPanelKt$InputPanel$inputViewModel$1$1(interfaceC7678dM10508c, c14893gM9235b, c8870f, c14893gM9235b2, c14893gM9235b3, interfaceC0300w1, interfaceC5985X3);
                c6021p.m6537c0(objM6514H7);
            } else {
                objM6514H7 = new InputPanelKt$InputPanel$inputViewModel$1$1(interfaceC7678dM10508c, c14893gM9235b, c8870f, c14893gM9235b2, c14893gM9235b3, interfaceC0300w1, interfaceC5985X3);
                c6021p.m6537c0(objM6514H7);
            }
            interfaceC1436k = (InterfaceC1436k) objM6514H7;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            context3 = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            zBooleanValue3 = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            list3 = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue3) {
                interfaceC2062k3 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19866Q.class));
                z6 = false;
            } else {
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                z6 = false;
                interfaceC2062k3 = null;
            }
            c6021p.m6553p(z6);
            LocalViewModelStoreOwner.f33491a.getClass();
            viewModelStoreOwnerM12165a3 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a3 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            c16527d2 = AbstractC16526C.f51263a;
            InterfaceC3756d interfaceC3756dMo5693b11 = c16527d2.mo5693b(InputViewModel.class);
            c13522n3 = c13522n2;
            InterfaceC3756d interfaceC3756dMo5693b12 = c16527d2.mo5693b(C19866Q.class);
            c6021p.m6524S(-1395498839);
            zM6542f5 = c6021p.m6542f(interfaceC3756dMo5693b11) | c6021p.m6542f(interfaceC3756dMo5693b12) | c6021p.m6542f(list3) | c6021p.m6544g(zBooleanValue3) | c6021p.m6542f(interfaceC2062k3);
            objM6514H8 = c6021p.m6514H();
            if (zM6542f5) {
                if (zBooleanValue3) {
                    ViewModelFactoryProviderKt.m14399b(c16527d2.mo5693b(C19866Q.class), c16527d2.mo5693b(InputViewModel.class), context3, interfaceC2062k3);
                    throw null;
                }
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                objM6514H8 = ViewModelFactoryProviderKt.m14398a(c16527d2.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                c6021p.m6537c0(objM6514H8);
            } else {
                if (zBooleanValue3) {
                    ViewModelFactoryProviderKt.m14399b(c16527d2.mo5693b(C19866Q.class), c16527d2.mo5693b(InputViewModel.class), context3, interfaceC2062k3);
                    throw null;
                }
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                objM6514H8 = ViewModelFactoryProviderKt.m14398a(c16527d2.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                c6021p.m6537c0(objM6514H8);
            }
            baseViewModel = (BaseViewModel) objM6514H8;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            zM6545h = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            objM6514H9 = c6021p.m6514H();
            if (zM6545h) {
                objM6514H9 = new InputPanelKt$InputPanel$$inlined$injectViewModel$1(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H9);
            } else {
                objM6514H9 = new InputPanelKt$InputPanel$$inlined$injectViewModel$1(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H9);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H9, c6021p, baseViewModel);
            c6021p.m6553p(false);
            inputViewModel = (InputViewModel) baseViewModel;
            c19866q = (C19866Q) AbstractC9112C3.m9642d(inputViewModel.f40343c, c6021p).getValue();
            interfaceC5985X2.setValue(c19866q.f62973d);
            c6021p.m6524S(-921987004);
            zM6545h2 = c6021p.m6545h(inputViewModel);
            objM6514H10 = c6021p.m6514H();
            if (zM6545h2) {
                objM6514H10 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 1);
                c6021p.m6537c0(objM6514H10);
            } else {
                objM6514H10 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 1);
                c6021p.m6537c0(objM6514H10);
            }
            interfaceC3759g2 = (InterfaceC3759g) objM6514H10;
            c6021p.m6553p(false);
            interfaceC5985X.setValue(interfaceC3759g2);
            boolean z17 = c14111x0.f44438z.f44212e;
            boolean z18 = !z17;
            c6021p.m6524S(-921981491);
            objM6514H11 = c6021p.m6514H();
            if (objM6514H11 == obj) {
                objM6514H11 = C5997d.m6430Q(Boolean.valueOf(!c19866q.m20785h()), c5975s);
                c6021p.m6537c0(objM6514H11);
            }
            interfaceC5985X4 = (InterfaceC5985X) objM6514H11;
            c6021p.m6553p(false);
            if (c19866q.m20784g()) {
                if (c19866q.f62977h != EnumC21517f.f68139o0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (c19866q.f62977h != EnumC21517f.f68139o0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c6021p.m6524S(-921967986);
            objM6514H12 = c6021p.m6514H();
            if (objM6514H12 == obj) {
                objM6514H12 = AbstractC0168G.m536y(c6021p);
            }
            interfaceC17406l = (InterfaceC17406l) objM6514H12;
            c6021p.m6553p(false);
            zBooleanValue4 = ((Boolean) interfaceC5985X4.getValue()).booleanValue();
            C6045C c6045c2 = c19866q.f62970a;
            if (zBooleanValue4) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (z11) {
                c6021p.m6524S(-921959943);
                jM15774b = C14365u.m15774b(0.5f, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12190D);
                c6021p.m6553p(false);
                z12 = false;
            } else {
                if (z11) {
                    c6021p.m6524S(-922298169);
                    c6021p.m6553p(false);
                    throw new C0644w();
                }
                c6021p.m6524S(-921957385);
                jM15774b = C14365u.m15774b(0.0f, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12190D);
                z12 = false;
                c6021p.m6553p(false);
            }
            interfaceC5982V0M14999a = AbstractC13474L.m14999a(jM15774b, AbstractC13758e.m15254s(0.0f, 0.0f, null, 7), "Input Panel Scrim", c6021p, 432, 8);
            if (((Boolean) AbstractC9183O2.m9739b(interfaceC17406l, c6021p).getValue()).booleanValue()) {
                interfaceC5985X4.setValue(Boolean.FALSE);
            }
            Integer numValueOf2 = Integer.valueOf(c19866q.f62975f.size());
            c6021p.m6524S(-921949248);
            zM6542f6 = c6021p.m6542f(c19866q);
            objM6514H13 = c6021p.m6514H();
            if (zM6542f6) {
                objM6514H13 = new C16858O(c19866q, interfaceC5985X4, null);
                c6021p.m6537c0(objM6514H13);
            } else {
                objM6514H13 = new C16858O(c19866q, interfaceC5985X4, null);
                c6021p.m6537c0(objM6514H13);
            }
            c6021p.m6553p(false);
            C5997d.m6451g(c6045c2, numValueOf2, (InterfaceC1439n) objM6514H13, c6021p);
            c6021p.m6524S(-921945071);
            if (c19866q.f62988s) {
                C17296C c17296c2 = C17296C.f55119a;
                c6021p.m6524S(-921943124);
                if ((i13 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM6542f11 = z14 | c6021p.m6542f(interfaceC0300w2) | c6021p.m6545h(inputViewModel);
                objM6514H24 = c6021p.m6514H();
                if (zM6542f11) {
                    c13522n4 = c13522n3;
                    objM6514H24 = new C16859P(c13522n4, interfaceC0300w1, inputViewModel, null);
                    c6021p.m6537c0(objM6514H24);
                } else {
                    c13522n4 = c13522n3;
                    objM6514H24 = new C16859P(c13522n4, interfaceC0300w1, inputViewModel, null);
                    c6021p.m6537c0(objM6514H24);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H24, c6021p, c17296c2);
            } else {
                c13522n4 = c13522n3;
                interfaceC0300w2 = interfaceC0300w1;
            }
            c6021p.m6553p(false);
            c21999e0 = c19866q.f62989t;
            if (c21999e0 != null) {
                C21995d0 c21995d1 = C21999e0.Companion;
                EnumC21964U enumC21964U2 = EnumC21964U.FileUpload;
                c21995d1.getClass();
                c21958sM22341a = C21995d0.m22341a(c21999e0, enumC21964U2);
            } else {
                c21958sM22341a = null;
            }
            c6021p.m6524S(-921934800);
            if (c19866q.f62990u) {
                c13522n5 = c13522n4;
                interfaceC3759g3 = interfaceC3759g;
                r10 = 0;
            } else {
                c13522n5 = c13522n4;
                interfaceC3759g3 = interfaceC3759g;
                r10 = 0;
            }
            c6021p.m6553p(r10);
            c6021p.m6524S(-921917199);
            if (((Boolean) interfaceC5985X3.getValue()).booleanValue()) {
                c6021p.m6524S(-921913524);
                objM6514H23 = c6021p.m6514H();
                obj3 = obj;
                if (objM6514H23 == obj3) {
                    objM6514H23 = new C14103t0(interfaceC5985X3, 8);
                    c6021p.m6537c0(objM6514H23);
                }
                c6021p.m6553p(r10);
                AbstractC9830X.m10473b(interfaceC7678dM10508c, R.string.conversation_camera_permission_request_rationale, (InterfaceC1426a) objM6514H23, c6021p, 384);
            } else {
                obj3 = r5;
            }
            c6021p.m6553p(r10);
            C17756f c17756f2 = AbstractC17770m.f56726c;
            C10449g c10449g2 = C10444b.f30946y0;
            C17790w c17790wM19515a4 = AbstractC17788v.m19515a(c17756f2, c10449g2, c6021p, r10);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a4);
            C21694h c21694h11 = C21698j.f68872e;
            C5997d.m6439Z(c21694h11, c6021p, interfaceC6008i0M6550m6);
            c21694h2 = C21698j.f68874g;
            if (c6021p.f19563O) {
                c21694h3 = c21694h;
                if (!AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                }
                C21694h c21694h12 = C21698j.f68871d;
                C5997d.m6439Z(c21694h12, c6021p, interfaceC10459qM10923d6);
                InterfaceC1436k interfaceC1436k10 = (InterfaceC1436k) interfaceC3759g2;
                C21694h c21694h13 = c21694h3;
                AbstractC16854K.m18576b(c19866q, interfaceC1436k10, null, c6021p, 0, 4);
                if (c21999e0 != null) {
                    c21987b0 = c21999e0.f69629b;
                } else {
                    c21987b0 = null;
                }
                if (c19866q.f62991v) {
                    interfaceC3759g4 = interfaceC3759g3;
                    if (c19866q.f62992w) {
                        c6021p.m6524S(-637944548);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-637944548);
                        c6021p.m6553p(false);
                    }
                } else {
                    interfaceC3759g4 = interfaceC3759g3;
                    if (c19866q.f62992w) {
                        c6021p.m6524S(-637944548);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-637944548);
                        c6021p.m6553p(false);
                    }
                }
                f10 = AbstractC7313q.f23199d;
                InterfaceC10459q interfaceC10459qM11237o5 = AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, f10, 0.0f, 11);
                if (c19866q.f62976g.isEmpty()) {
                    f11 = f10;
                } else {
                    f11 = AbstractC7313q.f23198c;
                }
                InterfaceC10459q interfaceC10459qM11237o6 = AbstractC10842a.m11237o(interfaceC10459qM11237o5, 0.0f, f11, 0.0f, f10, 5);
                C17781r0 c17781r0M19506b3 = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23198c), C10444b.f30945x0, c6021p, 48);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m7 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d7 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o6);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h13, c6021p, c17781r0M19506b3);
                C5997d.m6439Z(c21694h11, c6021p, interfaceC6008i0M6550m7);
                if (c6021p.f19563O) {
                    c21694h4 = c21694h2;
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h4);
                } else {
                    c21694h4 = c21694h2;
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h4);
                }
                C5997d.m6439Z(c21694h12, c6021p, interfaceC10459qM10923d7);
                C17785t0 c17785t2 = C17785t0.f56761a;
                c6021p.m6524S(-1357428602);
                objM6514H14 = c6021p.m6514H();
                if (objM6514H14 == obj3) {
                    objM6514H14 = C5997d.m6429P(1);
                    c6021p.m6537c0(objM6514H14);
                }
                c5996c0 = (C5996c0) objM6514H14;
                c6021p.m6553p(false);
                interfaceC10277bM19906b = AbstractC18539i.m19906b(c6021p);
                c6021p.m6524S(-1357424814);
                zM6545h3 = c6021p.m6545h(interfaceC10277bM19906b) | c6021p.m6542f(interfaceC0300w2) | c6021p.m6542f(interfaceC3759g4);
                objM6514H15 = c6021p.m6514H();
                if (zM6545h3) {
                    i16 = 1;
                    objM6514H15 = new C16905s(interfaceC10277bM19906b, interfaceC0300w2, interfaceC3759g4, 1);
                    c6021p.m6537c0(objM6514H15);
                } else {
                    i16 = 1;
                    objM6514H15 = new C16905s(interfaceC10277bM19906b, interfaceC0300w2, interfaceC3759g4, 1);
                    c6021p.m6537c0(objM6514H15);
                }
                interfaceC1426a = (InterfaceC1426a) objM6514H15;
                c6021p.m6553p(false);
                C13783q0 c13783q2 = AbstractC13508z.f42768a;
                Object obj10 = AbstractC13795w0.f43580a;
                c21694h5 = c21694h4;
                obj4 = obj3;
                interfaceC3759g5 = interfaceC3759g4;
                AbstractC10831a.m11200c(c17785t2, z10, null, AbstractC13508z.m15021m(new C0537v(21, C13485c.f42675G0), AbstractC13758e.m15254s(0.0f, 400.0f, new C7543h(AbstractC9101A4.m9631a(i16, i16)), i16)).m14995a(AbstractC13508z.m15009a(null, null, 15)), AbstractC13508z.m15023o(new C0537v(23, C13485c.f42677I0), AbstractC13758e.m15254s(0.0f, 400.0f, new C7543h(AbstractC9101A4.m9631a(1, 1)), 1)).m14996a(AbstractC13508z.m15017i(null, null, 15)), null, AbstractC8411c.m8969c(402487492, c6021p, new C8777V(c19866q, z18, interfaceC3759g2, c18418a2, c8870f, interfaceC5985X4)), c6021p, 1600518, 18);
                AbstractC10831a.m11200c(c17785t2, !z10, null, AbstractC13508z.m15009a(null, null, 15), AbstractC13508z.m15017i(null, null, 15), null, AbstractC16877e.f54167a, c6021p, 1600518, 18);
                float f14 = AbstractC7306j.f23145c;
                InterfaceC10459q interfaceC10459qM8501a3 = AbstractC8079e5.m8501a(AbstractC9262b4.m9836a(c17785t2.m19513a(c10456n, 1.0f, true), z17), AbstractC20417e.m21079a(AbstractC7314r.f23209b));
                c6021p.m6524S(-1357334599);
                zM6542f7 = c6021p.m6542f(interfaceC5982V0M14999a);
                objM6514H16 = c6021p.m6514H();
                if (zM6542f7) {
                    i17 = 2;
                    objM6514H16 = new C17122m(interfaceC5982V0M14999a, 2);
                    c6021p.m6537c0(objM6514H16);
                } else {
                    i17 = 2;
                    objM6514H16 = new C17122m(interfaceC5982V0M14999a, 2);
                    c6021p.m6537c0(objM6514H16);
                }
                c6021p.m6553p(false);
                i18 = i17;
                C13522n c13522n10 = c13522n5;
                AbstractC4034c4.m4725a(AbstractC10861a.m11297c(interfaceC10459qM8501a3, (InterfaceC1436k) objM6514H16), null, 0L, 0L, f14, 0.0f, null, AbstractC8411c.m8969c(-1726524127, c6021p, new C16861S(c19866q, interfaceC3759g2, z10, c13522n5, interfaceC1426a, z18, interfaceC17406l, c5996c0, c14111x0, interfaceC3759g5)), c6021p, 12582912, 110);
                C17790w c17790wM19515a5 = AbstractC17788v.m19515a(c17756f2, c10449g2, c6021p, 0);
                i19 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m8 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d8 = AbstractC10443a.m10923d(c6021p, c10456n);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h13, c6021p, c17790wM19515a5);
                C5997d.m6439Z(c21694h11, c6021p, interfaceC6008i0M6550m8);
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i19, c6021p, i19, c21694h5);
                } else {
                    AbstractC0168G.m537z(i19, c6021p, i19, c21694h5);
                }
                C5997d.m6439Z(c21694h12, c6021p, interfaceC10459qM10923d8);
                c6021p.m6524S(251950728);
                if (c5996c0.m6412g() >= 3) {
                    c6021p.m6524S(251954021);
                    interfaceC3759g6 = interfaceC3759g5;
                    zM6542f10 = c6021p.m6542f(interfaceC3759g6);
                    objM6514H22 = c6021p.m6514H();
                    obj5 = obj4;
                    if (zM6542f10) {
                        objM6514H22 = new C8846h(interfaceC3759g6, 28);
                        c6021p.m6537c0(objM6514H22);
                    } else {
                        objM6514H22 = new C8846h(interfaceC3759g6, 28);
                        c6021p.m6537c0(objM6514H22);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H22, null, false, null, null, AbstractC16877e.f54168b, c6021p, 196608, 30);
                } else {
                    obj5 = obj4;
                    interfaceC3759g6 = interfaceC3759g5;
                }
                c6021p.m6553p(false);
                InterfaceC1436k interfaceC1436k11 = (InterfaceC1436k) interfaceC3759g6;
                c6021p.m6524S(251973544);
                zM6545h4 = c6021p.m6545h(c18418a2) | c6021p.m6545h(c8870f) | c6021p.m6542f(interfaceC3759g6);
                objM6514H17 = c6021p.m6514H();
                if (zM6545h4) {
                    objM6514H17 = new C16899p(c18418a2, c8870f, interfaceC3759g6, i18);
                    c6021p.m6537c0(objM6514H17);
                } else {
                    objM6514H17 = new C16899p(c18418a2, c8870f, interfaceC3759g6, i18);
                    c6021p.m6537c0(objM6514H17);
                }
                InterfaceC1426a interfaceC1426a7 = (InterfaceC1426a) objM6514H17;
                c6021p.m6553p(false);
                c6021p.m6524S(251990535);
                zM6545h5 = c6021p.m6545h(messagesViewModel) | c6021p.m6542f(c14111x0);
                objM6514H18 = c6021p.m6514H();
                if (zM6545h5) {
                    objM6514H18 = new C16901q(messagesViewModel, c14111x0, 1);
                    c6021p.m6537c0(objM6514H18);
                } else {
                    objM6514H18 = new C16901q(messagesViewModel, c14111x0, 1);
                    c6021p.m6537c0(objM6514H18);
                }
                InterfaceC1426a interfaceC1426a8 = (InterfaceC1426a) objM6514H18;
                c6021p.m6553p(false);
                c6021p.m6524S(251982029);
                zM6545h6 = c6021p.m6545h(c18418a2) | c6021p.m6545h(c8870f) | c6021p.m6542f(interfaceC3759g6);
                objM6514H19 = c6021p.m6514H();
                if (zM6545h6) {
                    objM6514H19 = new C16899p(c18418a2, c8870f, interfaceC3759g6, 3);
                    c6021p.m6537c0(objM6514H19);
                } else {
                    objM6514H19 = new C16899p(c18418a2, c8870f, interfaceC3759g6, 3);
                    c6021p.m6537c0(objM6514H19);
                }
                c6021p.m6553p(false);
                obj6 = obj5;
                interfaceC3759g7 = interfaceC3759g6;
                AbstractC16868Z.m18578a(c14111x0, interfaceC1426a, interfaceC1436k11, interfaceC1426a7, interfaceC1426a8, (InterfaceC1426a) objM6514H19, null, null, null, c6021p, 0, 448);
                c6021p.m6553p(true);
                c6021p.m6524S(-1357129976);
                if (c14111x0.f44422n) {
                    c6021p.m6524S(-1357125453);
                    zM6542f8 = c6021p.m6542f(interfaceC3759g2);
                    objM6514H20 = c6021p.m6514H();
                    if (zM6542f8) {
                        obj7 = obj6;
                        if (objM6514H20 == obj7) {
                        }
                        InterfaceC1436k interfaceC1436k12 = (InterfaceC1436k) objM6514H20;
                        c6021p.m6553p(false);
                        if (c14111x0.f44421m0 == EnumC14057V0.f44189o0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        c6021p.m6524S(-1357118105);
                        zM6542f9 = c6021p.m6542f(interfaceC3759g7);
                        objM6514H21 = c6021p.m6514H();
                        if (zM6542f9) {
                            objM6514H21 = new C16862T(interfaceC3759g7, 1);
                            c6021p.m6537c0(objM6514H21);
                        } else {
                            objM6514H21 = new C16862T(interfaceC3759g7, 1);
                            c6021p.m6537c0(objM6514H21);
                        }
                        c6021p.m6553p(false);
                        AbstractC8747y4.m9498a(c19866q.f62970a, interfaceC1436k12, z13, interfaceC1426a, (InterfaceC1426a) objM6514H21, c6021p, 0);
                    } else {
                        obj7 = obj6;
                    }
                    objM6514H20 = new C14107v0(interfaceC3759g2, 10);
                    c6021p.m6537c0(objM6514H20);
                    InterfaceC1436k interfaceC1436k13 = (InterfaceC1436k) objM6514H20;
                    c6021p.m6553p(false);
                    if (c14111x0.f44421m0 == EnumC14057V0.f44189o0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c6021p.m6524S(-1357118105);
                    zM6542f9 = c6021p.m6542f(interfaceC3759g7);
                    objM6514H21 = c6021p.m6514H();
                    if (zM6542f9) {
                        objM6514H21 = new C16862T(interfaceC3759g7, 1);
                        c6021p.m6537c0(objM6514H21);
                    } else {
                        objM6514H21 = new C16862T(interfaceC3759g7, 1);
                        c6021p.m6537c0(objM6514H21);
                    }
                    c6021p.m6553p(false);
                    AbstractC8747y4.m9498a(c19866q.f62970a, interfaceC1436k13, z13, interfaceC1426a, (InterfaceC1426a) objM6514H21, c6021p, 0);
                }
                AbstractC3794B0.m4471F(c6021p, false, true, true);
                c13522n6 = c13522n10;
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c21694h3 = c21694h;
            }
            AbstractC0168G.m537z(i14, c6021p, i14, c21694h2);
            C21694h c21694h14 = C21698j.f68871d;
            C5997d.m6439Z(c21694h14, c6021p, interfaceC10459qM10923d6);
            InterfaceC1436k interfaceC1436k14 = (InterfaceC1436k) interfaceC3759g2;
            C21694h c21694h15 = c21694h3;
            AbstractC16854K.m18576b(c19866q, interfaceC1436k14, null, c6021p, 0, 4);
            if (c21999e0 != null) {
                c21987b0 = c21999e0.f69629b;
            } else {
                c21987b0 = null;
            }
            if (c19866q.f62991v) {
                interfaceC3759g4 = interfaceC3759g3;
                if (c19866q.f62992w) {
                    c6021p.m6524S(-637944548);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-637944548);
                    c6021p.m6553p(false);
                }
            } else {
                interfaceC3759g4 = interfaceC3759g3;
                if (c19866q.f62992w) {
                    c6021p.m6524S(-637944548);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-637944548);
                    c6021p.m6553p(false);
                }
            }
            f10 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459qM11237o7 = AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, f10, 0.0f, 11);
            if (c19866q.f62976g.isEmpty()) {
                f11 = f10;
            } else {
                f11 = AbstractC7313q.f23198c;
            }
            InterfaceC10459q interfaceC10459qM11237o8 = AbstractC10842a.m11237o(interfaceC10459qM11237o7, 0.0f, f11, 0.0f, f10, 5);
            C17781r0 c17781r0M19506b4 = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23198c), C10444b.f30945x0, c6021p, 48);
            i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m9 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d9 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o8);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h15, c6021p, c17781r0M19506b4);
            C5997d.m6439Z(c21694h11, c6021p, interfaceC6008i0M6550m9);
            if (c6021p.f19563O) {
                c21694h4 = c21694h2;
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h4);
            } else {
                c21694h4 = c21694h2;
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h4);
            }
            C5997d.m6439Z(c21694h14, c6021p, interfaceC10459qM10923d9);
            C17785t0 c17785t3 = C17785t0.f56761a;
            c6021p.m6524S(-1357428602);
            objM6514H14 = c6021p.m6514H();
            if (objM6514H14 == obj3) {
                objM6514H14 = C5997d.m6429P(1);
                c6021p.m6537c0(objM6514H14);
            }
            c5996c0 = (C5996c0) objM6514H14;
            c6021p.m6553p(false);
            interfaceC10277bM19906b = AbstractC18539i.m19906b(c6021p);
            c6021p.m6524S(-1357424814);
            zM6545h3 = c6021p.m6545h(interfaceC10277bM19906b) | c6021p.m6542f(interfaceC0300w2) | c6021p.m6542f(interfaceC3759g4);
            objM6514H15 = c6021p.m6514H();
            if (zM6545h3) {
                i16 = 1;
                objM6514H15 = new C16905s(interfaceC10277bM19906b, interfaceC0300w2, interfaceC3759g4, 1);
                c6021p.m6537c0(objM6514H15);
            } else {
                i16 = 1;
                objM6514H15 = new C16905s(interfaceC10277bM19906b, interfaceC0300w2, interfaceC3759g4, 1);
                c6021p.m6537c0(objM6514H15);
            }
            interfaceC1426a = (InterfaceC1426a) objM6514H15;
            c6021p.m6553p(false);
            C13783q0 c13783q3 = AbstractC13508z.f42768a;
            Object obj11 = AbstractC13795w0.f43580a;
            c21694h5 = c21694h4;
            obj4 = obj3;
            interfaceC3759g5 = interfaceC3759g4;
            AbstractC10831a.m11200c(c17785t3, z10, null, AbstractC13508z.m15021m(new C0537v(21, C13485c.f42675G0), AbstractC13758e.m15254s(0.0f, 400.0f, new C7543h(AbstractC9101A4.m9631a(i16, i16)), i16)).m14995a(AbstractC13508z.m15009a(null, null, 15)), AbstractC13508z.m15023o(new C0537v(23, C13485c.f42677I0), AbstractC13758e.m15254s(0.0f, 400.0f, new C7543h(AbstractC9101A4.m9631a(1, 1)), 1)).m14996a(AbstractC13508z.m15017i(null, null, 15)), null, AbstractC8411c.m8969c(402487492, c6021p, new C8777V(c19866q, z18, interfaceC3759g2, c18418a2, c8870f, interfaceC5985X4)), c6021p, 1600518, 18);
            AbstractC10831a.m11200c(c17785t3, !z10, null, AbstractC13508z.m15009a(null, null, 15), AbstractC13508z.m15017i(null, null, 15), null, AbstractC16877e.f54167a, c6021p, 1600518, 18);
            float f15 = AbstractC7306j.f23145c;
            InterfaceC10459q interfaceC10459qM8501a4 = AbstractC8079e5.m8501a(AbstractC9262b4.m9836a(c17785t3.m19513a(c10456n, 1.0f, true), z17), AbstractC20417e.m21079a(AbstractC7314r.f23209b));
            c6021p.m6524S(-1357334599);
            zM6542f7 = c6021p.m6542f(interfaceC5982V0M14999a);
            objM6514H16 = c6021p.m6514H();
            if (zM6542f7) {
                i17 = 2;
                objM6514H16 = new C17122m(interfaceC5982V0M14999a, 2);
                c6021p.m6537c0(objM6514H16);
            } else {
                i17 = 2;
                objM6514H16 = new C17122m(interfaceC5982V0M14999a, 2);
                c6021p.m6537c0(objM6514H16);
            }
            c6021p.m6553p(false);
            i18 = i17;
            C13522n c13522n11 = c13522n5;
            AbstractC4034c4.m4725a(AbstractC10861a.m11297c(interfaceC10459qM8501a4, (InterfaceC1436k) objM6514H16), null, 0L, 0L, f15, 0.0f, null, AbstractC8411c.m8969c(-1726524127, c6021p, new C16861S(c19866q, interfaceC3759g2, z10, c13522n5, interfaceC1426a, z18, interfaceC17406l, c5996c0, c14111x0, interfaceC3759g5)), c6021p, 12582912, 110);
            C17790w c17790wM19515a6 = AbstractC17788v.m19515a(c17756f2, c10449g2, c6021p, 0);
            i19 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m10 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d10 = AbstractC10443a.m10923d(c6021p, c10456n);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h15, c6021p, c17790wM19515a6);
            C5997d.m6439Z(c21694h11, c6021p, interfaceC6008i0M6550m10);
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i19, c6021p, i19, c21694h5);
            } else {
                AbstractC0168G.m537z(i19, c6021p, i19, c21694h5);
            }
            C5997d.m6439Z(c21694h14, c6021p, interfaceC10459qM10923d10);
            c6021p.m6524S(251950728);
            if (c5996c0.m6412g() >= 3) {
                c6021p.m6524S(251954021);
                interfaceC3759g6 = interfaceC3759g5;
                zM6542f10 = c6021p.m6542f(interfaceC3759g6);
                objM6514H22 = c6021p.m6514H();
                obj5 = obj4;
                if (zM6542f10) {
                    objM6514H22 = new C8846h(interfaceC3759g6, 28);
                    c6021p.m6537c0(objM6514H22);
                } else {
                    objM6514H22 = new C8846h(interfaceC3759g6, 28);
                    c6021p.m6537c0(objM6514H22);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H22, null, false, null, null, AbstractC16877e.f54168b, c6021p, 196608, 30);
            } else {
                obj5 = obj4;
                interfaceC3759g6 = interfaceC3759g5;
            }
            c6021p.m6553p(false);
            InterfaceC1436k interfaceC1436k15 = (InterfaceC1436k) interfaceC3759g6;
            c6021p.m6524S(251973544);
            zM6545h4 = c6021p.m6545h(c18418a2) | c6021p.m6545h(c8870f) | c6021p.m6542f(interfaceC3759g6);
            objM6514H17 = c6021p.m6514H();
            if (zM6545h4) {
                objM6514H17 = new C16899p(c18418a2, c8870f, interfaceC3759g6, i18);
                c6021p.m6537c0(objM6514H17);
            } else {
                objM6514H17 = new C16899p(c18418a2, c8870f, interfaceC3759g6, i18);
                c6021p.m6537c0(objM6514H17);
            }
            InterfaceC1426a interfaceC1426a9 = (InterfaceC1426a) objM6514H17;
            c6021p.m6553p(false);
            c6021p.m6524S(251990535);
            zM6545h5 = c6021p.m6545h(messagesViewModel) | c6021p.m6542f(c14111x0);
            objM6514H18 = c6021p.m6514H();
            if (zM6545h5) {
                objM6514H18 = new C16901q(messagesViewModel, c14111x0, 1);
                c6021p.m6537c0(objM6514H18);
            } else {
                objM6514H18 = new C16901q(messagesViewModel, c14111x0, 1);
                c6021p.m6537c0(objM6514H18);
            }
            InterfaceC1426a interfaceC1426a10 = (InterfaceC1426a) objM6514H18;
            c6021p.m6553p(false);
            c6021p.m6524S(251982029);
            zM6545h6 = c6021p.m6545h(c18418a2) | c6021p.m6545h(c8870f) | c6021p.m6542f(interfaceC3759g6);
            objM6514H19 = c6021p.m6514H();
            if (zM6545h6) {
                objM6514H19 = new C16899p(c18418a2, c8870f, interfaceC3759g6, 3);
                c6021p.m6537c0(objM6514H19);
            } else {
                objM6514H19 = new C16899p(c18418a2, c8870f, interfaceC3759g6, 3);
                c6021p.m6537c0(objM6514H19);
            }
            c6021p.m6553p(false);
            obj6 = obj5;
            interfaceC3759g7 = interfaceC3759g6;
            AbstractC16868Z.m18578a(c14111x0, interfaceC1426a, interfaceC1436k15, interfaceC1426a9, interfaceC1426a10, (InterfaceC1426a) objM6514H19, null, null, null, c6021p, 0, 448);
            c6021p.m6553p(true);
            c6021p.m6524S(-1357129976);
            if (c14111x0.f44422n) {
                c6021p.m6524S(-1357125453);
                zM6542f8 = c6021p.m6542f(interfaceC3759g2);
                objM6514H20 = c6021p.m6514H();
                if (zM6542f8) {
                    obj7 = obj6;
                    if (objM6514H20 == obj7) {
                    }
                    InterfaceC1436k interfaceC1436k16 = (InterfaceC1436k) objM6514H20;
                    c6021p.m6553p(false);
                    if (c14111x0.f44421m0 == EnumC14057V0.f44189o0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c6021p.m6524S(-1357118105);
                    zM6542f9 = c6021p.m6542f(interfaceC3759g7);
                    objM6514H21 = c6021p.m6514H();
                    if (zM6542f9) {
                        objM6514H21 = new C16862T(interfaceC3759g7, 1);
                        c6021p.m6537c0(objM6514H21);
                    } else {
                        objM6514H21 = new C16862T(interfaceC3759g7, 1);
                        c6021p.m6537c0(objM6514H21);
                    }
                    c6021p.m6553p(false);
                    AbstractC8747y4.m9498a(c19866q.f62970a, interfaceC1436k16, z13, interfaceC1426a, (InterfaceC1426a) objM6514H21, c6021p, 0);
                } else {
                    obj7 = obj6;
                }
                objM6514H20 = new C14107v0(interfaceC3759g2, 10);
                c6021p.m6537c0(objM6514H20);
                InterfaceC1436k interfaceC1436k17 = (InterfaceC1436k) objM6514H20;
                c6021p.m6553p(false);
                if (c14111x0.f44421m0 == EnumC14057V0.f44189o0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                c6021p.m6524S(-1357118105);
                zM6542f9 = c6021p.m6542f(interfaceC3759g7);
                objM6514H21 = c6021p.m6514H();
                if (zM6542f9) {
                    objM6514H21 = new C16862T(interfaceC3759g7, 1);
                    c6021p.m6537c0(objM6514H21);
                } else {
                    objM6514H21 = new C16862T(interfaceC3759g7, 1);
                    c6021p.m6537c0(objM6514H21);
                }
                c6021p.m6553p(false);
                AbstractC8747y4.m9498a(c19866q.f62970a, interfaceC1436k17, z13, interfaceC1426a, (InterfaceC1426a) objM6514H21, c6021p, 0);
            }
            AbstractC3794B0.m4471F(c6021p, false, true, true);
            c13522n6 = c13522n11;
            interfaceC10459q4 = interfaceC10459q3;
        } else {
            c10456n = C10456n.f30959Y;
            if (i20 != 0) {
                interfaceC10459q2 = c10456n;
            }
            obj = C6013l.f19514a;
            if (i21 != 0) {
                c6021p.m6524S(-922087164);
                objM6514H25 = c6021p.m6514H();
                if (objM6514H25 == obj) {
                    objM6514H25 = new C13522n();
                    c6021p.m6537c0(objM6514H25);
                }
                c6021p.m6553p(false);
                c13522n2 = (C13522n) objM6514H25;
            }
            interfaceC0300w1 = (InterfaceC0300w1) c6021p.m6548k(AbstractC0187M0.f712n);
            c6021p.m6524S(-1020152108);
            c5984w0 = AndroidCompositionLocals_androidKt.f32825b;
            context = (Context) c6021p.m6548k(c5984w0);
            c5984w1 = AbstractC0233b1.f873a;
            zBooleanValue = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
            c5984w2 = AbstractC16421b.f50950a;
            list = (List) c6021p.m6548k(c5984w2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14111x0.class));
            } else {
                if (zBooleanValue) {
                    throw new C0644w(17);
                }
                interfaceC2062k = null;
            }
            c6021p.m6553p(false);
            LocalViewModelStoreOwner.f33491a.getClass();
            viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            c16527d = AbstractC16526C.f51263a;
            interfaceC10459q3 = interfaceC10459q2;
            InterfaceC3756d interfaceC3756dMo5693b13 = c16527d.mo5693b(ConversationViewModel.class);
            InterfaceC3756d interfaceC3756dMo5693b14 = c16527d.mo5693b(C14111x0.class);
            c6021p.m6524S(-1395498839);
            zM6542f = c6021p.m6542f(interfaceC3756dMo5693b14) | c6021p.m6542f(interfaceC3756dMo5693b13) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            objM6514H = c6021p.m6514H();
            if (zM6542f) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(AbstractC16526C.m18073a(C14111x0.class), AbstractC16526C.m18073a(ConversationViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w(17);
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            } else {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(AbstractC16526C.m18073a(C14111x0.class), AbstractC16526C.m18073a(ConversationViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w(17);
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel6 = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel6, c6021p, 0);
            c6021p.m6553p(false);
            conversationViewModel = (ConversationViewModel) baseViewModel6;
            c6021p.m6524S(-1020152108);
            context2 = (Context) c6021p.m6548k(c5984w0);
            zBooleanValue2 = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
            list2 = (List) c6021p.m6548k(c5984w2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue2) {
                interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
            } else {
                if (zBooleanValue2) {
                    throw new C0644w(17);
                }
                interfaceC2062k2 = null;
            }
            c6021p.m6553p(false);
            viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a2 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            InterfaceC3756d interfaceC3756dMo5693b15 = c16527d.mo5693b(MessagesViewModel.class);
            InterfaceC3756d interfaceC3756dMo5693b16 = c16527d.mo5693b(C18160X.class);
            c6021p.m6524S(-1395498839);
            zM6542f2 = c6021p.m6542f(interfaceC3756dMo5693b16) | c6021p.m6542f(interfaceC3756dMo5693b15) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f2) {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H2);
            } else {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H2);
            }
            BaseViewModel baseViewModel7 = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel7, c6021p, 0);
            c6021p.m6553p(false);
            messagesViewModel = (MessagesViewModel) baseViewModel7;
            c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(-922075317);
            zM6542f3 = c6021p.m6542f(conversationViewModel);
            objM6514H3 = c6021p.m6514H();
            if (zM6542f3) {
                objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 0);
                c6021p.m6537c0(objM6514H3);
            } else {
                objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 0);
                c6021p.m6537c0(objM6514H3);
            }
            interfaceC3759g = (InterfaceC3759g) objM6514H3;
            objM530s = AbstractC0168G.m530s(-922073150, c6021p, false);
            c5975s = C5975S.f19448r0;
            if (objM530s == obj) {
                obj2 = null;
                objM530s = C5997d.m6430Q(null, c5975s);
                c6021p.m6537c0(objM530s);
            } else {
                obj2 = null;
            }
            interfaceC5985X = (InterfaceC5985X) objM530s;
            objM530s2 = AbstractC0168G.m530s(-922070162, c6021p, false);
            if (objM530s2 == obj) {
                objM530s2 = C5997d.m6430Q(obj2, c5975s);
                c6021p.m6537c0(objM530s2);
            }
            interfaceC5985X2 = (InterfaceC5985X) objM530s2;
            objM530s3 = AbstractC0168G.m530s(-922067671, c6021p, false);
            if (objM530s3 == obj) {
                objM530s3 = C5997d.m6430Q(Boolean.FALSE, c5975s);
                c6021p.m6537c0(objM530s3);
            }
            interfaceC5985X3 = (InterfaceC5985X) objM530s3;
            c6021p.m6553p(false);
            interfaceC7678dM10508c = AbstractC9856b0.m10508c("android.permission.CAMERA", null, c6021p, 6, 2);
            C6427b c6427b5 = new C6427b(9);
            c6021p.m6524S(-922060741);
            objM6514H4 = c6021p.m6514H();
            if (objM6514H4 == obj) {
                objM6514H4 = new C4702c(interfaceC5985X2, interfaceC5985X, 2);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            c14893gM9235b = AbstractC8571V2.m9235b(c6427b5, (InterfaceC1436k) objM6514H4, c6021p, 48);
            C16653d c16653d3 = new C16653d(4);
            c6021p.m6524S(-922050723);
            objM6514H5 = c6021p.m6514H();
            if (objM6514H5 == obj) {
                objM6514H5 = new C6194i(interfaceC5985X, 21);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            c14893gM9235b2 = AbstractC8571V2.m9235b(c16653d3, (InterfaceC1436k) objM6514H5, c6021p, 48);
            C6427b c6427b6 = new C6427b(3);
            c6021p.m6524S(-922044643);
            objM6514H6 = c6021p.m6514H();
            if (objM6514H6 == obj) {
                objM6514H6 = new C6194i(interfaceC5985X, 20);
                c6021p.m6537c0(objM6514H6);
            }
            c6021p.m6553p(false);
            c14893gM9235b3 = AbstractC8571V2.m9235b(c6427b6, (InterfaceC1436k) objM6514H6, c6021p, 48);
            c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c6021p.m6524S(617413469);
            it = ((Iterable) c6021p.m6548k(c5984w2)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                it2 = it;
                if (next instanceof C1996m) {
                    break;
                    break;
                }
                it = it2;
            }
            if (next != null) {
                objM19235b = (C1996m) next;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(C1996m.class);
                c6021p.m6553p(false);
            }
            c1996m = (C1996m) objM19235b;
            if (c1996m != null) {
                c18418a = c1996m.f5936a;
            } else {
                c18418a = null;
            }
            c6021p.m6524S(-922034753);
            zM6542f4 = c6021p.m6542f(interfaceC7678dM10508c) | c6021p.m6545h(c14893gM9235b) | c6021p.m6545h(c8870f) | c6021p.m6545h(c14893gM9235b2) | c6021p.m6545h(c14893gM9235b3) | c6021p.m6542f(interfaceC0300w1);
            c18418a2 = c18418a;
            objM6514H7 = c6021p.m6514H();
            if (zM6542f4) {
                objM6514H7 = new InputPanelKt$InputPanel$inputViewModel$1$1(interfaceC7678dM10508c, c14893gM9235b, c8870f, c14893gM9235b2, c14893gM9235b3, interfaceC0300w1, interfaceC5985X3);
                c6021p.m6537c0(objM6514H7);
            } else {
                objM6514H7 = new InputPanelKt$InputPanel$inputViewModel$1$1(interfaceC7678dM10508c, c14893gM9235b, c8870f, c14893gM9235b2, c14893gM9235b3, interfaceC0300w1, interfaceC5985X3);
                c6021p.m6537c0(objM6514H7);
            }
            interfaceC1436k = (InterfaceC1436k) objM6514H7;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            context3 = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            zBooleanValue3 = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            list3 = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue3) {
                interfaceC2062k3 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19866Q.class));
                z6 = false;
            } else {
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                z6 = false;
                interfaceC2062k3 = null;
            }
            c6021p.m6553p(z6);
            LocalViewModelStoreOwner.f33491a.getClass();
            viewModelStoreOwnerM12165a3 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a3 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            c16527d2 = AbstractC16526C.f51263a;
            InterfaceC3756d interfaceC3756dMo5693b17 = c16527d2.mo5693b(InputViewModel.class);
            c13522n3 = c13522n2;
            InterfaceC3756d interfaceC3756dMo5693b18 = c16527d2.mo5693b(C19866Q.class);
            c6021p.m6524S(-1395498839);
            zM6542f5 = c6021p.m6542f(interfaceC3756dMo5693b17) | c6021p.m6542f(interfaceC3756dMo5693b18) | c6021p.m6542f(list3) | c6021p.m6544g(zBooleanValue3) | c6021p.m6542f(interfaceC2062k3);
            objM6514H8 = c6021p.m6514H();
            if (zM6542f5) {
                if (zBooleanValue3) {
                    ViewModelFactoryProviderKt.m14399b(c16527d2.mo5693b(C19866Q.class), c16527d2.mo5693b(InputViewModel.class), context3, interfaceC2062k3);
                    throw null;
                }
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                objM6514H8 = ViewModelFactoryProviderKt.m14398a(c16527d2.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                c6021p.m6537c0(objM6514H8);
            } else {
                if (zBooleanValue3) {
                    ViewModelFactoryProviderKt.m14399b(c16527d2.mo5693b(C19866Q.class), c16527d2.mo5693b(InputViewModel.class), context3, interfaceC2062k3);
                    throw null;
                }
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                objM6514H8 = ViewModelFactoryProviderKt.m14398a(c16527d2.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                c6021p.m6537c0(objM6514H8);
            }
            baseViewModel = (BaseViewModel) objM6514H8;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            zM6545h = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            objM6514H9 = c6021p.m6514H();
            if (zM6545h) {
                objM6514H9 = new InputPanelKt$InputPanel$$inlined$injectViewModel$1(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H9);
            } else {
                objM6514H9 = new InputPanelKt$InputPanel$$inlined$injectViewModel$1(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H9);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H9, c6021p, baseViewModel);
            c6021p.m6553p(false);
            inputViewModel = (InputViewModel) baseViewModel;
            c19866q = (C19866Q) AbstractC9112C3.m9642d(inputViewModel.f40343c, c6021p).getValue();
            interfaceC5985X2.setValue(c19866q.f62973d);
            c6021p.m6524S(-921987004);
            zM6545h2 = c6021p.m6545h(inputViewModel);
            objM6514H10 = c6021p.m6514H();
            if (zM6545h2) {
                objM6514H10 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 1);
                c6021p.m6537c0(objM6514H10);
            } else {
                objM6514H10 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 1);
                c6021p.m6537c0(objM6514H10);
            }
            interfaceC3759g2 = (InterfaceC3759g) objM6514H10;
            c6021p.m6553p(false);
            interfaceC5985X.setValue(interfaceC3759g2);
            boolean z19 = c14111x0.f44438z.f44212e;
            boolean z110 = !z19;
            c6021p.m6524S(-921981491);
            objM6514H11 = c6021p.m6514H();
            if (objM6514H11 == obj) {
                objM6514H11 = C5997d.m6430Q(Boolean.valueOf(!c19866q.m20785h()), c5975s);
                c6021p.m6537c0(objM6514H11);
            }
            interfaceC5985X4 = (InterfaceC5985X) objM6514H11;
            c6021p.m6553p(false);
            if (c19866q.m20784g()) {
                if (c19866q.f62977h != EnumC21517f.f68139o0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (c19866q.f62977h != EnumC21517f.f68139o0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c6021p.m6524S(-921967986);
            objM6514H12 = c6021p.m6514H();
            if (objM6514H12 == obj) {
                objM6514H12 = AbstractC0168G.m536y(c6021p);
            }
            interfaceC17406l = (InterfaceC17406l) objM6514H12;
            c6021p.m6553p(false);
            zBooleanValue4 = ((Boolean) interfaceC5985X4.getValue()).booleanValue();
            C6045C c6045c3 = c19866q.f62970a;
            if (zBooleanValue4) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (z11) {
                c6021p.m6524S(-921959943);
                jM15774b = C14365u.m15774b(0.5f, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12190D);
                c6021p.m6553p(false);
                z12 = false;
            } else {
                if (z11) {
                    c6021p.m6524S(-922298169);
                    c6021p.m6553p(false);
                    throw new C0644w();
                }
                c6021p.m6524S(-921957385);
                jM15774b = C14365u.m15774b(0.0f, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12190D);
                z12 = false;
                c6021p.m6553p(false);
            }
            interfaceC5982V0M14999a = AbstractC13474L.m14999a(jM15774b, AbstractC13758e.m15254s(0.0f, 0.0f, null, 7), "Input Panel Scrim", c6021p, 432, 8);
            if (((Boolean) AbstractC9183O2.m9739b(interfaceC17406l, c6021p).getValue()).booleanValue()) {
                interfaceC5985X4.setValue(Boolean.FALSE);
            }
            Integer numValueOf3 = Integer.valueOf(c19866q.f62975f.size());
            c6021p.m6524S(-921949248);
            zM6542f6 = c6021p.m6542f(c19866q);
            objM6514H13 = c6021p.m6514H();
            if (zM6542f6) {
                objM6514H13 = new C16858O(c19866q, interfaceC5985X4, null);
                c6021p.m6537c0(objM6514H13);
            } else {
                objM6514H13 = new C16858O(c19866q, interfaceC5985X4, null);
                c6021p.m6537c0(objM6514H13);
            }
            c6021p.m6553p(false);
            C5997d.m6451g(c6045c3, numValueOf3, (InterfaceC1439n) objM6514H13, c6021p);
            c6021p.m6524S(-921945071);
            if (c19866q.f62988s) {
                C17296C c17296c3 = C17296C.f55119a;
                c6021p.m6524S(-921943124);
                if ((i13 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM6542f11 = z14 | c6021p.m6542f(interfaceC0300w2) | c6021p.m6545h(inputViewModel);
                objM6514H24 = c6021p.m6514H();
                if (zM6542f11) {
                    c13522n4 = c13522n3;
                    objM6514H24 = new C16859P(c13522n4, interfaceC0300w1, inputViewModel, null);
                    c6021p.m6537c0(objM6514H24);
                } else {
                    c13522n4 = c13522n3;
                    objM6514H24 = new C16859P(c13522n4, interfaceC0300w1, inputViewModel, null);
                    c6021p.m6537c0(objM6514H24);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H24, c6021p, c17296c3);
            } else {
                c13522n4 = c13522n3;
                interfaceC0300w2 = interfaceC0300w1;
            }
            c6021p.m6553p(false);
            c21999e0 = c19866q.f62989t;
            if (c21999e0 != null) {
                C21995d0 c21995d2 = C21999e0.Companion;
                EnumC21964U enumC21964U3 = EnumC21964U.FileUpload;
                c21995d2.getClass();
                c21958sM22341a = C21995d0.m22341a(c21999e0, enumC21964U3);
            } else {
                c21958sM22341a = null;
            }
            c6021p.m6524S(-921934800);
            if (c19866q.f62990u) {
                c13522n5 = c13522n4;
                interfaceC3759g3 = interfaceC3759g;
                r10 = 0;
            } else {
                c13522n5 = c13522n4;
                interfaceC3759g3 = interfaceC3759g;
                r10 = 0;
            }
            c6021p.m6553p(r10);
            c6021p.m6524S(-921917199);
            if (((Boolean) interfaceC5985X3.getValue()).booleanValue()) {
                c6021p.m6524S(-921913524);
                objM6514H23 = c6021p.m6514H();
                obj3 = obj;
                if (objM6514H23 == obj3) {
                    objM6514H23 = new C14103t0(interfaceC5985X3, 8);
                    c6021p.m6537c0(objM6514H23);
                }
                c6021p.m6553p(r10);
                AbstractC9830X.m10473b(interfaceC7678dM10508c, R.string.conversation_camera_permission_request_rationale, (InterfaceC1426a) objM6514H23, c6021p, 384);
            } else {
                obj3 = r5;
            }
            c6021p.m6553p(r10);
            C17756f c17756f3 = AbstractC17770m.f56726c;
            C10449g c10449g3 = C10444b.f30946y0;
            C17790w c17790wM19515a7 = AbstractC17788v.m19515a(c17756f3, c10449g3, c6021p, r10);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m11 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d11 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a7);
            C21694h c21694h16 = C21698j.f68872e;
            C5997d.m6439Z(c21694h16, c6021p, interfaceC6008i0M6550m11);
            c21694h2 = C21698j.f68874g;
            if (c6021p.f19563O) {
                c21694h3 = c21694h;
                if (!AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                }
                C21694h c21694h17 = C21698j.f68871d;
                C5997d.m6439Z(c21694h17, c6021p, interfaceC10459qM10923d11);
                InterfaceC1436k interfaceC1436k18 = (InterfaceC1436k) interfaceC3759g2;
                C21694h c21694h18 = c21694h3;
                AbstractC16854K.m18576b(c19866q, interfaceC1436k18, null, c6021p, 0, 4);
                if (c21999e0 != null) {
                    c21987b0 = c21999e0.f69629b;
                } else {
                    c21987b0 = null;
                }
                if (c19866q.f62991v) {
                    interfaceC3759g4 = interfaceC3759g3;
                    if (c19866q.f62992w) {
                        c6021p.m6524S(-637944548);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-637944548);
                        c6021p.m6553p(false);
                    }
                } else {
                    interfaceC3759g4 = interfaceC3759g3;
                    if (c19866q.f62992w) {
                        c6021p.m6524S(-637944548);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-637944548);
                        c6021p.m6553p(false);
                    }
                }
                f10 = AbstractC7313q.f23199d;
                InterfaceC10459q interfaceC10459qM11237o9 = AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, f10, 0.0f, 11);
                if (c19866q.f62976g.isEmpty()) {
                    f11 = f10;
                } else {
                    f11 = AbstractC7313q.f23198c;
                }
                InterfaceC10459q interfaceC10459qM11237o10 = AbstractC10842a.m11237o(interfaceC10459qM11237o9, 0.0f, f11, 0.0f, f10, 5);
                C17781r0 c17781r0M19506b5 = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23198c), C10444b.f30945x0, c6021p, 48);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m12 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d12 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o10);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h18, c6021p, c17781r0M19506b5);
                C5997d.m6439Z(c21694h16, c6021p, interfaceC6008i0M6550m12);
                if (c6021p.f19563O) {
                    c21694h4 = c21694h2;
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h4);
                } else {
                    c21694h4 = c21694h2;
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h4);
                }
                C5997d.m6439Z(c21694h17, c6021p, interfaceC10459qM10923d12);
                C17785t0 c17785t4 = C17785t0.f56761a;
                c6021p.m6524S(-1357428602);
                objM6514H14 = c6021p.m6514H();
                if (objM6514H14 == obj3) {
                    objM6514H14 = C5997d.m6429P(1);
                    c6021p.m6537c0(objM6514H14);
                }
                c5996c0 = (C5996c0) objM6514H14;
                c6021p.m6553p(false);
                interfaceC10277bM19906b = AbstractC18539i.m19906b(c6021p);
                c6021p.m6524S(-1357424814);
                zM6545h3 = c6021p.m6545h(interfaceC10277bM19906b) | c6021p.m6542f(interfaceC0300w2) | c6021p.m6542f(interfaceC3759g4);
                objM6514H15 = c6021p.m6514H();
                if (zM6545h3) {
                    i16 = 1;
                    objM6514H15 = new C16905s(interfaceC10277bM19906b, interfaceC0300w2, interfaceC3759g4, 1);
                    c6021p.m6537c0(objM6514H15);
                } else {
                    i16 = 1;
                    objM6514H15 = new C16905s(interfaceC10277bM19906b, interfaceC0300w2, interfaceC3759g4, 1);
                    c6021p.m6537c0(objM6514H15);
                }
                interfaceC1426a = (InterfaceC1426a) objM6514H15;
                c6021p.m6553p(false);
                C13783q0 c13783q4 = AbstractC13508z.f42768a;
                Object obj12 = AbstractC13795w0.f43580a;
                c21694h5 = c21694h4;
                obj4 = obj3;
                interfaceC3759g5 = interfaceC3759g4;
                AbstractC10831a.m11200c(c17785t4, z10, null, AbstractC13508z.m15021m(new C0537v(21, C13485c.f42675G0), AbstractC13758e.m15254s(0.0f, 400.0f, new C7543h(AbstractC9101A4.m9631a(i16, i16)), i16)).m14995a(AbstractC13508z.m15009a(null, null, 15)), AbstractC13508z.m15023o(new C0537v(23, C13485c.f42677I0), AbstractC13758e.m15254s(0.0f, 400.0f, new C7543h(AbstractC9101A4.m9631a(1, 1)), 1)).m14996a(AbstractC13508z.m15017i(null, null, 15)), null, AbstractC8411c.m8969c(402487492, c6021p, new C8777V(c19866q, z110, interfaceC3759g2, c18418a2, c8870f, interfaceC5985X4)), c6021p, 1600518, 18);
                AbstractC10831a.m11200c(c17785t4, !z10, null, AbstractC13508z.m15009a(null, null, 15), AbstractC13508z.m15017i(null, null, 15), null, AbstractC16877e.f54167a, c6021p, 1600518, 18);
                float f16 = AbstractC7306j.f23145c;
                InterfaceC10459q interfaceC10459qM8501a5 = AbstractC8079e5.m8501a(AbstractC9262b4.m9836a(c17785t4.m19513a(c10456n, 1.0f, true), z19), AbstractC20417e.m21079a(AbstractC7314r.f23209b));
                c6021p.m6524S(-1357334599);
                zM6542f7 = c6021p.m6542f(interfaceC5982V0M14999a);
                objM6514H16 = c6021p.m6514H();
                if (zM6542f7) {
                    i17 = 2;
                    objM6514H16 = new C17122m(interfaceC5982V0M14999a, 2);
                    c6021p.m6537c0(objM6514H16);
                } else {
                    i17 = 2;
                    objM6514H16 = new C17122m(interfaceC5982V0M14999a, 2);
                    c6021p.m6537c0(objM6514H16);
                }
                c6021p.m6553p(false);
                i18 = i17;
                C13522n c13522n12 = c13522n5;
                AbstractC4034c4.m4725a(AbstractC10861a.m11297c(interfaceC10459qM8501a5, (InterfaceC1436k) objM6514H16), null, 0L, 0L, f16, 0.0f, null, AbstractC8411c.m8969c(-1726524127, c6021p, new C16861S(c19866q, interfaceC3759g2, z10, c13522n5, interfaceC1426a, z110, interfaceC17406l, c5996c0, c14111x0, interfaceC3759g5)), c6021p, 12582912, 110);
                C17790w c17790wM19515a8 = AbstractC17788v.m19515a(c17756f3, c10449g3, c6021p, 0);
                i19 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m13 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d13 = AbstractC10443a.m10923d(c6021p, c10456n);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h18, c6021p, c17790wM19515a8);
                C5997d.m6439Z(c21694h16, c6021p, interfaceC6008i0M6550m13);
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i19, c6021p, i19, c21694h5);
                } else {
                    AbstractC0168G.m537z(i19, c6021p, i19, c21694h5);
                }
                C5997d.m6439Z(c21694h17, c6021p, interfaceC10459qM10923d13);
                c6021p.m6524S(251950728);
                if (c5996c0.m6412g() >= 3) {
                    c6021p.m6524S(251954021);
                    interfaceC3759g6 = interfaceC3759g5;
                    zM6542f10 = c6021p.m6542f(interfaceC3759g6);
                    objM6514H22 = c6021p.m6514H();
                    obj5 = obj4;
                    if (zM6542f10) {
                        objM6514H22 = new C8846h(interfaceC3759g6, 28);
                        c6021p.m6537c0(objM6514H22);
                    } else {
                        objM6514H22 = new C8846h(interfaceC3759g6, 28);
                        c6021p.m6537c0(objM6514H22);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H22, null, false, null, null, AbstractC16877e.f54168b, c6021p, 196608, 30);
                } else {
                    obj5 = obj4;
                    interfaceC3759g6 = interfaceC3759g5;
                }
                c6021p.m6553p(false);
                InterfaceC1436k interfaceC1436k19 = (InterfaceC1436k) interfaceC3759g6;
                c6021p.m6524S(251973544);
                zM6545h4 = c6021p.m6545h(c18418a2) | c6021p.m6545h(c8870f) | c6021p.m6542f(interfaceC3759g6);
                objM6514H17 = c6021p.m6514H();
                if (zM6545h4) {
                    objM6514H17 = new C16899p(c18418a2, c8870f, interfaceC3759g6, i18);
                    c6021p.m6537c0(objM6514H17);
                } else {
                    objM6514H17 = new C16899p(c18418a2, c8870f, interfaceC3759g6, i18);
                    c6021p.m6537c0(objM6514H17);
                }
                InterfaceC1426a interfaceC1426a11 = (InterfaceC1426a) objM6514H17;
                c6021p.m6553p(false);
                c6021p.m6524S(251990535);
                zM6545h5 = c6021p.m6545h(messagesViewModel) | c6021p.m6542f(c14111x0);
                objM6514H18 = c6021p.m6514H();
                if (zM6545h5) {
                    objM6514H18 = new C16901q(messagesViewModel, c14111x0, 1);
                    c6021p.m6537c0(objM6514H18);
                } else {
                    objM6514H18 = new C16901q(messagesViewModel, c14111x0, 1);
                    c6021p.m6537c0(objM6514H18);
                }
                InterfaceC1426a interfaceC1426a12 = (InterfaceC1426a) objM6514H18;
                c6021p.m6553p(false);
                c6021p.m6524S(251982029);
                zM6545h6 = c6021p.m6545h(c18418a2) | c6021p.m6545h(c8870f) | c6021p.m6542f(interfaceC3759g6);
                objM6514H19 = c6021p.m6514H();
                if (zM6545h6) {
                    objM6514H19 = new C16899p(c18418a2, c8870f, interfaceC3759g6, 3);
                    c6021p.m6537c0(objM6514H19);
                } else {
                    objM6514H19 = new C16899p(c18418a2, c8870f, interfaceC3759g6, 3);
                    c6021p.m6537c0(objM6514H19);
                }
                c6021p.m6553p(false);
                obj6 = obj5;
                interfaceC3759g7 = interfaceC3759g6;
                AbstractC16868Z.m18578a(c14111x0, interfaceC1426a, interfaceC1436k19, interfaceC1426a11, interfaceC1426a12, (InterfaceC1426a) objM6514H19, null, null, null, c6021p, 0, 448);
                c6021p.m6553p(true);
                c6021p.m6524S(-1357129976);
                if (c14111x0.f44422n) {
                    c6021p.m6524S(-1357125453);
                    zM6542f8 = c6021p.m6542f(interfaceC3759g2);
                    objM6514H20 = c6021p.m6514H();
                    if (zM6542f8) {
                        obj7 = obj6;
                        if (objM6514H20 == obj7) {
                        }
                        InterfaceC1436k interfaceC1436k110 = (InterfaceC1436k) objM6514H20;
                        c6021p.m6553p(false);
                        if (c14111x0.f44421m0 == EnumC14057V0.f44189o0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        c6021p.m6524S(-1357118105);
                        zM6542f9 = c6021p.m6542f(interfaceC3759g7);
                        objM6514H21 = c6021p.m6514H();
                        if (zM6542f9) {
                            objM6514H21 = new C16862T(interfaceC3759g7, 1);
                            c6021p.m6537c0(objM6514H21);
                        } else {
                            objM6514H21 = new C16862T(interfaceC3759g7, 1);
                            c6021p.m6537c0(objM6514H21);
                        }
                        c6021p.m6553p(false);
                        AbstractC8747y4.m9498a(c19866q.f62970a, interfaceC1436k110, z13, interfaceC1426a, (InterfaceC1426a) objM6514H21, c6021p, 0);
                    } else {
                        obj7 = obj6;
                    }
                    objM6514H20 = new C14107v0(interfaceC3759g2, 10);
                    c6021p.m6537c0(objM6514H20);
                    InterfaceC1436k interfaceC1436k111 = (InterfaceC1436k) objM6514H20;
                    c6021p.m6553p(false);
                    if (c14111x0.f44421m0 == EnumC14057V0.f44189o0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c6021p.m6524S(-1357118105);
                    zM6542f9 = c6021p.m6542f(interfaceC3759g7);
                    objM6514H21 = c6021p.m6514H();
                    if (zM6542f9) {
                        objM6514H21 = new C16862T(interfaceC3759g7, 1);
                        c6021p.m6537c0(objM6514H21);
                    } else {
                        objM6514H21 = new C16862T(interfaceC3759g7, 1);
                        c6021p.m6537c0(objM6514H21);
                    }
                    c6021p.m6553p(false);
                    AbstractC8747y4.m9498a(c19866q.f62970a, interfaceC1436k111, z13, interfaceC1426a, (InterfaceC1426a) objM6514H21, c6021p, 0);
                }
                AbstractC3794B0.m4471F(c6021p, false, true, true);
                c13522n6 = c13522n12;
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c21694h3 = c21694h;
            }
            AbstractC0168G.m537z(i14, c6021p, i14, c21694h2);
            C21694h c21694h19 = C21698j.f68871d;
            C5997d.m6439Z(c21694h19, c6021p, interfaceC10459qM10923d11);
            InterfaceC1436k interfaceC1436k112 = (InterfaceC1436k) interfaceC3759g2;
            C21694h c21694h110 = c21694h3;
            AbstractC16854K.m18576b(c19866q, interfaceC1436k112, null, c6021p, 0, 4);
            if (c21999e0 != null) {
                c21987b0 = c21999e0.f69629b;
            } else {
                c21987b0 = null;
            }
            if (c19866q.f62991v) {
                interfaceC3759g4 = interfaceC3759g3;
                if (c19866q.f62992w) {
                    c6021p.m6524S(-637944548);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-637944548);
                    c6021p.m6553p(false);
                }
            } else {
                interfaceC3759g4 = interfaceC3759g3;
                if (c19866q.f62992w) {
                    c6021p.m6524S(-637944548);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-637944548);
                    c6021p.m6553p(false);
                }
            }
            f10 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459qM11237o11 = AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, f10, 0.0f, 11);
            if (c19866q.f62976g.isEmpty()) {
                f11 = f10;
            } else {
                f11 = AbstractC7313q.f23198c;
            }
            InterfaceC10459q interfaceC10459qM11237o12 = AbstractC10842a.m11237o(interfaceC10459qM11237o11, 0.0f, f11, 0.0f, f10, 5);
            C17781r0 c17781r0M19506b6 = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23198c), C10444b.f30945x0, c6021p, 48);
            i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m14 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d14 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o12);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h110, c6021p, c17781r0M19506b6);
            C5997d.m6439Z(c21694h16, c6021p, interfaceC6008i0M6550m14);
            if (c6021p.f19563O) {
                c21694h4 = c21694h2;
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h4);
            } else {
                c21694h4 = c21694h2;
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h4);
            }
            C5997d.m6439Z(c21694h19, c6021p, interfaceC10459qM10923d14);
            C17785t0 c17785t5 = C17785t0.f56761a;
            c6021p.m6524S(-1357428602);
            objM6514H14 = c6021p.m6514H();
            if (objM6514H14 == obj3) {
                objM6514H14 = C5997d.m6429P(1);
                c6021p.m6537c0(objM6514H14);
            }
            c5996c0 = (C5996c0) objM6514H14;
            c6021p.m6553p(false);
            interfaceC10277bM19906b = AbstractC18539i.m19906b(c6021p);
            c6021p.m6524S(-1357424814);
            zM6545h3 = c6021p.m6545h(interfaceC10277bM19906b) | c6021p.m6542f(interfaceC0300w2) | c6021p.m6542f(interfaceC3759g4);
            objM6514H15 = c6021p.m6514H();
            if (zM6545h3) {
                i16 = 1;
                objM6514H15 = new C16905s(interfaceC10277bM19906b, interfaceC0300w2, interfaceC3759g4, 1);
                c6021p.m6537c0(objM6514H15);
            } else {
                i16 = 1;
                objM6514H15 = new C16905s(interfaceC10277bM19906b, interfaceC0300w2, interfaceC3759g4, 1);
                c6021p.m6537c0(objM6514H15);
            }
            interfaceC1426a = (InterfaceC1426a) objM6514H15;
            c6021p.m6553p(false);
            C13783q0 c13783q5 = AbstractC13508z.f42768a;
            Object obj13 = AbstractC13795w0.f43580a;
            c21694h5 = c21694h4;
            obj4 = obj3;
            interfaceC3759g5 = interfaceC3759g4;
            AbstractC10831a.m11200c(c17785t5, z10, null, AbstractC13508z.m15021m(new C0537v(21, C13485c.f42675G0), AbstractC13758e.m15254s(0.0f, 400.0f, new C7543h(AbstractC9101A4.m9631a(i16, i16)), i16)).m14995a(AbstractC13508z.m15009a(null, null, 15)), AbstractC13508z.m15023o(new C0537v(23, C13485c.f42677I0), AbstractC13758e.m15254s(0.0f, 400.0f, new C7543h(AbstractC9101A4.m9631a(1, 1)), 1)).m14996a(AbstractC13508z.m15017i(null, null, 15)), null, AbstractC8411c.m8969c(402487492, c6021p, new C8777V(c19866q, z110, interfaceC3759g2, c18418a2, c8870f, interfaceC5985X4)), c6021p, 1600518, 18);
            AbstractC10831a.m11200c(c17785t5, !z10, null, AbstractC13508z.m15009a(null, null, 15), AbstractC13508z.m15017i(null, null, 15), null, AbstractC16877e.f54167a, c6021p, 1600518, 18);
            float f17 = AbstractC7306j.f23145c;
            InterfaceC10459q interfaceC10459qM8501a6 = AbstractC8079e5.m8501a(AbstractC9262b4.m9836a(c17785t5.m19513a(c10456n, 1.0f, true), z19), AbstractC20417e.m21079a(AbstractC7314r.f23209b));
            c6021p.m6524S(-1357334599);
            zM6542f7 = c6021p.m6542f(interfaceC5982V0M14999a);
            objM6514H16 = c6021p.m6514H();
            if (zM6542f7) {
                i17 = 2;
                objM6514H16 = new C17122m(interfaceC5982V0M14999a, 2);
                c6021p.m6537c0(objM6514H16);
            } else {
                i17 = 2;
                objM6514H16 = new C17122m(interfaceC5982V0M14999a, 2);
                c6021p.m6537c0(objM6514H16);
            }
            c6021p.m6553p(false);
            i18 = i17;
            C13522n c13522n13 = c13522n5;
            AbstractC4034c4.m4725a(AbstractC10861a.m11297c(interfaceC10459qM8501a6, (InterfaceC1436k) objM6514H16), null, 0L, 0L, f17, 0.0f, null, AbstractC8411c.m8969c(-1726524127, c6021p, new C16861S(c19866q, interfaceC3759g2, z10, c13522n5, interfaceC1426a, z110, interfaceC17406l, c5996c0, c14111x0, interfaceC3759g5)), c6021p, 12582912, 110);
            C17790w c17790wM19515a9 = AbstractC17788v.m19515a(c17756f3, c10449g3, c6021p, 0);
            i19 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m15 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d15 = AbstractC10443a.m10923d(c6021p, c10456n);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h110, c6021p, c17790wM19515a9);
            C5997d.m6439Z(c21694h16, c6021p, interfaceC6008i0M6550m15);
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i19, c6021p, i19, c21694h5);
            } else {
                AbstractC0168G.m537z(i19, c6021p, i19, c21694h5);
            }
            C5997d.m6439Z(c21694h19, c6021p, interfaceC10459qM10923d15);
            c6021p.m6524S(251950728);
            if (c5996c0.m6412g() >= 3) {
                c6021p.m6524S(251954021);
                interfaceC3759g6 = interfaceC3759g5;
                zM6542f10 = c6021p.m6542f(interfaceC3759g6);
                objM6514H22 = c6021p.m6514H();
                obj5 = obj4;
                if (zM6542f10) {
                    objM6514H22 = new C8846h(interfaceC3759g6, 28);
                    c6021p.m6537c0(objM6514H22);
                } else {
                    objM6514H22 = new C8846h(interfaceC3759g6, 28);
                    c6021p.m6537c0(objM6514H22);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H22, null, false, null, null, AbstractC16877e.f54168b, c6021p, 196608, 30);
            } else {
                obj5 = obj4;
                interfaceC3759g6 = interfaceC3759g5;
            }
            c6021p.m6553p(false);
            InterfaceC1436k interfaceC1436k113 = (InterfaceC1436k) interfaceC3759g6;
            c6021p.m6524S(251973544);
            zM6545h4 = c6021p.m6545h(c18418a2) | c6021p.m6545h(c8870f) | c6021p.m6542f(interfaceC3759g6);
            objM6514H17 = c6021p.m6514H();
            if (zM6545h4) {
                objM6514H17 = new C16899p(c18418a2, c8870f, interfaceC3759g6, i18);
                c6021p.m6537c0(objM6514H17);
            } else {
                objM6514H17 = new C16899p(c18418a2, c8870f, interfaceC3759g6, i18);
                c6021p.m6537c0(objM6514H17);
            }
            InterfaceC1426a interfaceC1426a13 = (InterfaceC1426a) objM6514H17;
            c6021p.m6553p(false);
            c6021p.m6524S(251990535);
            zM6545h5 = c6021p.m6545h(messagesViewModel) | c6021p.m6542f(c14111x0);
            objM6514H18 = c6021p.m6514H();
            if (zM6545h5) {
                objM6514H18 = new C16901q(messagesViewModel, c14111x0, 1);
                c6021p.m6537c0(objM6514H18);
            } else {
                objM6514H18 = new C16901q(messagesViewModel, c14111x0, 1);
                c6021p.m6537c0(objM6514H18);
            }
            InterfaceC1426a interfaceC1426a14 = (InterfaceC1426a) objM6514H18;
            c6021p.m6553p(false);
            c6021p.m6524S(251982029);
            zM6545h6 = c6021p.m6545h(c18418a2) | c6021p.m6545h(c8870f) | c6021p.m6542f(interfaceC3759g6);
            objM6514H19 = c6021p.m6514H();
            if (zM6545h6) {
                objM6514H19 = new C16899p(c18418a2, c8870f, interfaceC3759g6, 3);
                c6021p.m6537c0(objM6514H19);
            } else {
                objM6514H19 = new C16899p(c18418a2, c8870f, interfaceC3759g6, 3);
                c6021p.m6537c0(objM6514H19);
            }
            c6021p.m6553p(false);
            obj6 = obj5;
            interfaceC3759g7 = interfaceC3759g6;
            AbstractC16868Z.m18578a(c14111x0, interfaceC1426a, interfaceC1436k113, interfaceC1426a13, interfaceC1426a14, (InterfaceC1426a) objM6514H19, null, null, null, c6021p, 0, 448);
            c6021p.m6553p(true);
            c6021p.m6524S(-1357129976);
            if (c14111x0.f44422n) {
                c6021p.m6524S(-1357125453);
                zM6542f8 = c6021p.m6542f(interfaceC3759g2);
                objM6514H20 = c6021p.m6514H();
                if (zM6542f8) {
                    obj7 = obj6;
                    if (objM6514H20 == obj7) {
                    }
                    InterfaceC1436k interfaceC1436k114 = (InterfaceC1436k) objM6514H20;
                    c6021p.m6553p(false);
                    if (c14111x0.f44421m0 == EnumC14057V0.f44189o0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c6021p.m6524S(-1357118105);
                    zM6542f9 = c6021p.m6542f(interfaceC3759g7);
                    objM6514H21 = c6021p.m6514H();
                    if (zM6542f9) {
                        objM6514H21 = new C16862T(interfaceC3759g7, 1);
                        c6021p.m6537c0(objM6514H21);
                    } else {
                        objM6514H21 = new C16862T(interfaceC3759g7, 1);
                        c6021p.m6537c0(objM6514H21);
                    }
                    c6021p.m6553p(false);
                    AbstractC8747y4.m9498a(c19866q.f62970a, interfaceC1436k114, z13, interfaceC1426a, (InterfaceC1426a) objM6514H21, c6021p, 0);
                } else {
                    obj7 = obj6;
                }
                objM6514H20 = new C14107v0(interfaceC3759g2, 10);
                c6021p.m6537c0(objM6514H20);
                InterfaceC1436k interfaceC1436k115 = (InterfaceC1436k) objM6514H20;
                c6021p.m6553p(false);
                if (c14111x0.f44421m0 == EnumC14057V0.f44189o0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                c6021p.m6524S(-1357118105);
                zM6542f9 = c6021p.m6542f(interfaceC3759g7);
                objM6514H21 = c6021p.m6514H();
                if (zM6542f9) {
                    objM6514H21 = new C16862T(interfaceC3759g7, 1);
                    c6021p.m6537c0(objM6514H21);
                } else {
                    objM6514H21 = new C16862T(interfaceC3759g7, 1);
                    c6021p.m6537c0(objM6514H21);
                }
                c6021p.m6553p(false);
                AbstractC8747y4.m9498a(c19866q.f62970a, interfaceC1436k115, z13, interfaceC1426a, (InterfaceC1426a) objM6514H21, c6021p, 0);
            }
            AbstractC3794B0.m4471F(c6021p, false, true, true);
            c13522n6 = c13522n13;
            interfaceC10459q4 = interfaceC10459q3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C16907t(interfaceC10459q4, c13522n6, i10, i11, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m14267d(C19866Q c19866q, int i10, InterfaceC1436k interfaceC1436k, InterfaceC1439n interfaceC1439n, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-756694554);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6542f(c19866q) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6538d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c6021p.m6545h(interfaceC1439n) ? 2048 : 1024;
        }
        int i13 = i12 | 24576;
        if ((i13 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C20263a0 c20263a0 = c19866q.f62980k;
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(c10456n, c20263a0 == null ? AbstractC7313q.f23201f : AbstractC7313q.f23199d, 0.0f, 0.0f, 0.0f, 14);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p, 48);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            C17785t0 c17785t0 = C17785t0.f56761a;
            c6021p.m6524S(-75581998);
            if (c20263a0 != null) {
                String strM8677e = AbstractC8142m4.m8677e(R.string.conversations_input_gizmo_long_press, new Object[]{c20263a0.f64086c.f64081a}, c6021p);
                InterfaceC10459q interfaceC10459qM8501a = AbstractC8079e5.m8501a(c10456n, AbstractC20417e.f64539a);
                c6021p.m6524S(-75571416);
                int i15 = i13 & 896;
                boolean zM6542f = (i15 == 256) | c6021p.m6542f(strM8677e);
                Object objM6514H = c6021p.m6514H();
                Object obj = C6013l.f19514a;
                if (zM6542f || objM6514H == obj) {
                    objM6514H = new C6186a(3, strM8677e, interfaceC1436k);
                    c6021p.m6537c0(objM6514H);
                }
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(-75568354);
                boolean z6 = i15 == 256;
                Object objM6514H2 = c6021p.m6514H();
                if (z6 || objM6514H2 == obj) {
                    objM6514H2 = new C10312h(27, interfaceC1436k);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC9815U2.m10445d(c20263a0, AbstractC10844c.m11252l(AbstractC10833a.m11211f(interfaceC10459qM8501a, interfaceC1426a2, (InterfaceC1426a) objM6514H2), AbstractC7312p.f23187d), c6021p, 8);
                AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11252l(c10456n, AbstractC7313q.f23199d));
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM19513a = c17785t0.m19513a(AbstractC10842a.m11237o(c10456n, 0.0f, (c20263a0 == null || i10 > 1) ? AbstractC7313q.f23199d : 0, 0.0f, 0.0f, 13), 1.0f, true);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i16 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19513a);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            C5997d.m6440a(AbstractC4124r4.f13310a.mo6405a(((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12154j), AbstractC8411c.m8969c(717220604, c6021p, new C16909u(c19866q, interfaceC1439n, 0)), c6021p, 56);
            c6021p.m6553p(true);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1275q(c19866q, i10, interfaceC1436k, interfaceC1439n, interfaceC10459q2, i11);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m14268e(C19866Q c19866q, C14111x0 c14111x0, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC1439n interfaceC1439n, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-604966943);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c19866q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c14111x0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(interfaceC1439n) ? 16384 : 8192;
        }
        int i12 = i11 | 196608;
        if ((74899 & i12) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C20263a0 c20263a0 = c19866q.f62980k;
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(c10456n, c20263a0 == null ? AbstractC7313q.f23201f : AbstractC7313q.f23199d, 0.0f, 0.0f, 0.0f, 14);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p, 48);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            C17785t0 c17785t0 = C17785t0.f56761a;
            c6021p.m6524S(-75731662);
            if (c20263a0 != null) {
                String strM8677e = AbstractC8142m4.m8677e(R.string.conversations_input_gizmo_long_press, new Object[]{c20263a0.f64086c.f64081a}, c6021p);
                InterfaceC10459q interfaceC10459qM8501a = AbstractC8079e5.m8501a(c10456n, AbstractC20417e.f64539a);
                c6021p.m6524S(-75721080);
                int i14 = i12 & 7168;
                boolean zM6542f = (i14 == 2048) | c6021p.m6542f(strM8677e);
                Object objM6514H = c6021p.m6514H();
                Object obj = C6013l.f19514a;
                if (zM6542f || objM6514H == obj) {
                    objM6514H = new C6186a(4, strM8677e, interfaceC1436k2);
                    c6021p.m6537c0(objM6514H);
                }
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(-75718018);
                boolean z6 = i14 == 2048;
                Object objM6514H2 = c6021p.m6514H();
                if (z6 || objM6514H2 == obj) {
                    objM6514H2 = new C10312h(29, interfaceC1436k2);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC9815U2.m10445d(c20263a0, AbstractC10844c.m11252l(AbstractC10833a.m11211f(interfaceC10459qM8501a, interfaceC1426a2, (InterfaceC1426a) objM6514H2), AbstractC7312p.f23187d), c6021p, 8);
                AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11252l(c10456n, AbstractC7313q.f23199d));
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM19513a = c17785t0.m19513a(AbstractC10842a.m11235m(c10456n, 0.0f, AbstractC7313q.f23199d, 1), 1.0f, true);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19513a);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            C5997d.m6440a(AbstractC4124r4.f13310a.mo6405a(((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12154j), AbstractC8411c.m8969c(-1589560329, c6021p, new C16909u(c19866q, interfaceC1439n, 1)), c6021p, 56);
            c6021p.m6553p(true);
            C5997d.m6440a(AbstractC3794B0.m4494s(((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, AbstractC4025b1.f12649a), AbstractC8411c.m8969c(-2048825283, c6021p, new C8805o(c14111x0, interfaceC1436k, false, 19)), c6021p, 56);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2452G(c19866q, c14111x0, interfaceC1436k, interfaceC1436k2, interfaceC1439n, interfaceC10459q2, i10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m14269f(C14111x0 c14111x0, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        C10456n c10456n;
        C6021p c6021p2;
        InterfaceC10459q interfaceC10459q2;
        Object next;
        Object objM19235b;
        c6021p.m6526U(933703899);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6542f(c14111x0) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n2 = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(AbstractC10844c.m11242b(c10456n2, AbstractC7313q.f23201f, 0.0f, 2), 0.0f, 0.0f, AbstractC7313q.f23198c, 0.0f, 11);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            if (c14111x0.m15499m()) {
                c6021p.m6524S(-582426967);
                C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                c6021p.m6524S(617413469);
                Iterator it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof C1996m));
                if (next != null) {
                    objM19235b = (C1996m) next;
                    c6021p.m6553p(false);
                } else {
                    objM19235b = C17632f.f56419a.m19235b(C1996m.class);
                    c6021p.m6553p(false);
                }
                C1996m c1996m = (C1996m) objM19235b;
                C18418a c18418a = c1996m != null ? c1996m.f5936a : null;
                c6021p.m6524S(-295877030);
                boolean zM6545h = ((i12 & 14) == 4) | ((i12 & 112) == 32) | c6021p.m6545h(c18418a) | c6021p.m6545h(c8870f);
                Object objM6514H = c6021p.m6514H();
                if (zM6545h || objM6514H == C6013l.f19514a) {
                    C16856M c16856m = new C16856M(c18418a, c8870f, interfaceC1436k, c14111x0, 0);
                    c6021p.m6537c0(c16856m);
                    objM6514H = c16856m;
                }
                c6021p.m6553p(false);
                c10456n = c10456n2;
                c6021p2 = c6021p;
                AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H, null, false, null, null, AbstractC8411c.m8969c(578846297, c6021p, new C11720k(c14111x0, 2)), c6021p, 196608, 30);
                c6021p2.m6553p(false);
            } else {
                c10456n = c10456n2;
                c6021p2 = c6021p;
                c6021p2.m6524S(-581462030);
                AbstractC17780r.m19507a(AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23188e), c6021p2, 0);
                c6021p2.m6553p(false);
            }
            c6021p2.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C16857N(c14111x0, interfaceC1436k, interfaceC10459q2, i10, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m14270g(C19866Q c19866q, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        int iIntValue;
        String str;
        String strM19533p;
        InterfaceC10459q interfaceC10459q4;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(1882913702);
        if ((i10 & 6) == 0) {
            i12 = i10 | (c6021p.m6542f(c19866q) ? 4 : 2);
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 == 0) {
            if ((i10 & 48) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 32 : 16;
            }
            if ((i12 & 19) == 18 || !c6021p.m6562y()) {
                if (i13 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                C17309l c17309l = c19866q.f62969A;
                iIntValue = ((Number) c17309l.f55136Y).intValue();
                str = (String) c17309l.f55137Z;
                if (str == null) {
                    strM19533p = AbstractC17792x.m19533p(c6021p, -1675486384, iIntValue, c6021p, false);
                } else {
                    c6021p.m6524S(-1675484700);
                    String strM8677e = AbstractC8142m4.m8677e(iIntValue, new Object[]{str}, c6021p);
                    c6021p.m6553p(false);
                    strM19533p = strM8677e;
                }
                AbstractC4124r4.m4768b(strM19533p, interfaceC10459q3, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p, i12 & 112, 3120, 120824);
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c6021p.m6517L();
                interfaceC10459q4 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C5062h(c19866q, interfaceC10459q4, i10, i11, 6);
            }
        }
        i12 |= 48;
        interfaceC10459q2 = interfaceC10459q;
        if ((i12 & 19) == 18) {
            if (i13 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            C17309l c17309l2 = c19866q.f62969A;
            iIntValue = ((Number) c17309l2.f55136Y).intValue();
            str = (String) c17309l2.f55137Z;
            if (str == null) {
                strM19533p = AbstractC17792x.m19533p(c6021p, -1675486384, iIntValue, c6021p, false);
            } else {
                c6021p.m6524S(-1675484700);
                String strM8677e2 = AbstractC8142m4.m8677e(iIntValue, new Object[]{str}, c6021p);
                c6021p.m6553p(false);
                strM19533p = strM8677e2;
            }
            AbstractC4124r4.m4768b(strM19533p, interfaceC10459q3, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p, i12 & 112, 3120, 120824);
            interfaceC10459q4 = interfaceC10459q3;
        } else {
            if (i13 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            C17309l c17309l3 = c19866q.f62969A;
            iIntValue = ((Number) c17309l3.f55136Y).intValue();
            str = (String) c17309l3.f55137Z;
            if (str == null) {
                strM19533p = AbstractC17792x.m19533p(c6021p, -1675486384, iIntValue, c6021p, false);
            } else {
                c6021p.m6524S(-1675484700);
                String strM8677e3 = AbstractC8142m4.m8677e(iIntValue, new Object[]{str}, c6021p);
                c6021p.m6553p(false);
                strM19533p = strM8677e3;
            }
            AbstractC4124r4.m4768b(strM19533p, interfaceC10459q3, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p, i12 & 112, 3120, 120824);
            interfaceC10459q4 = interfaceC10459q3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5062h(c19866q, interfaceC10459q4, i10, i11, 6);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m14271h(boolean z6, boolean z10, InterfaceC10459q interfaceC10459q, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(213216273);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z10) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6545h(c8410b) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            c6021p.m6524S(-616058656);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            C5975S c5975s2 = C5975S.f19448r0;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, c5975s2);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            Object objM530s = AbstractC0168G.m530s(-616056705, c6021p, false);
            if (objM530s == c5975s) {
                objM530s = C5997d.m6430Q(null, c5975s2);
                c6021p.m6537c0(objM530s);
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM530s;
            c6021p.m6553p(false);
            Boolean boolValueOf = Boolean.valueOf(z6);
            c6021p.m6524S(-616053562);
            boolean z11 = (i12 & 14) == 4;
            Object objM6514H2 = c6021p.m6514H();
            if (z11 || objM6514H2 == c5975s) {
                objM6514H2 = new C16864V(z6, interfaceC5985X, interfaceC5985X2, null);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, boolValueOf);
            c6021p.m6524S(-616025336);
            c6021p.m6524S(-616028317);
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == c5975s) {
                objM6514H3 = new C6194i(interfaceC5985X2, 22);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11319e = AbstractC10868a.m11319e(interfaceC10459q, (InterfaceC1436k) objM6514H3);
            Integer num = (Integer) interfaceC5985X2.getValue();
            if (z10 && num != null) {
                int iIntValue = num.intValue();
                c6021p.m6524S(979120708);
                boolean zM6538d = c6021p.m6538d(iIntValue);
                Object objM6514H4 = c6021p.m6514H();
                if (zM6538d || objM6514H4 == c5975s) {
                    objM6514H4 = new C10361c0(iIntValue, 1);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                interfaceC10459qM11319e = AbstractC10868a.m11316b(interfaceC10459qM11319e, (InterfaceC1440o) objM6514H4);
            }
            c6021p.m6553p(false);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11319e);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC17792x.m19538u((i12 >> 9) & 14, c8410b, c6021p, true);
        }
        InterfaceC10459q interfaceC10459q2 = interfaceC10459q;
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3371i0(z6, z10, interfaceC10459q2, c8410b, i10);
        }
    }
}
