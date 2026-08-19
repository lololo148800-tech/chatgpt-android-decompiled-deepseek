package p381Pe;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11153a0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p479Td.C7351f0;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: Pe.h */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6397h<ID, T> {
    public static final C6396g Companion = new C6396g();

    /* JADX INFO: renamed from: e */
    public static final PluginGeneratedSerialDescriptor f20818e;

    /* JADX INFO: renamed from: a */
    public final Object f20819a;

    /* JADX INFO: renamed from: b */
    public final Object f20820b;

    /* JADX INFO: renamed from: c */
    public final List f20821c;

    /* JADX INFO: renamed from: d */
    public final Object f20822d;

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.util.TreeNode", null, 4);
        pluginGeneratedSerialDescriptor.m18453j(ParameterNames.f31999ID, false);
        pluginGeneratedSerialDescriptor.m18453j("parent", true);
        pluginGeneratedSerialDescriptor.m18453j("children", true);
        pluginGeneratedSerialDescriptor.m18453j("content", false);
        f20818e = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ C6397h(int i10, Object obj, Object obj2, Object obj3, List list) {
        if (9 != (i10 & 9)) {
            AbstractC11153a0.m12389l(i10, 9, f20818e);
            throw null;
        }
        this.f20819a = obj;
        if ((i10 & 2) == 0) {
            this.f20820b = null;
        } else {
            this.f20820b = obj2;
        }
        if ((i10 & 4) == 0) {
            this.f20821c = C17689w.f56480Y;
        } else {
            this.f20821c = list;
        }
        this.f20822d = obj3;
    }

    /* JADX INFO: renamed from: a */
    public static C6397h m7033a(C6397h c6397h, Object obj, Object obj2, ArrayList arrayList, C7351f0 c7351f0, int i10) {
        if ((i10 & 1) != 0) {
            obj = c6397h.f20819a;
        }
        if ((i10 & 2) != 0) {
            obj2 = c6397h.f20820b;
        }
        List children = arrayList;
        if ((i10 & 4) != 0) {
            children = c6397h.f20821c;
        }
        Object content = c7351f0;
        if ((i10 & 8) != 0) {
            content = c6397h.f20822d;
        }
        c6397h.getClass();
        AbstractC16544l.m18094g(children, "children");
        AbstractC16544l.m18094g(content, "content");
        return new C6397h(obj, obj2, children, content);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6397h)) {
            return false;
        }
        C6397h c6397h = (C6397h) obj;
        return AbstractC16544l.m18089b(this.f20819a, c6397h.f20819a) && AbstractC16544l.m18089b(this.f20820b, c6397h.f20820b) && AbstractC16544l.m18089b(this.f20821c, c6397h.f20821c) && AbstractC16544l.m18089b(this.f20822d, c6397h.f20822d);
    }

    public final int hashCode() {
        Object obj = this.f20819a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f20820b;
        return this.f20822d.hashCode() + AbstractC14376f.m15858x(this.f20821c, (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "█";
    }

    public C6397h(Object obj, Object obj2, List children, Object content) {
        AbstractC16544l.m18094g(children, "children");
        AbstractC16544l.m18094g(content, "content");
        this.f20819a = obj;
        this.f20820b = obj2;
        this.f20821c = children;
        this.f20822d = content;
    }
}
