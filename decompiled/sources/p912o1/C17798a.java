package p912o1;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p784hb.C14438g;
import p955q2.AbstractC18610b;

/* JADX INFO: renamed from: o1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C17798a {

    /* JADX INFO: renamed from: a */
    public final XmlResourceParser f56783a;

    /* JADX INFO: renamed from: b */
    public int f56784b = 0;

    /* JADX INFO: renamed from: c */
    public final C14438g f56785c;

    public C17798a(XmlResourceParser xmlResourceParser) {
        this.f56783a = xmlResourceParser;
        C14438g c14438g = new C14438g();
        c14438g.f45414Y = new float[64];
        this.f56785c = c14438g;
    }

    /* JADX INFO: renamed from: a */
    public final float m19547a(TypedArray typedArray, String str, int i10, float f10) {
        if (AbstractC18610b.m19961e(this.f56783a, str)) {
            f10 = typedArray.getFloat(i10, f10);
        }
        m19548b(typedArray.getChangingConfigurations());
        return f10;
    }

    /* JADX INFO: renamed from: b */
    public final void m19548b(int i10) {
        this.f56784b = i10 | this.f56784b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17798a)) {
            return false;
        }
        C17798a c17798a = (C17798a) obj;
        return AbstractC16544l.m18089b(this.f56783a, c17798a.f56783a) && this.f56784b == c17798a.f56784b;
    }

    public final int hashCode() {
        return (this.f56783a.hashCode() * 31) + this.f56784b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f56783a);
        sb2.append(", config=");
        return AbstractC12107L1.m13826q(sb2, this.f56784b, ')');
    }
}
