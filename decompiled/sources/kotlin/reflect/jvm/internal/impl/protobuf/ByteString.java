package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import p604Yk.C10077b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ByteString implements Iterable<Byte> {
    public static final ByteString EMPTY = new C16610g(new byte[0]);

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    public static ByteString copyFrom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C16610g(bArr2);
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            return new C16610g(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static ByteString m18267f(Iterator it, int i10) {
        if (i10 == 1) {
            return (ByteString) it.next();
        }
        int i11 = i10 >>> 1;
        return m18267f(it, i11).concat(m18267f(it, i10 - i11));
    }

    public static Output newOutput() {
        return new Output();
    }

    public ByteString concat(ByteString byteString) {
        ByteString c16612i;
        int size = size();
        int size2 = byteString.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb2 = new StringBuilder(53);
            sb2.append("ByteString would be too long: ");
            sb2.append(size);
            sb2.append("+");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int[] iArr = C16612i.f52773s0;
        C16612i c16612i2 = this instanceof C16612i ? (C16612i) this : null;
        if (byteString.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return byteString;
        }
        int size3 = byteString.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = byteString.size();
            byte[] bArr = new byte[size4 + size5];
            copyTo(bArr, 0, 0, size4);
            byteString.copyTo(bArr, 0, size4, size5);
            return new C16610g(bArr);
        }
        if (c16612i2 != null) {
            ByteString byteString2 = c16612i2.f52776o0;
            if (byteString.size() + byteString2.size() < 128) {
                int size6 = byteString2.size();
                int size7 = byteString.size();
                byte[] bArr2 = new byte[size6 + size7];
                byteString2.copyTo(bArr2, 0, 0, size6);
                byteString.copyTo(bArr2, 0, size6, size7);
                return new C16612i(c16612i2.f52775Z, new C16610g(bArr2));
            }
        }
        if (c16612i2 != null) {
            ByteString byteString3 = c16612i2.f52775Z;
            int iMo18269j = byteString3.mo18269j();
            ByteString byteString4 = c16612i2.f52776o0;
            if (iMo18269j > byteString4.mo18269j()) {
                if (c16612i2.f52778q0 > byteString.mo18269j()) {
                    return new C16612i(byteString3, new C16612i(byteString4, byteString));
                }
            }
        }
        if (size3 >= C16612i.f52773s0[Math.max(mo18269j(), byteString.mo18269j()) + 1]) {
            c16612i = new C16612i(this, byteString);
        } else {
            C10077b c10077b = new C10077b(6);
            c10077b.m10657B(this);
            c10077b.m10657B(byteString);
            Stack stack = (Stack) c10077b.f29833Z;
            c16612i = (ByteString) stack.pop();
            while (!stack.isEmpty()) {
                c16612i = new C16612i((ByteString) stack.pop(), c16612i);
            }
        }
        return c16612i;
    }

    public void copyTo(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i12 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i13);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i12 > 0) {
                mo18268i(i10, i11, i12, bArr);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i14);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo18268i(int i10, int i11, int i12, byte[] bArr);

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    public abstract Iterator<Byte> iterator();

    /* JADX INFO: renamed from: j */
    public abstract int mo18269j();

    /* JADX INFO: renamed from: m */
    public abstract boolean mo18270m();

    public abstract CodedInputStream newCodedInput();

    /* JADX INFO: renamed from: p */
    public abstract int mo18271p(int i10, int i11, int i12);

    /* JADX INFO: renamed from: q */
    public abstract int mo18272q(int i10, int i11, int i12);

    /* JADX INFO: renamed from: r */
    public abstract int mo18273r();

    /* JADX INFO: renamed from: s */
    public abstract void mo18274s(OutputStream outputStream, int i10, int i11);

    public abstract int size();

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        mo18268i(0, 0, size, bArr);
        return bArr;
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String toString(String str);

    public String toStringUtf8() {
        try {
            return toString("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public static final class Output extends OutputStream {

        /* JADX INFO: renamed from: r0 */
        public static final byte[] f52711r0 = new byte[0];

        /* JADX INFO: renamed from: o0 */
        public int f52714o0;

        /* JADX INFO: renamed from: q0 */
        public int f52716q0;

        /* JADX INFO: renamed from: Y */
        public final int f52712Y = 128;

        /* JADX INFO: renamed from: Z */
        public final ArrayList f52713Z = new ArrayList();

        /* JADX INFO: renamed from: p0 */
        public byte[] f52715p0 = new byte[128];

        /* JADX INFO: renamed from: a */
        public final void m18275a(int i10) {
            this.f52713Z.add(new C16610g(this.f52715p0));
            int length = this.f52714o0 + this.f52715p0.length;
            this.f52714o0 = length;
            this.f52715p0 = new byte[Math.max(this.f52712Y, Math.max(i10, length >>> 1))];
            this.f52716q0 = 0;
        }

        /* JADX INFO: renamed from: e */
        public final void m18276e() {
            int i10 = this.f52716q0;
            byte[] bArr = this.f52715p0;
            int length = bArr.length;
            ArrayList arrayList = this.f52713Z;
            if (i10 >= length) {
                arrayList.add(new C16610g(this.f52715p0));
                this.f52715p0 = f52711r0;
            } else if (i10 > 0) {
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
                arrayList.add(new C16610g(bArr2));
            }
            this.f52714o0 += this.f52716q0;
            this.f52716q0 = 0;
        }

        public synchronized int size() {
            return this.f52714o0 + this.f52716q0;
        }

        public synchronized ByteString toByteString() {
            m18276e();
            return ByteString.copyFrom(this.f52713Z);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.f52716q0 == this.f52715p0.length) {
                    m18275a(1);
                }
                byte[] bArr = this.f52715p0;
                int i11 = this.f52716q0;
                this.f52716q0 = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f52715p0;
                int length = bArr2.length;
                int i12 = this.f52716q0;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f52716q0 += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    m18275a(i13);
                    System.arraycopy(bArr, i10 + length2, this.f52715p0, 0, i13);
                    this.f52716q0 = i13;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        ?? arrayList;
        if (!(iterable instanceof Collection)) {
            arrayList = new ArrayList();
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            arrayList = (Collection) iterable;
        }
        if (arrayList.isEmpty()) {
            return EMPTY;
        }
        return m18267f(arrayList.iterator(), arrayList.size());
    }
}
