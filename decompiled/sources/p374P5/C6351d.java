package p374P5;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.AbstractC0682p;
import p033B5.C0827k;
import p033B5.C0828l;
import p049Bm.InterfaceC1436k;
import p397Q5.EnumC6575d;
import p397Q5.EnumC6578g;
import p397Q5.InterfaceC6580i;
import p420R5.C6812c;
import p496U5.C7567i;
import p571X9.AbstractC9137G4;
import p658b5.C11234e;
import p909nm.C17690x;
import p972qm.C18777j;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: P5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6351d {

    /* JADX INFO: renamed from: a */
    public final Context f20621a;

    /* JADX INFO: renamed from: b */
    public C6352e f20622b;

    /* JADX INFO: renamed from: c */
    public Object f20623c;

    /* JADX INFO: renamed from: d */
    public C11234e f20624d;

    /* JADX INFO: renamed from: e */
    public final Map f20625e;

    /* JADX INFO: renamed from: f */
    public C6812c f20626f;

    /* JADX INFO: renamed from: g */
    public C18777j f20627g;

    /* JADX INFO: renamed from: h */
    public C18777j f20628h;

    /* JADX INFO: renamed from: i */
    public C18777j f20629i;

    /* JADX INFO: renamed from: j */
    public final C7567i f20630j;

    /* JADX INFO: renamed from: k */
    public final C7567i f20631k;

    /* JADX INFO: renamed from: l */
    public final C7567i f20632l;

    /* JADX INFO: renamed from: m */
    public InterfaceC6580i f20633m;

    /* JADX INFO: renamed from: n */
    public EnumC6578g f20634n;

    /* JADX INFO: renamed from: o */
    public EnumC6575d f20635o;

    /* JADX INFO: renamed from: p */
    public Object f20636p;

    public C6351d(Context context) {
        this.f20621a = context;
        this.f20622b = C6352e.f20637o;
        this.f20623c = null;
        this.f20624d = null;
        this.f20625e = C17690x.f56481Y;
        this.f20626f = null;
        this.f20627g = null;
        this.f20628h = null;
        this.f20629i = null;
        C7567i c7567i = C7567i.f23970Y;
        this.f20630j = c7567i;
        this.f20631k = c7567i;
        this.f20632l = c7567i;
        this.f20633m = null;
        this.f20634n = null;
        this.f20635o = null;
        this.f20636p = C0828l.f2308b;
    }

    /* JADX INFO: renamed from: a */
    public final C6354g m6972a() {
        Map mapM9681c;
        C0828l c0828l;
        Object obj = this.f20623c;
        if (obj == null) {
            obj = C6359l.f20696a;
        }
        Object obj2 = obj;
        C11234e c11234e = this.f20624d;
        Boolean bool = Boolean.FALSE;
        Map map = this.f20625e;
        if (AbstractC16544l.m18089b(map, bool)) {
            AbstractC16544l.m18092e(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
            mapM9681c = AbstractC9137G4.m9681c(AbstractC16529F.m18079c(map));
        } else {
            if (!(map instanceof Map)) {
                throw new AssertionError();
            }
            mapM9681c = map;
        }
        AbstractC16544l.m18092e(mapM9681c, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        C6352e c6352e = this.f20622b;
        AbstractC0682p abstractC0682p = c6352e.f20638a;
        C6812c c6812c = this.f20626f;
        EnumC6349b enumC6349b = c6352e.f20642e;
        EnumC6349b enumC6349b2 = c6352e.f20643f;
        EnumC6349b enumC6349b3 = c6352e.f20644g;
        InterfaceC18776i interfaceC18776i = this.f20627g;
        if (interfaceC18776i == null) {
            interfaceC18776i = c6352e.f20639b;
        }
        InterfaceC18776i interfaceC18776i2 = interfaceC18776i;
        InterfaceC18776i interfaceC18776i3 = this.f20628h;
        if (interfaceC18776i3 == null) {
            interfaceC18776i3 = c6352e.f20640c;
        }
        InterfaceC18776i interfaceC18776i4 = interfaceC18776i3;
        InterfaceC18776i interfaceC18776i5 = this.f20629i;
        if (interfaceC18776i5 == null) {
            interfaceC18776i5 = c6352e.f20641d;
        }
        InterfaceC18776i interfaceC18776i6 = interfaceC18776i5;
        InterfaceC1436k interfaceC1436k = this.f20630j;
        if (interfaceC1436k == null) {
            interfaceC1436k = c6352e.f20645h;
        }
        InterfaceC1436k interfaceC1436k2 = interfaceC1436k;
        InterfaceC1436k interfaceC1436k3 = this.f20631k;
        if (interfaceC1436k3 == null) {
            interfaceC1436k3 = c6352e.f20646i;
        }
        InterfaceC1436k interfaceC1436k4 = interfaceC1436k3;
        InterfaceC1436k interfaceC1436k5 = this.f20632l;
        if (interfaceC1436k5 == null) {
            interfaceC1436k5 = c6352e.f20647j;
        }
        InterfaceC1436k interfaceC1436k6 = interfaceC1436k5;
        InterfaceC6580i interfaceC6580i = this.f20633m;
        if (interfaceC6580i == null) {
            interfaceC6580i = c6352e.f20648k;
        }
        InterfaceC6580i interfaceC6580i2 = interfaceC6580i;
        EnumC6578g enumC6578g = this.f20634n;
        if (enumC6578g == null) {
            enumC6578g = c6352e.f20649l;
        }
        EnumC6578g enumC6578g2 = enumC6578g;
        EnumC6575d enumC6575d = this.f20635o;
        EnumC6575d enumC6575d2 = enumC6575d == null ? c6352e.f20650m : enumC6575d;
        Object obj3 = this.f20636p;
        if (obj3 instanceof C0827k) {
            C0827k c0827k = (C0827k) obj3;
            c0827k.getClass();
            c0828l = new C0828l(AbstractC9137G4.m9681c(c0827k.f2307a));
        } else {
            if (!(obj3 instanceof C0828l)) {
                throw new AssertionError();
            }
            c0828l = (C0828l) obj3;
        }
        return new C6354g(this.f20621a, obj2, c11234e, mapM9681c, abstractC0682p, c6812c, interfaceC18776i2, interfaceC18776i4, interfaceC18776i6, enumC6349b, enumC6349b2, enumC6349b3, interfaceC1436k2, interfaceC1436k4, interfaceC1436k6, interfaceC6580i2, enumC6578g2, enumC6575d2, c0828l, new C6353f(this.f20627g, this.f20628h, this.f20629i, this.f20630j, this.f20631k, this.f20632l, this.f20633m, this.f20634n, this.f20635o), this.f20622b);
    }

    public C6351d(C6354g c6354g, Context context) {
        this.f20621a = context;
        this.f20622b = c6354g.f20681u;
        this.f20623c = c6354g.f20662b;
        this.f20624d = c6354g.f20663c;
        this.f20625e = c6354g.f20664d;
        C6353f c6353f = c6354g.f20680t;
        this.f20626f = c6354g.f20666f;
        this.f20627g = c6353f.f20652a;
        this.f20628h = c6353f.f20653b;
        this.f20629i = c6353f.f20654c;
        this.f20630j = c6353f.f20655d;
        this.f20631k = c6353f.f20656e;
        this.f20632l = c6353f.f20657f;
        this.f20633m = c6353f.f20658g;
        this.f20634n = c6353f.f20659h;
        this.f20635o = c6353f.f20660i;
        this.f20636p = c6354g.f20679s;
    }
}
