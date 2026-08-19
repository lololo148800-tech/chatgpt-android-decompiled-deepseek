package p978r1;

import android.content.Context;
import android.media.Image;
import android.view.KeyEvent;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bf.C11391s;
import com.openai.feature.gizmos.impl.settings.GizmoSettingsViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.nio.ByteBuffer;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p042Bf.C1282x;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2062k;
import p124Ei.C2467N0;
import p193Hf.C3313J;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3914G1;
import p243Jf.C4334d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p479Td.AbstractC7360k;
import p482Tg.C7445b0;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p550We.C8829j;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p622Ze.AbstractC10286d;
import p622Ze.C10288f;
import p622Ze.C10290h;
import p622Ze.C10291i;
import p622Ze.C10298p;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: r1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18857c {
    /* JADX INFO: renamed from: a */
    public static final void m20154a(InterfaceC10459q interfaceC10459q, GizmoSettingsViewModel gizmoSettingsViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        InterfaceC10459q interfaceC10459q2;
        GizmoSettingsViewModel gizmoSettingsViewModel2;
        c6021p.m6526U(-2060199781);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            gizmoSettingsViewModel2 = gizmoSettingsViewModel;
        } else {
            c6021p.m6519N();
            int i13 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i13 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C10298p.class));
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
                Object objMo5693b = c16527d.mo5693b(GizmoSettingsViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C10298p.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C10298p.class), c16527d.mo5693b(GizmoSettingsViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(GizmoSettingsViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-113);
                interfaceC10459q2 = c10456n;
                gizmoSettingsViewModel2 = (GizmoSettingsViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                i11 = i12 & (-113);
                interfaceC10459q2 = interfaceC10459q;
                gizmoSettingsViewModel2 = gizmoSettingsViewModel;
            }
            c6021p.m6554q();
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            C10298p c10298p = (C10298p) AbstractC9112C3.m9642d(gizmoSettingsViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(-510252007);
            boolean zM6542f2 = c6021p.m6542f(gizmoSettingsViewModel2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C7445b0(1, gizmoSettingsViewModel2, GizmoSettingsViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 8);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            int i14 = (i11 & 14) | 199680;
            AbstractC8662k3.m9350a(interfaceC10459q2, null, 0L, AbstractC8411c.m8969c(651761220, c6021p, new C4334d(c8870f, 23)), false, AbstractC8411c.m8969c(617305055, c6021p, new C10290h(c10298p, (InterfaceC3759g) objM6514H2, 0)), c6021p, i14, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10291i(interfaceC10459q2, gizmoSettingsViewModel2, i10, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m20155b(boolean z6, C8829j c8829j, C11391s c11391s, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-1205806801);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c8829j) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? c6021p.m6542f(c11391s) : c6021p.m6545h(c11391s) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        int i12 = i11 | 24576;
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            AbstractC3914G1.m4611a(AbstractC8411c.m8969c(-1462264563, c6021p, new C10288f(c11391s, 0)), c10456n, null, null, null, AbstractC8411c.m8969c(-143779438, c6021p, new C3313J(c8829j, interfaceC1436k, z6)), null, 0.0f, 0.0f, c6021p, ((i12 >> 9) & 112) | 196614, 476);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2467N0(z6, c8829j, c11391s, interfaceC1436k, interfaceC10459q2, i10, 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m20156c(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-52726903);
        int i11 = i10 | 6;
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            AbstractC3914G1.m4611a(AbstractC10286d.f30550b, interfaceC10459q2, null, null, null, AbstractC10286d.f30552d, null, 0.0f, 0.0f, c6021p, ((i11 << 3) & 112) | 196614, 476);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q2, i10, 25);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final long m20157d(KeyEvent keyEvent) {
        return AbstractC7360k.m7784a(keyEvent.getKeyCode());
    }

    /* JADX INFO: renamed from: e */
    public static final int m20158e(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: f */
    public static void m20159f(Image.Plane plane, int i10, int i11, byte[] bArr, int i12, int i13) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i14 = i10 / (i11 / rowStride);
        int rowStride2 = 0;
        for (int i15 = 0; i15 < rowStride; i15++) {
            int pixelStride = rowStride2;
            for (int i16 = 0; i16 < i14; i16++) {
                bArr[i12] = buffer.get(pixelStride);
                i12 += i13;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }
}
