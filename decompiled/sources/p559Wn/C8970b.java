package p559Wn;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p571X9.AbstractC9393x3;

/* JADX INFO: renamed from: Wn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8970b extends C8976h {

    /* JADX INFO: renamed from: Y */
    public final List f27405Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8970b(List missingFields, String str, C8970b c8970b) {
        super(str, c8970b);
        AbstractC16544l.m18094g(missingFields, "missingFields");
        this.f27405Y = missingFields;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8970b(String serialName, ArrayList arrayList) {
        String str;
        AbstractC16544l.m18094g(serialName, "serialName");
        if (arrayList.size() == 1) {
            str = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(arrayList, str, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8970b(String str, String serialName) {
        this(AbstractC9393x3.m9974d(str), AbstractC0010F.m20d("Field '", str, "' is required for type with serial name '", serialName, "', but it was missing"), null);
        AbstractC16544l.m18094g(serialName, "serialName");
    }
}
