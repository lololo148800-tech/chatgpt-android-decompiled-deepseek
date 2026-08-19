package p544W9;

import androidx.fragment.app.OwC.wNrQXvwLiB;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p049Bm.InterfaceC1436k;
import p157G2.C2978d;
import p181H2.C3198a;
import p488Tn.C7518a;
import p488Tn.C7524g;
import p488Tn.InterfaceC7526i;
import p769gj.InterfaceC14167i;

/* JADX INFO: renamed from: W9.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8688p {
    /* JADX INFO: renamed from: a */
    public static final Exception m9385a(C3198a c3198a, String str, C2978d c2978d) {
        return new C2978d(c3198a, str);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9386b(Object me2, Object you) {
        AbstractC16544l.m18094g(me2, "me");
        AbstractC16544l.m18094g(you, "you");
        Class<?> cls = me2.getClass();
        C16527D c16527d = AbstractC16526C.f51263a;
        if (!c16527d.mo5693b(cls).equals(c16527d.mo5693b(you.getClass()))) {
            return false;
        }
        if (me2 instanceof InterfaceC14167i) {
            return AbstractC16544l.m18089b(((InterfaceC14167i) me2).mo6751b(), ((InterfaceC14167i) you).mo6751b());
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static final void m9387c(InterfaceC7526i interfaceC7526i, InterfaceC1436k interfaceC1436k) throws EOFException {
        AbstractC16544l.m18094g(interfaceC7526i, "<this>");
        AbstractC16544l.m18094g(interfaceC1436k, wNrQXvwLiB.wETGDXNOSi);
        C7518a c7518aMo7819b = interfaceC7526i.mo7819b();
        if (c7518aMo7819b.mo7821g()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        C7524g c7524g = c7518aMo7819b.f23839Y;
        AbstractC16544l.m18091d(c7524g);
        int i10 = c7524g.f23855b;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(c7524g.f23854a, i10, c7524g.f23856c - i10);
        AbstractC16544l.m18091d(byteBufferWrap);
        interfaceC1436k.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i10;
        if (iPosition != 0) {
            if (iPosition < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (iPosition > c7524g.m7828b()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            c7518aMo7819b.skip(iPosition);
        }
    }
}
