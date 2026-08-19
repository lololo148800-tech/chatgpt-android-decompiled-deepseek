package p109E3;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p013Ab.C0420b;
import p025An.AbstractC0575H;
import p1031u3.AbstractC20103f;
import p1031u3.C20099b;
import p1073w3.AbstractC20817s;
import p153Fn.C2925c;
import p341Ni.C5787j;

/* JADX INFO: renamed from: E3.O */
/* JADX INFO: loaded from: classes.dex */
public final class C2274O extends AbstractC20103f {

    /* JADX INFO: renamed from: i */
    public final C0420b f7038i;

    public C2274O(C0420b c0420b) {
        this.f7038i = c0420b;
    }

    @Override // p1031u3.InterfaceC20101d
    /* JADX INFO: renamed from: e */
    public final void mo3353e(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return;
        }
        int i10 = AbstractC20817s.f66106a;
        ByteBuffer buffer = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        C0420b c0420b = this.f7038i;
        c0420b.getClass();
        AbstractC16544l.m18094g(buffer, "buffer");
        if (c0420b.f1381Z != 0) {
            int iRemaining2 = buffer.remaining();
            int iMax = Math.max(1, iRemaining2 / 960);
            int i11 = iRemaining2 / iMax;
            ArrayList arrayList = new ArrayList();
            int i12 = c0420b.f1381Z / 960;
            int i13 = 0;
            while (i13 < iMax) {
                byte[] bArr = new byte[i13 == iMax + (-1) ? buffer.remaining() : i11];
                buffer.get(bArr);
                arrayList.add(bArr);
                i13++;
            }
            AbstractC0575H.m1156D((C2925c) c0420b.f1382o0, null, null, new C5787j(arrayList, c0420b, i12, null), 3);
        }
        m20939l(iRemaining).put(byteBuffer).flip();
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: i */
    public final void mo3355i() {
        m3361m();
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: j */
    public final void mo3356j() {
        m3361m();
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: k */
    public final void mo3357k() {
        m3361m();
    }

    /* JADX INFO: renamed from: m */
    public final void m3361m() {
        if (mo3352a()) {
            this.f7038i.f1381Z = this.f63647b.f63642a;
        }
    }

    @Override // p1031u3.AbstractC20103f
    /* JADX INFO: renamed from: h */
    public final C20099b mo3354h(C20099b c20099b) {
        return c20099b;
    }
}
