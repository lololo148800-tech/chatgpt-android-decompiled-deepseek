package co;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import ao.AbstractC11153a0;
import bo.AbstractC11516d;
import bo.AbstractC11523k;
import bo.C11521i;
import bo.C11531s;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16644c;
import kotlinx.serialization.json.JsonNull;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p606Yn.AbstractC10103d;
import p606Yn.C10109j;
import p631Zn.InterfaceC10428a;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17665J;
import p909nm.C17691y;

/* JADX INFO: renamed from: co.v */
/* JADX INFO: loaded from: classes2.dex */
public class C11832v extends AbstractC11811a {

    /* JADX INFO: renamed from: f */
    public final C16644c f35855f;

    /* JADX INFO: renamed from: g */
    public final SerialDescriptor f35856g;

    /* JADX INFO: renamed from: h */
    public int f35857h;

    /* JADX INFO: renamed from: i */
    public boolean f35858i;

    public /* synthetic */ C11832v(AbstractC11516d abstractC11516d, C16644c c16644c, String str, int i10) {
        this(abstractC11516d, c16644c, (i10 & 4) != 0 ? null : str, (SerialDescriptor) null);
    }

    @Override // co.AbstractC11811a
    /* JADX INFO: renamed from: G */
    public AbstractC16643b mo13073G(String tag) {
        AbstractC16544l.m18094g(tag, "tag");
        return (AbstractC16643b) AbstractC17659D.m19243e(mo13087U(), tag);
    }

    @Override // co.AbstractC11811a
    /* JADX INFO: renamed from: S */
    public String mo13085S(SerialDescriptor descriptor, int i10) {
        Object next;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC11516d abstractC11516d = this.f35808c;
        C11531s c11531sM13114t = AbstractC11828r.m13114t(abstractC11516d, descriptor);
        String strMo10683f = descriptor.mo10683f(i10);
        if (c11531sM13114t == null && (!this.f35810e.f34880l || mo13087U().f53331Y.keySet().contains(strMo10683f))) {
            return strMo10683f;
        }
        Map mapM13106l = AbstractC11828r.m13106l(abstractC11516d, descriptor);
        Iterator it = mo13087U().f53331Y.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) mapM13106l.get((String) next);
            if (num != null && num.intValue() == i10) {
                break;
            }
        }
        String str = (String) next;
        if (str != null) {
            return str;
        }
        String strM12924a = c11531sM13114t != null ? c11531sM13114t.m12924a(descriptor, strMo10683f) : null;
        return strM12924a == null ? strMo10683f : strM12924a;
    }

    @Override // co.AbstractC11811a
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public C16644c mo13087U() {
        return this.f35855f;
    }

    @Override // co.AbstractC11811a, p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: b */
    public void mo5470b(SerialDescriptor descriptor) {
        Set setM19266f;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        C11521i c11521i = this.f35810e;
        if (c11521i.f34870b || (descriptor.getKind() instanceof AbstractC10103d)) {
            return;
        }
        AbstractC11516d abstractC11516d = this.f35808c;
        C11531s c11531sM13114t = AbstractC11828r.m13114t(abstractC11516d, descriptor);
        if (c11531sM13114t == null && !c11521i.f34880l) {
            setM19266f = AbstractC11153a0.m12379b(descriptor);
        } else if (c11531sM13114t != null) {
            setM19266f = AbstractC11828r.m13106l(abstractC11516d, descriptor).keySet();
        } else {
            Set setM12379b = AbstractC11153a0.m12379b(descriptor);
            Map map = (Map) abstractC11516d.f34845c.m20030m(descriptor, AbstractC11828r.f35843a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = C17691y.f56482Y;
            }
            setM19266f = AbstractC17665J.m19266f(setM12379b, setKeySet);
        }
        for (String key : mo13087U().f53331Y.keySet()) {
            if (!setM19266f.contains(key) && !AbstractC16544l.m18089b(key, this.f35809d)) {
                String input = mo13087U().toString();
                AbstractC16544l.m18094g(key, "key");
                AbstractC16544l.m18094g(input, "input");
                StringBuilder sbM11058p = AbstractC10763a.m11058p("Encountered an unknown key '", key, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sbM11058p.append((Object) AbstractC11828r.m13113s(-1, input));
                throw AbstractC11828r.m13098d(-1, sbM11058p.toString());
            }
        }
    }

    @Override // co.AbstractC11811a, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: r */
    public final boolean mo5484r() {
        return !this.f35858i && super.mo5484r();
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: s */
    public int mo10914s(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        while (this.f35857h < descriptor.mo10682e()) {
            int i10 = this.f35857h;
            this.f35857h = i10 + 1;
            String strM13086T = m13086T(descriptor, i10);
            int i11 = this.f35857h - 1;
            this.f35858i = false;
            boolean zContainsKey = mo13087U().containsKey(strM13086T);
            AbstractC11516d abstractC11516d = this.f35808c;
            if (!zContainsKey) {
                boolean z6 = (abstractC11516d.f34843a.f34874f || descriptor.mo10686i(i11) || !descriptor.mo10685h(i11).mo10680c()) ? false : true;
                this.f35858i = z6;
                if (!z6) {
                    continue;
                }
            }
            if (this.f35810e.f34876h) {
                boolean zMo10686i = descriptor.mo10686i(i11);
                SerialDescriptor serialDescriptorMo10685h = descriptor.mo10685h(i11);
                if (!zMo10686i || serialDescriptorMo10685h.mo10680c() || !(mo13073G(strM13086T) instanceof JsonNull)) {
                    if (AbstractC16544l.m18089b(serialDescriptorMo10685h.getKind(), C10109j.f29934b) && (!serialDescriptorMo10685h.mo10680c() || !(mo13073G(strM13086T) instanceof JsonNull))) {
                        AbstractC16643b abstractC16643bMo13073G = mo13073G(strM13086T);
                        AbstractC16645d abstractC16645d = abstractC16643bMo13073G instanceof AbstractC16645d ? (AbstractC16645d) abstractC16643bMo13073G : null;
                        String strM12913f = abstractC16645d != null ? AbstractC11523k.m12913f(abstractC16645d) : null;
                        if (strM12913f != null) {
                            int iM13109o = AbstractC11828r.m13109o(serialDescriptorMo10685h, abstractC11516d, strM12913f);
                            boolean z10 = !abstractC11516d.f34843a.f34874f && serialDescriptorMo10685h.mo10680c();
                            if (iM13109o != -3 || (!zMo10686i && !z10)) {
                            }
                        }
                    }
                }
            }
            return i11;
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11832v(AbstractC11516d json, C16644c value, String str, SerialDescriptor serialDescriptor) {
        super(json, str);
        AbstractC16544l.m18094g(json, "json");
        AbstractC16544l.m18094g(value, "value");
        this.f35855f = value;
        this.f35856g = serialDescriptor;
    }

    @Override // co.AbstractC11811a, kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: c */
    public final InterfaceC10428a mo5471c(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        SerialDescriptor serialDescriptor = this.f35856g;
        if (descriptor != serialDescriptor) {
            return super.mo5471c(descriptor);
        }
        AbstractC16643b abstractC16643bM13074H = m13074H();
        String strMo10679a = serialDescriptor.mo10679a();
        if (abstractC16643bM13074H instanceof C16644c) {
            return new C11832v(this.f35808c, (C16644c) abstractC16643bM13074H, this.f35809d, serialDescriptor);
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        C16527D c16527d = AbstractC16526C.f51263a;
        sb2.append(c16527d.mo5693b(C16644c.class).mo4448c());
        sb2.append(", but had ");
        sb2.append(c16527d.mo5693b(abstractC16643bM13074H.getClass()).mo4448c());
        sb2.append(" as the serialized body of ");
        sb2.append(strMo10679a);
        sb2.append(QzvfuIgrngtl.RBEaiQBgoNPqNnQ);
        sb2.append(m13089W());
        throw AbstractC11828r.m13097c(-1, abstractC16643bM13074H.toString(), sb2.toString());
    }
}
