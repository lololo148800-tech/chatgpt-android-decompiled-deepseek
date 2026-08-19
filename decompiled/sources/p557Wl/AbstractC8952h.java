package p557Wl;

import android.gov.nist.javax.sdp.MediaDescriptionImpl;
import android.gov.nist.javax.sdp.fields.AttributeField;
import java.util.ArrayList;
import java.util.Vector;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p1113xn.C21317k;
import p1113xn.C21319m;
import p1160zp.AbstractC22225a;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p867l8.C16831c;
import p909nm.C17662G;

/* JADX INFO: renamed from: Wl.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8952h {

    /* JADX INFO: renamed from: a */
    public static final C21319m f27371a = new C21319m("(\\d*) ([\\w\\-.]*)(?:\\s*/(\\d*)(?:\\s*/(\\S*))?)?");

    /* JADX INFO: renamed from: b */
    public static final C21319m f27372b = new C21319m("(\\d*) ([\\S| ]*)");

    /* JADX INFO: renamed from: c */
    public static final C21319m f27373c = new C21319m("(\\d+)(?:/(\\w+))?(?: (urn:ietf:params:rtp-hdrext:encrypt))? (\\S*)(?: (\\S*))?");

    /* JADX INFO: renamed from: a */
    public static final ArrayList m9569a(MediaDescriptionImpl mediaDescriptionImpl) {
        C8958n c8958n;
        Vector attributes = mediaDescriptionImpl.getAttributes(true);
        AbstractC16544l.m18093f(attributes, "getAttributes(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : attributes) {
            if (obj instanceof AttributeField) {
                arrayList.add(obj);
            }
        }
        ArrayList<AttributeField> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (AbstractC16544l.m18089b(((AttributeField) obj2).getAttribute().getName(), "rtpmap")) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (AttributeField attributeField : arrayList2) {
            String value = attributeField.getValue();
            AbstractC16544l.m18093f(value, "getValue(...)");
            C21317k c21317kM21663c = f27371a.m21663c(value);
            C17309l c17309l = null;
            if (c21317kM21663c == null) {
                c8958n = null;
            } else {
                String str = (String) ((C17662G) c21317kM21663c.m21657a()).get(1);
                String str2 = (String) ((C17662G) c21317kM21663c.m21657a()).get(2);
                String str3 = (String) ((C17662G) c21317kM21663c.m21657a()).get(3);
                String str4 = (String) ((C17662G) c21317kM21663c.m21657a()).get(4);
                long j10 = Long.parseLong(str);
                AbstractC16544l.m18094g(str3, "str");
                c8958n = new C8958n(j10, str2, str3.length() == 0 ? null : Long.valueOf(Long.parseLong(str3)), m9570b(str4));
            }
            if (c8958n == null) {
                C8395g c8395g = AbstractC8396h.Companion;
                EnumC8397i enumC8397i = EnumC8397i.f26119p0;
                AbstractC8396h.Companion.getClass();
                if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                    attributeField.encode();
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18571j(new Object[0]);
                }
            } else {
                c17309l = new C17309l(attributeField, c8958n);
            }
            if (c17309l != null) {
                arrayList3.add(c17309l);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: b */
    public static final String m9570b(String str) {
        AbstractC16544l.m18094g(str, "str");
        if (str.length() == 0) {
            return null;
        }
        return str;
    }
}
