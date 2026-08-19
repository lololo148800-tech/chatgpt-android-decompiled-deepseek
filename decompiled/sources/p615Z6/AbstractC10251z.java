package p615Z6;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: Z6.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10251z extends AbstractC10198X implements InterfaceC10169B, InterfaceC10195U {

    /* JADX INFO: renamed from: i */
    public HashSet f30447i = null;

    /* JADX INFO: renamed from: j */
    public String f30448j = null;

    /* JADX INFO: renamed from: k */
    public HashSet f30449k = null;

    /* JADX INFO: renamed from: l */
    public HashSet f30450l = null;

    /* JADX INFO: renamed from: m */
    public HashSet f30451m = null;

    /* JADX INFO: renamed from: n */
    public Matrix f30452n;

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: a */
    public final Set mo10775a() {
        return this.f30449k;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: b */
    public final String mo10776b() {
        return this.f30448j;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: d */
    public final void mo10777d(HashSet hashSet) {
        this.f30447i = hashSet;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: e */
    public final Set mo10778e() {
        return this.f30447i;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: f */
    public final void mo10779f(HashSet hashSet) {
        this.f30451m = hashSet;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: g */
    public final void mo10780g(String str) {
        this.f30448j = str;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: h */
    public final void mo10781h(HashSet hashSet) {
        this.f30450l = hashSet;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: i */
    public final void mo10782i(HashSet hashSet) {
        this.f30449k = hashSet;
    }

    @Override // p615Z6.InterfaceC10169B
    /* JADX INFO: renamed from: k */
    public final void mo10763k(Matrix matrix) {
        this.f30452n = matrix;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: l */
    public final Set mo10783l() {
        return this.f30450l;
    }

    @Override // p615Z6.InterfaceC10195U
    /* JADX INFO: renamed from: m */
    public final Set mo10784m() {
        return this.f30451m;
    }
}
