package android.gov.nist.javax.sip.header.ims;

import java.util.Iterator;
import java.util.ListIterator;
import p713e.InterfaceC13200H;
import p713e.InterfaceC13250x;

/* JADX INFO: loaded from: classes.dex */
public interface PChargingFunctionAddressesHeader extends InterfaceC13200H, InterfaceC13250x {
    public static final String NAME = "P-Charging-Function-Addresses";

    void addChargingCollectionFunctionAddress(String str);

    void addEventChargingFunctionAddress(String str);

    @Override // p713e.InterfaceC13250x
    /* synthetic */ Object clone();

    ListIterator getChargingCollectionFunctionAddresses();

    ListIterator getEventChargingFunctionAddresses();

    /* synthetic */ String getName();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    void removeChargingCollectionFunctionAddress(String str);

    void removeEventChargingFunctionAddress(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    void setChargingCollectionFunctionAddress(String str);

    void setEventChargingFunctionAddress(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);
}
