package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import p690cp.C12936v;
import p732en.C13446c;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C16612i extends ByteString {

    /* JADX INFO: renamed from: s0 */
    public static final int[] f52773s0;

    /* JADX INFO: renamed from: Y */
    public final int f52774Y;

    /* JADX INFO: renamed from: Z */
    public final ByteString f52775Z;

    /* JADX INFO: renamed from: o0 */
    public final ByteString f52776o0;

    /* JADX INFO: renamed from: p0 */
    public final int f52777p0;

    /* JADX INFO: renamed from: q0 */
    public final int f52778q0;

    /* JADX INFO: renamed from: r0 */
    public int f52779r0 = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f52773s0 = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f52773s0;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    public C16612i(ByteString byteString, ByteString byteString2) {
        this.f52775Z = byteString;
        this.f52776o0 = byteString2;
        int size = byteString.size();
        this.f52777p0 = size;
        this.f52774Y = byteString2.size() + size;
        this.f52778q0 = Math.max(byteString.mo18269j(), byteString2.mo18269j()) + 1;
    }

    public final boolean equals(Object obj) {
        int iMo18273r;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        int size = byteString.size();
        int i10 = this.f52774Y;
        if (i10 != size) {
            return false;
        }
        if (i10 == 0) {
            return true;
        }
        if (this.f52779r0 != 0 && (iMo18273r = byteString.mo18273r()) != 0 && this.f52779r0 != iMo18273r) {
            return false;
        }
        C12936v c12936v = new C12936v(this);
        C16610g c16610gM14599a = c12936v.m14599a();
        C12936v c12936v2 = new C12936v(byteString);
        C16610g c16610gM14599a2 = c12936v2.m14599a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int length = c16610gM14599a.f52768Y.length - i11;
            int length2 = c16610gM14599a2.f52768Y.length - i12;
            int iMin = Math.min(length, length2);
            if (!(i11 == 0 ? c16610gM14599a.m18305t(c16610gM14599a2, i12, iMin) : c16610gM14599a2.m18305t(c16610gM14599a, i11, iMin))) {
                return false;
            }
            i13 += iMin;
            if (i13 >= i10) {
                if (i13 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == length) {
                c16610gM14599a = c12936v.m14599a();
                i11 = 0;
            } else {
                i11 += iMin;
            }
            if (iMin == length2) {
                c16610gM14599a2 = c12936v2.m14599a();
                i12 = 0;
            } else {
                i12 += iMin;
            }
        }
    }

    public final int hashCode() {
        int iMo18271p = this.f52779r0;
        if (iMo18271p == 0) {
            int i10 = this.f52774Y;
            iMo18271p = mo18271p(i10, 0, i10);
            if (iMo18271p == 0) {
                iMo18271p = 1;
            }
            this.f52779r0 = iMo18271p;
        }
        return iMo18271p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: i */
    public final void mo18268i(int i10, int i11, int i12, byte[] bArr) {
        int i13 = i10 + i12;
        ByteString byteString = this.f52775Z;
        int i14 = this.f52777p0;
        if (i13 <= i14) {
            byteString.mo18268i(i10, i11, i12, bArr);
            return;
        }
        ByteString byteString2 = this.f52776o0;
        if (i10 >= i14) {
            byteString2.mo18268i(i10 - i14, i11, i12, bArr);
            return;
        }
        int i15 = i14 - i10;
        byteString.mo18268i(i10, i11, i15, bArr);
        byteString2.mo18268i(0, i11 + i15, i12 - i15, bArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean isValidUtf8() {
        int iMo18272q = this.f52775Z.mo18272q(0, 0, this.f52777p0);
        ByteString byteString = this.f52776o0;
        return byteString.mo18272q(iMo18272q, 0, byteString.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new C16611h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: j */
    public final int mo18269j() {
        return this.f52778q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: m */
    public final boolean mo18270m() {
        return this.f52774Y >= f52773s0[this.f52778q0];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(new C13446c(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: p */
    public final int mo18271p(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        ByteString byteString = this.f52775Z;
        int i14 = this.f52777p0;
        if (i13 <= i14) {
            return byteString.mo18271p(i10, i11, i12);
        }
        ByteString byteString2 = this.f52776o0;
        if (i11 >= i14) {
            return byteString2.mo18271p(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return byteString2.mo18271p(byteString.mo18271p(i10, i11, i15), 0, i12 - i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: q */
    public final int mo18272q(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        ByteString byteString = this.f52775Z;
        int i14 = this.f52777p0;
        if (i13 <= i14) {
            return byteString.mo18272q(i10, i11, i12);
        }
        ByteString byteString2 = this.f52776o0;
        if (i11 >= i14) {
            return byteString2.mo18272q(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return byteString2.mo18272q(byteString.mo18272q(i10, i11, i15), 0, i12 - i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: r */
    public final int mo18273r() {
        return this.f52779r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: s */
    public final void mo18274s(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        ByteString byteString = this.f52775Z;
        int i13 = this.f52777p0;
        if (i12 <= i13) {
            byteString.mo18274s(outputStream, i10, i11);
            return;
        }
        ByteString byteString2 = this.f52776o0;
        if (i10 >= i13) {
            byteString2.mo18274s(outputStream, i10 - i13, i11);
            return;
        }
        int i14 = i13 - i10;
        byteString.mo18274s(outputStream, i10, i14);
        byteString2.mo18274s(outputStream, 0, i11 - i14);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int size() {
        return this.f52774Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final String toString(String str) {
        return new String(toByteArray(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new C16611h(this);
    }
}
