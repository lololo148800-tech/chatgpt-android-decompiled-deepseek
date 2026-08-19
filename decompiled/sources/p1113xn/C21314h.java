package p1113xn;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: xn.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C21314h {

    /* JADX INFO: renamed from: d */
    public static final C21314h f67742d;

    /* JADX INFO: renamed from: a */
    public final boolean f67743a;

    /* JADX INFO: renamed from: b */
    public final C21312f f67744b;

    /* JADX INFO: renamed from: c */
    public final C21313g f67745c;

    static {
        C21312f c21312f = C21312f.f67737c;
        C21313g c21313g = C21313g.f67740b;
        f67742d = new C21314h(false, c21312f, c21313g);
        new C21314h(true, c21312f, c21313g);
    }

    public C21314h(boolean z6, C21312f bytes, C21313g number) {
        AbstractC16544l.m18094g(bytes, "bytes");
        AbstractC16544l.m18094g(number, "number");
        this.f67743a = z6;
        this.f67744b = bytes;
        this.f67745c = number;
    }

    public final String toString() {
        StringBuilder sbM9893l = AbstractC9306j0.m9893l("HexFormat(\n    upperCase = ");
        sbM9893l.append(this.f67743a);
        sbM9893l.append(",\n    bytes = BytesHexFormat(\n");
        this.f67744b.m21655a("        ", sbM9893l);
        sbM9893l.append('\n');
        sbM9893l.append("    ),");
        sbM9893l.append('\n');
        sbM9893l.append("    number = NumberHexFormat(");
        sbM9893l.append('\n');
        this.f67745c.m21656a("        ", sbM9893l);
        sbM9893l.append('\n');
        sbM9893l.append("    )");
        sbM9893l.append('\n');
        sbM9893l.append(Separators.RPAREN);
        return sbM9893l.toString();
    }
}
