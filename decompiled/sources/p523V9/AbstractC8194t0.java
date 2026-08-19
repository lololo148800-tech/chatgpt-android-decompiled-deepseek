package p523V9;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.glance.appwidget.protobuf.C11042g;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.conversations.impl.conversation.ConversationViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import ge.C14111x0;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.AbstractC0233b1;
import p003A1.C0286s;
import p017Af.C0495z;
import p025An.C0644w;
import p039Bc.C0871e;
import p039Bc.C0886t;
import p049Bm.InterfaceC1426a;
import p098Di.InterfaceC2062k;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.InterfaceC5985X;
import p492U1.InterfaceC7537b;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8577W2;
import p544W9.AbstractC8662k3;
import p547Wc.C8775T;
import p547Wc.EnumC8776U;
import p571X9.AbstractC9245Z;
import p594Y9.AbstractC9834X3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p999s.AbstractC19332Z0;
import p999s.ViewOnLongClickListenerC19338b1;

/* JADX INFO: renamed from: V9.t0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8194t0 {
    /* JADX INFO: renamed from: a */
    public static final void m8795a(boolean z6, InterfaceC10459q interfaceC10459q, ConversationViewModel conversationViewModel, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        ConversationViewModel conversationViewModel2;
        int i12;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        ConversationViewModel conversationViewModel3;
        c6021p.m6526U(-1285916732);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i13 = i11 | 48;
        if ((i10 & 384) == 0) {
            i13 = i11 | 176;
        }
        if ((i13 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            conversationViewModel3 = conversationViewModel;
        } else {
            c6021p.m6519N();
            int i14 = i10 & 1;
            Object obj = C6013l.f19514a;
            C10456n c10456n = C10456n.f30959Y;
            boolean z10 = true;
            if (i14 == 0 || c6021p.m6561x()) {
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
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
                Object objMo5693b = c16527d.mo5693b(ConversationViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    z10 = true;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    z10 = true;
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                conversationViewModel2 = (ConversationViewModel) baseViewModel;
                i12 = i13 & (-897);
                interfaceC10459q2 = c10456n;
            } else {
                c6021p.m6517L();
                i12 = i13 & (-897);
                interfaceC10459q2 = interfaceC10459q;
                conversationViewModel2 = conversationViewModel;
            }
            c6021p.m6554q();
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj) {
                objM6514H2 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            Object obj2 = ((C6035w) objM6514H2).f19668Y;
            InterfaceC5985X interfaceC5985XM10480c = AbstractC9834X3.m10480c(new Object[0], C8775T.f26766c, C0871e.f2560q0, c6021p, 3072);
            if (((C8775T) interfaceC5985XM10480c.getValue()).m9529a() == EnumC8776U.f26769Y) {
                z10 = false;
            }
            c6021p.m6524S(-532483104);
            boolean zM6545h = c6021p.m6545h(obj2) | c6021p.m6542f(interfaceC5985XM10480c);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h || objM6514H3 == obj) {
                objM6514H3 = new C0286s(obj2, 9, interfaceC5985XM10480c);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC8577W2.m9239a(0, 0, (InterfaceC1426a) objM6514H3, c6021p, z10);
            c6021p.m6524S(-532470832);
            Object objM6514H4 = c6021p.m6514H();
            if (objM6514H4 == obj) {
                objM6514H4 = C5997d.m6429P(0);
                c6021p.m6537c0(objM6514H4);
            }
            C5996c0 c5996c0 = (C5996c0) objM6514H4;
            c6021p.m6553p(false);
            int iM6412g = c5996c0.m6412g();
            c6021p.m6524S(1490738457);
            float fM9819a = AbstractC9245Z.m9819a(iM6412g, (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f));
            c6021p.m6553p(false);
            AbstractC8662k3.m9350a(interfaceC10459q2, AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, 0.0f, fM9819a, 7), 0L, null, false, AbstractC8411c.m8969c(-695205112, c6021p, new C0495z(conversationViewModel2, interfaceC5985XM10480c, z6, c5996c0)), c6021p, ((i12 >> 3) & 14) | 221184, 12);
            interfaceC10459q3 = interfaceC10459q2;
            conversationViewModel3 = conversationViewModel2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0886t(z6, interfaceC10459q3, conversationViewModel3, i10, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m8796b(C11042g c11042g) {
        StringBuilder sb2 = new StringBuilder(c11042g.size());
        for (int i10 = 0; i10 < c11042g.size(); i10++) {
            byte bMo12001f = c11042g.mo12001f(i10);
            if (bMo12001f == 34) {
                sb2.append("\\\"");
            } else if (bMo12001f == 39) {
                sb2.append("\\'");
            } else if (bMo12001f != 92) {
                switch (bMo12001f) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bMo12001f < 32 || bMo12001f > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bMo12001f >>> 6) & 3) + 48));
                            sb2.append((char) (((bMo12001f >>> 3) & 7) + 48));
                            sb2.append((char) ((bMo12001f & 7) + 48));
                        } else {
                            sb2.append((char) bMo12001f);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static void m8797c(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC19332Z0.m20432a(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC19338b1 viewOnLongClickListenerC19338b1 = ViewOnLongClickListenerC19338b1.f61242w0;
        if (viewOnLongClickListenerC19338b1 != null && viewOnLongClickListenerC19338b1.f61244Y == view) {
            ViewOnLongClickListenerC19338b1.m20435b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC19338b1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC19338b1 viewOnLongClickListenerC19338b2 = ViewOnLongClickListenerC19338b1.f61243x0;
        if (viewOnLongClickListenerC19338b2 != null && viewOnLongClickListenerC19338b2.f61244Y == view) {
            viewOnLongClickListenerC19338b2.m20436a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
