package p398Q8;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p025An.C0644w;

/* JADX INFO: renamed from: Q8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6581a extends C0644w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6581a(long j10, long j11, char c9, String message) {
        super(message + " [rowNum = " + j10 + ", colIndex = " + j11 + ", char = " + c9 + ']', 8);
        AbstractC16544l.m18094g(message, "message");
    }

    public C6581a(int i10, int i11, int i12) {
        super(AbstractC12107L1.m13826q(AbstractC0010F.m21e("Fields num seems to be ", i10, " on each row, but on ", i12, "th csv row, fields num is "), i11, '.'), 8);
    }
}
