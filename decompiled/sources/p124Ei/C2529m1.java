package p124Ei;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1155zi.C22025k2;
import p1155zi.C22057s2;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Ei.m1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2529m1 {

    /* JADX INFO: renamed from: a */
    public final String f7860a;

    /* JADX INFO: renamed from: b */
    public final String f7861b;

    /* JADX INFO: renamed from: c */
    public final List f7862c;

    /* JADX INFO: renamed from: d */
    public final Map f7863d;

    public C2529m1(String title, String description, Map analyticsProperties, List buttons) {
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(description, "description");
        AbstractC16544l.m18094g(buttons, "buttons");
        AbstractC16544l.m18094g(analyticsProperties, "analyticsProperties");
        this.f7860a = title;
        this.f7861b = description;
        this.f7862c = buttons;
        this.f7863d = analyticsProperties;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2529m1)) {
            return false;
        }
        C2529m1 c2529m1 = (C2529m1) obj;
        return AbstractC16544l.m18089b(this.f7860a, c2529m1.f7860a) && AbstractC16544l.m18089b(this.f7861b, c2529m1.f7861b) && AbstractC16544l.m18089b(this.f7862c, c2529m1.f7862c) && AbstractC16544l.m18089b(this.f7863d, c2529m1.f7863d);
    }

    public final int hashCode() {
        return this.f7863d.hashCode() + AbstractC14376f.m15858x(this.f7862c, AbstractC0168G.m527p(this.f7860a.hashCode() * 31, 31, this.f7861b), 31);
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2529m1(C22025k2 disabledMessage) {
        this(disabledMessage.f69673a, disabledMessage.f69674b, disabledMessage.f69676d, disabledMessage.f69675c);
        AbstractC16544l.m18094g(disabledMessage, "disabledMessage");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2529m1(C22057s2 disclosureMessage) {
        this(disclosureMessage.f69747a, disclosureMessage.f69748b, disclosureMessage.f69752f, disclosureMessage.f69750d);
        AbstractC16544l.m18094g(disclosureMessage, "disclosureMessage");
    }
}
