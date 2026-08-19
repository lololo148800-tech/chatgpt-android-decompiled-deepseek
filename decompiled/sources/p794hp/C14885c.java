package p794hp;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import p667bp.AbstractC11538a;

/* JADX INFO: renamed from: hp.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C14885c {

    /* JADX INFO: renamed from: c */
    public static final Map f46366c = Collections.emptyMap();

    /* JADX INFO: renamed from: a */
    public final StringBuilder f46367a;

    /* JADX INFO: renamed from: b */
    public char f46368b = 0;

    public C14885c(StringBuilder sb2) {
        this.f46367a = sb2;
    }

    /* JADX INFO: renamed from: a */
    public final void m16062a(String str) {
        try {
            this.f46367a.append((CharSequence) str);
            int length = str.length();
            if (length != 0) {
                this.f46368b = str.charAt(length - 1);
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16063b() {
        char c9 = this.f46368b;
        if (c9 == 0 || c9 == '\n') {
            return;
        }
        m16062a(Separators.RETURN);
    }

    /* JADX INFO: renamed from: c */
    public final void m16064c(String str) {
        m16065d(str, f46366c, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m16065d(String str, Map map, boolean z6) {
        m16062a(Separators.LESS_THAN);
        m16062a(str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                m16062a(Separators.f31991SP);
                m16062a(AbstractC11538a.m12928a((String) entry.getKey()));
                if (entry.getValue() != null) {
                    m16062a("=\"");
                    m16062a(AbstractC11538a.m12928a((String) entry.getValue()));
                    m16062a(Separators.DOUBLE_QUOTE);
                }
            }
        }
        if (z6) {
            m16062a(" /");
        }
        m16062a(Separators.GREATER_THAN);
    }
}
