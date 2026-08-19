package p606Yn;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p909nm.C17689w;

/* JADX INFO: renamed from: Yn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C10100a {

    /* JADX INFO: renamed from: a */
    public final String f29898a;

    /* JADX INFO: renamed from: b */
    public List f29899b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f29900c;

    /* JADX INFO: renamed from: d */
    public final HashSet f29901d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f29902e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f29903f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f29904g;

    public C10100a(String serialName) {
        AbstractC16544l.m18094g(serialName, "serialName");
        this.f29898a = serialName;
        this.f29899b = C17689w.f56480Y;
        this.f29900c = new ArrayList();
        this.f29901d = new HashSet();
        this.f29902e = new ArrayList();
        this.f29903f = new ArrayList();
        this.f29904g = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m10678a(String elementName, SerialDescriptor descriptor, List annotations, boolean z6) {
        AbstractC16544l.m18094g(elementName, "elementName");
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(annotations, "annotations");
        if (!this.f29901d.add(elementName)) {
            StringBuilder sbM11058p = AbstractC10763a.m11058p("Element with name '", elementName, "' is already registered in ");
            sbM11058p.append(this.f29898a);
            throw new IllegalArgumentException(sbM11058p.toString().toString());
        }
        this.f29900c.add(elementName);
        this.f29902e.add(descriptor);
        this.f29903f.add(annotations);
        this.f29904g.add(Boolean.valueOf(z6));
    }
}
