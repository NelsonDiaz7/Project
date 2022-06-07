package co.edu.unbosque.demo.jpa.repositories;

import co.edu.unbosque.demo.jpa.entities.WalletHistory;

import java.util.Optional;

public interface WalletHistoryRepository {

    Optional<WalletHistory> save(WalletHistory walletHistory);

}
