package android.security.net.config;

import android.os.Environment;
import android.os.UserHandle;
import java.io.File;
import java.security.cert.X509Certificate;
import java.util.Set;

public final class UserCertificateSource extends DirectoryCertificateSource {

    private static class NoPreloadHolder {
        private static final UserCertificateSource INSTANCE = new UserCertificateSource();

        private NoPreloadHolder() {
        }
    }

    public /* bridge */ /* synthetic */ Set findAllByIssuerAndSignature(X509Certificate cert) {
        return super.findAllByIssuerAndSignature(cert);
    }

    public /* bridge */ /* synthetic */ X509Certificate findByIssuerAndSignature(X509Certificate cert) {
        return super.findByIssuerAndSignature(cert);
    }

    public /* bridge */ /* synthetic */ X509Certificate findBySubjectAndPublicKey(X509Certificate cert) {
        return super.findBySubjectAndPublicKey(cert);
    }

    public /* bridge */ /* synthetic */ Set getCertificates() {
        return super.getCertificates();
    }

    public /* bridge */ /* synthetic */ void handleTrustStorageUpdate() {
        super.handleTrustStorageUpdate();
    }

    private UserCertificateSource() {
        super(new File(Environment.getUserConfigDirectory(UserHandle.myUserId()), "cacerts-added"));
    }

    public static UserCertificateSource getInstance() {
        return NoPreloadHolder.INSTANCE;
    }

    protected boolean isCertMarkedAsRemoved(String caFile) {
        return false;
    }
}
