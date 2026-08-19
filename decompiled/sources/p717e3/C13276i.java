package p717e3;

import androidx.glance.appwidget.protobuf.AbstractC11032b;
import androidx.glance.appwidget.protobuf.AbstractC11057s;
import androidx.glance.appwidget.protobuf.AbstractC11059u;
import androidx.glance.appwidget.protobuf.AbstractC11063y;
import androidx.glance.appwidget.protobuf.C11024U;
import androidx.glance.appwidget.protobuf.C11025V;
import androidx.glance.appwidget.protobuf.C11058t;
import androidx.glance.appwidget.protobuf.InterfaceC11022S;
import androidx.glance.appwidget.protobuf.InterfaceC11062x;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p001A.AbstractC0010F;
import p011A9.p012Ra.ahZQMZ;

/* JADX INFO: renamed from: e3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C13276i extends AbstractC11059u {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final C13276i DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile InterfaceC11022S PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private InterfaceC11062x children_ = C11024U.f33269p0;
    private boolean hasAction_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        C13276i c13276i = new C13276i();
        DEFAULT_INSTANCE = c13276i;
        AbstractC11059u.m12098k(C13276i.class, c13276i);
    }

    /* JADX INFO: renamed from: m */
    public static void m14884m(C13276i c13276i, EnumC13277j enumC13277j) {
        c13276i.getClass();
        if (enumC13277j == EnumC13277j.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c13276i.type_ = enumC13277j.f41969Y;
    }

    /* JADX INFO: renamed from: n */
    public static void m14885n(C13276i c13276i, EnumC13269b enumC13269b) {
        c13276i.getClass();
        c13276i.width_ = enumC13269b.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m14886o(C13276i c13276i, EnumC13269b enumC13269b) {
        c13276i.getClass();
        c13276i.height_ = enumC13269b.getNumber();
    }

    /* JADX INFO: renamed from: q */
    public static void m14888q(C13276i c13276i, EnumC13278k enumC13278k) {
        c13276i.getClass();
        if (enumC13278k == EnumC13278k.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c13276i.verticalAlignment_ = enumC13278k.f41975Y;
    }

    /* JADX INFO: renamed from: r */
    public static void m14889r(C13276i c13276i, EnumC13268a enumC13268a) {
        c13276i.getClass();
        if (enumC13268a == EnumC13268a.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c13276i.imageScale_ = enumC13268a.f41943Y;
    }

    /* JADX INFO: renamed from: s */
    public static void m14890s(C13276i c13276i) {
        c13276i.getClass();
        c13276i.identity_ = 1;
    }

    /* JADX INFO: renamed from: t */
    public static void m14891t(C13276i c13276i, boolean z6) {
        c13276i.hasAction_ = z6;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: u */
    public static void m14892u(C13276i c13276i, ArrayList arrayList) {
        InterfaceC11062x interfaceC11062x = c13276i.children_;
        if (!((AbstractC11032b) interfaceC11062x).f33285Y) {
            int size = interfaceC11062x.size();
            c13276i.children_ = ((C11024U) interfaceC11062x).m11921j(size == 0 ? 10 : size * 2);
        }
        List list = c13276i.children_;
        Charset charset = AbstractC11063y.f33343a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size2 = list.size();
        for (Object obj : arrayList) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                    list.remove(size3);
                }
                throw new NullPointerException(str);
            }
            list.add(obj);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m14893v(C13276i c13276i, boolean z6) {
        c13276i.hasImageDescription_ = z6;
    }

    /* JADX INFO: renamed from: w */
    public static void m14894w(C13276i c13276i, boolean z6) {
        c13276i.hasImageColorFilter_ = z6;
    }

    /* JADX INFO: renamed from: x */
    public static C13276i m14895x() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static C13275h m14896y() {
        return (C13275h) ((AbstractC11057s) DEFAULT_INSTANCE.mo12101d(5));
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC11059u
    /* JADX INFO: renamed from: d */
    public final Object mo12101d(int i10) {
        switch (AbstractC0010F.m24h(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C11025V(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", C13276i.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_"});
            case 3:
                return new C13276i();
            case 4:
                return new C13275h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC11022S c11058t = PARSER;
                if (c11058t == null) {
                    synchronized (C13276i.class) {
                        try {
                            c11058t = PARSER;
                            if (c11058t == null) {
                                c11058t = new C11058t();
                                PARSER = c11058t;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return c11058t;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m14887p(C13276i c13276i, EnumC13270c enumC13270c) {
        c13276i.getClass();
        if (enumC13270c != EnumC13270c.UNRECOGNIZED) {
            c13276i.horizontalAlignment_ = enumC13270c.f41956Y;
            return;
        }
        throw new IllegalArgumentException(ahZQMZ.PRHulOPXGIySU);
    }
}
