package p339Nf;

import ai.AbstractC10620k;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.draw.AbstractC10861a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.messages.MessagesViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import ni.C17632f;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p017Af.C0459F;
import p025An.C0644w;
import p040Bd.C0922F4;
import p040Bd.C0928G4;
import p042Bf.C1276r;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1051v0.AbstractC20417e;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20901t;
import p1081wc.InterfaceC20904w;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21965U0;
import p1155zi.C22011h0;
import p204I1.C3582M;
import p225Im.InterfaceC3756d;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4152w2;
import p229J0.C3880A3;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C4134t2;
import p273Kl.C4714D;
import p293Lh.C5062h;
import p324Mn.C5521B;
import p324Mn.C5524E;
import p324Mn.C5525F;
import p324Mn.C5551u;
import p328N1.C5609y;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p444S4.AbstractC6993A;
import p467T1.C7199i;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8467E;
import p544W9.AbstractC8519M3;
import p544W9.AbstractC8651i4;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9746I4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.AbstractC13474L;
import p736f0.AbstractC13508z;
import p758g0.AbstractC13764h;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p894n0.InterfaceC17406l;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17788v;
import p911o0.C17764j;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17790w;
import p926of.C18160X;
import p936p0.AbstractC18283w;
import p936p0.C18280t;
import p977r0.C18853y;

/* JADX INFO: renamed from: Nf.w */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5741w {

    /* JADX INFO: renamed from: a */
    public static final float f18690a = AbstractC7313q.f23202g;

    /* JADX INFO: renamed from: a */
    public static final void m6158a(String str, String messageId, List list, List citations, List searchResultGroups, List imageResults, C3880A3 sheetState, InterfaceC1426a onDismissRequest, C6021p c6021p, int i10) {
        int i11;
        Object next;
        Object objM19235b;
        InterfaceC2062k interfaceC2062k;
        boolean z6;
        C6021p c6021p2;
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(citations, "citations");
        AbstractC16544l.m18094g(searchResultGroups, "searchResultGroups");
        AbstractC16544l.m18094g(imageResults, "imageResults");
        AbstractC16544l.m18094g(sheetState, "sheetState");
        AbstractC16544l.m18094g(onDismissRequest, "onDismissRequest");
        c6021p.m6526U(899067675);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(messageId) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(list) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(citations) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(searchResultGroups) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(imageResults) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6542f(sheetState) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c6021p.m6545h(onDismissRequest) ? 8388608 : 4194304;
        }
        int i12 = i11;
        if ((i12 & 4793491) == 4793490 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            Configuration configuration = (Configuration) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32824a);
            c6021p.m6524S(617413469);
            Iterator it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof InterfaceC20901t));
            if (next != null) {
                objM19235b = (InterfaceC20901t) next;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(InterfaceC20901t.class);
                c6021p.m6553p(false);
            }
            InterfaceC20901t interfaceC20901t = (InterfaceC20901t) objM19235b;
            InterfaceC20904w interfaceC20904wMo3164b = interfaceC20901t != null ? interfaceC20901t.mo3164b() : null;
            c6021p.m6524S(-1020152108);
            Context context2 = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list2 = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
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
            InterfaceC3756d interfaceC3756dMo5693b = c16527d.mo5693b(MessagesViewModel.class);
            InterfaceC3756d interfaceC3756dMo5693b2 = c16527d.mo5693b(C18160X.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(interfaceC3756dMo5693b) | c6021p.m6542f(interfaceC3756dMo5693b2) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6542f || objM6514H == c5975s) {
                z6 = true;
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a, list2);
                c6021p.m6537c0(objM6514H);
            } else {
                z6 = true;
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            MessagesViewModel messagesViewModel = (MessagesViewModel) baseViewModel;
            InterfaceC5985X interfaceC5985XM9805a = AbstractC9233X.m9805a(messagesViewModel.f40343c, C5723e.f18535o0, c6021p, 48);
            c6021p.m6524S(-1241056886);
            boolean zM6545h = c6021p.m6545h(searchResultGroups) | c6021p.m6545h(imageResults) | c6021p.m6542f(messagesViewModel);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == c5975s) {
                objM6514H2 = new C5731m(searchResultGroups, imageResults, messagesViewModel, null);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            int i13 = i12 >> 12;
            C5997d.m6451g(searchResultGroups, imageResults, (InterfaceC1439n) objM6514H2, c6021p);
            c6021p.m6524S(-1241048110);
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == c5975s) {
                objM6514H3 = C5997d.m6430Q(EnumC5742x.f18691Y, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H3;
            c6021p.m6553p(false);
            EnumC5742x enumC5742x = (EnumC5742x) interfaceC5985X.getValue();
            c6021p.m6524S(-1241044973);
            boolean zM6545h2 = c6021p.m6545h(interfaceC20904wMo3164b) | ((i12 & 14) == 4 ? z6 : false);
            if ((i12 & 112) != 32) {
                z6 = false;
            }
            boolean zM6545h3 = zM6545h2 | z6 | c6021p.m6545h(citations) | c6021p.m6545h(searchResultGroups) | c6021p.m6545h(imageResults);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6545h3 || objM6514H4 == c5975s) {
                c6021p2 = c6021p;
                C5732n c5732n = new C5732n(interfaceC20904wMo3164b, str, messageId, citations, searchResultGroups, imageResults, interfaceC5985X, null);
                c6021p2.m6537c0(c5732n);
                objM6514H4 = c5732n;
            } else {
                c6021p2 = c6021p;
            }
            c6021p2.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p2, enumC5742x);
            AbstractC4152w2.m4780a(onDismissRequest, null, sheetState, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(737072568, c6021p2, new C5735q(configuration, context, interfaceC5985X, str, messageId, list, citations, searchResultGroups, messagesViewModel, imageResults, interfaceC5985XM9805a)), c6021p, ((i12 >> 21) & 14) | (i13 & 896), 384, 4090);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5736r(str, messageId, list, citations, searchResultGroups, imageResults, sheetState, onDismissRequest, i10, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m6159b(int i10, int i11, InterfaceC1426a interfaceC1426a, C6021p c6021p, boolean z6) {
        int i12;
        long j10;
        C17785t0 c17785t0 = C17785t0.f56761a;
        c6021p.m6526U(-1223827984);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6542f(c17785t0) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6538d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c6021p.m6545h(interfaceC1426a) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (z6) {
                c6021p.m6524S(1941551392);
                j10 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
            } else {
                c6021p.m6524S(1941552649);
                j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s;
            }
            c6021p.m6553p(false);
            InterfaceC5982V0 interfaceC5982V0M14999a = AbstractC13474L.m14999a(j10, null, "Pill alpha", c6021p, 384, 10);
            String strM8676d = AbstractC8142m4.m8676d(i10, c6021p);
            C3582M c3582m = new C3582M(((C14365u) interfaceC5982V0M14999a.getValue()).f45062a, AbstractC9119D4.m9650c(14), C5609y.f18153p0, 0L, 0, 0L, 16777208);
            InterfaceC10459q interfaceC10459qM19513a = c17785t0.m19513a(C10456n.f30959Y, 1.0f, true);
            c6021p.m6524S(1941564480);
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = AbstractC0168G.m536y(c6021p);
            }
            c6021p.m6553p(false);
            AbstractC4124r4.m4768b(strM8676d, AbstractC10842a.m11235m(AbstractC10833a.m11208c(interfaceC10459qM19513a, (InterfaceC17406l) objM6514H, null, false, null, interfaceC1426a, 28), 0.0f, AbstractC7313q.f23200e, 1), 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, c3582m, c6021p, 0, 0, 65020);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5740v(i10, z6, interfaceC1426a, i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m6160c(String str, String str2, List list, Map map, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        Object next;
        Object objM19235b;
        C21965U0 c21965u0;
        C6021p c6021p2;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-1259135317);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(list) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(map) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 16384 : 8192;
        }
        int i12 = i11 | 196608;
        if ((74899 & i12) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(617413469);
            Iterator it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof InterfaceC20901t));
            if (next != null) {
                objM19235b = (InterfaceC20901t) next;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(InterfaceC20901t.class);
                c6021p.m6553p(false);
            }
            InterfaceC20901t interfaceC20901t = (InterfaceC20901t) objM19235b;
            InterfaceC20904w interfaceC20904wMo3164b = interfaceC20901t != null ? interfaceC20901t.mo3164b() : null;
            c6021p.m6524S(-107023888);
            boolean zIsEmpty = list.isEmpty();
            float f10 = f18690a;
            if (zIsEmpty) {
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.message_sources_no_images, c6021p), AbstractC10842a.m11235m(c10456n, f10, 0.0f, 2), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p, 48, 0, 65528);
                c6021p.m6553p(false);
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C5724f(str, str2, list, map, interfaceC1436k, c10456n, i10, 0);
                    return;
                }
                return;
            }
            c6021p.m6553p(false);
            long jM15774b = C14365u.m15774b(0.4f, AbstractC8467E.m9097b(c6021p) ? C14365u.f45055e : C14365u.f45052b);
            c6021p.m6524S(-107008455);
            boolean zM6542f = c6021p.m6542f(list);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6542f || objM6514H == c5975s) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C0928G4 c0928g4 = (C0928G4) it2.next();
                    Iterator it3 = it2;
                    String str3 = c0928g4.f2675b;
                    if (str3 == null) {
                        c21965u0 = null;
                    } else {
                        C0922F4 c0922f4 = c0928g4.f2677d;
                        c21965u0 = new C21965U0(str3, 0, c0922f4 != null ? c0922f4.f2662a : 0, c0922f4 != null ? c0922f4.f2663b : 0, null, 112);
                    }
                    if (c21965u0 != null) {
                        arrayList.add(c21965u0);
                    }
                    it2 = it3;
                }
                c6021p.m6537c0(arrayList);
                objM6514H = arrayList;
            }
            List list2 = (List) objM6514H;
            c6021p.m6553p(false);
            C18853y c18853y = new C18853y();
            float f11 = AbstractC7313q.f23199d;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(f11);
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10844c.m11244d(c10456n, 1.0f), f10, 0.0f, 2);
            c6021p.m6524S(-106984999);
            boolean zM6545h = ((i12 & 57344) == 16384) | c6021p.m6545h(list2) | c6021p.m6545h(list) | c6021p.m6545h(map) | c6021p.m6545h(interfaceC20904wMo3164b) | ((i12 & 14) == 4) | ((i12 & 112) == 32) | c6021p.m6540e(jM15774b);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == c5975s) {
                c6021p2 = c6021p;
                C5728j c5728j = new C5728j(list2, list, map, interfaceC20904wMo3164b, str, str2, interfaceC1436k, jM15774b);
                c6021p2.m6537c0(c5728j);
                objM6514H2 = c5728j;
            } else {
                c6021p2 = c6021p;
            }
            c6021p2.m6553p(false);
            AbstractC6993A.m7395a(c18853y, interfaceC10459qM11235m, null, null, false, f11, c17764jM19500g, null, false, (InterfaceC1436k) objM6514H2, c6021p, 0);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C5724f(str, str2, list, map, interfaceC1436k, interfaceC10459q2, i10, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m6161d(String str, String str2, String str3, String str4, String str5, C5551u c5551u, String str6, Map map, C5521B c5521b, C5521B c5521b2, InterfaceC1426a interfaceC1426a, boolean z6, C5721c c5721c, C6021p c6021p, int i10, int i11) {
        int i12;
        int i13;
        C6021p c6021p2;
        boolean z10;
        c6021p.m6526U(447074028);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(str3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6542f(str4) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6542f(str5) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c6021p.m6545h(c5551u) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c6021p.m6542f(str6) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= c6021p.m6545h(map) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i12 |= c6021p.m6545h(c5521b) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i12 |= c6021p.m6545h(c5521b2) ? 536870912 : 268435456;
        }
        int i14 = i12;
        if ((i11 & 6) == 0) {
            i13 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c6021p.m6542f(c5721c) ? 256 : 128;
        }
        if ((i14 & 306783379) == 306783378 && (i13 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(1271696899);
            boolean zM6545h = ((i13 & 896) == 256) | c6021p.m6545h(interfaceC20904w) | ((i14 & 14) == 4) | ((i14 & 112) == 32) | ((i14 & 896) == 256) | ((57344 & i14) == 16384) | ((i14 & 7168) == 2048);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                c6021p2 = c6021p;
                C5729k c5729k = new C5729k(interfaceC20904w, str, str2, str3, str5, str4, c5721c, null);
                c6021p2.m6537c0(c5729k);
                objM6514H = c5729k;
            } else {
                c6021p2 = c6021p;
            }
            c6021p2.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p2, c17296c);
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(AbstractC10833a.m11209d(AbstractC10844c.m11244d(c10456n, 1.0f), false, null, interfaceC1426a, 7), f18690a, 0.0f, 2);
            float f10 = AbstractC7313q.f23201f;
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459qM11235m, 0.0f, z6 ? 0 : f10, 0.0f, f10, 5);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p2, 0);
            int i15 = c6021p2.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11237o);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p2.f19563O) {
                c6021p2.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p2, c17790wM19515a);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p2, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                AbstractC0168G.m537z(i15, c6021p2, i15, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p2, interfaceC10459qM10923d);
            float f11 = AbstractC7313q.f23198c;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(f11);
            C10450h c10450h = C10444b.f30944w0;
            InterfaceC10459q interfaceC10459qM11237o2 = AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, 0.0f, AbstractC7313q.f23197b, 7);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c17764jM19500g, c10450h, c6021p2, 48);
            int i16 = c6021p2.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p2, interfaceC10459qM11237o2);
            c6021p.m6528W();
            if (c6021p2.f19563O) {
                c6021p2.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p2, c17781r0M19506b);
            C5997d.m6439Z(c21694h2, c6021p2, interfaceC6008i0M6550m2);
            if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                AbstractC0168G.m537z(i16, c6021p2, i16, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p2, interfaceC10459qM10923d2);
            AbstractC8651i4.m9323a((i14 >> 9) & 14, 4, c6021p, AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23185b), str4, false);
            String strM6157a = (String) map.get(str6);
            String str7 = (strM6157a == null && (strM6157a = AbstractC5722d.m6157a(str4)) == null) ? str4 : strM6157a;
            C5984W0 c5984w0 = AbstractC3947L4.f12183a;
            AbstractC4124r4.m4768b(str7, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p2.m6548k(c5984w0)).f12155k, c6021p, 0, 0, 65534);
            c6021p2.m6553p(true);
            c6021p2.m6524S(950798496);
            if (str5 == null) {
                z10 = false;
            } else {
                z10 = false;
                AbstractC4124r4.m4768b(str5, AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, 0.0f, f11, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new C3582M(0L, AbstractC9119D4.m9650c(15), C5609y.f18152o0, 0L, 0, AbstractC9119D4.m9650c(21), 16646137), c6021p, 0, 1572864, 65532);
            }
            c6021p2.m6553p(z10);
            c6021p2.m6524S(950809850);
            if (c5551u != 0) {
                AbstractC4124r4.m4768b(m6165h(c5551u, c5521b, c5521b2, c6021p2), null, ((C3949M0) c6021p2.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p2.m6548k(c5984w0)).f12156l, c6021p, 0, 0, 65530);
            }
            c6021p2.m6553p(z10);
            c6021p2.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5730l(str, str2, str3, str4, str5, c5551u, str6, map, c5521b, c5521b2, interfaceC1426a, z6, c5721c, i10, i11);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m6162e(String str, String str2, List list, List list2, List list3, Map map, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) throws Exception {
        int i11;
        C18280t c18280t;
        C6021p c6021p2;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-61220982);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(list) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(list2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(list3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(map) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 1048576 : 524288;
        }
        int i12 = i11 | 12582912;
        if ((i12 & 4793491) == 4793490 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-327654741);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                C5551u.Companion.getClass();
                objM6514H = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
                c6021p.m6537c0(objM6514H);
            }
            C5551u c5551u = (C5551u) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(-327653056);
            boolean zM6542f = c6021p.m6542f(c5551u);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == c5975s) {
                C5525F.Companion.getClass();
                objM6514H2 = AbstractC8519M3.m9187a(c5551u, C5524E.m5924a());
                c6021p.m6537c0(objM6514H2);
            }
            C5521B c5521b = (C5521B) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6524S(-327649525);
            boolean zM6542f2 = c6021p.m6542f(c5551u);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == c5975s) {
                C21554a c21554a = C21555b.f68260Z;
                long jM8644j = AbstractC8128k6.m8644j(1, EnumC21557d.DAYS);
                c5551u.getClass();
                C5551u c5551uM5947c = c5551u.m5947c(C21555b.m21843m(jM8644j));
                C5525F.Companion.getClass();
                objM6514H3 = AbstractC8519M3.m9187a(c5551uM5947c, C5524E.m5924a());
                c6021p.m6537c0(objM6514H3);
            }
            C5521B c5521b2 = (C5521B) objM6514H3;
            c6021p.m6553p(false);
            C18280t c18280tM19827a = AbstractC18283w.m19827a(0, c6021p, 0, 3);
            c6021p.m6524S(-327638585);
            boolean zM6545h = c6021p.m6545h(list) | ((i12 & 14) == 4) | ((i12 & 112) == 32) | c6021p.m6545h(c5521b) | c6021p.m6545h(c5521b2) | ((i12 & 3670016) == 1048576) | c6021p.m6542f(c18280tM19827a) | c6021p.m6545h(list2) | c6021p.m6545h(list3) | c6021p.m6545h(map);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6545h || objM6514H4 == c5975s) {
                c18280t = c18280tM19827a;
                c6021p2 = c6021p;
                C5739u c5739u = new C5739u(list, list2, list3, str, str2, c5521b, c5521b2, interfaceC1436k, c18280t, map);
                c6021p2.m6537c0(c5739u);
                objM6514H4 = c5739u;
            } else {
                c18280t = c18280tM19827a;
                c6021p2 = c6021p;
            }
            c6021p2.m6553p(false);
            AbstractC9746I4.m10337a(c10456n, c18280t, null, false, null, null, null, false, (InterfaceC1436k) objM6514H4, c6021p, (i12 >> 21) & 14, 252);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5736r(str, str2, list, list2, list3, map, interfaceC1436k, interfaceC10459q2, i10, 1);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m6163f(int i10, C18280t c18280t, String str, C6021p c6021p, int i11) {
        int i12;
        c6021p.m6526U(377041735);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6538d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6542f(c18280t) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c6021p.m6542f(str) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(i10, c6021p), AbstractC10842a.m11237o(AbstractC10842a.m11235m(AbstractC10833a.m11207b(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), m6166i(c6021p), AbstractC14334L.f44973a), f18690a, 0.0f, 2), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23201f, 7), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p, 0, 0, 65528);
            c6021p.m6524S(2074420256);
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = C5997d.m6421H(new C4714D(c18280t, 11, str));
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC10831a.m11201d(((Boolean) ((InterfaceC5982V0) objM6514H).getValue()).booleanValue(), null, AbstractC13508z.m15013e(null, 3), AbstractC13508z.m15014f(null, 3), null, AbstractC5720b.f18529c, c6021p, 200064, 18);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5062h(i10, c18280t, str, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:61:0x0123  */
    /* JADX WARN: Code duplicated, block: B:62:0x0125  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:70:0x014a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0153  */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    /* JADX WARN: Code duplicated, block: B:77:0x015c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x015e  */
    /* JADX WARN: Code duplicated, block: B:82:0x017d  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m6164g(EnumC5742x enumC5742x, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        InterfaceC10459q interfaceC10459q3;
        EnumC5742x enumC5742x2;
        float f10;
        InterfaceC5982V0 interfaceC5982V0M15261b;
        long jM6166i;
        boolean zM6540e;
        Object objM6514H;
        int i14;
        InterfaceC1426a interfaceC1426a;
        C21694h c21694h;
        boolean z6;
        int i15;
        boolean z10;
        Object objM6514H2;
        boolean z11;
        boolean z12;
        Object objM6514H3;
        InterfaceC10459q interfaceC10459q4;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(349442078);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(enumC5742x) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        int i16 = i11 & 4;
        if (i16 == 0) {
            if ((i10 & 384) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 256 : 128;
            }
            i13 = i12;
            if ((i13 & 147) == 146 || !c6021p.m6562y()) {
                if (i16 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                enumC5742x2 = EnumC5742x.f18691Y;
                if (enumC5742x == enumC5742x2) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                interfaceC5982V0M15261b = AbstractC13764h.m15261b(f10, null, "View mode", c6021p, 3072, 22);
                jM6166i = m6166i(c6021p);
                InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(AbstractC10833a.m11207b(AbstractC10844c.m11244d(interfaceC10459q3, 1.0f), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12191E, AbstractC20417e.f64539a), AbstractC7313q.f23198c);
                c6021p.m6524S(2082273491);
                zM6540e = c6021p.m6540e(jM6166i) | c6021p.m6542f(interfaceC5982V0M15261b);
                objM6514H = c6021p.m6514H();
                Object obj = C6013l.f19514a;
                if (zM6540e || objM6514H == obj) {
                    objM6514H = new C4134t2(jM6166i, interfaceC5982V0M15261b, 1);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM11295a = AbstractC10861a.m11295a(interfaceC10459qM11233k, (InterfaceC1436k) objM6514H);
                C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30943v0, c6021p, 0);
                i14 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11295a);
                InterfaceC21700k.f68875m0.getClass();
                interfaceC1426a = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                    AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                if (enumC5742x == enumC5742x2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                c6021p.m6524S(-1413964081);
                i15 = i13 & 112;
                if (i15 == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objM6514H2 = c6021p.m6514H();
                if (z10 || objM6514H2 == obj) {
                    objM6514H2 = new C0459F(24, interfaceC1436k);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                m6159b(R.string.message_links, 6, (InterfaceC1426a) objM6514H2, c6021p, z6);
                if (enumC5742x == EnumC5742x.f18692Z) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c6021p.m6524S(-1413958160);
                if (i15 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objM6514H3 = c6021p.m6514H();
                if (z12 || objM6514H3 == obj) {
                    objM6514H3 = new C0459F(25, interfaceC1436k);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                m6159b(R.string.message_images, 6, (InterfaceC1426a) objM6514H3, c6021p, z11);
                c6021p.m6553p(true);
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c6021p.m6517L();
                interfaceC10459q4 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C1276r((Object) enumC5742x, (Object) interfaceC1436k, interfaceC10459q4, i10, i11, 4);
            }
        }
        i12 |= 384;
        interfaceC10459q2 = interfaceC10459q;
        i13 = i12;
        if ((i13 & 147) == 146) {
            if (i16 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            enumC5742x2 = EnumC5742x.f18691Y;
            if (enumC5742x == enumC5742x2) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            interfaceC5982V0M15261b = AbstractC13764h.m15261b(f10, null, "View mode", c6021p, 3072, 22);
            jM6166i = m6166i(c6021p);
            InterfaceC10459q interfaceC10459qM11233k2 = AbstractC10842a.m11233k(AbstractC10833a.m11207b(AbstractC10844c.m11244d(interfaceC10459q3, 1.0f), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12191E, AbstractC20417e.f64539a), AbstractC7313q.f23198c);
            c6021p.m6524S(2082273491);
            zM6540e = c6021p.m6540e(jM6166i) | c6021p.m6542f(interfaceC5982V0M15261b);
            objM6514H = c6021p.m6514H();
            Object obj2 = C6013l.f19514a;
            if (zM6540e) {
                objM6514H = new C4134t2(jM6166i, interfaceC5982V0M15261b, 1);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C4134t2(jM6166i, interfaceC5982V0M15261b, 1);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11295a2 = AbstractC10861a.m11295a(interfaceC10459qM11233k2, (InterfaceC1436k) objM6514H);
            C17781r0 c17781r0M19506b2 = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30943v0, c6021p, 0);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11295a2);
            InterfaceC21700k.f68875m0.getClass();
            interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b2);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            } else {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
            if (enumC5742x == enumC5742x2) {
                z6 = true;
            } else {
                z6 = false;
            }
            c6021p.m6524S(-1413964081);
            i15 = i13 & 112;
            if (i15 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            objM6514H2 = c6021p.m6514H();
            if (z10) {
                objM6514H2 = new C0459F(24, interfaceC1436k);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C0459F(24, interfaceC1436k);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            m6159b(R.string.message_links, 6, (InterfaceC1426a) objM6514H2, c6021p, z6);
            if (enumC5742x == EnumC5742x.f18692Z) {
                z11 = true;
            } else {
                z11 = false;
            }
            c6021p.m6524S(-1413958160);
            if (i15 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            objM6514H3 = c6021p.m6514H();
            if (z12) {
                objM6514H3 = new C0459F(25, interfaceC1436k);
                c6021p.m6537c0(objM6514H3);
            } else {
                objM6514H3 = new C0459F(25, interfaceC1436k);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            m6159b(R.string.message_images, 6, (InterfaceC1426a) objM6514H3, c6021p, z11);
            c6021p.m6553p(true);
            interfaceC10459q4 = interfaceC10459q3;
        } else {
            if (i16 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            enumC5742x2 = EnumC5742x.f18691Y;
            if (enumC5742x == enumC5742x2) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            interfaceC5982V0M15261b = AbstractC13764h.m15261b(f10, null, "View mode", c6021p, 3072, 22);
            jM6166i = m6166i(c6021p);
            InterfaceC10459q interfaceC10459qM11233k3 = AbstractC10842a.m11233k(AbstractC10833a.m11207b(AbstractC10844c.m11244d(interfaceC10459q3, 1.0f), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12191E, AbstractC20417e.f64539a), AbstractC7313q.f23198c);
            c6021p.m6524S(2082273491);
            zM6540e = c6021p.m6540e(jM6166i) | c6021p.m6542f(interfaceC5982V0M15261b);
            objM6514H = c6021p.m6514H();
            Object obj3 = C6013l.f19514a;
            if (zM6540e) {
                objM6514H = new C4134t2(jM6166i, interfaceC5982V0M15261b, 1);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C4134t2(jM6166i, interfaceC5982V0M15261b, 1);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11295a3 = AbstractC10861a.m11295a(interfaceC10459qM11233k3, (InterfaceC1436k) objM6514H);
            C17781r0 c17781r0M19506b3 = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30943v0, c6021p, 0);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11295a3);
            InterfaceC21700k.f68875m0.getClass();
            interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b3);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m3);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            } else {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d3);
            if (enumC5742x == enumC5742x2) {
                z6 = true;
            } else {
                z6 = false;
            }
            c6021p.m6524S(-1413964081);
            i15 = i13 & 112;
            if (i15 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            objM6514H2 = c6021p.m6514H();
            if (z10) {
                objM6514H2 = new C0459F(24, interfaceC1436k);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C0459F(24, interfaceC1436k);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            m6159b(R.string.message_links, 6, (InterfaceC1426a) objM6514H2, c6021p, z6);
            if (enumC5742x == EnumC5742x.f18692Z) {
                z11 = true;
            } else {
                z11 = false;
            }
            c6021p.m6524S(-1413958160);
            if (i15 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            objM6514H3 = c6021p.m6514H();
            if (z12) {
                objM6514H3 = new C0459F(25, interfaceC1436k);
                c6021p.m6537c0(objM6514H3);
            } else {
                objM6514H3 = new C0459F(25, interfaceC1436k);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            m6159b(R.string.message_images, 6, (InterfaceC1426a) objM6514H3, c6021p, z11);
            c6021p.m6553p(true);
            interfaceC10459q4 = interfaceC10459q3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r((Object) enumC5742x, (Object) interfaceC1436k, interfaceC10459q4, i10, i11, 4);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final String m6165h(C5551u date, C5521B nowLocal, C5521B yesterdayLocal, C6021p c6021p) {
        AbstractC16544l.m18094g(date, "date");
        AbstractC16544l.m18094g(nowLocal, "nowLocal");
        AbstractC16544l.m18094g(yesterdayLocal, "yesterdayLocal");
        c6021p.m6524S(-465445506);
        String strM10988d = AbstractC10620k.m10988d(date, nowLocal, yesterdayLocal, AbstractC8142m4.m8676d(R.string.publication_date_today, c6021p), AbstractC8142m4.m8676d(R.string.publication_date_yesterday, c6021p));
        c6021p.m6553p(false);
        return strM10988d;
    }

    /* JADX INFO: renamed from: i */
    public static final long m6166i(C6021p c6021p) {
        c6021p.m6524S(-843500604);
        long jM4664f = AbstractC3959O0.m4664f((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a), 1);
        c6021p.m6553p(false);
        return jM4664f;
    }
}
