package p1031u3;

import com.google.protobuf.AbstractC12107L1;
import java.util.Arrays;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: u3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C20099b {

    /* JADX INFO: renamed from: e */
    public static final C20099b f63641e = new C20099b(-1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f63642a;

    /* JADX INFO: renamed from: b */
    public final int f63643b;

    /* JADX INFO: renamed from: c */
    public final int f63644c;

    /* JADX INFO: renamed from: d */
    public final int f63645d;

    public C20099b(int i10, int i11, int i12) {
        this.f63642a = i10;
        this.f63643b = i11;
        this.f63644c = i12;
        this.f63645d = AbstractC20817s.m21387A(i12) ? AbstractC20817s.m21420u(i12, i11) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20099b)) {
            return false;
        }
        C20099b c20099b = (C20099b) obj;
        return this.f63642a == c20099b.f63642a && this.f63643b == c20099b.f63643b && this.f63644c == c20099b.f63644c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f63642a), Integer.valueOf(this.f63643b), Integer.valueOf(this.f63644c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.f63642a);
        sb2.append(", channelCount=");
        sb2.append(this.f63643b);
        sb2.append(", encoding=");
        return AbstractC12107L1.m13826q(sb2, this.f63644c, ']');
    }
}
