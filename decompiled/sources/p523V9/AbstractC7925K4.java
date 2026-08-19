package p523V9;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p042Bf.C1269k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p124Ei.C2497c;
import p124Ei.C2500d;
import p229J0.AbstractC4152w2;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p697d5.AbstractC13025h;
import p697d5.C13020c;
import p697d5.C13024g;
import p855kj.AbstractC16428g;
import p855kj.C16424c;
import p855kj.C16425d;
import p855kj.C16426e;
import p855kj.C16427f;

/* JADX INFO: renamed from: V9.K4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7925K4 {
    /* JADX INFO: renamed from: a */
    public static final void m8213a(C2500d state, InterfaceC1426a onDismiss, InterfaceC1436k onAudioDeviceChange, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        AbstractC16544l.m18094g(onAudioDeviceChange, "onAudioDeviceChange");
        c6021p.m6526U(569187015);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(state) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onDismiss) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onAudioDeviceChange) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            AbstractC4152w2.m4780a(onDismiss, c10456n, null, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(954135908, c6021p, new C2497c(state, onAudioDeviceChange, onDismiss, ((C8870f) c6021p.m6548k(AbstractC8873i.f27157a)).f27148a, 0)), c6021p, ((i12 >> 3) & 14) | ((i12 >> 6) & 112), 384, 4092);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(state, onDismiss, onAudioDeviceChange, interfaceC10459q2, i10, 2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m8214e(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    /* JADX INFO: renamed from: f */
    public static final int m8215f(AbstractC16428g abstractC16428g) {
        AbstractC16544l.m18094g(abstractC16428g, "<this>");
        if (abstractC16428g instanceof C16424c) {
            return R.drawable.bluetooth;
        }
        if (abstractC16428g instanceof C16427f) {
            return R.drawable.headphones;
        }
        if (abstractC16428g instanceof C16425d) {
            return R.drawable.phone;
        }
        if (abstractC16428g instanceof C16426e) {
            return R.drawable.sound_on;
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo8216b(AbstractC13025h abstractC13025h, C13020c c13020c, C13020c c13020c2);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo8217c(AbstractC13025h abstractC13025h, Object obj, Object obj2);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo8218d(AbstractC13025h abstractC13025h, C13024g c13024g, C13024g c13024g2);

    /* JADX INFO: renamed from: g */
    public abstract void mo8219g(C13024g c13024g, C13024g c13024g2);

    /* JADX INFO: renamed from: h */
    public abstract void mo8220h(C13024g c13024g, Thread thread);
}
