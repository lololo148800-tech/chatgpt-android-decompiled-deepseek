package co;

import android.gov.nist.javax.sip.header.ParameterNames;
import bo.C11518f;
import bo.C11536x;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16642a;
import kotlinx.serialization.json.C16644c;
import p025An.C0644w;

/* JADX INFO: renamed from: co.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C11835y extends C11831u {

    /* JADX INFO: renamed from: i */
    public String f35866i;

    /* JADX INFO: renamed from: j */
    public boolean f35867j;

    @Override // co.C11831u
    /* JADX INFO: renamed from: L */
    public final AbstractC16643b mo13125L() {
        return new C16644c((LinkedHashMap) this.f35854h);
    }

    @Override // co.C11831u
    /* JADX INFO: renamed from: O */
    public final void mo13128O(String key, AbstractC16643b element) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(element, "element");
        if (!this.f35867j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f35854h;
            String str = this.f35866i;
            if (str == null) {
                AbstractC16544l.m18103p(ParameterNames.TAG);
                throw null;
            }
            linkedHashMap.put(str, element);
            this.f35867j = true;
            return;
        }
        if (element instanceof AbstractC16645d) {
            this.f35866i = ((AbstractC16645d) element).mo12922f();
            this.f35867j = false;
        } else {
            if (element instanceof C16644c) {
                throw AbstractC11828r.m13096b(C11536x.f34903b);
            }
            if (!(element instanceof C16642a)) {
                throw new C0644w();
            }
            throw AbstractC11828r.m13096b(C11518f.f34850b);
        }
    }
}
