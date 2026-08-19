package sl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p817j$.util.DesugarCollections;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: sl.s */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19684s implements InterfaceC19682q {

    /* JADX INFO: renamed from: c */
    public final Map f62376c;

    public AbstractC19684s(Map values) {
        AbstractC16544l.m18094g(values, "values");
        C19673h c19673h = new C19673h();
        for (Map.Entry entry : values.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add((String) list.get(i10));
            }
            c19673h.put(str, arrayList);
        }
        this.f62376c = c19673h;
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: a */
    public final Set mo7977a() {
        Set setEntrySet = this.f62376c.entrySet();
        AbstractC16544l.m18094g(setEntrySet, "<this>");
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(setEntrySet);
        AbstractC16544l.m18093f(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: b */
    public final Set mo7978b() {
        Set setKeySet = this.f62376c.keySet();
        AbstractC16544l.m18094g(setKeySet, "<this>");
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(setKeySet);
        AbstractC16544l.m18093f(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: d */
    public final List mo7979d(String name) {
        AbstractC16544l.m18094g(name, "name");
        return (List) this.f62376c.get(name);
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: e */
    public final void mo7980e(InterfaceC1439n interfaceC1439n) {
        for (Map.Entry entry : this.f62376c.entrySet()) {
            interfaceC1439n.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC19682q)) {
            return false;
        }
        InterfaceC19682q interfaceC19682q = (InterfaceC19682q) obj;
        if (true != interfaceC19682q.mo7981f()) {
            return false;
        }
        return mo7977a().equals(interfaceC19682q.mo7977a());
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: f */
    public final boolean mo7981f() {
        return true;
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: g */
    public final String mo7982g(String str) {
        List list = (List) this.f62376c.get(str);
        if (list != null) {
            return (String) AbstractC17680n.m19343S(list);
        }
        return null;
    }

    public final int hashCode() {
        return mo7977a().hashCode() + 1182991;
    }

    @Override // sl.InterfaceC19682q
    public final boolean isEmpty() {
        return this.f62376c.isEmpty();
    }
}
