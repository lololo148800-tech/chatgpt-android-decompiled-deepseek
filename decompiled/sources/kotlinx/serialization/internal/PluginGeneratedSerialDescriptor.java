package kotlinx.serialization.internal;

import android.gov.nist.core.Separators;
import ao.InterfaceC11127C;
import ao.InterfaceC11174l;
import io.sentry.config.AbstractC15340a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mm.EnumC17307j;
import p008A6.C0386f;
import p049Bm.InterfaceC1426a;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9227W;
import p606Yn.C10110k;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes2.dex */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, InterfaceC11174l {

    /* JADX INFO: renamed from: a */
    public final String f53318a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC11127C f53319b;

    /* JADX INFO: renamed from: c */
    public final int f53320c;

    /* JADX INFO: renamed from: d */
    public int f53321d = -1;

    /* JADX INFO: renamed from: e */
    public final String[] f53322e;

    /* JADX INFO: renamed from: f */
    public final List[] f53323f;

    /* JADX INFO: renamed from: g */
    public ArrayList f53324g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f53325h;

    /* JADX INFO: renamed from: i */
    public Object f53326i;

    /* JADX INFO: renamed from: j */
    public final Object f53327j;

    /* JADX INFO: renamed from: k */
    public final Object f53328k;

    /* JADX INFO: renamed from: l */
    public final Object f53329l;

    public PluginGeneratedSerialDescriptor(String str, InterfaceC11127C interfaceC11127C, int i10) {
        this.f53318a = str;
        this.f53319b = interfaceC11127C;
        this.f53320c = i10;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f53322e = strArr;
        int i12 = this.f53320c;
        this.f53323f = new List[i12];
        this.f53325h = new boolean[i12];
        this.f53326i = C17690x.f56481Y;
        EnumC17307j enumC17307j = EnumC17307j.f55133Y;
        final int i13 = 0;
        this.f53327j = AbstractC9227W.m9799b(enumC17307j, new InterfaceC1426a(this) { // from class: ao.b0

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ PluginGeneratedSerialDescriptor f33793Z;

            {
                this.f33793Z = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mm.i] */
            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i13) {
                    case 0:
                        InterfaceC11127C interfaceC11127C2 = this.f33793Z.f53319b;
                        return (interfaceC11127C2 == null || (kSerializerArrChildSerializers = interfaceC11127C2.childSerializers()) == null) ? AbstractC11153a0.f33790b : kSerializerArrChildSerializers;
                    case 1:
                        InterfaceC11127C interfaceC11127C3 = this.f33793Z.f53319b;
                        if (interfaceC11127C3 == null || (kSerializerArrTypeParametersSerializers = interfaceC11127C3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return AbstractC11153a0.m12380c(arrayList);
                    default:
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f33793Z;
                        return Integer.valueOf(AbstractC11153a0.m12384g(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.f53328k.getValue()));
                }
            }
        });
        final int i14 = 1;
        this.f53328k = AbstractC9227W.m9799b(enumC17307j, new InterfaceC1426a(this) { // from class: ao.b0

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ PluginGeneratedSerialDescriptor f33793Z;

            {
                this.f33793Z = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mm.i] */
            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i14) {
                    case 0:
                        InterfaceC11127C interfaceC11127C2 = this.f33793Z.f53319b;
                        return (interfaceC11127C2 == null || (kSerializerArrChildSerializers = interfaceC11127C2.childSerializers()) == null) ? AbstractC11153a0.f33790b : kSerializerArrChildSerializers;
                    case 1:
                        InterfaceC11127C interfaceC11127C3 = this.f33793Z.f53319b;
                        if (interfaceC11127C3 == null || (kSerializerArrTypeParametersSerializers = interfaceC11127C3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return AbstractC11153a0.m12380c(arrayList);
                    default:
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f33793Z;
                        return Integer.valueOf(AbstractC11153a0.m12384g(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.f53328k.getValue()));
                }
            }
        });
        final int i15 = 2;
        this.f53329l = AbstractC9227W.m9799b(enumC17307j, new InterfaceC1426a(this) { // from class: ao.b0

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ PluginGeneratedSerialDescriptor f33793Z;

            {
                this.f33793Z = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mm.i] */
            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i15) {
                    case 0:
                        InterfaceC11127C interfaceC11127C2 = this.f33793Z.f53319b;
                        return (interfaceC11127C2 == null || (kSerializerArrChildSerializers = interfaceC11127C2.childSerializers()) == null) ? AbstractC11153a0.f33790b : kSerializerArrChildSerializers;
                    case 1:
                        InterfaceC11127C interfaceC11127C3 = this.f33793Z.f53319b;
                        if (interfaceC11127C3 == null || (kSerializerArrTypeParametersSerializers = interfaceC11127C3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return AbstractC11153a0.m12380c(arrayList);
                    default:
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f33793Z;
                        return Integer.valueOf(AbstractC11153a0.m12384g(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.f53328k.getValue()));
                }
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo10679a() {
        return this.f53318a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // ao.InterfaceC11174l
    /* JADX INFO: renamed from: b */
    public final Set mo10687b() {
        return this.f53326i.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: c */
    public final boolean mo10680c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo10681d(String name) {
        AbstractC16544l.m18094g(name, "name");
        Integer num = (Integer) this.f53326i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo10682e() {
        return this.f53320c;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, mm.i] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f53318a.equals(serialDescriptor.mo10679a()) && Arrays.equals((SerialDescriptor[]) this.f53328k.getValue(), (SerialDescriptor[]) ((PluginGeneratedSerialDescriptor) obj).f53328k.getValue())) {
                int iMo10682e = serialDescriptor.mo10682e();
                int i10 = this.f53320c;
                if (i10 == iMo10682e) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (AbstractC16544l.m18089b(mo10685h(i11).mo10679a(), serialDescriptor.mo10685h(i11).mo10679a()) && AbstractC16544l.m18089b(mo10685h(i11).getKind(), serialDescriptor.mo10685h(i11).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo10683f(int i10) {
        return this.f53322e[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo10684g(int i10) {
        List list = this.f53323f[i10];
        return list == null ? C17689w.f56480Y : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        ArrayList arrayList = this.f53324g;
        return arrayList == null ? C17689w.f56480Y : arrayList;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public AbstractC15340a getKind() {
        return C10110k.f29935b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public SerialDescriptor mo10685h(int i10) {
        return ((KSerializer[]) this.f53327j.getValue())[i10].getDescriptor();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    public int hashCode() {
        return ((Number) this.f53329l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo10686i(int i10) {
        return this.f53325h[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m18453j(String name, boolean z6) {
        AbstractC16544l.m18094g(name, "name");
        int i10 = this.f53321d + 1;
        this.f53321d = i10;
        String[] strArr = this.f53322e;
        strArr[i10] = name;
        this.f53325h[i10] = z6;
        this.f53323f[i10] = null;
        if (i10 == this.f53320c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                map.put(strArr[i11], Integer.valueOf(i11));
            }
            this.f53326i = map;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m18454k(Annotation annotation) {
        AbstractC16544l.m18094g(annotation, "annotation");
        int i10 = this.f53321d;
        List[] listArr = this.f53323f;
        List arrayList = listArr[i10];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            listArr[this.f53321d] = arrayList;
        }
        arrayList.add(annotation);
    }

    public String toString() {
        return AbstractC17680n.m19349Y(AbstractC8301I.m8929t(0, this.f53320c), ", ", this.f53318a.concat(Separators.LPAREN), Separators.RPAREN, 0, null, new C0386f(this, 21), 24);
    }
}
