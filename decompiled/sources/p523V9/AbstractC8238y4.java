package p523V9;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import ch.AbstractC11749c;
import com.openai.feature.conversationhistory.dialogs.move.C12231x120ecaed;
import com.openai.feature.conversationhistory.dialogs.move.C12232xb4ead017;
import com.openai.feature.conversationhistory.dialogs.move.ConversationMoveViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import com.revenuecat.purchases.PurchasesError;
import io.sentry.android.replay.C15298l;
import io.sentry.android.replay.capture.C15272c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p006A4.C0362w;
import p017Af.C0469P;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p080D0.C1811j0;
import p098Di.InterfaceC2062k;
import p117Eb.C2374d;
import p124Ei.C2446D;
import p145Ff.C2728f;
import p193Hf.C3321N;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3896D1;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4101o;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p571X9.AbstractC9112C3;
import p594Y9.AbstractC9746I4;
import p624Zg.AbstractC10345O;
import p624Zg.C10341K;
import p624Zg.C10343M;
import p624Zg.C10344N;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p870le.C16863U;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17792x;
import td.AbstractC19840c;
import td.C19841d;
import td.C19843f;
import td.C19849l;

/* JADX INFO: renamed from: V9.y4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8238y4 {
    /* JADX INFO: renamed from: a */
    public static final void m8877a(int i10, InterfaceC1426a onDismiss, C6021p c6021p, InterfaceC10459q interfaceC10459q, String conversationId) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        AbstractC16544l.m18094g(conversationId, "conversationId");
        c6021p.m6526U(1481877617);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6545h(onDismiss) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(conversationId) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-2049917971);
            int i13 = i12 & 14;
            boolean z6 = i13 == 4;
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (z6 || objM6514H == obj) {
                objM6514H = new C1811j0(16, onDismiss);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19849l.class));
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
            Object objMo5693b = c16527d.mo5693b(ConversationMoveViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C19849l.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19849l.class), c16527d.mo5693b(ConversationMoveViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationMoveViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H2);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            boolean zM6545h = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h || objM6514H3 == obj) {
                objM6514H3 = new C12231x120ecaed(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            ConversationMoveViewModel conversationMoveViewModel = (ConversationMoveViewModel) baseViewModel;
            AbstractC3984T1.m4682a(onDismiss, AbstractC8411c.m8969c(-1286888151, c6021p, new C3321N(15, onDismiss)), c10456n, null, null, AbstractC19840c.f62917b, AbstractC8411c.m8969c(-106039036, c6021p, new C15298l(conversationMoveViewModel, conversationId, AbstractC9112C3.m9642d(conversationMoveViewModel.f40343c, c6021p), 7)), null, 0L, 0L, 0L, 0L, 0.0f, null, c6021p, 1769520 | i13 | (i12 & 896), 0, 16280);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0469P(onDismiss, conversationId, interfaceC10459q2, i10, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8878b(int i10, InterfaceC1426a onDismiss, C6021p c6021p, InterfaceC10459q interfaceC10459q, String conversationId) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        boolean z6;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        AbstractC16544l.m18094g(conversationId, "conversationId");
        c6021p.m6526U(840516037);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6545h(onDismiss) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(conversationId) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(1744520977);
            boolean z10 = (i12 & 14) == 4;
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (z10 || objM6514H == obj) {
                objM6514H = new C1811j0(17, onDismiss);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19849l.class));
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
            Object objMo5693b = c16527d.mo5693b(ConversationMoveViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C19849l.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                z6 = true;
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19849l.class), c16527d.mo5693b(ConversationMoveViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationMoveViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H2);
            } else {
                z6 = true;
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            boolean zM6545h = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h || objM6514H3 == obj) {
                objM6514H3 = new C12232xb4ead017(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            ConversationMoveViewModel conversationMoveViewModel = (ConversationMoveViewModel) baseViewModel;
            InterfaceC5985X interfaceC5985XM9642d = AbstractC9112C3.m9642d(conversationMoveViewModel.f40343c, c6021p);
            c6021p.m6524S(1744527288);
            boolean zM6542f2 = c6021p.m6542f(conversationMoveViewModel);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f2 || objM6514H4 == obj) {
                objM6514H4 = new C16863U(1, conversationMoveViewModel, ConversationMoveViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 13);
                c6021p.m6537c0(objM6514H4);
            }
            Object obj2 = (InterfaceC3759g) objM6514H4;
            c6021p.m6553p(false);
            C8410b c8410bM8969c = AbstractC8411c.m8969c(982915061, c6021p, new C2728f(interfaceC5985XM9642d, 12));
            c6021p.m6524S(1744537137);
            boolean zM6542f3 = c6021p.m6542f(interfaceC5985XM9642d) | c6021p.m6542f(obj2) | ((i12 & 112) == 32 ? z6 : false);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6542f3 || objM6514H5 == obj) {
                objM6514H5 = new C15272c(obj2, conversationId, interfaceC5985XM9642d, 23);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            AbstractC4101o.m4761b(c8410bM8969c, (InterfaceC1426a) objM6514H5, c10456n, AbstractC19840c.f62921f, null, false, null, null, null, c6021p, (i12 & 896) | 3078, 496);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0469P(onDismiss, conversationId, interfaceC10459q2, i10, 4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8879c(int i10, C6021p c6021p) {
        c6021p.m6526U(1930464910);
        if (i10 == 0 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            float f10 = AbstractC3896D1.f11851a;
            AbstractC3914G1.m4611a(AbstractC19840c.f62919d, null, null, null, AbstractC19840c.f62920e, null, AbstractC3896D1.m4607a(C14365u.f45059i, 0L, 0L, 0L, c6021p, 510), 0.0f, 0.0f, c6021p, 24582, 430);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2446D(i10, 23);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8880d(int i10, C6021p c6021p) {
        c6021p.m6526U(1010907014);
        if (i10 == 0 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC9746I4.m10337a(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), null, null, false, null, null, null, false, C19841d.f62922Z, c6021p, 100663302, 254);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2446D(i10, 24);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8881e(C19849l c19849l, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1867843513);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c19849l) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k2) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            List list = c19849l.f62938b;
            InterfaceC10459q interfaceC10459qM11258r = AbstractC10844c.m11258r(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), null, 3);
            c6021p.m6524S(1813282826);
            boolean zM6545h = ((i11 & 14) == 4) | c6021p.m6545h(list) | ((i11 & 112) == 32);
            String str = c19849l.f62939c;
            boolean zM6542f = zM6545h | c6021p.m6542f(str) | ((i11 & 896) == 256);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                Object c0362w = new C0362w(list, str, c19849l, interfaceC1436k, interfaceC1436k2);
                c6021p.m6537c0(c0362w);
                objM6514H = c0362w;
            }
            c6021p.m6553p(false);
            AbstractC9746I4.m10337a(interfaceC10459qM11258r, null, null, false, null, null, null, false, (InterfaceC1436k) objM6514H, c6021p, 6, 254);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C19843f(c19849l, interfaceC1436k, interfaceC1436k2, i10, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m8882f(ArrayDeque arrayDeque, int i10) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i10 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m8883g(C2374d c2374d) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i10);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < iMin2) {
                int i12 = c2374d.read(bArr, i11, iMin2 - i11);
                if (i12 == -1) {
                    return m8882f(arrayDeque, i10);
                }
                i11 += i12;
                i10 += i12;
            }
            long j10 = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j10 > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j10 < -2147483648L ? Integer.MIN_VALUE : (int) j10;
            }
        }
        if (c2374d.read() == -1) {
            return m8882f(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* JADX INFO: renamed from: h */
    public static final AbstractC10345O m8884h(PurchasesError purchasesError) {
        AbstractC10345O c10344n;
        AbstractC16544l.m18094g(purchasesError, "<this>");
        int i10 = AbstractC11749c.f35629a[purchasesError.getCode().ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            Integer numValueOf = Integer.valueOf(purchasesError.getCode().getCode());
            String message = purchasesError.getMessage();
            String underlyingErrorMessage = purchasesError.getUnderlyingErrorMessage();
            c10344n = new C10344N(numValueOf, message, underlyingErrorMessage != null ? new Exception(underlyingErrorMessage) : null);
        } else if (i10 != 3) {
            Integer numValueOf2 = Integer.valueOf(purchasesError.getCode().getCode());
            String message2 = purchasesError.getMessage();
            String underlyingErrorMessage2 = purchasesError.getUnderlyingErrorMessage();
            c10344n = new C10341K(numValueOf2, message2, underlyingErrorMessage2 != null ? new Exception(underlyingErrorMessage2) : null);
        } else {
            Integer numValueOf3 = Integer.valueOf(purchasesError.getCode().getCode());
            String message3 = purchasesError.getMessage();
            String underlyingErrorMessage3 = purchasesError.getUnderlyingErrorMessage();
            c10344n = new C10343M(numValueOf3, message3, underlyingErrorMessage3 != null ? new Exception(underlyingErrorMessage3) : null);
        }
        return c10344n;
    }
}
