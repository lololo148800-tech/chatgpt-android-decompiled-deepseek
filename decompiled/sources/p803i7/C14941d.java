package p803i7;

import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p001A.AbstractC0010F;
import p035B7.C0846c;
import p087D7.C1975b;
import p160G5.p161rK.TVCuK;
import p523V9.AbstractC7889G0;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p749fd.C13628m;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: i7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C14941d implements InterfaceC14938a {

    /* JADX INFO: renamed from: c */
    public static final Set f46551c = AbstractC17678l.m19293P(new String[]{TVCuK.dxp, "device", "source", ReferencesHeader.SERVICE});

    /* JADX INFO: renamed from: a */
    public final InterfaceC11256c f46552a;

    /* JADX INFO: renamed from: b */
    public final List f46553b;

    public C14941d(InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f46552a = internalLogger;
        this.f46553b = AbstractC17681o.m19382k(C14939b.f46542Z, C14939b.f46543o0, C14939b.f46544p0, C14939b.f46545q0, C14939b.f46546r0, new C13628m(this, 17));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final LinkedHashMap m16098a(Map attributes, String str, String str2, Set reservedKeys) {
        int i10;
        EnumC11255b enumC11255b;
        C17309l c17309l;
        AbstractC16544l.m18094g(attributes, "attributes");
        AbstractC16544l.m18094g(reservedKeys, "reservedKeys");
        char c9 = '.';
        if (str != null) {
            int i11 = 0;
            for (int i12 = 0; i12 < str.length(); i12++) {
                if (str.charAt(i12) == '.') {
                    i11++;
                }
            }
            i10 = i11 + 1;
        } else {
            i10 = 0;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = attributes.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC11255b = EnumC11255b.f34098Y;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() == null) {
                AbstractC7889G0.m8184b(this.f46552a, 5, enumC11255b, new C1975b(entry, 1), null, false, 56);
            } else {
                if (reservedKeys.contains(entry.getKey())) {
                    AbstractC7889G0.m8184b(this.f46552a, 5, enumC11255b, new C1975b(entry, 2), null, false, 56);
                } else {
                    String str3 = (String) entry.getKey();
                    ArrayList arrayList2 = new ArrayList(str3.length());
                    int i13 = 0;
                    int i14 = i10;
                    while (i13 < str3.length()) {
                        char cCharAt = str3.charAt(i13);
                        if (cCharAt == c9 && (i14 = i14 + 1) > 9) {
                            cCharAt = '_';
                        }
                        arrayList2.add(Character.valueOf(cCharAt));
                        i13++;
                        c9 = '.';
                    }
                    String str4 = new String(AbstractC17680n.m19375y0(arrayList2));
                    if (!str4.equals(entry.getKey())) {
                        AbstractC7889G0.m8184b(this.f46552a, 4, enumC11255b, new C14940c(entry, str4, 0), null, false, 56);
                    }
                    c17309l = new C17309l(str4, entry.getValue());
                }
                if (c17309l != null) {
                    arrayList.add(c17309l);
                }
                c9 = '.';
            }
            c17309l = null;
            if (c17309l != null) {
                arrayList.add(c17309l);
            }
            c9 = '.';
        }
        int size = arrayList.size() - 128;
        if (size > 0) {
            AbstractC7889G0.m8184b(this.f46552a, 4, enumC11255b, new C0846c(str2 != null ? "Too many attributes were added for [" + str2 + "], " + size + " had to be discarded." : AbstractC0010F.m19c(size, "Too many attributes were added, ", " had to be discarded."), 21), null, false, 56);
        }
        List listM19373w0 = AbstractC17680n.m19373w0(arrayList, 128);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC17659D.m19251m(linkedHashMap, listM19373w0);
        return linkedHashMap;
    }
}
