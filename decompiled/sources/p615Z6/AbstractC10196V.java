package p615Z6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: Z6.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10196V extends AbstractC10198X implements InterfaceC10197W, InterfaceC10195U {

    /* JADX INFO: renamed from: i */
    public ArrayList f30299i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public HashSet f30300j = null;

    /* JADX INFO: renamed from: k */
    public String f30301k = null;

    /* JADX INFO: renamed from: l */
    public HashSet f30302l = null;

    /* JADX INFO: renamed from: m */
    public HashSet f30303m = null;

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: a */
    public final Set mo10775a() {
        return null;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: b */
    public final String mo10776b() {
        return this.f30301k;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: d */
    public final void mo10777d(HashSet hashSet) {
        this.f30300j = hashSet;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: e */
    public final Set mo10778e() {
        return this.f30300j;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: f */
    public final void mo10779f(HashSet hashSet) {
        this.f30303m = hashSet;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: g */
    public final void mo10780g(String str) {
        this.f30301k = str;
    }

    @Override // p615Z6.InterfaceC10197W
    public final List getChildren() {
        return this.f30299i;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: h */
    public final void mo10781h(HashSet hashSet) {
        this.f30302l = hashSet;
    }

    @Override // p615Z6.InterfaceC10197W
    /* JADX INFO: renamed from: j */
    public void mo10773j(AbstractC10202a0 abstractC10202a0) {
        this.f30299i.add(abstractC10202a0);
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: l */
    public final Set mo10783l() {
        return this.f30302l;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: m */
    public final Set mo10784m() {
        return this.f30303m;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: i */
    public final void mo10782i(HashSet hashSet) {
    }
}
