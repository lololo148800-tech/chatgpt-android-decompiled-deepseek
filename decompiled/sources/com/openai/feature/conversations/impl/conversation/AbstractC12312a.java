package com.openai.feature.conversations.impl.conversation;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC11112u;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bf.AbstractC11372a0;
import com.openai.chatgpt.R;
import com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModel;
import com.openai.feature.messages.MessagesViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import ge.C14089m0;
import ge.C14093o0;
import ge.C14095p0;
import ge.C14111x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import ni.C17632f;
import p002A0.C0148y;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p021Aj.C0537v;
import p025An.C0644w;
import p040Bd.C0960M0;
import p040Bd.C0995S0;
import p046Bk.C1325F0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p092Dc.C1996m;
import p092Dc.C2001r;
import p098Di.InterfaceC2062k;
import p1042uh.C20263a0;
import p1107xh.EnumC21219I;
import p1128yg.C21539c;
import p1155zi.C21936L0;
import p1155zi.C22011h0;
import p124Ei.AbstractC2511g1;
import p124Ei.C2452G;
import p153Fn.C2925c;
import p225Im.InterfaceC3756d;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4152w2;
import p229J0.C3880A3;
import p229J0.C3949M0;
import p269Kh.C4688o;
import p291Lf.AbstractC5011h;
import p316Mf.AbstractC5340g;
import p339Nf.AbstractC5741w;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.C6037x;
import p349O0.InterfaceC5985X;
import p403Qd.AbstractC6601G;
import p403Qd.AbstractC6659u;
import p403Qd.C6638j;
import p406Qg.C6703N;
import p437Rn.C6959q;
import p478Tc.AbstractC7308l;
import p478Tc.C7299c;
import p479Td.C7351f0;
import p523V9.AbstractC8086f4;
import p523V9.AbstractC8090g0;
import p523V9.AbstractC8098h0;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8167p5;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p544W9.AbstractC8478F4;
import p544W9.AbstractC8646i;
import p544W9.AbstractC8664l;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9230W2;
import p594Y9.AbstractC9721E3;
import p594Y9.AbstractC9973t4;
import p623Zf.C10312h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.C13775m0;
import p853kd.C16368c;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p911o0.AbstractC17792x;
import p914o3.AbstractC17814e;
import p926of.C18160X;
import p926of.C18162Z;
import p938p2.AbstractC18290d;
import p965qf.AbstractC18702d;
import re.AbstractC18947B;
import re.AbstractC18967t;
import re.C18963p;
import re.C18964q;
import re.C18965r;
import re.C18966s;
import sg.C19575q;

/* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12312a {
    /* JADX WARN: Code duplicated, block: B:167:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:168:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:172:0x0305  */
    /* JADX WARN: Code duplicated, block: B:176:0x030b  */
    /* JADX WARN: Code duplicated, block: B:178:0x030e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0311  */
    /* JADX WARN: Code duplicated, block: B:182:0x0325  */
    /* JADX WARN: Code duplicated, block: B:183:0x0327  */
    /* JADX WARN: Code duplicated, block: B:187:0x0330  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r35v0, types: [O0.p] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX INFO: renamed from: a */
    public static final void m14259a(C14111x0 c14111x0, InterfaceC1436k onIntent, C14111x0 c14111x1, C18160X messagesState, InterfaceC1436k onMessagesIntent, C7299c interactionSource, C6021p c6021p, int i10) {
        char c9;
        ?? r12;
        boolean z6;
        int i11;
        List list;
        boolean z10;
        String str;
        String str2;
        C22011h0 c22011h0;
        String str3;
        boolean z11;
        Object obj;
        Object obj2;
        Object obj3;
        AbstractC16544l.m18094g(onIntent, "onIntent");
        AbstractC16544l.m18094g(messagesState, "messagesState");
        AbstractC16544l.m18094g(onMessagesIntent, "onMessagesIntent");
        AbstractC16544l.m18094g(interactionSource, "interactionSource");
        c6021p.m6526U(53154860);
        int i12 = (i10 & 6) == 0 ? (c6021p.m6542f(c14111x0) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(onIntent) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(c14111x1) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6542f(messagesState) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6545h(onMessagesIntent) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c6021p.m6542f(interactionSource) ? 131072 : 65536;
        }
        int i13 = i12;
        if ((i13 & 74899) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            Object objM529r = objM6514H;
            if (objM6514H == c5975s) {
                objM529r = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            C2925c c2925c = ((C6035w) objM529r).f19668Y;
            AbstractC8167p5.m8743c(null, null, c6021p, 0);
            AbstractC8664l.m9360a(null, null, null, c6021p, 0);
            AbstractC5340g.m5882b(null, c6021p, 0);
            c6021p.m6524S(1793705905);
            String str4 = messagesState.f57913d;
            if (str4 != null) {
                c6021p.m6524S(1793708822);
                int i14 = i13 & 57344;
                boolean z12 = i14 == 16384;
                Object objM6514H2 = c6021p.m6514H();
                Object obj4 = objM6514H2;
                if (z12 || objM6514H2 == c5975s) {
                    C10312h c10312h = new C10312h(12, onMessagesIntent);
                    c6021p.m6537c0(c10312h);
                    obj4 = c10312h;
                }
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) obj4;
                c6021p.m6553p(false);
                c6021p.m6524S(1793711127);
                boolean z13 = i14 == 16384;
                Object objM6514H3 = c6021p.m6514H();
                Object obj5 = objM6514H3;
                if (z13 || objM6514H3 == c5975s) {
                    C14089m0 c14089m0 = new C14089m0(0, onMessagesIntent);
                    c6021p.m6537c0(c14089m0);
                    obj5 = c14089m0;
                }
                c6021p.m6553p(false);
                AbstractC8478F4.m9118a(str4, interfaceC1426a, (InterfaceC1436k) obj5, c6021p, 0);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(1793713613);
            if (messagesState.f57916g) {
                c6021p.m6524S(1793716618);
                int i15 = i13 & 57344;
                boolean z14 = i15 == 16384;
                Object objM6514H4 = c6021p.m6514H();
                Object obj6 = objM6514H4;
                if (z14 || objM6514H4 == c5975s) {
                    C10312h c10312h2 = new C10312h(17, onMessagesIntent);
                    c6021p.m6537c0(c10312h2);
                    obj6 = c10312h2;
                }
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) obj6;
                c6021p.m6553p(false);
                c6021p.m6524S(1793719610);
                boolean z15 = i15 == 16384;
                Object objM6514H5 = c6021p.m6514H();
                Object obj7 = objM6514H5;
                if (z15 || objM6514H5 == c5975s) {
                    C10312h c10312h3 = new C10312h(18, onMessagesIntent);
                    c6021p.m6537c0(c10312h3);
                    obj7 = c10312h3;
                }
                c6021p.m6553p(false);
                AbstractC8646i.m9319c(interfaceC1426a2, (InterfaceC1426a) obj7, c6021p, 0);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(1793724889);
            List list2 = C17689w.f56480Y;
            C7351f0 c7351f0 = messagesState.f57917h;
            if (c7351f0 != null) {
                List listM15497k = c14111x0.m15497k();
                List list3 = c7351f0.f23267C;
                if (list3 == null) {
                    list3 = list2;
                }
                ArrayList arrayListM19361k0 = AbstractC17680n.m19361k0(c14111x0.f44429q0, list3);
                c6021p.m6524S(1793736271);
                int i16 = i13 & 57344;
                boolean z16 = i16 == 16384;
                Object objM6514H6 = c6021p.m6514H();
                Object obj8 = objM6514H6;
                if (z16 || objM6514H6 == c5975s) {
                    C10312h c10312h4 = new C10312h(19, onMessagesIntent);
                    c6021p.m6537c0(c10312h4);
                    obj8 = c10312h4;
                }
                InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) obj8;
                c6021p.m6553p(false);
                c6021p.m6524S(1793739566);
                boolean zM6542f = (i16 == 16384) | c6021p.m6542f(c7351f0);
                Object objM6514H7 = c6021p.m6514H();
                if (zM6542f || objM6514H7 == c5975s) {
                    C13775m0 c13775m0 = new C13775m0(onMessagesIntent, 3, c7351f0);
                    c6021p.m6537c0(c13775m0);
                    obj3 = c13775m0;
                } else {
                    obj3 = objM6514H7;
                }
                c6021p.m6553p(false);
                AbstractC8646i.m9317a(c14111x0.f44402d, listM15497k, c7351f0.f23292g, arrayListM19361k0, interfaceC1426a3, (InterfaceC1436k) obj3, c6021p, 0);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(1793745384);
            AbstractC6601G abstractC6601G = messagesState.f57918i;
            if (abstractC6601G != null) {
                c6021p.m6524S(1793748693);
                c9 = 16384;
                boolean z17 = (i13 & 57344) == 16384;
                Object objM6514H8 = c6021p.m6514H();
                Object obj9 = objM6514H8;
                if (z17 || objM6514H8 == c5975s) {
                    C10312h c10312h5 = new C10312h(20, onMessagesIntent);
                    c6021p.m6537c0(c10312h5);
                    obj9 = c10312h5;
                }
                c6021p.m6553p(false);
                C6638j c6638j = AbstractC6601G.Companion;
                AbstractC18702d.m20042a((InterfaceC1426a) obj9, abstractC6601G, null, c6021p, 0);
            } else {
                c9 = 16384;
            }
            c6021p.m6553p(false);
            c6021p.m6524S(1793754059);
            if (c14111x0.f44438z.f44208a) {
                c6021p.m6524S(1793756953);
                int i17 = i13 & 112;
                boolean z18 = i17 == 32;
                Object objM6514H9 = c6021p.m6514H();
                Object obj10 = objM6514H9;
                if (z18 || objM6514H9 == c5975s) {
                    C14089m0 c14089m1 = new C14089m0(1, onIntent);
                    c6021p.m6537c0(c14089m1);
                    obj10 = c14089m1;
                }
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) obj10;
                c6021p.m6553p(false);
                c6021p.m6524S(1793759439);
                boolean z19 = i17 == 32;
                Object objM6514H10 = c6021p.m6514H();
                if (z19 || objM6514H10 == c5975s) {
                    C10312h c10312h6 = new C10312h(21, onIntent);
                    c6021p.m6537c0(c10312h6);
                    obj2 = c10312h6;
                } else {
                    obj2 = objM6514H10;
                }
                c6021p.m6553p(false);
                AbstractC9721E3.m10311a(interfaceC1436k, (InterfaceC1426a) obj2, AbstractC8142m4.m8676d(R.string.voice_unsupported_history_off, c6021p), AbstractC8142m4.m8676d(R.string.conversations_history_enable, c6021p), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12241w, null, false, null, c6021p, 0, 224);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(1793770753);
            if (c14111x0.f44373D) {
                C20263a0 c20263a0 = c14111x0.f44411h0;
                String strM12782a = c20263a0 != null ? AbstractC11372a0.m12782a(c20263a0) : null;
                C21936L0 c21936l0 = strM12782a != null ? new C21936L0(strM12782a) : null;
                if (c20263a0 != null) {
                    z10 = true;
                    if (!c20263a0.f64087d.contains(EnumC21219I.REPORTABLE)) {
                    }
                    if (c21936l0 != null) {
                        str = c21936l0.f69488a;
                    } else {
                        str = null;
                    }
                    str2 = c14111x0.f44381L;
                    if (str2 != null) {
                        c22011h0 = new C22011h0(str2);
                    } else {
                        c22011h0 = null;
                    }
                    if (!c14111x0.f44376G) {
                        c22011h0 = null;
                    }
                    if (c22011h0 != null) {
                        str3 = c22011h0.f69652a;
                    } else {
                        str3 = null;
                    }
                    C19575q c19575q = new C19575q(str, str3, (String) null, 4);
                    c6021p.m6524S(1793783105);
                    if ((i13 & 112) == 32) {
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    Object objM6514H11 = c6021p.m6514H();
                    obj = objM6514H11;
                    if (z11 || objM6514H11 == c5975s) {
                        C10312h c10312h7 = new C10312h(13, onIntent);
                        c6021p.m6537c0(c10312h7);
                        obj = c10312h7;
                    }
                    c6021p.m6553p(false);
                    z6 = z10;
                    r12 = 0;
                    AbstractC8086f4.m8515b(c19575q, (InterfaceC1426a) obj, null, c6021p, 0, 4);
                } else {
                    z10 = true;
                }
                c21936l0 = null;
                if (c21936l0 != null) {
                    str = c21936l0.f69488a;
                } else {
                    str = null;
                }
                str2 = c14111x0.f44381L;
                if (str2 != null) {
                    c22011h0 = new C22011h0(str2);
                } else {
                    c22011h0 = null;
                }
                if (!c14111x0.f44376G) {
                    c22011h0 = null;
                }
                if (c22011h0 != null) {
                    str3 = c22011h0.f69652a;
                } else {
                    str3 = null;
                }
                C19575q c19575q2 = new C19575q(str, str3, (String) null, 4);
                c6021p.m6524S(1793783105);
                if ((i13 & 112) == 32) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
                Object objM6514H12 = c6021p.m6514H();
                obj = objM6514H12;
                if (z11) {
                    C10312h c10312h8 = new C10312h(13, onIntent);
                    c6021p.m6537c0(c10312h8);
                    obj = c10312h8;
                } else {
                    C10312h c10312h9 = new C10312h(13, onIntent);
                    c6021p.m6537c0(c10312h9);
                    obj = c10312h9;
                }
                c6021p.m6553p(false);
                z6 = z10;
                r12 = 0;
                AbstractC8086f4.m8515b(c19575q2, (InterfaceC1426a) obj, null, c6021p, 0, 4);
            } else {
                r12 = 0;
                z6 = true;
            }
            c6021p.m6553p(r12);
            c6021p.m6524S(1793786029);
            List list4 = c14111x0.f44374E;
            if (list4 == null || list4.isEmpty()) {
                i11 = 32;
            } else {
                c6021p.m6524S(1793788838);
                int i18 = i13 & 112;
                i11 = 32;
                ?? r10 = i18 == 32 ? z6 : r12;
                Object objM6514H13 = c6021p.m6514H();
                Object obj11 = objM6514H13;
                if (r10 != 0 || objM6514H13 == c5975s) {
                    C10312h c10312h10 = new C10312h(14, onIntent);
                    c6021p.m6537c0(c10312h10);
                    obj11 = c10312h10;
                }
                InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) obj11;
                c6021p.m6553p(r12);
                C4688o c4688oM21453a = c14111x0.f44406f.m21453a();
                c6021p.m6524S(1793795529);
                ?? r6 = i18 == 32 ? z6 : r12;
                Object objM6514H14 = c6021p.m6514H();
                Object obj12 = objM6514H14;
                if (r6 != 0 || objM6514H14 == c5975s) {
                    C0537v c0537v = new C0537v(29, onIntent);
                    c6021p.m6537c0(c0537v);
                    obj12 = c0537v;
                }
                c6021p.m6553p(r12);
                AbstractC9230W2.m9801a(interfaceC1426a4, c4688oM21453a, c14111x0.f44374E, (InterfaceC1436k) obj12, c6021p, 0);
            }
            c6021p.m6553p(r12);
            c6021p.m6524S(1793799500);
            C18162Z c18162z = messagesState.f57914e;
            if (c18162z != null) {
                AbstractC9973t4.m10616a(c18162z, onMessagesIntent, interactionSource, null, c6021p, (i13 >> 9) & 1008);
            }
            c6021p.m6553p(r12);
            c6021p.m6524S(1793805320);
            if (c14111x1.f44389T) {
                c6021p.m6524S(1793808153);
                int i19 = i13 & 112;
                ?? r11 = i19 == i11 ? z6 : r12;
                Object objM6514H15 = c6021p.m6514H();
                Object obj13 = objM6514H15;
                if (r11 != 0 || objM6514H15 == c5975s) {
                    C10312h c10312h11 = new C10312h(15, onIntent);
                    c6021p.m6537c0(c10312h11);
                    obj13 = c10312h11;
                }
                InterfaceC1426a interfaceC1426a5 = (InterfaceC1426a) obj13;
                c6021p.m6553p(r12);
                c6021p.m6524S(1793810790);
                ?? r13 = i19 == i11 ? z6 : r12;
                Object objM6514H16 = c6021p.m6514H();
                Object obj14 = objM6514H16;
                if (r13 != 0 || objM6514H16 == c5975s) {
                    C10312h c10312h12 = new C10312h(16, onIntent);
                    c6021p.m6537c0(c10312h12);
                    obj14 = c10312h12;
                }
                c6021p.m6553p(r12);
                AbstractC18290d.m19831a(interfaceC1426a5, (InterfaceC1426a) obj14, null, c6021p, r12);
            }
            c6021p.m6553p(r12);
            C3880A3 c3880a3M4785f = AbstractC4152w2.m4785f(r12, 3, c6021p, r12);
            AbstractC6659u abstractC6659u = messagesState.f57920k;
            if (abstractC6659u != null) {
                List list5 = abstractC6659u.m7172d().f23307v;
                ArrayList arrayList = new ArrayList();
                for (Object obj15 : list5) {
                    if (obj15 instanceof C0960M0) {
                        arrayList.add(obj15);
                    }
                }
                C0960M0 c0960m0 = (C0960M0) AbstractC17680n.m19343S(arrayList);
                List list6 = abstractC6659u.m7172d().f23307v;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj16 : list6) {
                    if (obj16 instanceof C0995S0) {
                        arrayList2.add(obj16);
                    }
                }
                C0995S0 c0995s0 = (C0995S0) AbstractC17680n.m19343S(arrayList2);
                if (c0995s0 != null) {
                    String str5 = abstractC6659u.m7172d().f23286a;
                    if (c0960m0 != null && (list = c0960m0.f2728c) != null) {
                        list2 = list;
                    }
                    c6021p.m6524S(1793851598);
                    ?? r14 = (c6021p.m6545h(c2925c) ? 1 : 0) | (c6021p.m6542f(c3880a3M4785f) ? 1 : 0) | ((i13 & 57344) == 16384 ? z6 : r12);
                    Object objM6514H17 = c6021p.m6514H();
                    Object obj17 = objM6514H17;
                    if (r14 != 0 || objM6514H17 == c5975s) {
                        C6959q c6959q = new C6959q(c2925c, c3880a3M4785f, onMessagesIntent, 21);
                        c6021p.m6537c0(c6959q);
                        obj17 = c6959q;
                    }
                    c6021p.m6553p(r12);
                    AbstractC5741w.m6158a(c14111x1.f44404e, str5, list2, c0995s0.f2784d, c0995s0.f2785e, c0995s0.f2786f, c3880a3M4785f, (InterfaceC1426a) obj17, c6021p, 0);
                }
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2452G(c14111x0, onIntent, c14111x1, messagesState, onMessagesIntent, interactionSource, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX INFO: renamed from: b */
    public static final void m14260b(InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k2, C6021p c6021p, int i10) {
        int i11;
        Object next;
        Object objM19235b;
        InterfaceC2062k interfaceC2062k;
        InterfaceC2062k interfaceC2062k2;
        InterfaceC2062k interfaceC2062k3;
        Object next2;
        Object objM19235b2;
        ?? r6;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(709079502);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1436k) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k2) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            InterfaceC11112u interfaceC11112u = (InterfaceC11112u) c6021p.m6548k(AbstractC17814e.f56807a);
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
            C16368c c16368c = c1996m != null ? (C16368c) c1996m.f5984y.get() : null;
            c6021p.m6524S(157303149);
            boolean zM6545h = c6021p.m6545h(c16368c) | c6021p.m6545h(abstractActivityC17375g);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6545h || objM6514H == c5975s) {
                objM6514H = new C12259x4a8e5692(c16368c, abstractActivityC17375g);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            C5984W0 c5984w0 = AndroidCompositionLocals_androidKt.f32825b;
            Context context = (Context) c6021p.m6548k(c5984w0);
            C5984W0 c5984w1 = AbstractC0233b1.f873a;
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
            C5984W0 c5984w2 = AbstractC16421b.f50950a;
            List list = (List) c6021p.m6548k(c5984w2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14111x0.class));
            } else {
                if (zBooleanValue) {
                    throw new C0644w();
                }
                interfaceC2062k = null;
            }
            c6021p.m6553p(false);
            LocalViewModelStoreOwner.f33491a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            C16527D c16527d = AbstractC16526C.f51263a;
            C16368c c16368c2 = c16368c;
            InterfaceC3756d interfaceC3756dMo5693b = c16527d.mo5693b(ConversationViewModel.class);
            InterfaceC3756d interfaceC3756dMo5693b2 = c16527d.mo5693b(C14111x0.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(interfaceC3756dMo5693b) | c6021p.m6542f(interfaceC3756dMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == c5975s) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H2);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k3, c6021p, -1395474517);
            boolean zM6545h2 = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h2 || objM6514H3 == c5975s) {
                objM6514H3 = new C12256x2005c58c(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            ConversationViewModel conversationViewModel = (ConversationViewModel) baseViewModel;
            c6021p.m6524S(157309531);
            boolean zM6545h3 = c6021p.m6545h(interfaceC11112u) | c6021p.m6542f(conversationViewModel);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6545h3 || objM6514H4 == c5975s) {
                objM6514H4 = new C14093o0(interfaceC11112u, conversationViewModel, null);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p, interfaceC11112u);
            c6021p.m6524S(157323830);
            boolean zM6545h4 = c6021p.m6545h(c8870f);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6545h4 || objM6514H5 == c5975s) {
                objM6514H5 = new C6703N(c8870f, 3);
                c6021p.m6537c0(objM6514H5);
            }
            InterfaceC1436k interfaceC1436k4 = (InterfaceC1436k) objM6514H5;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            Context context2 = (Context) c6021p.m6548k(c5984w0);
            boolean zBooleanValue2 = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
            List list2 = (List) c6021p.m6548k(c5984w2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue2) {
                interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
            } else {
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                interfaceC2062k2 = null;
            }
            c6021p.m6553p(false);
            ViewModelStoreOwner viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a2 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            InterfaceC3756d interfaceC3756dMo5693b3 = c16527d.mo5693b(MessagesViewModel.class);
            InterfaceC3756d interfaceC3756dMo5693b4 = c16527d.mo5693b(C18160X.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f2 = c6021p.m6542f(interfaceC3756dMo5693b3) | c6021p.m6542f(interfaceC3756dMo5693b4) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
            Object objM6514H6 = c6021p.m6514H();
            if (zM6542f2 || objM6514H6 == c5975s) {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H6 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H6);
            }
            BaseViewModel baseViewModel2 = (BaseViewModel) objM6514H6;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n2 = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k4, c6021p, -1395474517);
            boolean zM6545h5 = c6021p.m6545h(baseViewModel2) | c6021p.m6542f(interfaceC5985XM19531n2);
            Object objM6514H7 = c6021p.m6514H();
            if (zM6545h5 || objM6514H7 == c5975s) {
                objM6514H7 = new C12257x2005c58d(baseViewModel2, interfaceC5985XM19531n2, null);
                c6021p.m6537c0(objM6514H7);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H7, c6021p, baseViewModel2);
            c6021p.m6553p(false);
            c6021p.m6524S(157334438);
            boolean zM6545h6 = c6021p.m6545h(c16368c2) | c6021p.m6545h(abstractActivityC17375g) | c6021p.m6545h(c8870f);
            Object objM6514H8 = c6021p.m6514H();
            if (zM6545h6 || objM6514H8 == c5975s) {
                objM6514H8 = new ConversationScreenKt$ConversationScreen$voiceEndedViewModel$1$1(c16368c2, abstractActivityC17375g, c8870f);
                c6021p.m6537c0(objM6514H8);
            }
            InterfaceC1436k interfaceC1436k5 = (InterfaceC1436k) objM6514H8;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            Context context3 = (Context) c6021p.m6548k(c5984w0);
            boolean zBooleanValue3 = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
            List list3 = (List) c6021p.m6548k(c5984w2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue3) {
                interfaceC2062k3 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), AbstractC18967t.class));
            } else {
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                interfaceC2062k3 = null;
            }
            c6021p.m6553p(false);
            ViewModelStoreOwner viewModelStoreOwnerM12165a3 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a3 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            InterfaceC3756d interfaceC3756dMo5693b5 = c16527d.mo5693b(VoiceEndedViewModel.class);
            InterfaceC3756d interfaceC3756dMo5693b6 = c16527d.mo5693b(AbstractC18967t.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f3 = c6021p.m6542f(interfaceC3756dMo5693b5) | c6021p.m6542f(interfaceC3756dMo5693b6) | c6021p.m6542f(list3) | c6021p.m6544g(zBooleanValue3) | c6021p.m6542f(interfaceC2062k3);
            Object objM6514H9 = c6021p.m6514H();
            if (zM6542f3 || objM6514H9 == c5975s) {
                if (zBooleanValue3) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(AbstractC18967t.class), c16527d.mo5693b(VoiceEndedViewModel.class), context3, interfaceC2062k3);
                    throw null;
                }
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                objM6514H9 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VoiceEndedViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                c6021p.m6537c0(objM6514H9);
            }
            BaseViewModel baseViewModel3 = (BaseViewModel) objM6514H9;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel3, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n3 = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k5, c6021p, -1395474517);
            boolean zM6545h7 = c6021p.m6545h(baseViewModel3) | c6021p.m6542f(interfaceC5985XM19531n3);
            Object objM6514H10 = c6021p.m6514H();
            if (zM6545h7 || objM6514H10 == c5975s) {
                objM6514H10 = new C12258x2005c58e(baseViewModel3, interfaceC5985XM19531n3, null);
                c6021p.m6537c0(objM6514H10);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H10, c6021p, baseViewModel3);
            c6021p.m6553p(false);
            VoiceEndedViewModel voiceEndedViewModel = (VoiceEndedViewModel) baseViewModel3;
            boolean z6 = ((C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue()).f44438z.f44212e;
            c6021p.m6524S(617413469);
            Iterator it2 = ((Iterable) c6021p.m6548k(c5984w2)).iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!(next2 instanceof C2001r));
            if (next2 != null) {
                objM19235b2 = (C2001r) next2;
                c6021p.m6553p(false);
            } else {
                objM19235b2 = C17632f.f56419a.m19235b(C2001r.class);
                c6021p.m6553p(false);
            }
            C2001r c2001r = (C2001r) objM19235b2;
            C21539c c21539c = c2001r != null ? (C21539c) c2001r.f6121w.get() : null;
            Boolean boolValueOf = Boolean.valueOf(z6);
            c6021p.m6524S(157353778);
            boolean zM6545h8 = c6021p.m6545h(interfaceC11112u) | c6021p.m6544g(z6) | c6021p.m6545h(c21539c) | c6021p.m6545h(abstractActivityC17375g);
            Object objM6514H11 = c6021p.m6514H();
            if (zM6545h8 || objM6514H11 == c5975s) {
                objM6514H11 = new C1325F0(interfaceC11112u, z6, c21539c, abstractActivityC17375g, 4);
                c6021p.m6537c0(objM6514H11);
            }
            c6021p.m6553p(false);
            C5997d.m6446d(interfaceC11112u, boolValueOf, (InterfaceC1436k) objM6514H11, c6021p);
            C6037x c6037x = AbstractC5011h.f16350a;
            c6021p.m6524S(157369846);
            boolean zM6542f4 = c6021p.m6542f(abstractActivityC17375g);
            Object objM6514H12 = c6021p.m6514H();
            if (zM6542f4 || objM6514H12 == c5975s) {
                objM6514H12 = new LinkedHashMap();
                c6021p.m6537c0(objM6514H12);
            }
            c6021p.m6553p(false);
            C5997d.m6440a(c6037x.mo6405a((Map) objM6514H12), AbstractC8411c.m8969c(-451778930, c6021p, new C0148y(interfaceC1436k, c10456n, interfaceC1436k2, 25)), c6021p, 56);
            c6021p.m6524S(157376832);
            if (z6) {
                c6021p.m6524S(157379047);
                boolean zM6542f5 = c6021p.m6542f(voiceEndedViewModel);
                Object objM6514H13 = c6021p.m6514H();
                if (zM6542f5 || objM6514H13 == c5975s) {
                    objM6514H13 = new C14095p0(voiceEndedViewModel, 0);
                    c6021p.m6537c0(objM6514H13);
                }
                r6 = 0;
                c6021p.m6553p(false);
                AbstractC2511g1.m3593e(0, (InterfaceC1436k) objM6514H13, c6021p, null);
            } else {
                r6 = 0;
            }
            c6021p.m6553p(r6);
            AbstractC18967t abstractC18967t = (AbstractC18967t) AbstractC9112C3.m9642d(voiceEndedViewModel.f40343c, c6021p).getValue();
            if (abstractC18967t instanceof C18963p) {
                c6021p.m6524S(157389490);
                AbstractC8098h0.m8572d(null, c6021p, r6);
                c6021p.m6553p(r6);
            } else if (abstractC18967t instanceof C18965r) {
                c6021p.m6524S(157392200);
                AbstractC8090g0.m8551j(null, c6021p, r6);
                c6021p.m6553p(r6);
            } else if (abstractC18967t instanceof C18966s) {
                c6021p.m6524S(157394632);
                AbstractC18947B.m20275c(null, c6021p, r6);
                c6021p.m6553p(r6);
            } else if (abstractC18967t instanceof C18964q) {
                c6021p.m6524S(157396629);
                c6021p.m6553p(r6);
            } else {
                c6021p.m6524S(584338001);
                c6021p.m6553p(r6);
            }
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(interfaceC1436k, interfaceC10459q2, interfaceC1436k2, i10, 12);
        }
    }
}
